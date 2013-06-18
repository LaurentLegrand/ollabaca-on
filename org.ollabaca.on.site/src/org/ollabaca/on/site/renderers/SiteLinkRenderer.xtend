package org.ollabaca.on.site.renderers

import org.pegdown.LinkRenderer
import org.pegdown.LinkRenderer$Rendering
import org.pegdown.ast.WikiLinkNode
import org.ollabaca.on.site.Site

class SiteLinkRenderer extends LinkRenderer {
	
	val Site site;
	
	new(Site site) {
		this.site = site;
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
			return new LinkRenderer$Rendering(Renderers::href(topic), topic.title); 
		}
	}

}