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

//	after(TransferImpl object) : execution(TransferImpl.new(..)) && this(object) {
//		object.debit = GtbrFactory.eINSTANCE.createDebit();
//		object.credit = GtbrFactory.eINSTANCE.createCredit();
//	}

	after(TransferImpl object, String name) returning: execution(* TransferImpl.setName(..)) && this(object) && args(name) {
		this.getDebit(object).setName(name + " - Debit");
		this.getCredit(object).setName(name + " - Credit");
	}
	
	after(TransferImpl object, Date date) returning: execution(* TransferImpl.setDate(..)) && this(object) && args(date) {
		this.getDebit(object).setDate(date);
		this.getCredit(object).setDate(date);
	}

	after(TransferImpl object, double amount) returning: execution(* TransferImpl.setAmount(..)) && this(object) && args(amount) {
		this.getDebit(object).setAmount(amount);
		this.getCredit(object).setAmount(amount);
	}
	
	after(TransferImpl object, Account from) returning: execution(* TransferImpl.setFrom(..)) && this(object) && args(from) {
		this.getDebit(object).setAccount(from);
	}
	
	after(TransferImpl object, Account to) returning: execution(* TransferImpl.setTo(..)) && this(object) && args(to) {
		this.getCredit(object).setAccount(to);
	}
	
	// does not work: Account still have reference to de-serialized record
//	void around() : call(* TransferImpl.setDebit(..)) && withincode(void eSet(int, Object)) {
//	}
//	
//	void around() : call(* TransferImpl.setCredit(..)) && withincode(void eSet(int, Object)) {
//	}
	
	void around(TransferImpl object, Debit debit) : execution(* TransferImpl.setDebit(..)) && this(object) && args(debit) {
		Debit previous = object.getDebit();
		proceed(object, debit);
		if (previous != null && previous != debit) {
			previous.setAccount(null);
			EcoreUtil.delete(previous);
		}
	}
	
	void around(TransferImpl object, Credit credit) : execution(* TransferImpl.setCredit(..)) && this(object) && args(credit) {
		Credit previous = object.getCredit();
		proceed(object, credit);
		if (previous != null && previous != credit) {
			previous.setAccount(null);
			EcoreUtil.delete(previous);
		}
	}
	
	Debit getDebit(TransferImpl object) {
		Debit debit = object.getDebit();
		if (debit == null) {
			debit = GtbrFactory.eINSTANCE.createDebit();
			object.setDebit(debit);
		}
		return debit;
	}
	
	Credit getCredit(TransferImpl object) {
		Credit credit = object.getCredit();
		if (credit == null) {
			credit = GtbrFactory.eINSTANCE.createCredit();
			object.setCredit(credit);
		}
		return credit;
	}
}
