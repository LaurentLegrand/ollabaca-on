package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Named
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.util.Template

import static extension org.ollabaca.on.site.util.Sites.*

class Title extends Template<Element> {

	public static val Title instance = new Title()

	static def title_Element(Element object) {
		instance.transform(object)
	}

	dispatch def CharSequence doFallback(Site object) 
		'''«object.name»'''
		
	dispatch def CharSequence doFallback(EObject object) 
		'''«object.site_Object.name» - «object.topic_EObject.title»'''
	
	dispatch def CharSequence doFallback(Element object) 
		'''«object.site_Object.name»'''
		
	dispatch def CharSequence doFallback(Named object) 
		'''«object.site_Object.name» - «object.name»'''
		
	dispatch def CharSequence doFallback(Void object) {
		""
	}
}
