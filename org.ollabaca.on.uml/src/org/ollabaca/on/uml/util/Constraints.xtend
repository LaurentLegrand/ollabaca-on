package org.ollabaca.on.uml.util

import org.eclipse.uml2.uml.Constraint

import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class Constraints {

	static def div_Constraint(Constraint self) '''
		<div>�self.documentation_EObject�</div>
		<div>�self.notation_Object�</div>
	'''
}
