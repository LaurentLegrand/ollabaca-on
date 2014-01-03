package org.ollabaca.on.gtbr.site;

import org.ollabaca.on.gtbr.site.Notation_Element;
import org.ollabaca.on.site.SitePlugin;

@SuppressWarnings("all")
public class GtbrSitePlugin implements SitePlugin {
  public void activate() {
    Notation_Element.register();
  }
}
