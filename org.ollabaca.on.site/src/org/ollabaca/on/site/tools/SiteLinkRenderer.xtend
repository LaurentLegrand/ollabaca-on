package org.ollabaca.on.site.tools

import org.pegdown.LinkRenderer
import org.pegdown.LinkRenderer$Rendering
import org.pegdown.ast.WikiLinkNode

class SiteLinkRenderer extends LinkRenderer {
	
	val SiteRenderer renderer
	
	new(SiteRenderer renderer) {
		this.renderer = renderer
	}

	/**
	 * 
	 */	
	override render(WikiLinkNode node) {
		val key = node.text.substring(1).replaceAll("/", ".")
		
		val topic = renderer.site.getTopic(key)
		if (topic == null) {
			return new LinkRenderer$Rendering('#', "Not found: " + key); 
		} else {
			return new LinkRenderer$Rendering(renderer.href(topic), topic.title); 
		}
	}

}