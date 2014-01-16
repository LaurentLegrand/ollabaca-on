package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.NamedElement

import static extension org.ollabaca.on.site.servlets.Link.*

class NamedElements {

	static def link_NamedElement(NamedElement object) '''«FOR e : object.allNamespaces.reverse SEPARATOR "::" AFTER "::"»«e.
		link_EObject»«ENDFOR»«object.link_EObject»'''

}
