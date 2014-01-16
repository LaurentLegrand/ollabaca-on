package org.ollabaca.on.mm.uml

import org.eclipse.uml2.uml.Element
import org.ollabaca.on.site.util.Template

class Body_Element extends Template<Element> {
	
	public static val instance = new Body_Element()
	
	def static CharSequence body_Element(Element self) {
		return instance.transform(self)
	}
	
	override CharSequence doFallback(Element self) ''''''
	
}