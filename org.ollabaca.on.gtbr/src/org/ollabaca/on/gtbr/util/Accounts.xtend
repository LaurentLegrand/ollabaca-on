package org.ollabaca.on.gtbr.util

import org.ollabaca.on.gtbr.Account
import org.ollabaca.on.gtbr.AccountingOperation
import org.ollabaca.on.gtbr.Debit
import org.ollabaca.on.gtbr.Credit

class Accounts {
	
	public static def getBalance(Account self) {
		var double balance = 0
		for (AccountingOperation e: self.operations) {
			balance = e.apply(balance)
		}
		return balance
	}
	
	static dispatch def double apply(AccountingOperation self, double balance) {
		return balance
	}
	
	static dispatch def double apply(Debit self, double balance) {
		return balance - self.amount
	}
	
	static dispatch def double apply(Credit self, double balance) {
		return balance + self.amount
	}
	
}