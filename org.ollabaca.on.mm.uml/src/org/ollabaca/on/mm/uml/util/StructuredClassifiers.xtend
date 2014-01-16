package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.StructuredClassifier

import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class StructuredClassifiers {
	
	def definition_list_StructuredClassifier_Parts(StructuredClassifier self) {
		dl(self.parts, [it.notation_Object], [it.documentation_EObject])
	}
}