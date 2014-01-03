package org.ollabaca.on.gtbr.site;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.gtbr.Account;
import org.ollabaca.on.gtbr.Credit;
import org.ollabaca.on.gtbr.Debit;
import org.ollabaca.on.gtbr.Record;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.renderers.Content;
import org.ollabaca.on.site.renderers.Renderers;
import org.ollabaca.on.site.renderers.Text;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.servlets.Scope;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Column;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Content_Element {
  private final static String GTBR = "gtbr";
  
  public static Function1<? super Topic,? extends Content> register() {
    Function1<? super Topic,? extends Content> _xblockexpression = null;
    {
      final Function1<Topic,Boolean> _function = new Function1<Topic,Boolean>() {
        public Boolean apply(final Topic it) {
          EObject _target = it.getTarget();
          return Boolean.valueOf((_target instanceof Account));
        }
      };
      final Function1<Topic,CharSequence> _function_1 = new Function1<Topic,CharSequence>() {
        public CharSequence apply(final Topic it) {
          CharSequence _load = Content_Element.load(it);
          return _load;
        }
      };
      Renderers.topicRenderers.registerLoader(_function, _function_1);
      final Function1<Topic,Text> _function_2 = new Function1<Topic,Text>() {
        public Text apply(final Topic it) {
          EObject _target = it.getTarget();
          CharSequence _table_Account = Content_Element.table_Account(((Account) _target));
          Text _text = new Text("text/html", _table_Account);
          return _text;
        }
      };
      Function1<? super Topic,? extends Content> _registerRenderer = Renderers.topicRenderers.registerRenderer(Content_Element.GTBR, _function_2);
      _xblockexpression = (_registerRenderer);
    }
    return _xblockexpression;
  }
  
  public static CharSequence load(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("$(document).ready(function() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(\"#properties\").before(\"<div id=\'");
    _builder.append(Content_Element.GTBR, "	");
    _builder.append("\'></div>\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("$(\"#");
    _builder.append(Content_Element.GTBR, "	");
    _builder.append("\").load(\"");
    Scope _scope = Ref.scope(Content_Element.GTBR, self);
    CharSequence _ref_Object = Ref.ref_Object(_scope);
    _builder.append(_ref_Object, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence table_Account(final Account self) {
    EList<Record> _records = self.getRecords();
    final Function1<Record,Date> _function = new Function1<Record,Date>() {
      public Date apply(final Record it) {
        Date _date = it.getDate();
        return _date;
      }
    };
    List<Record> _sortBy = IterableExtensions.<Record, Date>sortBy(_records, _function);
    final Function1<Record,String> _function_1 = new Function1<Record,String>() {
      public String apply(final Record it) {
        String _name = it.getName();
        return _name;
      }
    };
    Column<Record> _column = Html.<Record>column("Name", _function_1);
    final Function1<Record,CharSequence> _function_2 = new Function1<Record,CharSequence>() {
      public CharSequence apply(final Record it) {
        CharSequence _xifexpression = null;
        if ((it instanceof Debit)) {
          double _amount = it.getAmount();
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
          double _amount = it.getAmount();
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
