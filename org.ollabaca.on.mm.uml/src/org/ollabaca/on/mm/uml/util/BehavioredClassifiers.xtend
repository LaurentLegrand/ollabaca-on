package org.ollabaca.on.mm.uml.util

import org.eclipse.uml2.uml.BehavioredClassifier
import org.ollabaca.on.mm.uml.Section_Element

class BehavioredClassifiers {

	static def CharSequence section_BehavioredClassifier_OwnedBehaviors(BehavioredClassifier self) '''
		«FOR e : self.ownedBehaviors»
			«Section_Element.section_Element(e)»
		«ENDFOR»
	'''

}
