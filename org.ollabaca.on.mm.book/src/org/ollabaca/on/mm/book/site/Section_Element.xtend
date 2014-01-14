package org.ollabaca.on.mm.book.site

import org.eclipse.uml2.uml.Element
import org.ollabaca.on.site.util.Html

import static extension org.ollabaca.on.site.servlets.Ref.*
import static extension org.ollabaca.on.site.servlets.Title.*
import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.site.util.Sites.*
import static extension org.ollabaca.on.mm.book.site.Body_Element.*
import static extension org.ollabaca.on.mm.book.site.BookElements.*
import static extension org.ollabaca.on.mm.book.site.Section_Element_OwnedElements.*
import org.ollabaca.on.uml.Layout_Element
import org.ollabaca.on.mm.book.Book

class Section_Element {

	static def dispatch CharSequence section_Element(Book self) '''
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
		«self.section_Element_OwnedElements»
	'''

	static def dispatch CharSequence section_Element(Element self) {
		Layout_Element.layout_Element(self.ref_Object.toString, self.topic_EObject.getTitle.span.toString, self,
			[
				'''
					«Html::documentation_EObject(it)»
					«it.body_Element»
				'''
			], [Section_Element_OwnedElements::section_Element_OwnedElements(it)]);
	}

}
