package org.ollabaca.on.mm.book.site

import org.ollabaca.on.mm.book.BookElement
import org.ollabaca.on.mm.book.Section

import static extension org.ollabaca.on.mm.book.site.BookElements.*
import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.util.Html.*

class Body_BookElement {
	
	def static dispatch CharSequence body_BookElement(BookElement self) { 
		self.toc_BookElement
	}
	
	def static dispatch CharSequence body_BookElement(Section self) '''
		«_body_BookElement(self as BookElement)»
		«table(self.elements, #[], #[
			column("Title", [it.link_EObject]), // TODO local link
			column("Description", [it.abstract_EObject])
		])
		»
	'''
	
}