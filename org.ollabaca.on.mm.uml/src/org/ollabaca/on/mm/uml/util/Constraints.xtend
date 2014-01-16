package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.Constraint

import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class Constraints {

	static def div_Constraint(Constraint object) '''
		<div>«object.documentation_EObject»</div>
		<div>«object.notation_Object»</div>
	'''
}
