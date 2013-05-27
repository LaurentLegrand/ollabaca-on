package org.ollabaca.on.site.tools

import org.pegdown.LinkRenderer
import org.ollabaca.on.site.Site
import org.pegdown.ast.WikiLinkNode

class SiteLinkRenderer extends LinkRenderer {
	
	val Site site
	
	new(Site site) {
		this.site = site
	}

	/**
	 * 
	 */	
	override render(WikiLinkNode node) {
		val key = node.text.substring(1).replaceAll("/", ".")
		
		val topic = site.getTopic(key)
		if (topic == null) {
			return new LinkRenderer$Rendering('#', "Not found: " + key); 
		} else {
			return new LinkRenderer$Rendering('#' + key, topic.title); 
		}
	}

}