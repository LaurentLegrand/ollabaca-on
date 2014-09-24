package org.ollabaca.on.mm.book.site;

import java.util.Arrays;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.book.BookElement;
import org.ollabaca.on.mm.book.Section;
import org.ollabaca.on.mm.book.site.BookElements;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Column;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Body_BookElement {
  protected static CharSequence _body_BookElement(final BookElement object) {
    return BookElements.toc_BookElement(object);
  }
  
  protected static CharSequence _body_BookElement(final Section object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence __body_BookElement = Body_BookElement._body_BookElement(((BookElement) object));
    _builder.append(__body_BookElement, "");
    _builder.newLineIfNotEmpty();
    EList<Element> _elements = object.getElements();
    final Function1<Element, CharSequence> _function = new Function1<Element, CharSequence>() {
      public CharSequence apply(final Element it) {
        return Link.link_EObject(it);
      }
    };
    Column<Element> _column = Html.<Element>column("Title", _function);
    final Function1<Element, CharSequence> _function_1 = new Function1<Element, CharSequence>() {
      public CharSequence apply(final Element it) {
        return Html.abstract_EObject(it);
      }
    };
    Column<Element> _column_1 = Html.<Element>column("Description", _function_1);
    CharSequence _table = Html.<Element>table(_elements, Collections.<Attr<Iterable<? extends Element>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends Element>>>newArrayList()), Collections.<Column<Element>>unmodifiableList(CollectionLiterals.<Column<Element>>newArrayList(_column, _column_1)));
    _builder.append(_table, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence body_BookElement(final BookElement object) {
    if (object instanceof Section) {
      return _body_BookElement((Section)object);
    } else if (object != null) {
      return _body_BookElement(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
