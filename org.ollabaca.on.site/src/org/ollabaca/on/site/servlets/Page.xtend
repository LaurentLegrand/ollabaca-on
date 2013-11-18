package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.util.Template

class Page extends Template<EObject> {

	public static val Page instance = new Page()

	static def page_EObject(EObject self) {
		instance.apply(self)
	}

	override protected doFallback(EObject self) '''
		<!DOCTYPE html>
		<html lang="en">
		«Head::head_EObject(self)»
		«Body::body_EObject(self)»
		</html>
	'''
}
