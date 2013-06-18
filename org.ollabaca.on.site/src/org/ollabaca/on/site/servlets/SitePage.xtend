package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import static extension org.ollabaca.on.site.renderers.Renderers.*

class SitePage extends Page {
	
	public val Site site
	
	new(Site site) {
		this.site = site
	}
		
}