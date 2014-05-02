package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.Classifier

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*
import org.eclipse.uml2.uml.Operation

class Classifiers {

	static def CharSequence dl_Classifier_Associations(Classifier object) {
		dl(Types::getAssociationEnds(object), [it.notation_Object], [it.documentation_EObject])
	}

	static def CharSequence ul_Classifier_Generals(Classifier object) {

		// TODO local link!!!!
		ul(object.generals, [it.link_EObject])
	}

	static def dl_Classifier_Attributes(Classifier object) {
		dl(object.attributes.filter[it.association == null], [it.notation_Object], [it.documentation_EObject])
	}

	static def dl_Classifier_Operations(Classifier object) {
		dl(object.operations, [it.notation_Object], [Operation it |
			'''
			«it.documentation_EObject»
			«it.dl_Operation_Parameters»
			'''
		])
	}
	
	
	static def dl_Operation_Parameters(Operation object) {
		dl(object.ownedParameters, 
			#[attr("class", ["dl-horizontal"])], 
			content([it.notation_Object]), 
			content([it.documentation_EObject])
		)
	}

}
