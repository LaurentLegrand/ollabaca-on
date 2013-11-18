package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.util.Template
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site
import static extension org.ollabaca.on.site.util.Html.*
import org.ollabaca.on.site.Topic
import org.eclipse.emf.ecore.EClass

class Aside extends Template<EObject> {

	public static val Aside instance = new Aside()

	static def aside_EObject(EObject self) {
		instance.apply(self)
	}

	def dispatch CharSequence doFallback(EObject self) ''''''

	def dispatch CharSequence doFallback(EClass self) '''
		<aside>
			<ul class='nav nav-list'>
				<li class='nav-header'>name</li><li>«self.name»</li>
			</ul>
		</aside>
	'''

	def dispatch CharSequence doFallback(Site self) '''
		«self.nav»
		«self.tags»
		«self.abbreviations»
	'''

	def dispatch CharSequence doFallback(Topic self) '''
		<aside>
			<ul class='nav nav-list'>
				<li class='nav-header'>type</li><li>«self.target.eClass.link»</li>
				«FOR e : self.ancestors BEFORE "<li class='divider'></li><li class='nav-header'>ancestors</li>"»<li>«e.link»</li>«ENDFOR»
				«FOR e : self.topics BEFORE "<li class='divider'></li><li class='nav-header'>children</li>"»<li>«e.link»</li>«ENDFOR»
				«FOR e : self.see BEFORE "<li class='divider'></li><li class='nav-header'>see also</li>"»<li>«e.link»</li>«ENDFOR»
			</ul>
		</aside>
	'''

	def dispatch CharSequence nav(Site self) '''
		<nav class="instance-tree">
		«ul(self.roots.sortBy[name], [it.nav])»
		</nav>
	'''

	def dispatch CharSequence nav(Topic self) '''
		«self.link»
		«ul(self.topics.filter[!anonymous].sortBy[name], [it.nav])»
	'''

	def tags(Site self) '''
		«FOR e : self.tags BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.link»«ENDFOR»
	'''

	def abbreviations(Site self) '''
		«FOR e : self.abbreviations BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.name»«ENDFOR»
	'''
}
