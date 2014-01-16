package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.Namespace

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.mm.uml.util.Constraints.*

class Namespaces {
	
	static def ordered_list_Namespace_OwnedRules(Namespace object) {
		ol(object.ownedRules, #[], content([it.div_Constraint]))
	}
}