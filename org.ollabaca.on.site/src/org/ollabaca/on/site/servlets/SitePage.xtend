package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.tools.MultiPageSiteRenderer
import org.ollabaca.on.site.tools.Renderers


class SitePage extends Page {
	
	public val Site site
	
	protected val MultiPageSiteRenderer renderer
	
	new(Site site) {
		this.site = site
		this.renderer = Renderers::newMultiPageSiteRenderer(site)
	}
	
	def dispatch link(Site self) {
		'''<a href="«renderer.href(self)»">«self.name»</a>'''
	}
	
	def dispatch link(Topic self) {
		'''<a href="«renderer.href(self)»">«self.title»</a>'''
	}
	
	def dispatch link(EClass self) {
		'''<a href="/site/projects/«site.name»/types/«self.instanceClassName»">«self.name»</a>'''		
	}
	
	def html(String self) {
		renderer.html(self)
	}
	
	def escape(String self) {
		renderer.escape(self)
	}
	
	def print(Object self) {
		renderer.print(self)
	}
	
}