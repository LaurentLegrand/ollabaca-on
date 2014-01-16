package org.ollabaca.on.mm.book.site

import org.eclipse.uml2.uml.Element
import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.mm.book.Part
import org.ollabaca.on.mm.book.Section
import org.ollabaca.on.mm.uml.Section_Element

class Section_BookElement_OwnedElements {
	
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
	
	static def dispatch section_Element_OwnedElements(Section self) '''
		«FOR e: self.elements»
			«Section_Element::section_Element(e)»
		«ENDFOR»
		«FOR e: self.sections»
			«Section_Element::section_Element(e)»
		«ENDFOR»
	'''
		
}