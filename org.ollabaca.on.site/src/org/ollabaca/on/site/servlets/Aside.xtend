package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.util.Component

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.servlets.Link.*

class Aside extends Component {
	
	new() {
		super("aside", #{}, null)
	}

	def dispatch CharSequence content_Element(Element object) ''''''

	def dispatch CharSequence content_Element(Void object) ''''''

	def dispatch CharSequence content_Element(Type object) '''
		<ul class='nav nav-list'>
			<li class='nav-header'>name</li><li>«object.name»</li>
		</ul>
	'''

	def dispatch CharSequence content_Element(Site object) '''
		«object.nav»
		«object.para_Site_tags»
		«object.para_Site_abbreviations»
	'''

	def dispatch CharSequence content_Element(Topic object) '''
		<ul class='nav nav-list'>
			<li class='nav-header'>type</li><li>«object.type.link_EObject»</li>
			«FOR e : object.ancestors BEFORE "<li class='divider'></li><li class='nav-header'>ancestors</li>"»<li>«e.link_EObject»</li>«ENDFOR»
			«FOR e : object.topics BEFORE "<li class='divider'></li><li class='nav-header'>children</li>"»<li>«e.link_EObject»</li>«ENDFOR»
			«FOR e : object.see BEFORE "<li class='divider'></li><li class='nav-header'>see also</li>"»<li>«e.link_EObject»</li>«ENDFOR»
		</ul>
	'''

	def dispatch CharSequence nav(Site object) '''
		<nav class="instance-tree">
		«ul(object.roots.sortBy[name], [it.nav])»
		</nav>
	'''

	def dispatch CharSequence nav(Topic object) '''
		«object.link_EObject»
		«ul(object.topics.filter[!anonymous].sortBy[name], [it.nav])»
	'''

	def para_Site_tags(Site object) '''
		«FOR e : object.tags BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.link_EObject»«ENDFOR»
	'''

	def para_Site_abbreviations(Site object) '''
		«FOR e : object.abbreviations BEFORE "<p>" SEPARATOR "&nbsp;" AFTER "</p>"»«e.name»«ENDFOR»
	'''
}
