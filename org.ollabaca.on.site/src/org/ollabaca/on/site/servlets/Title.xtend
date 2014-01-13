package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Named
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.util.Template

import static extension org.ollabaca.on.site.util.Sites.*

class Title extends Template<Element> {

	public static val Title instance = new Title()

	static def title_Element(Element self) {
		instance.transform(self)
	}

	dispatch def CharSequence doFallback(Site self) 
		'''«self.name»'''
		
	dispatch def CharSequence doFallback(EObject self) 
		'''«self.site_Object.name» - «self.topic_EObject.title»'''
	
	dispatch def CharSequence doFallback(Element self) 
		'''«self.site_Object.name»'''
		
	dispatch def CharSequence doFallback(Named self) 
		'''«self.site_Object.name» - «self.name»'''
		
	dispatch def CharSequence doFallback(Void self) {
		""
	}
}
