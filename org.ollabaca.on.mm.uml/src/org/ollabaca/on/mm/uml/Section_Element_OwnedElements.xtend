package org.ollabaca.on.mm.uml

import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Component
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.OpaqueBehavior
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Port
import org.eclipse.uml2.uml.UseCase
import org.ollabaca.on.site.util.Template

import static org.ollabaca.on.mm.uml.Layout_Element.*

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Ref.*
import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.mm.uml.util.BehavioralFeatures.*
import static extension org.ollabaca.on.mm.uml.util.BehavioredClassifiers.*
import static extension org.ollabaca.on.mm.uml.util.Classifiers.*
import static extension org.ollabaca.on.mm.uml.util.Constraints.*
import static extension org.ollabaca.on.mm.uml.util.Namespaces.*

class Section_Element_OwnedElements extends Template<Element> {
	
	public static val instance = new Section_Element_OwnedElements()
	
	static def CharSequence section_Element_OwnedElements(Element object) {
		instance.transform(object)
	}
	
	
	
//	static def dispatch CharSequence section_Element_OwnedElements(Environment object) '''
//		«layout_Element(object.ref_Object.toString + "-Nodes", "Nodes", object, [it.table_Environment_Nodes], null)»
//		«layout_Element(object.ref_Object.toString + "-Deployments", "Deployments", object, [it.table_Environment_Deployments], null)»
//		«layout_Element(object.ref_Object.toString + "-CommunicationPaths", "Communication Paths", object, null, null)»
//	'''	
	
	def dispatch CharSequence doFallback(UseCase object) '''
		«_doFallback(object as Classifier)»
		«layout_Element(object.ref_Object.toString + "-OwnedRules", "Constraints", object, [ordered_list_Namespace_OwnedRules], null)»
		«layout_Element(object.ref_Object.toString + "-OwnedBehaviors", "Behaviors", object, null, [section_BehavioredClassifier_OwnedBehaviors])»
	'''
	
	def dispatch CharSequence doFallback(Classifier object) '''
		«layout_Element(object.ref_Object.toString + "-Generals", "Generalizations", object, [ul_Classifier_Generals], null)»
		«layout_Element(object.ref_Object.toString + "-Attributes", "Attributes", object, [dl_Classifier_Attributes], null)»
		«layout_Element(object.ref_Object.toString + "-Associations", "Associations", object, [dl_Classifier_Associations], null)»
		«layout_Element(object.ref_Object.toString + "-Operations", "Operations", object, [dl_Classifier_Operations], null)»
	'''

	def dispatch CharSequence doFallback(Component object) '''
		«layout_Element(object.ref_Object.toString + "-Generals", "Generalizations", object, [ul_Classifier_Generals], null)»
		«layout_Element(object.ref_Object.toString + "-Required", "Required Interfaces", object, [ul(it.requireds, [it.link_EObject])], null)»
		«layout_Element(object.ref_Object.toString + "-Provided", "Provided Interfaces", object, [ul(it.provideds, [it.link_EObject])], null)»
		«layout_Element(object.ref_Object.toString + "-Parts", "Parts", object, [dl_Classifier_Attributes], null)»
	'''

	def dispatch CharSequence doFallback(Operation object) '''
		«layout_Element(object.ref_Object.toString + "-RaisedExceptions", "Raised Exceptions", object, [dl_BehavioralFeature_RaisedException], null)»
		«layout_Element(object.ref_Object.toString + "-Preconditions", "Preconditions", object, [ol(it.preconditions, [it.div_Constraint])], null)»
		«layout_Element(object.ref_Object.toString + "-Postconditions", "Postconditions", object, [ol(it.postconditions, [it.div_Constraint])], null)»
	'''
	
	def dispatch CharSequence doFallback(OpaqueBehavior object) '''
		«layout_Element(object.ref_Object.toString + "-Postconditions", "Postconditions", object, [ol(it.postconditions, [it.div_Constraint])], null)»
		«layout_Element(object.ref_Object.toString + "-Body", "Body", object, [it | ul(it.bodies, [it.html])], null)»
	'''
	
	def dispatch CharSequence doFallback(Port object) '''
		«layout_Element(object.ref_Object.toString + "-Required", "Required Interfaces", object, [ul(it.requireds, [it.link_EObject])], null)»
		«layout_Element(object.ref_Object.toString + "-Provided", "Provided Interfaces", object, [ul(it.provideds, [it.link_EObject])], null)»
	'''
	
	def dispatch CharSequence doFallback(Element object) '''
		<! -- TODO : «object.toString» -->
	'''
	
	
}