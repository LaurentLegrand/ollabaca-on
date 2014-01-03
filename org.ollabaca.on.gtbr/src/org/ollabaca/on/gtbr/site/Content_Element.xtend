package org.ollabaca.on.gtbr.site

import org.ollabaca.on.gtbr.Account
import org.ollabaca.on.gtbr.Credit
import org.ollabaca.on.gtbr.Debit
import org.ollabaca.on.gtbr.Record
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.renderers.Renderers
import org.ollabaca.on.site.renderers.Text
import org.ollabaca.on.site.servlets.Notation

import static org.ollabaca.on.site.util.Html.*

import static extension org.ollabaca.on.site.servlets.Ref.*

class Content_Element {
	
	static val GTBR = "gtbr"
	
	static def register() {
		
		Renderers::topicRenderers.registerLoader([it.target instanceof Account], [load])
		Renderers::topicRenderers.registerRenderer(GTBR, 
			[new Text("text/html", (it.target as Account).table_Account)]
		)	
	}
	
	static def CharSequence load(Topic self) '''
		<script>
		$(document).ready(function() {
			$("#properties").before("<div id='«GTBR»'></div>");
			$("#«GTBR»").load("«scope(GTBR, self).ref_Object»");
		});
		</script>
	'''
	
	static def CharSequence table_Account(Account self) {
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