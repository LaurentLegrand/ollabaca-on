package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.BehavioralFeature

import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class BehavioralFeatures {

	static def CharSequence dl_BehavioralFeature_RaisedException(BehavioralFeature object) {
		dl(object.raisedExceptions, [it.notation_Object], [it.abstract_EObject])
	}

}
