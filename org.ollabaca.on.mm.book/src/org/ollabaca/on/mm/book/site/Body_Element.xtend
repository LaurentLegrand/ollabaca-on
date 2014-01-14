package org.ollabaca.on.mm.book.site

import org.eclipse.uml2.uml.Element

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.mm.book.site.BookElements.*
import org.ollabaca.on.mm.book.BookElement
import org.ollabaca.on.mm.book.Section

class Body_Element {
	
	def static dispatch CharSequence body_Element(BookElement self) { 
		self.toc_BookElement
	}
	
	def static dispatch CharSequence body_Element(Section self) '''
		«_body_Element(self as BookElement)»
		«		table(self.elements, #[], #[
			column("Title", [it.link_EObject]), // TODO local link
			column("Description", [it.abstract_EObject])
		])
		»
	'''
	
	def static dispatch body_Element(Element self) '''
	'''
}