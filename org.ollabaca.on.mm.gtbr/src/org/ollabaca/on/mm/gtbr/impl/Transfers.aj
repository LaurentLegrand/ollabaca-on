package org.ollabaca.on.mm.gtbr.impl;

import java.util.Date;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.ollabaca.on.mm.gtbr.Account;
import org.ollabaca.on.mm.gtbr.Credit;
import org.ollabaca.on.mm.gtbr.Debit;
import org.ollabaca.on.mm.gtbr.GtbrFactory;
import org.ollabaca.on.mm.gtbr.impl.TransferImpl;

public privileged aspect Transfers {
	
	public void TransferImpl.setName(String name) {
		super.setName(name);
	}

//	after(TransferImpl self) : execution(TransferImpl.new(..)) && this(self) {
//		self.debit = GtbrFactory.eINSTANCE.createDebit();
//		self.credit = GtbrFactory.eINSTANCE.createCredit();
//	}

	after(TransferImpl self, String name) returning: execution(* TransferImpl.setName(..)) && this(self) && args(name) {
		this.getDebit(self).setName(name + " - Debit");
		this.getCredit(self).setName(name + " - Credit");
	}
	
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
	
	// does not work: Account still have reference to de-serialized record
//	void around() : call(* TransferImpl.setDebit(..)) && withincode(void eSet(int, Object)) {
//	}
//	
//	void around() : call(* TransferImpl.setCredit(..)) && withincode(void eSet(int, Object)) {
//	}
	
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
