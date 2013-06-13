package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic

class ProjectPage extends SitePage {
		
	new(Site site) {
		super(site)
	}
	
	override content() {
		'''
		«nav»
		'''
	}
	
	def topics() {
		'''
		'''
	}
	
	def types() {
		'''
		'''
	}

	def nav() {
		'''
		<nav class="instance-tree">
		«FOR e: site.roots.sortBy[name] BEFORE "<ul>" AFTER "</ul>"»
			«nav(e)»
		«ENDFOR»
		</nav>
		'''
	}
	
	def nav(Topic self) {
		'''
		<li>
			«self.link»
			«FOR e: self.topics.filter[!anonymous].sortBy[name] BEFORE "<ul>" AFTER "</ul>"»
				«e.nav»
			«ENDFOR»
		</li>
		'''
	}	
}