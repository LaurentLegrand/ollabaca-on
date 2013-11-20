package org.ollabaca.on.site.util

import java.util.List
import org.apache.commons.lang3.StringEscapeUtils
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.servlets.Notation
import org.pegdown.Extensions
import org.pegdown.LinkRenderer
import org.pegdown.PegDownProcessor
import org.pegdown.ToHtmlSerializer
import org.pegdown.ast.ParaNode
import org.pegdown.ast.WikiLinkNode

import static extension org.ollabaca.on.site.util.Sites.*
import org.ollabaca.on.site.servlets.Ref

@Data
class Attr<E> {
	val String name
	val (E)=>CharSequence value

	def CharSequence apply(E self) {
		'''«name»="«value.apply(self)»"'''
	}
}

@Data
class Content<E> {
	val (E)=>CharSequence body

	def CharSequence apply(E self) {
		body.apply(self)
	}
}

@Data
class Column<E> {
	val String name
	val (E)=>CharSequence cell

	def CharSequence apply(E self) {
		cell.apply(self)
	}
}

class InlineSerializer extends ToHtmlSerializer {

	new(LinkRenderer linkRenderer) {
		super(linkRenderer)
	}

	override visit(ParaNode node) {
		visitChildren(node)
	}
}

class LocalLinkRenderer extends LinkRenderer {

	override render(WikiLinkNode self) {
		val key = self.text.substring(1).replaceAll("/", ".")

		val topic = site.getTopic(key)
		if (topic == null) {
			return new LinkRenderer.Rendering('#', "Not found: " + key);
		} else {
			return new LinkRenderer.Rendering('#' + topic.target, Notation::notation_Object(topic.title).toString);
		}
	}

}

class DefaultLinkRenderer extends LinkRenderer {

	override render(WikiLinkNode self) {
		val key = self.text.substring(1).replaceAll("/", ".")

		val topic = site.getTopic(key)
		if (topic == null) {
			return new LinkRenderer.Rendering('#', "Not found: " + key);
		} else {
			return new LinkRenderer.Rendering(Ref::ref_Object(topic).toString,
				Notation::notation_Object(topic.title).toString);
		}
	}

}

public class Html {

	static val processor = new PegDownProcessor(Extensions::WIKILINKS)

	static val linkRenderer = new DefaultLinkRenderer

	def static String html(String self) {
		processor.markdownToHtml(self, linkRenderer)
	}
	
	def static dispatch CharSequence span(Void self) {
		"null"
	}

	def static dispatch CharSequence span(CharSequence self) {
		_span(self.toString)
	}
	
	def static dispatch CharSequence span(String self) {
		val node = processor.parseMarkdown(self.toCharArray)
		val span = new InlineSerializer(linkRenderer).toHtml(node)
		return span
	}

	static def <E> Attr<E> attr(String name, (E)=>CharSequence value) {
		new Attr(name, value)
	}

	static def <E> Content<E> content((E)=>CharSequence body) {
		new Content(body)
	}

	static def <E> Column<E> column(String name, (E)=>CharSequence cell) {
		new Column<E>(name, cell)
	}

	static def <E> CharSequence tag(E self, String name, (E)=>CharSequence content) {
		tag(self, name, #[], #[content(content)])
	}

	static def <E> CharSequence tag(E self, String name, List<Attr<E>> attributes, List<Content<E>> contents) {
		'''
			<«name» «FOR e : attributes» «e.apply(self)» «ENDFOR»>
			«FOR e : contents»
				«e.apply(self)»
			«ENDFOR»
			</«name»>
		'''
	}

	static def <E> CharSequence dl(Iterable<? extends E> self, (E)=>CharSequence term, (E)=>CharSequence definition) {
		dl(self, #[], content(term), content(definition))
	}

	static def <E> CharSequence dl(Iterable<? extends E> self, List<Attr<Iterable<? extends E>>> attributes,
		Content<E> term, Content<E> definition) {
		if (self.empty) {
			return ""
		}
		tag(self, "dl", attributes,
			#[
				content(['''«FOR E e : it» «definition(e, term, definition)» «ENDFOR»'''])
			]);
	}

	static def <E> CharSequence definition(E self, Content<E> term, Content<E> definition) '''
		<dt>«term.apply(self)»</dt>
		<dd>«definition.apply(self)»</dd>
	'''

	static def <E> CharSequence ol(Iterable<? extends E> self, (E)=>CharSequence item) {
		ol(self, #[], content(item))
	}

	static def <E> CharSequence ol(Iterable<? extends E> self, List<Attr<Iterable<? extends E>>> attributes,
		Content<E> item) {
		list(self, "ol", attributes, item)
	}

	static def <E> CharSequence ul(Iterable<? extends E> self, (E)=>CharSequence item) {
		ul(self, #[], content(item))
	}

	static def <E> CharSequence ul(Iterable<? extends E> self, List<Attr<Iterable<? extends E>>> attributes,
		Content<E> item) {
		list(self, "ul", attributes, item)
	}

	static def <E> CharSequence list(Iterable<? extends E> self, String name,
		List<Attr<Iterable<? extends E>>> attributes, Content<E> item) {
		if (self.empty) {
			return ""
		}
		tag(self, name, attributes,
			#[
				content(
					[
						'''
							«FOR E e : it»
								<li>«item.apply(e)»</li>
							«ENDFOR»
						'''
					])
			]);
	}

	static def <E> CharSequence table(Iterable<? extends E> list, List<Attr<Iterable<? extends E>>> attributes,
		List<Column<E>> columns) '''
			<table class="table">
			<thead>
			<tr>
			«FOR c : columns»
				<th>«c.name»</th>
			«ENDFOR»
			</tr>
			</thead>
			<tbody>
			«FOR e : list»
				<tr>
				«FOR c : columns»
					<td>«c.cell.apply(e)»</td>
				«ENDFOR»					
				</tr>
			«ENDFOR»
			</tbody>
		</table>
	'''

	def static String escape(String self) {
		StringEscapeUtils::escapeHtml4(self)
	}

	def static String escapeEcmaScript(String self) {
		StringEscapeUtils::escapeEcmaScript(self)
	}

	static def CharSequence abstract_EObject(EObject self) {
		val topic = self.topic_EObject
		if (topic != null) {
			return topic.abstract.html
		}
		return ""
	}

	static def CharSequence documentation_EObject(EObject self) {
		val topic = self.topic_EObject
		if (topic != null) {
			return '''
				<div class="abstract">«topic.^abstract.html»</div>
				<div class="documentation">«topic.documentation.html»</div>
			'''
		}
		""
	}

}
