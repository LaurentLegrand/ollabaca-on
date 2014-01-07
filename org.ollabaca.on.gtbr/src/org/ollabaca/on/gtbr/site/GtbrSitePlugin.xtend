package org.ollabaca.on.gtbr.site

import org.ollabaca.on.site.SitePlugin
import org.ollabaca.on.gtbr.site.Notation_Element

class GtbrSitePlugin implements SitePlugin {
	
	override activate() {
		Notation_Element::register();
		Content_Element::register();
	}
	
}