package org.ollabaca.on.site.tools

import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.eclipse.emf.ecore.EClass

class MultiPageSiteRenderer extends SiteRenderer {

	new(Site site) {
		super(site)
	}
	
	override href(Topic self) {
		'''/site/projects/�site.name�/topics/�self.name�'''
	}

	override href(Site self) {
		'''/site/projects/�self.name�'''
	}
	
	override href(EClass self) {
		'''/site/projects/�site.name�/types/�self.instanceClassName�'''
	}
	
}