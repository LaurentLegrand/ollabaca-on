package org.ollabaca.on.mm.gtbr.site;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.mm.gtbr.Account;
import org.ollabaca.on.mm.gtbr.Credit;
import org.ollabaca.on.mm.gtbr.Debit;
import org.ollabaca.on.mm.gtbr.Record;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Column;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Table_Account {
  public static CharSequence table_Account(final Account object) {
    EList<Record> _records = object.getRecords();
    final Function1<Record, Date> _function = new Function1<Record, Date>() {
      public Date apply(final Record it) {
        return it.getDate();
      }
    };
    List<Record> _sortBy = IterableExtensions.<Record, Date>sortBy(_records, _function);
    final Function1<Record, CharSequence> _function_1 = new Function1<Record, CharSequence>() {
      public CharSequence apply(final Record it) {
        return Link.link_EObject(it);
      }
    };
    Column<Record> _column = Html.<Record>column("Name", _function_1);
    final Function1<Record, CharSequence> _function_2 = new Function1<Record, CharSequence>() {
      public CharSequence apply(final Record it) {
        CharSequence _xifexpression = null;
        if ((it instanceof Debit)) {
          double _amount = ((Debit)it).getAmount();
          _xifexpression = Notation.notation_Object(Double.valueOf(_amount));
        }
        return _xifexpression;
      }
    };
    Column<Record> _column_1 = Html.<Record>column("Debit", _function_2);
    final Function1<Record, CharSequence> _function_3 = new Function1<Record, CharSequence>() {
      public CharSequence apply(final Record it) {
        CharSequence _xifexpression = null;
        if ((it instanceof Credit)) {
          double _amount = ((Credit)it).getAmount();
          _xifexpression = Notation.notation_Object(Double.valueOf(_amount));
        }
        return _xifexpression;
      }
    };
    Column<Record> _column_2 = Html.<Record>column("Credit", _function_3);
    return Html.<Record>table(_sortBy, 
      Collections.<Attr<Iterable<? extends Record>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends Record>>>newArrayList()), 
      Collections.<Column<Record>>unmodifiableList(CollectionLiterals.<Column<Record>>newArrayList(_column, _column_1, _column_2)));
  }
}
