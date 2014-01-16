package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.Classifier

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class Classifiers {

	static def CharSequence dl_Classifier_Associations(Classifier self) {
		dl(Types::getAssociationEnds(self), [it.notation_Object], [it.documentation_EObject])
	}

	static def CharSequence ul_Classifier_Generals(Classifier self) {

		// TODO local link!!!!
		ul(self.generals, [it.link_EObject])
	}

	static def dl_Classifier_Attributes(Classifier self) {
		dl(self.attributes, [it.notation_Object], [it.documentation_EObject])
	}

	static def dl_Classifier_Operations(Classifier self) {
		dl(self.operations, [it.notation_Object], [it.documentation_EObject])
	}

}
