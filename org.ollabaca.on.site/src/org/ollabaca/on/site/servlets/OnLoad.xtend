package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.renderers.Renderers
import org.ollabaca.on.site.util.Template

class OnLoad extends Template<Element> {

	public static val OnLoad instance = new OnLoad()

	static def onLoad_Element(Element self) {
		instance.transform(self)
	}

	dispatch def CharSequence doFallback(Element self) {
		""
	}
	
	dispatch def CharSequence doFallback(Site self) {
		Renderers::siteRenderers.load(self)
	}

	dispatch def CharSequence doFallback(Topic self) {
		Renderers::topicRenderers.load(self)
	}

	dispatch def CharSequence doFallback(Type self) {
		Renderers::typeRenderers.load(self)
	}

	dispatch def CharSequence doFallback(Void self) {
		""
	}
}
