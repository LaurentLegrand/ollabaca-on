package org.ollabaca.on.uml

import java.util.List
import javax.swing.text.View
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Tag
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.renderers.ContentProvider
import org.ollabaca.on.site.renderers.Register
import org.ollabaca.on.site.renderers.Text
import org.ollabaca.on.uml.book.Book

import static org.ollabaca.on.site.util.Sites.*

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.servlets.Ref.*
import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.uml.Section_Element_OwnedElements.*

class UmlContentProvider implements ContentProvider {

	static val String PATH = "uml"

	static val String BOOK = "uml-book"

	static val BookToHtml bookToHtml = new BookToHtml();

	override onSite(Site self) ''''''

	override onTopic(Topic self) '''
		<script>
		$(document).ready(function() {
			$("#properties").before("<div id='«PATH»'></div>");
			$("#«PATH»").load("«scope(PATH, self).ref_Object»");
		});
		</script>
	'''

	override onType(org.ollabaca.on.site.Type self) ''''''
	

	override onTag(Tag self) ''''''
	

	override activate(Register register) {

		register.registerTopicRenderer(PATH, [toSection]);
		register.registerTopicRenderer(BOOK, [toBook]);
	}

	def Text toSection(Topic self) {
		if (self.target instanceof Book) {
			var text = '''<a href="«scope(BOOK, self).ref_Object»" target="_blank">Read more...</a">'''
			return new Text("text/html", text);
		}
		return new Text("text/html", section(self.target));
	}

	def Text toBook(Topic self) {
		return new Text("text/html", bookToHtml.html_Book(self.target as Book));
	}

	def dispatch section(EObject self) {
		''''''
	}
	
	def dispatch section(Element self) {
		Section_Element.section_Element(self)
	}

	def dispatch section(Package self) {
		val List<List<Topic>> rows = newArrayList()
		var i = 0
		var List<Topic> current = null
		for (e : self.packagedElements) {
			var t = site.getTopic(e)
			if (t != null) {
				if (i % 3 == 0) {
					current = newArrayList()
					rows.add(current)
				}
				current.add(t)
				i = i + 1
			}
		}
		'''
			<section class="«self.eClass.name»">
			
			«FOR r : rows»
				<div class="row-fluid">
				«FOR t : r»
					<div class="span4">
						<h3>«t.title»: «t.type.link_EObject»</h3>
						«t.^abstract.html»
						<a class="btn" href="«t.ref_Object»">View details »</a>
					</div>
				«ENDFOR»
				</div>
			«ENDFOR»
			</section>
		'''
	}
	
	def dispatch section(Classifier self) {
		self.section_Element_OwnedElements
	}
	


//	def dispatch section(Element self) {
//		'''
//		<section class="«self.eClass.name»">
//			<p>TODO: «self.eClass.name.escape» : «self.toString.escape»</p>
//		</section>'''
//	}

	def define(Property self) {
		'''
			<dt>«self.notation_Object»</dt>
			<dd>«self.doc»</dd>
		'''
	}

	def define(Operation self) {
		'''
			<dt>«self.notation_Object»</dt>
			<dd>«self.doc»</dd>
		'''
	}

	def print(Association self, Type context) {
		if (self.endTypes.size == 1) { // the same type is involved on all ends
			'''
				«FOR e : self.ownedEnds»
					«e.define»
				«ENDFOR»
			'''
		} else { // print only ends which type is not the context
			'''
				«FOR e : self.ownedEnds.filter[it|it.type != context]»
					«e.define»
				«ENDFOR»
			'''
		}
	}

	def doc(Element self) {
		val topic = site.getTopic(self)
		if (topic != null) {
			'''
				<div>
					<div class="abstract">«topic.^abstract.html»</div>
					<div>«topic.documentation.html»</div>
				</div>
			'''
		}
	}

	def dispatch link(Element self) {
		val topic = site.getTopic(self)
		if (topic != null) {
			return topic.link_EObject
		} else {
			return self.notation_Object
		}

	//		if (self instanceof NamedElement) {
	//		'''<a href="«href»">«(self as NamedElement).name.escape»</a>'''
	//		} else if (topic != null) {
	//			topic.link
	//		} else {
	//			""
	//		}
	}

	def dispatch link(Void self) {
		'''<code>null</code>'''
	}

}
