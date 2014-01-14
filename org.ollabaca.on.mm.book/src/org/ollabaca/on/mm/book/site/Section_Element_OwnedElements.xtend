package org.ollabaca.on.mm.book.site

import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Component
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.OpaqueBehavior
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Port
import org.eclipse.uml2.uml.UseCase
import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.mm.book.Part
import org.ollabaca.on.mm.book.Section
//import org.ollabaca.on.mm.todo.Environment

import static org.ollabaca.on.uml.Layout_Element.*

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Ref.*
import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.uml.util.BehavioralFeatures.*
import static extension org.ollabaca.on.mm.book.site.BehavioredClassifiers.*
import static extension org.ollabaca.on.uml.util.Classifiers.*
import static extension org.ollabaca.on.uml.util.Constraints.*
import static extension org.ollabaca.on.uml.util.Namespaces.*
import static extension org.ollabaca.on.uml.util.Environments.*
import org.ollabaca.on.mm.book.Book

class Section_Element_OwnedElements {
	
	static dispatch def CharSequence section_Element_OwnedElements(Element self) ''''''
	
	static def dispatch CharSequence section_Element_OwnedElements(Book self) '''
		«FOR e: self.parts»
			«Section_Element.section_Element(e)»
		«ENDFOR»
	'''
	
	static def dispatch CharSequence section_Element_OwnedElements(Part self) '''
		«FOR e: self.chapters»
			«Section_Element.section_Element(e)»
		«ENDFOR»
	'''
	
//	static def dispatch CharSequence section_Element_OwnedElements(Environment self) '''
//		«layout_Element(self.ref_Object.toString + "-Nodes", "Nodes", self, [it.table_Environment_Nodes], null)»
//		«layout_Element(self.ref_Object.toString + "-Deployments", "Deployments", self, [it.table_Environment_Deployments], null)»
//		«layout_Element(self.ref_Object.toString + "-CommunicationPaths", "Communication Paths", self, null, null)»
//	'''	
	
	static def dispatch CharSequence section_Element_OwnedElements(UseCase self) '''
		«_section_Element_OwnedElements(self as Classifier)»
		«layout_Element(self.ref_Object.toString + "-OwnedRules", "Constraints", self, [ordered_list_Namespace_OwnedRules], null)»
		«layout_Element(self.ref_Object.toString + "-OwnedBehaviors", "Behaviors", self, null, [section_BehavioredClassifier_OwnedBehaviors])»
	'''
	
	static def dispatch CharSequence section_Element_OwnedElements(Classifier self) '''
		«layout_Element(self.ref_Object.toString + "-Generals", "Generalizations", self, [ul_Classifier_Generals], null)»
		«layout_Element(self.ref_Object.toString + "-Attributes", "Attributes", self, [dl_Classifier_Attributes], null)»
		«layout_Element(self.ref_Object.toString + "-Associations", "Associations", self, [dl_Classifier_Associations], null)»
		«layout_Element(self.ref_Object.toString + "-Operations", "Operations", self, [dl_Classifier_Operations], null)»
	'''

	static def dispatch CharSequence section_Element_OwnedElements(Component self) '''
		«layout_Element(self.ref_Object.toString + "-Generals", "Generalizations", self, [ul_Classifier_Generals], null)»
		«layout_Element(self.ref_Object.toString + "-Required", "Required Interfaces", self, [ul(it.requireds, [it.link_EObject])], null)»
		«layout_Element(self.ref_Object.toString + "-Provided", "Provided Interfaces", self, [ul(it.provideds, [it.link_EObject])], null)»
		«layout_Element(self.ref_Object.toString + "-Parts", "Parts", self, [dl_Classifier_Attributes], null)»
	'''

	static def dispatch CharSequence section_Element_OwnedElements(Operation self) '''
		«layout_Element(self.ref_Object.toString + "-RaisedExceptions", "Raised Exceptions", self, [dl_BehavioralFeature_RaisedException], null)»
		«layout_Element(self.ref_Object.toString + "-Preconditions", "Preconditions", self, [ol(it.preconditions, [it.div_Constraint])], null)»
		«layout_Element(self.ref_Object.toString + "-Postconditions", "Postconditions", self, [ol(it.postconditions, [it.div_Constraint])], null)»
	'''
	
	static def dispatch CharSequence section_Element_OwnedElements(OpaqueBehavior self) '''
		«layout_Element(self.ref_Object.toString + "-Postconditions", "Postconditions", self, [ol(it.postconditions, [it.div_Constraint])], null)»
		«layout_Element(self.ref_Object.toString + "-Body", "Body", self, [it | ul(it.bodies, [it.html])], null)»
	'''
	
	static def dispatch CharSequence section_Element_OwnedElements(Port self) '''
		«layout_Element(self.ref_Object.toString + "-Required", "Required Interfaces", self, [ul(it.requireds, [it.link_EObject])], null)»
		«layout_Element(self.ref_Object.toString + "-Provided", "Provided Interfaces", self, [ul(it.provideds, [it.link_EObject])], null)»
	'''
	
	static def dispatch section_Element_OwnedElements(Section self) '''
		«FOR e: self.elements»
			«Section_Element::section_Element(e)»
		«ENDFOR»
		«FOR e: self.sections»
			«Section_Element::section_Element(e)»
		«ENDFOR»
	'''
		
}