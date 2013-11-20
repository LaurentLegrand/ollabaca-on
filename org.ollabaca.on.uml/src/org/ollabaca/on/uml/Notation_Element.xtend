package org.ollabaca.on.uml

import java.util.List
import org.eclipse.uml2.uml.BehavioralFeature
import org.eclipse.uml2.uml.Element
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
import org.ollabaca.on.site.util.Sites
import org.ollabaca.on.uml.book.BookElement
import org.ollabaca.on.uml.util.BookElements

import static extension org.ollabaca.on.site.servlets.Link.*

class Notation_Element {

	static def register() {
		Notation::instance.register(typeof(Element), [if(it instanceof Element) notation_Element(it as Element)])
		Sites::topic.register(typeof(BookElement),
			[if(it instanceof BookElement) BookElements::topic_BookElement(it as BookElement)]) // TODO refactor
	}

	static def dispatch CharSequence notation_Element(Element self) {
	}

	static def dispatch CharSequence notation_Element(Property self) {

		val definition = new StringBuilder
		if (self.derived) {
			definition.append('/')
		}

		definition.append(self.visibility.notation_Element).append(self.link_EObject).append(":&nbsp;").append(
			self.type.link_EObject).append(self.notation_Multiplicity)

		if (self.setDefault) {
			definition.append(" = ").append(self.^default)
		}
		val List<String> modifiers = newArrayList()
		if (self.readOnly) {
			modifiers.add("readOnly")
		}
		if (self.derivedUnion) {
			modifiers.add("union")
		}
		for (Property e : self.subsettedProperties) {
			modifiers.add("subsets " + e.link_EObject)
		}
		for (Property e : self.redefinedProperties) {
			modifiers.add("redefines " + e.link_EObject)
		}
		if (self.ordered) {
			modifiers.add("ordered")
		}
		if (self.unique && self.multivalued) {
			modifiers.add("unique")
		}
		if (self.isID) {
			modifiers.add("id")
		}

		'''<code>«definition»«FOR e : modifiers BEFORE " { " SEPARATOR ", " AFTER " } "»«e»«ENDFOR»</code>'''
	}
	
	static def dispatch CharSequence notation_Element(Operation self) {
		val definition = new StringBuilder
		
		definition.append(self.visibility.notation_Element).append(self.link_EObject)
		
		definition.append(notation_BehavioralFeature_OwnedParameters(self))
		
		if (!self.returnResult.empty) {
			val ret = self.returnResult.head
			definition.append(":&nbsp;").
			append(ret.type.link_EObject).append(ret.notation_Multiplicity)
		}
		
		val List<String> modifiers = newArrayList()
		if (self.query) {
			modifiers.add("query")
		}
		for (e : self.redefinedOperations) {
			modifiers.add("redefines " + e.link_EObject)
		}
		if (self.ordered) {
			modifiers.add("ordered")
		}
		if (self.unique) {
			modifiers.add("unique")
		}
		
		'''<code>«definition»«FOR e : modifiers BEFORE " { " SEPARATOR ", " AFTER " } "»«e»«ENDFOR»</code>'''
	}

	static def dispatch CharSequence notation_Element(Parameter self) {
		val definition = new StringBuilder

		definition.append(self.direction.notation_Element).append("&nbsp;").append(self.link_EObject).append(":&nbsp;").
			append(self.type.link_EObject).append(self.notation_Multiplicity)

		if (self.setDefault) {
			definition.append(" = ").append(self.^default)
		}

		'''«definition»'''
	}

	static def CharSequence notation_BehavioralFeature_OwnedParameters(BehavioralFeature self) '''(«FOR e : self.
		ownedParameters.filter[direction != ParameterDirectionKind::RETURN_LITERAL] SEPARATOR ", "»«e.notation_Element»«ENDFOR»)'''

	static def CharSequence notation_Multiplicity(MultiplicityElement self) {
		switch self {
			case self.lower == 0 && self.upper == 0:
				""
			case self.lower == 1 && self.upper == 1:
				"[1]"
			case self.upper > 0: '''[«self.lower»..«self.upper»]'''
			default: '''[«self.lower»..*]'''
		}
	}

	static def dispatch CharSequence notation_Element(ParameterDirectionKind self) {
		switch self {
			case ParameterDirectionKind::IN_LITERAL: 'in'
			case ParameterDirectionKind::OUT_LITERAL: 'out'
			case ParameterDirectionKind::INOUT_LITERAL: 'inout'
			case ParameterDirectionKind::RETURN_LITERAL: 'return'
		}
	}

	static def dispatch CharSequence notation_Element(VisibilityKind self) {
		switch self {
			case VisibilityKind::PUBLIC_LITERAL: '+'
			case VisibilityKind::PRIVATE_LITERAL: '-'
			case VisibilityKind::PROTECTED_LITERAL: '#'
			case VisibilityKind::PACKAGE_LITERAL: '~'
		}
	}

	static def dispatch CharSequence notation_Element(LiteralBoolean self) {
		'''<code>«self.value»</code> as <code>Boolean</code>'''
	}

	static def dispatch CharSequence notation_Element(LiteralUnlimitedNatural self) {
		'''<code>«self.value»</code> as <code>UnlimitedNatural</code>'''
	}

	static def dispatch CharSequence notation_Element(LiteralInteger self) {
		'''<code>«self.value»</code> as <code>Integer</code>'''
	}

	static def dispatch CharSequence notation_Element(LiteralString self) {
		'''<code>«self.value»</code> as <code>String</code>'''
	}

}
