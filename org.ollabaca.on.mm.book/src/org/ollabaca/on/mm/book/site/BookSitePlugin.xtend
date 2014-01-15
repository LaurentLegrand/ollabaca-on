package org.ollabaca.on.mm.book.site

import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.mm.book.BookElement
import org.ollabaca.on.site.SitePlugin
import org.ollabaca.on.site.renderers.Renderers
import org.ollabaca.on.site.renderers.Text
import org.ollabaca.on.site.servlets.Page
import org.ollabaca.on.site.util.Sites

import static extension org.ollabaca.on.site.servlets.Ref.*
import org.ollabaca.on.uml.Section_Element
import org.ollabaca.on.uml.Section_Element_OwnedElements
import org.ollabaca.on.uml.Body_Element

class BookSitePlugin implements SitePlugin {

	static val String BOOK = "book"

	override activate() {
		Sites::topic.register(typeof(BookElement),
			[if(it instanceof BookElement) BookElements::topic_BookElement(it as BookElement)])

		Page::article.beforeEnd.register(typeof(Book), ['''
				<a href="«scope(BOOK, Sites::topic_EObject(it)).ref_Object»" target="_blank">Read more...</a>
			'''
		])
		
		Section_Element::instance.register(typeof(Book), [Section_Book::section_Book(it as Book)])
		
		Section_Element_OwnedElements::instance.register(typeof(BookElement), [Section_BookElement_OwnedElements::section_Element_OwnedElements(it as BookElement)])
		
		Body_Element::instance.register(typeof(BookElement), [Body_BookElement::body_BookElement(it as BookElement)])
		
		Renderers::topicRenderers.registerRenderer(BOOK, [		
			new Text("text/html", Page_Book::page_Book(it.target as Book));
		]);
	}
}
