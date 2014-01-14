package org.ollabaca.on.mm.book.site

import org.ollabaca.on.site.Topic

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.util.Sites.*
import static extension org.ollabaca.on.mm.book.site.BookElement_OwnedElements.*
import org.ollabaca.on.mm.book.BookElement

class BookElements {

	def static CharSequence toc_BookElement(BookElement self) {
		tag(self, "nav", [it.ul_BookElement_OwnedElements])
	}

	def static Topic topic_BookElement(BookElement self) {
		if (self.documentation != null) {
			self.documentation.topic_EObject
		} else {
			self.topic_fallback
		}
	}
}
