package org.ollabaca.on.gtbr.util;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.ollabaca.on.gtbr.Account;
import org.ollabaca.on.gtbr.AccountingOperation;
import org.ollabaca.on.gtbr.Credit;
import org.ollabaca.on.gtbr.Debit;

@SuppressWarnings("all")
public class Accounts {
  public static double getBalance(final Account self) {
    double balance = 0;
    EList<AccountingOperation> _operations = self.getOperations();
    for (final AccountingOperation e : _operations) {
      double _apply = Accounts.apply(e, balance);
      balance = _apply;
    }
    return balance;
  }
  
  protected static double _apply(final AccountingOperation self, final double balance) {
    return balance;
  }
  
  protected static double _apply(final Debit self, final double balance) {
    double _amount = self.getAmount();
    return (balance - _amount);
  }
  
  protected static double _apply(final Credit self, final double balance) {
    double _amount = self.getAmount();
    return (balance + _amount);
  }
  
  public static double apply(final AccountingOperation self, final double balance) {
    if (self instanceof Credit) {
      return _apply((Credit)self, balance);
    } else if (self instanceof Debit) {
      return _apply((Debit)self, balance);
    } else if (self != null) {
      return _apply(self, balance);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self, balance).toString());
    }
  }
}
