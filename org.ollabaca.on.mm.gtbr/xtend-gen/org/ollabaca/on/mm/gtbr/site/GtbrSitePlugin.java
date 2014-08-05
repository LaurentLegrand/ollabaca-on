package org.ollabaca.on.mm.gtbr.site;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.gtbr.Account;
import org.ollabaca.on.mm.gtbr.site.Table_Account;
import org.ollabaca.on.site.SitePlugin;
import org.ollabaca.on.site.servlets.Features;

@SuppressWarnings("all")
public class GtbrSitePlugin implements SitePlugin {
  public void activate() {
    final Function1<EObject, CharSequence> _function = new Function1<EObject, CharSequence>() {
      public CharSequence apply(final EObject it) {
        return Table_Account.table_Account(((Account) it));
      }
    };
    Features.instance.register(Account.class, _function);
  }
}
