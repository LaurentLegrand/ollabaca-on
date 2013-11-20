package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Named
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.util.Sites
import org.ollabaca.on.site.util.Template

import static extension org.ollabaca.on.site.util.Html.*

class Link extends Template<EObject> {

	public static val Link instance = new Link()

	static def link_EObject(EObject self) {
		instance.apply(self)
	}

	def dispatch CharSequence doFallback(Void self) {
		"null"
	}

	def dispatch CharSequence doFallback(Named self) {
		'''<a href="«Ref::ref_Object(self)»">«self.name»</a>'''
	}

	def dispatch CharSequence doFallback(Type self) {
		'''<a href="«Ref::ref_Object(self)»">«self.name.split("\\.").last»</a>'''
	}

	def dispatch CharSequence doFallback(Topic self) {
		'''<a href="«Ref::ref_Object(self)»">«self.title.span»</a>'''
	}


	def dispatch CharSequence doFallback(EClass self) {
		val type = Sites::type_EClass(self)
		if (type == null) {
			self.name
		} else {
			link_EObject(type)
		}		
	}
	
	def dispatch CharSequence doFallback(EObject self) {
		val topic = Sites::topic_EObject(self)
		if (topic == null) {
			self.toString
		} else {
			link_EObject(topic)
		}		
	}

	def dispatch CharSequence doFallback(Element self) {
		link_EObject(Sites::site)
	}

}
