package org.ollabaca.on.mm.uml

import java.util.List
import org.eclipse.uml2.uml.BehavioralFeature
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Generalization
import org.eclipse.uml2.uml.LiteralBoolean
import org.eclipse.uml2.uml.LiteralInteger
import org.eclipse.uml2.uml.LiteralString
import org.eclipse.uml2.uml.LiteralUnlimitedNatural
import org.eclipse.uml2.uml.MultiplicityElement
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.ParameterDirectionKind
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.VisibilityKind
import org.ollabaca.on.site.servlets.Notation

import static extension org.ollabaca.on.site.servlets.Link.*

class Notation_Element {

	static def register() {
		Notation::instance.register(typeof(Element), [if(it instanceof Element) notation_Element(it as Element)])
	}

	static def dispatch CharSequence notation_Element(Element object) {
	}

	static def dispatch CharSequence notation_Element(Property object) {

		val definition = new StringBuilder
		if (object.derived) {
			definition.append('/')
		}

		definition.append(object.visibility.notation_Element).append(object.link_EObject).append(":&nbsp;").append(
			object.type.link_EObject).append(object.notation_Multiplicity)

		if (object.setDefault) {
			definition.append(" = ").append(object.^default)
		}
		val List<String> modifiers = newArrayList()
		if (object.readOnly) {
			modifiers.add("readOnly")
		}
		if (object.derivedUnion) {
			modifiers.add("union")
		}
		for (Property e : object.subsettedProperties) {
			modifiers.add("subsets " + e.link_EObject)
		}
		for (Property e : object.redefinedProperties) {
			modifiers.add("redefines " + e.link_EObject)
		}
		if (object.ordered) {
			modifiers.add("ordered")
		}
		if (object.unique && object.multivalued) {
			modifiers.add("unique")
		}
		if (object.isID) {
			modifiers.add("id")
		}

		'''<code>«definition»«FOR e : modifiers BEFORE " { " SEPARATOR ", " AFTER " } "»«e»«ENDFOR»</code>'''
	}
	
	static def dispatch CharSequence notation_Element(Operation that) {
		val definition = new StringBuilder
		
		definition.append(that.visibility.notation_Element).append(that.link_EObject)
		
		definition.append(notation_BehavioralFeature_OwnedParameters(that))
		
		if (!that.returnResult().empty) {
			val ret = that.returnResult().head
			definition.append(":&nbsp;").
			append(ret.type.link_EObject).append(ret.notation_Multiplicity)
		}
		
		val List<String> modifiers = newArrayList()
		if (that.query) {
			modifiers.add("query")
		}
		for (e : that.redefinedOperations) {
			modifiers.add("redefines " + e.link_EObject)
		}
		if (that.ordered) {
			modifiers.add("ordered")
		}
		if (that.unique) {
			modifiers.add("unique")
		}
		
		'''<code>«definition»«FOR e : modifiers BEFORE " { " SEPARATOR ", " AFTER " } "»«e»«ENDFOR»</code>'''
	}

	static def dispatch CharSequence notation_Element(Parameter object) {
		val definition = new StringBuilder

		definition.append(object.direction.notation_Element).append("&nbsp;").append(object.link_EObject).append(":&nbsp;").
			append(object.type.link_EObject).append(object.notation_Multiplicity)

		if (object.setDefault) {
			definition.append(" = ").append(object.^default)
		}

		'''«definition»'''
	}

	static def CharSequence notation_BehavioralFeature_OwnedParameters(BehavioralFeature object) '''(«FOR e : object.
		ownedParameters.filter[direction != ParameterDirectionKind::RETURN_LITERAL] SEPARATOR ", "»«e.notation_Element»«ENDFOR»)'''

	static def CharSequence notation_Multiplicity(MultiplicityElement object) {
		switch object {
			case object.lower == 0 && object.upper == 0:
				""
			case object.lower == 1 && object.upper == 1:
				"[1]"
			case object.upper > 0: '''[«object.lower»..«object.upper»]'''
			default: '''[«object.lower»..*]'''
		}
	}

	static def dispatch CharSequence notation_Element(ParameterDirectionKind object) {
		switch object {
			case ParameterDirectionKind::IN_LITERAL: 'in'
			case ParameterDirectionKind::OUT_LITERAL: 'out'
			case ParameterDirectionKind::INOUT_LITERAL: 'inout'
			case ParameterDirectionKind::RETURN_LITERAL: 'return'
		}
	}

	static def dispatch CharSequence notation_Element(VisibilityKind object) {
		switch object {
			case VisibilityKind::PUBLIC_LITERAL: '+'
			case VisibilityKind::PRIVATE_LITERAL: '-'
			case VisibilityKind::PROTECTED_LITERAL: '#'
			case VisibilityKind::PACKAGE_LITERAL: '~'
		}
	}

	static def dispatch CharSequence notation_Element(LiteralBoolean object) {
		'''<code>«object.value»</code> as <code>Boolean</code>'''
	}

	static def dispatch CharSequence notation_Element(LiteralUnlimitedNatural object) {
		'''<code>«object.value»</code> as <code>UnlimitedNatural</code>'''
	}

	static def dispatch CharSequence notation_Element(LiteralInteger object) {
		'''<code>«object.value»</code> as <code>Integer</code>'''
	}

	static def dispatch CharSequence notation_Element(LiteralString object) {
		'''<code>«object.value»</code> as <code>String</code>'''
	}
	
	static def dispatch CharSequence notation_Element(Generalization object) {
		'''«object.specific.link_EObject» &#8680; «object.general.link_EObject»'''
	}

}
