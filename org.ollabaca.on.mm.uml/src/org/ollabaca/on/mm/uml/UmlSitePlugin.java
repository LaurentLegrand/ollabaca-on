package org.ollabaca.on.mm.uml;

import org.ollabaca.on.site.SitePlugin;
import org.ollabaca.on.mm.uml.Notation_Element;

public class UmlSitePlugin implements SitePlugin {

	@Override
	public void activate() {
		Notation_Element.register();
	}

}
