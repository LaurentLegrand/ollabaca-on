package org.ollabaca.on.mm.book.site

import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.mm.book.BookElement
import org.ollabaca.on.mm.book.Part
import org.ollabaca.on.mm.book.Section

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.servlets.Link.*

class BookElement_OwnedElements {
	
	static def dispatch CharSequence ul_BookElement_OwnedElements(BookElement self) '''
	'''
	
	static def dispatch CharSequence ul_BookElement_OwnedElements(Book self) {
		ul(self.parts, [''' «it.link_EObject» «it.ul_BookElement_OwnedElements»''']) // TODO local link
	}
	
	static def dispatch CharSequence ul_BookElement_OwnedElements(Part self) {
		ul(self.chapters, [ ''' «it.link_EObject» «it.ul_BookElement_OwnedElements»''']) // TODO local link
	}

	static def dispatch CharSequence ul_BookElement_OwnedElements(Section self) {
		if (self.elements.empty && self.sections.empty) {
			return ""
		}
		tag(self, "ul", 
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