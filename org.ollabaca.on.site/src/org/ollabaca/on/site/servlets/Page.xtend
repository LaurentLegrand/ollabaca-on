package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.util.Template

class Page extends Template<Element> {

	public static val Page instance = new Page()

	static def page_Element(Element self) {
		instance.transform(self)
	}

	override protected doFallback(Element self) '''
		<!DOCTYPE html>
		<html lang="en">
		«Head::head_Element(self)»
		«Body::body_Element(self)»
		</html>
	'''
}
