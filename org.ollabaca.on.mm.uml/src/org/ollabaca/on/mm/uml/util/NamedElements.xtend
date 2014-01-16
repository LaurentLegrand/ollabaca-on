package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.NamedElement

import static extension org.ollabaca.on.site.servlets.Link.*

class NamedElements {

	static def link_NamedElement(NamedElement self) '''«FOR e : self.allNamespaces.reverse SEPARATOR "::" AFTER "::"»«e.
		link_EObject»«ENDFOR»«self.link_EObject»'''

}
