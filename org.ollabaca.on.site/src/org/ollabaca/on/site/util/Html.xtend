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

	def CharSequence apply(E object) {
		'''«name»="«value.apply(object)»"'''
	}
}

@Data
class Content<E> {
	val (E)=>CharSequence body

	def CharSequence apply(E object) {
		body.apply(object)
	}
}

@Data
class Column<E> {
	val String name
	val (E)=>CharSequence cell

	def CharSequence apply(E object) {
		cell.apply(object)
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

	override render(WikiLinkNode object) {
		val key = object.text.substring(1).replaceAll("/", ".")

		val topic = site.getTopic(key)
		if (topic == null) {
			return new LinkRenderer.Rendering('#', "Not found: " + key);
		} else {
			return new LinkRenderer.Rendering('#' + topic.target, Notation::notation_Object(topic.title).toString);
		}
	}

}

class DefaultLinkRenderer extends LinkRenderer {

	override render(WikiLinkNode object) {
		val key = object.text.substring(1).replaceAll("/", ".")

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

	def static String html(String object) {
		processor.markdownToHtml(object, linkRenderer)
		.replace("{{info}}", "<div class='alert alert-info'>")
		.replace("{{/info}}", "</div>")
		.replace("{{warning}}", "<div class='alert alert-warning'>")
		.replace("{{/warning}}", "</div>")
	}
	
	def static dispatch CharSequence span(Void object) {
		"null"
	}

	def static dispatch CharSequence span(CharSequence object) {
		_span(object.toString)
	}
	
	def static dispatch CharSequence span(String object) {
		val node = processor.parseMarkdown(object.toCharArray)
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

	static def <E> CharSequence tag(E object, String name, (E)=>CharSequence content) {
		tag(object, name, #[], #[content(content)])
	}

	static def <E> CharSequence tag(E object, String name, List<Attr<E>> attributes, List<Content<E>> contents) {
		'''
			<«name» «FOR e : attributes» «e.apply(object)» «ENDFOR»>
			«FOR e : contents»
				«e.apply(object)»
			«ENDFOR»
			</«name»>
		'''
	}

	static def <E> CharSequence dl(Iterable<? extends E> object, (E)=>CharSequence term, (E)=>CharSequence definition) {
		dl(object, #[], content(term), content(definition))
	}

	static def <E> CharSequence dl(Iterable<? extends E> object, List<Attr<Iterable<? extends E>>> attributes,
		Content<E> term, Content<E> definition) {
		if (object.empty) {
			return ""
		}
		tag(object, "dl", attributes,
			#[
				content(['''«FOR E e : it» «definition(e, term, definition)» «ENDFOR»'''])
			]);
	}

	static def <E> CharSequence definition(E object, Content<E> term, Content<E> definition) '''
		<dt>«term.apply(object)»</dt>
		<dd>«definition.apply(object)»</dd>
	'''

	static def <E> CharSequence ol(Iterable<? extends E> object, (E)=>CharSequence item) {
		ol(object, #[], content(item))
	}

	static def <E> CharSequence ol(Iterable<? extends E> object, List<Attr<Iterable<? extends E>>> attributes,
		Content<E> item) {
		list(object, "ol", attributes, item)
	}

	static def <E> CharSequence ul(Iterable<? extends E> object, (E)=>CharSequence item) {
		ul(object, #[], content(item))
	}

	static def <E> CharSequence ul(Iterable<? extends E> object, List<Attr<Iterable<? extends E>>> attributes,
		Content<E> item) {
		list(object, "ul", attributes, item)
	}

	static def <E> CharSequence list(Iterable<? extends E> object, String name,
		List<Attr<Iterable<? extends E>>> attributes, Content<E> item) {
		if (object.empty) {
			return ""
		}
		tag(object, name, attributes,
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

	def static String escape(String object) {
		StringEscapeUtils::escapeHtml4(object)
	}

	def static String escapeEcmaScript(String object) {
		StringEscapeUtils::escapeEcmaScript(object)
	}

	static def CharSequence abstract_EObject(EObject object) {
		val topic = object.topic_EObject
		if (topic != null) {
			return topic.abstract.html
		}
		return ""
	}

	static def CharSequence documentation_EObject(EObject object) {
		val topic = object.topic_EObject
		if (topic != null) {
			return '''
				<div class="abstract">«topic.^abstract.html»</div>
				<div class="documentation">«topic.documentation.html»</div>
			'''
		}
		""
	}

}
