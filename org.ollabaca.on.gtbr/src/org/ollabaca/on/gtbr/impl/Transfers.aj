package org.ollabaca.on.gtbr.impl;

import java.util.Date;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ollabaca.on.gtbr.Account;
import org.ollabaca.on.gtbr.Credit;
import org.ollabaca.on.gtbr.Debit;
import org.ollabaca.on.gtbr.GtbrFactory;

public privileged aspect Transfers {

//	after(TransferImpl self) : execution(TransferImpl.new(..)) && this(self) {
//		self.debit = GtbrFactory.eINSTANCE.createDebit();
//		self.credit = GtbrFactory.eINSTANCE.createCredit();
//	}

	after(TransferImpl self, Date date) returning: execution(* TransferImpl.setDate(..)) && this(self) && args(date) {
		this.getDebit(self).setDate(date);
		this.getCredit(self).setDate(date);
	}

	after(TransferImpl self, double amount) returning: execution(* TransferImpl.setAmount(..)) && this(self) && args(amount) {
		this.getDebit(self).setAmount(amount);
		this.getCredit(self).setAmount(amount);
	}
	
	after(TransferImpl self, Account from) returning: execution(* TransferImpl.setFrom(..)) && this(self) && args(from) {
		this.getDebit(self).setAccount(from);
	}
	
	after(TransferImpl self, Account to) returning: execution(* TransferImpl.setTo(..)) && this(self) && args(to) {
		this.getCredit(self).setAccount(to);
	}
	
	void around(TransferImpl self, Debit debit) : execution(* TransferImpl.setDebit(..)) && this(self) && args(debit) {
		Debit previous = self.getDebit();
		proceed(self, debit);
		if (previous != null && previous != debit) {
			previous.setAccount(null);
			EcoreUtil.delete(previous);
		}
	}
	
	void around(TransferImpl self, Credit credit) : execution(* TransferImpl.setCredit(..)) && this(self) && args(credit) {
		Credit previous = self.getCredit();
		proceed(self, credit);
		if (previous != null && previous != credit) {
			previous.setAccount(null);
			EcoreUtil.delete(previous);
		}
	}
	
	Debit getDebit(TransferImpl self) {
		Debit debit = self.getDebit();
		if (debit == null) {
			debit = GtbrFactory.eINSTANCE.createDebit();
			self.setDebit(debit);
		}
		return debit;
	}
	
	Credit getCredit(TransferImpl self) {
		Credit credit = self.getCredit();
		if (credit == null) {
			credit = GtbrFactory.eINSTANCE.createCredit();
			self.setCredit(credit);
		}
		return credit;
	}
}
