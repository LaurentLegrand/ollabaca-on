package org.ollabaca.on.mm.uml

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.renderers.Renderers
import org.ollabaca.on.site.renderers.Text

import static org.ollabaca.on.site.util.Sites.*

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.servlets.Ref.*
import static extension org.ollabaca.on.site.util.Html.*

class BookRenderers {

//	static val String PATH = "uml"
//
//	static val String BOOK = "book"
//
//	static val BookToHtml bookToHtml = new BookToHtml();
//	
//	static def register() {
//		Renderers::topicRenderers.registerLoader([true], [it.onTopic]);
//		
//		Renderers::topicRenderers.registerRenderer(PATH, [toSection]);
//		Renderers::topicRenderers.registerRenderer(BOOK, [toBook]);
//		
//	}
//
//	static def onTopic(Topic object) '''
//		<script>
//		$(document).ready(function() {
//			$("#properties").before("<div id='«PATH»'></div>");
//			$("#«PATH»").load("«scope(PATH, object).ref_Object»");
//		});
//		</script>
//	'''
//
//	static def Text toSection(Topic object) {
//		if (object.target instanceof Book) {
//			var text = '''<a href="«scope(BOOK, object).ref_Object»" target="_blank">Read more...</a">'''
//			return new Text("text/html", text);
//		}
//		return new Text("text/html", section(object.target));
//	}
//
//	static def Text toBook(Topic object) {
//		return new Text("text/html", bookToHtml.html_Book(object.target as Book));
//	}
//
//	static def dispatch section(EObject object) {
//		''''''
//	}
//	
//	static def dispatch section(Element object) {
//		Section_Element.section_Element(object)
//	}
//
//	static def dispatch section(Package object) {
//		val List<List<Topic>> rows = newArrayList()
//		var i = 0
//		var List<Topic> current = null
//		for (e : object.packagedElements) {
//			var t = site.getTopic(e)
//			if (t != null) {
//				if (i % 3 == 0) {
//					current = newArrayList()
//					rows.add(current)
//				}
//				current.add(t)
//				i = i + 1
//			}
//		}
//		'''
//			<section class="«object.eClass.name»">
//			
//			«FOR r : rows»
//				<div class="row-fluid">
//				«FOR t : r»
//					<div class="span4">
//						<h3>«t.title»: «t.type.link_EObject»</h3>
//						«t.^abstract.html»
//						<a class="btn" href="«t.ref_Object»">View details »</a>
//					</div>
//				«ENDFOR»
//				</div>
//			«ENDFOR»
//			</section>
//		'''
//	}
//	
////	static def dispatch section(Classifier object) {
////		object.section_Element_OwnedElements
////	}
//	
//
//
////	def dispatch section(Element object) {
////		'''
////		<section class="«object.eClass.name»">
////			<p>TODO: «object.eClass.name.escape» : «object.toString.escape»</p>
////		</section>'''
////	}
//
//	def define(Property object) {
//		'''
//			<dt>«object.notation_Object»</dt>
//			<dd>«object.doc»</dd>
//		'''
//	}
//
//	def define(Operation object) {
//		'''
//			<dt>«object.notation_Object»</dt>
//			<dd>«object.doc»</dd>
//		'''
//	}
//
//	def print(Association object, Type context) {
//		if (object.endTypes.size == 1) { // the same type is involved on all ends
//			'''
//				«FOR e : object.ownedEnds»
//					«e.define»
//				«ENDFOR»
//			'''
//		} else { // print only ends which type is not the context
//			'''
//				«FOR e : object.ownedEnds.filter[it|it.type != context]»
//					«e.define»
//				«ENDFOR»
//			'''
//		}
//	}
//
//	def doc(Element object) {
//		val topic = site.getTopic(object)
//		if (topic != null) {
//			'''
//				<div>
//					<div class="abstract">«topic.^abstract.html»</div>
//					<div>«topic.documentation.html»</div>
//				</div>
//			'''
//		}
//	}
//
//	def dispatch link(Element object) {
//		val topic = site.getTopic(object)
//		if (topic != null) {
//			return topic.link_EObject
//		} else {
//			return object.notation_Object
//		}
//
//	//		if (object instanceof NamedElement) {
//	//		'''<a href="«href»">«(object as NamedElement).name.escape»</a>'''
//	//		} else if (topic != null) {
//	//			topic.link
//	//		} else {
//	//			""
//	//		}
//	}
//
//	def dispatch link(Void object) {
//		'''<code>null</code>'''
//	}

}
