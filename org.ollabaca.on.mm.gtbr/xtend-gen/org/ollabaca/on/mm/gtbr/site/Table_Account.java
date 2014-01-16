package org.ollabaca.on.mm.gtbr.site;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
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
    final Function1<Record,Date> _function = new Function1<Record,Date>() {
      public Date apply(final Record it) {
        Date _date = it.getDate();
        return _date;
      }
    };
    List<Record> _sortBy = IterableExtensions.<Record, Date>sortBy(_records, _function);
    final Function1<Record,CharSequence> _function_1 = new Function1<Record,CharSequence>() {
      public CharSequence apply(final Record it) {
        CharSequence _link_EObject = Link.link_EObject(it);
        return _link_EObject;
      }
    };
    Column<Record> _column = Html.<Record>column("Name", _function_1);
    final Function1<Record,CharSequence> _function_2 = new Function1<Record,CharSequence>() {
      public CharSequence apply(final Record it) {
        CharSequence _xifexpression = null;
        if ((it instanceof Debit)) {
          double _amount = ((Debit)it).getAmount();
          CharSequence _notation_Object = Notation.notation_Object(Double.valueOf(_amount));
          _xifexpression = _notation_Object;
        }
        return _xifexpression;
      }
    };
    Column<Record> _column_1 = Html.<Record>column("Debit", _function_2);
    final Function1<Record,CharSequence> _function_3 = new Function1<Record,CharSequence>() {
      public CharSequence apply(final Record it) {
        CharSequence _xifexpression = null;
        if ((it instanceof Credit)) {
          double _amount = ((Credit)it).getAmount();
          CharSequence _notation_Object = Notation.notation_Object(Double.valueOf(_amount));
          _xifexpression = _notation_Object;
        }
        return _xifexpression;
      }
    };
    Column<Record> _column_2 = Html.<Record>column("Credit", _function_3);
    CharSequence _table = Html.<Record>table(_sortBy, 
      Collections.<Attr<Iterable<? extends Record>>>unmodifiableList(Lists.<Attr<Iterable<? extends Record>>>newArrayList()), 
      Collections.<Column<Record>>unmodifiableList(Lists.<Column<Record>>newArrayList(_column, _column_1, _column_2)));
    return _table;
  }
}
