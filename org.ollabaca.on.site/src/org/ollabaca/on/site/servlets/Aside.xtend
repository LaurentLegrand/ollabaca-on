package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.util.Template

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.servlets.Link.*

class Aside extends Template<Element> {

	public static val Aside instance = new Aside()

	static def aside_Element(Element self) {
		instance.apply(self)
	}

	def dispatch CharSequence doFallback(Element self) ''''''

	def dispatch CharSequence doFallback(Void self) ''''''

	def dispatch CharSequence doFallback(Type self) '''
		<aside>
			<ul class='nav nav-list'>
				<li class='nav-header'>name</li><li>«self.name»</li>
			</ul>
		</aside>
	'''

	def dispatch CharSequence doFallback(Site self) '''
		«self.nav»
		«self.para_Site_tags»
		«self.para_Site_abbreviations»
	'''

	def dispatch CharSequence doFallback(Topic self) '''
		<aside>
			<ul class='nav nav-list'>
				<li class='nav-header'>type</li><li>«self.type.link_EObject»</li>
				«FOR e : self.ancestors BEFORE "<li class='divider'></li><li class='nav-header'>ancestors</li>"»<li>«e.link_EObject»</li>«ENDFOR»
				«FOR e : self.topics BEFORE "<li class='divider'></li><li class='nav-header'>children</li>"»<li>«e.link_EObject»</li>«ENDFOR»
				«FOR e : self.see BEFORE "<li class='divider'></li><li class='nav-header'>see also</li>"»<li>«e.link_EObject»</li>«ENDFOR»
			</ul>
		</aside>
	'''

	def dispatch CharSequence nav(Site self) '''
		<nav class="instance-tree">
		«ul(self.roots.sortBy[name], [it.nav])»
		</nav>
	'''

	def dispatch CharSequence nav(Topic self) '''
		«self.link_EObject»
		«ul(self.topics.filter[!anonymous].sortBy[name], [it.nav])»
	'''

	def para_Site_tags(Site self) '''
		«FOR e : self.tags BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.link_EObject»«ENDFOR»
	'''

	def para_Site_abbreviations(Site self) '''
		«FOR e : self.abbreviations BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.name»«ENDFOR»
	'''
}
