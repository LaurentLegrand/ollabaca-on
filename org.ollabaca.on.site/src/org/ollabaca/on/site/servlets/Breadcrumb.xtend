package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.util.HTag
import org.ollabaca.on.site.util.Sites

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.util.Html.*

class Breadcrumb extends HTag {
	
	new() {
		super("div", #{}, null)
	}

	dispatch def CharSequence content_Element(Topic self) '''
		<ul class="breadcrumb">
			<li>«Sites::site.link_EObject» <span class="divider">/</span></li>
			«FOR e: self.ancestors»
				<li>«e.link_EObject» <span class="divider">/</span></li>
			«ENDFOR»
			<li class="active">«self.title.html»</li>
		</ul>	
	'''
	
	def dispatch CharSequence content_Element(Element self) ''''''

}
