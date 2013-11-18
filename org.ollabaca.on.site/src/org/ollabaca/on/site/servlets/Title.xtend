package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.util.Template
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import static extension org.ollabaca.on.site.util.Sites.*

class Title extends Template<EObject> {

	public static val Title instance = new Title()

	static def title_EObject(EObject self) {
		instance.apply(self)
	}

	dispatch def CharSequence doFallback(EObject self) 
		'''«self.site_Object» - «self.toString»'''
	
	dispatch def CharSequence doFallback(EClass self) 
		'''«self.site_Object» - «self.name»'''
		
	dispatch def CharSequence doFallback(Void self) {
		""
	}
}
