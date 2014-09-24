package org.ollabaca.on.mm.gtbr.site

import org.ollabaca.on.mm.gtbr.Account
import org.ollabaca.on.site.SitePlugin
import org.ollabaca.on.site.servlets.Features
import java.util.Collections

class GtbrSitePlugin implements SitePlugin {

	override activate() {
		Features::instance.register(typeof(Account), [Table_Account::table_Account(it as Account)])
		return Collections.emptyMap
	}

}
