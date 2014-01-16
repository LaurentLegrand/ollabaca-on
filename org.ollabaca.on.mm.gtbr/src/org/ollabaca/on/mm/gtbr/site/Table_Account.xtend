package org.ollabaca.on.mm.gtbr.site

import org.ollabaca.on.mm.gtbr.Account
import org.ollabaca.on.mm.gtbr.Credit
import org.ollabaca.on.mm.gtbr.Debit
import org.ollabaca.on.mm.gtbr.Record
import org.ollabaca.on.site.servlets.Link
import org.ollabaca.on.site.servlets.Notation

import static org.ollabaca.on.site.util.Html.*

class Table_Account {
		
	static def CharSequence table_Account(Account self) {
		table(
			self.records.sortBy[date], 
			#[],
			#[
				column("Name", [Record it | Link::link_EObject(it)]),
				column("Debit", [Record it | if (it instanceof Debit) Notation::notation_Object(it.amount)]),
				column("Credit", [Record it | if (it instanceof Credit) Notation::notation_Object(it.amount)])
			]
		)
	}
}