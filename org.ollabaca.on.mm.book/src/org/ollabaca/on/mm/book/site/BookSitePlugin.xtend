package org.ollabaca.on.mm.book.site

import org.ollabaca.on.site.SitePlugin
import org.ollabaca.on.site.util.Sites
import org.ollabaca.on.mm.book.BookElement

class BookSitePlugin implements SitePlugin {

	override activate() {
		Sites::topic.register(typeof(BookElement),
			[if(it instanceof BookElement) BookElements::topic_BookElement(it as BookElement)])
		BookContentProvider::register();
	}
}
