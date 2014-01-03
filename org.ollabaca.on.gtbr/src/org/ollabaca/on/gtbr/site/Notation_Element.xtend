package org.ollabaca.on.gtbr.site

import org.ollabaca.on.site.servlets.Notation
import org.ollabaca.on.gtbr.AccountingElement
import org.ollabaca.on.gtbr.Account

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*
import org.ollabaca.on.gtbr.Record
import org.ollabaca.on.gtbr.Credit
import org.ollabaca.on.gtbr.Debit

class Notation_Element {
	
	static def register() {
		//Notation::instance.register(typeof(AccountingElement), [if(it instanceof AccountingElement) notation_Element(it as AccountingElement)])
	}
	
	def static dispatch CharSequence notation_Element(AccountingElement self) {
		""
	}
	
	def static dispatch CharSequence notation_Element(Account self) {
		table(
			self.records.sortBy[date], 
			#[],
			#[
				column("Name", [Record it | it.name]),
				column("Debit", [Record it | if (it instanceof Debit) Notation::notation_Object(it.amount)]),
				column("Credit", [Record it | if (it instanceof Credit) Notation::notation_Object(it.amount)])
			]
		)
	}
	
}