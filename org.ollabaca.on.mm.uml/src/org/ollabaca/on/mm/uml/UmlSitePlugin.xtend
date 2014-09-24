package org.ollabaca.on.mm.uml

import org.ollabaca.on.site.SitePlugin
import org.ollabaca.on.site.servlets.Features
import org.eclipse.uml2.uml.Element
import java.util.Collections

class UmlSitePlugin implements SitePlugin {

	override activate() {
		Notation_Element.register()
		Features::instance.register(typeof(Element), [Section_Element::section_Element(it as Element)])
		return Collections::emptyMap
	}

}
