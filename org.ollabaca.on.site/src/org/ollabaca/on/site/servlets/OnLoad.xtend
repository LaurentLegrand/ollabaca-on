package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Activator
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.util.Template

class OnLoad extends Template<Element> {

	public static val OnLoad instance = new OnLoad()

	static def onLoad_Element(Element self) {
		instance.apply(self)
	}

	dispatch def CharSequence doFallback(Element self) {
		""
	}
	dispatch def CharSequence doFallback(Site self) '''
		«FOR e : Activator::instance.context.contentProviders»
			«e.onSite(self)»
		«ENDFOR»
	'''

	dispatch def CharSequence doFallback(Topic self) '''
		«FOR e : Activator::instance.context.contentProviders»
			«e.onTopic(self)»
		«ENDFOR»
	'''

	dispatch def CharSequence doFallback(Type self) '''
		«FOR e : Activator::instance.context.contentProviders»
			«e.onType(self)»
		«ENDFOR»
	'''

	dispatch def CharSequence doFallback(Void self) {
		""
	}
}
