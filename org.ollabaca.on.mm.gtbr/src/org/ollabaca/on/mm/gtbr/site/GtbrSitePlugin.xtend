package org.ollabaca.on.mm.gtbr.site

import org.ollabaca.on.mm.gtbr.Account
import org.ollabaca.on.site.SitePlugin
import org.ollabaca.on.site.servlets.Page

class GtbrSitePlugin implements SitePlugin {

	override activate() {
		Page::article.beforeEnd.register(typeof(Account), [Table_Account::table_Account(it as Account)])
	}

}