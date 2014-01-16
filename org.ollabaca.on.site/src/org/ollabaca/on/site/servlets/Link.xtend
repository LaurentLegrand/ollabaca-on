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

	static def link_EObject(EObject object) {
		instance.transform(object)
	}

	def dispatch CharSequence doFallback(Void object) {
		"null"
	}

	def dispatch CharSequence doFallback(Named object) {
		'''<a href="«Ref::ref_Object(object)»">«object.name»</a>'''
	}

	def dispatch CharSequence doFallback(Type object) {
		'''<a href="«Ref::ref_Object(object)»">«object.name.split("\\.").last»</a>'''
	}

	def dispatch CharSequence doFallback(Topic object) {
		'''<a href="«Ref::ref_Object(object)»">«object.title.span»</a>'''
	}


	def dispatch CharSequence doFallback(EClass object) {
		val type = Sites::type_EClass(object)
		if (type == null) {
			object.name
		} else {
			link_EObject(type)
		}		
	}
	
	def dispatch CharSequence doFallback(EObject object) {
		val topic = Sites::topic_EObject(object)
		if (topic == null) {
			object.toString
		} else {
			link_EObject(topic)
		}		
	}

	def dispatch CharSequence doFallback(Element object) {
		link_EObject(Sites::site)
	}

}
