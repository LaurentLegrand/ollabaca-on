package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.util.Template

class Features extends Template<EObject> {
	
	public static val instance = new Features();
	
	static def CharSequence features_EObject(EObject object) {
		instance.transform(object)
	}
	
	dispatch def protected doFallback(EObject object) {
		""
	}
	
	dispatch def protected doFallback(Void object) {
		""
	}
	
}