package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.util.Component
import org.ollabaca.on.site.util.Sites

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.util.Html.*

class Breadcrumb extends Component {
	
	new() {
		super("div", #{}, null)
	}

	dispatch def CharSequence content_Element(Topic object) '''
		<ol class="breadcrumb">
			<li>«Sites::site.link_EObject»</li>
			«FOR e: object.ancestors»
				<li>«e.link_EObject»</li>
			«ENDFOR»
			<li class="active">«object.title.span»</li>
		</ol>	
	'''
	
	def dispatch CharSequence content_Element(Element object) ''''''

}
