package org.ollabaca.on.mm.book.site

import org.ollabaca.on.site.Topic

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.util.Sites.*
import static extension org.ollabaca.on.mm.book.site.BookElement_OwnedElements.*
import org.ollabaca.on.mm.book.BookElement

class BookElements {

	def static CharSequence toc_BookElement(BookElement object) {
		tag(object, "nav", [it.ul_BookElement_OwnedElements])
	}

	def static Topic topic_BookElement(BookElement object) {
		if (object.documentation != null) {
			object.documentation.topic_EObject
		} else {
			object.topic_fallback
		}
	}
}
