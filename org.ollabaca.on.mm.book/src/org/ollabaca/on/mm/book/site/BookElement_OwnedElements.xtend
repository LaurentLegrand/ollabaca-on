package org.ollabaca.on.mm.book.site

import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.mm.book.BookElement
import org.ollabaca.on.mm.book.Part
import org.ollabaca.on.mm.book.Section

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.servlets.Link.*

class BookElement_OwnedElements {
	
	static def dispatch CharSequence ul_BookElement_OwnedElements(BookElement object) '''
	'''
	
	static def dispatch CharSequence ul_BookElement_OwnedElements(Book object) {
		ul(object.parts, [''' «it.link_EObject» «it.ul_BookElement_OwnedElements»''']) // TODO local link
	}
	
	static def dispatch CharSequence ul_BookElement_OwnedElements(Part object) {
		ul(object.chapters, [ ''' «it.link_EObject» «it.ul_BookElement_OwnedElements»''']) // TODO local link
	}

	static def dispatch CharSequence ul_BookElement_OwnedElements(Section object) {
		if (object.elements.empty && object.sections.empty) {
			return ""
		}
		tag(object, "ul", 
			[
				'''
				«FOR e: it.elements»
					<li>«e.link_EObject»</li> ««« // TODO local link
				«ENDFOR»
				«FOR e: it.sections»
					<li>«e.link_EObject» ««« // TODO local link
						«e.ul_BookElement_OwnedElements»
					</li>
				«ENDFOR»
				'''
			]
		)
	}
}