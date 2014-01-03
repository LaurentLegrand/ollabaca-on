package org.ollabaca.on.uml;

import org.ollabaca.on.site.SitePlugin;

public class UmlSitePlugin implements SitePlugin {

	@Override
	public void activate() {
		Notation_Element.register();
		UmlContentProvider.register();
	}

}
