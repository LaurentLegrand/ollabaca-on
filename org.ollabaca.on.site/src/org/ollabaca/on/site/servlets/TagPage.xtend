package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Tag
import org.ollabaca.on.site.Site

import static extension org.ollabaca.on.site.renderers.Renderers.*

class TagPage extends SitePage {

	val Tag tag
	
	new(Site site, Tag tag) {
		super(site)
		this.tag = tag
	}
	
	override content() {
		'''
		<nav>
		«FOR e: tag.topics BEFORE "<ul>" AFTER "</ul>"»
		<li>«e.link»</li>
		«ENDFOR»
		</nav>
		'''
	}
	
	
}