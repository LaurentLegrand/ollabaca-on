package org.ollabaca.on.mm.book.site

import org.eclipse.uml2.uml.Element
import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.mm.book.Part
import org.ollabaca.on.mm.book.Section
import org.ollabaca.on.mm.uml.Section_Element

class Section_BookElement_OwnedElements {
	
	static dispatch def CharSequence section_Element_OwnedElements(Element object) ''''''
	
	static def dispatch CharSequence section_Element_OwnedElements(Book object) '''
		«FOR e: object.parts»
			«Section_Element.section_Element(e)»
		«ENDFOR»
	'''
	
	static def dispatch CharSequence section_Element_OwnedElements(Part object) '''
		«FOR e: object.chapters»
			«Section_Element.section_Element(e)»
		«ENDFOR»
	'''
	
	static def dispatch section_Element_OwnedElements(Section object) '''
		«FOR e: object.elements»
			«Section_Element::section_Element(e)»
		«ENDFOR»
		«FOR e: object.sections»
			«Section_Element::section_Element(e)»
		«ENDFOR»
	'''
		
}