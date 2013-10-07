package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Activator
import static extension org.ollabaca.on.site.renderers.Renderers.*

class ProjectPage extends SitePage {
		
	new(Site site) {
		super(site)
	}
	
	override aside() {
		'''
		«nav»
		«tags»
		«abbreviations»
		'''
	}
	
	override content() {
		'''
		<div id="vis" class="span12">
		</div>
		'''
	}
	
	override onLoad() {
		'''
		«FOR e: Activator::instance.context.contentProviders»
			«e.onSite(site)»
		«ENDFOR»
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
	
//	override onDocumentReady() {
//		'''myGraph("#vis", "/site/projects/«site.name»/json");'''
//	}

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
	
	def tags() {
		'''«FOR e: site.tags BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.link»«ENDFOR»'''
	}	
	def abbreviations() {
		'''«FOR e: site.abbreviations BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.name»«ENDFOR»'''
	}	
}