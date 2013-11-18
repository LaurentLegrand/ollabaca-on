package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Activator
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.util.Template
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.util.Sites

class OnLoad extends Template<EObject> {

	public static val OnLoad instance = new OnLoad()

	static def onLoad_EObject(EObject self) {
		instance.apply(self)
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

	dispatch def CharSequence doFallback(EClass self) '''
		«FOR e : Activator::instance.context.contentProviders»
			«e.onType(Sites::site, self)»
		«ENDFOR»
	'''

	dispatch def CharSequence doFallback(Void self) {
		""
	}
}
