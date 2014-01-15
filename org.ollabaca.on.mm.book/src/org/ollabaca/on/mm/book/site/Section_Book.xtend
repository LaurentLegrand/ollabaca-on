package org.ollabaca.on.mm.book.site

import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.uml.Section_Element_OwnedElements

import static extension org.ollabaca.on.mm.book.site.BookElements.*
import static extension org.ollabaca.on.site.servlets.Title.*
import static extension org.ollabaca.on.site.util.Sites.*

class Section_Book {

	static def CharSequence section_Book(Book self) '''
		<div class="row-fluid">
			<div class="span12">
				<div class="page-header">
					<p>«self.topic_EObject.title_Element»</p>
				</div>
			</div>
			<div class="span12">
				«self.toc_BookElement»
			</div>
		</div>
		«Section_Element_OwnedElements::section_Element_OwnedElements(self)»
	'''
}
