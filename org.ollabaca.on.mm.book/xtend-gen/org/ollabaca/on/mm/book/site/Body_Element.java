package org.ollabaca.on.mm.book.site;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.book.BookElement;
import org.ollabaca.on.mm.book.Section;
import org.ollabaca.on.mm.book.site.BookElements;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Column;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Body_Element {
  protected static CharSequence _body_Element(final BookElement self) {
    CharSequence _c_BookElement = BookElements.toc_BookElement(self);
    return _c_BookElement;
  }
  
  protected static CharSequence _body_Element(final Section self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence __body_Element = Body_Element._body_Element(((BookElement) self));
    _builder.append(__body_Element, "");
    _builder.newLineIfNotEmpty();
    EList<Element> _elements = self.getElements();
    final Function1<Element,CharSequence> _function = new Function1<Element,CharSequence>() {
      public CharSequence apply(final Element it) {
        CharSequence _link_EObject = Link.link_EObject(it);
        return _link_EObject;
      }
    };
    Column<Element> _column = Html.<Element>column("Title", _function);
    final Function1<Element,CharSequence> _function_1 = new Function1<Element,CharSequence>() {
      public CharSequence apply(final Element it) {
        CharSequence _abstract_EObject = Html.abstract_EObject(it);
        return _abstract_EObject;
      }
    };
    Column<Element> _column_1 = Html.<Element>column("Description", _function_1);
    CharSequence _table = Html.<Element>table(_elements, Collections.<Attr<Iterable<? extends Element>>>unmodifiableList(Lists.<Attr<Iterable<? extends Element>>>newArrayList()), Collections.<Column<Element>>unmodifiableList(Lists.<Column<Element>>newArrayList(_column, _column_1)));
    _builder.append(_table, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _body_Element(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public static CharSequence body_Element(final Element self) {
    if (self instanceof Section) {
      return _body_Element((Section)self);
    } else if (self instanceof BookElement) {
      return _body_Element((BookElement)self);
    } else if (self != null) {
      return _body_Element(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
