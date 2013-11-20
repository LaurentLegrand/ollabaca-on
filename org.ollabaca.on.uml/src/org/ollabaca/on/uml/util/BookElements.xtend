package org.ollabaca.on.uml.util

import org.ollabaca.on.site.Topic
import org.ollabaca.on.uml.book.BookElement

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.util.Sites.*
import static extension org.ollabaca.on.uml.util.BookElement_OwnedElements.*

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
