package org.ollabaca.on.mm.uml

import org.eclipse.uml2.uml.Element
import org.ollabaca.on.site.util.Template

class Body_Element extends Template<Element> {
	
	public static val instance = new Body_Element()
	
	def static CharSequence body_Element(Element object) {
		return instance.transform(object)
	}
	
	override CharSequence doFallback(Element object) ''''''
	
}