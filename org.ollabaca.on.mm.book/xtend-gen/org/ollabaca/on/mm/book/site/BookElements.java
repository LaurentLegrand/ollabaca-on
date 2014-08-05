package org.ollabaca.on.mm.book.site;

import com.google.common.base.Objects;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.book.BookElement;
import org.ollabaca.on.mm.book.site.BookElement_OwnedElements;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class BookElements {
  public static CharSequence toc_BookElement(final BookElement object) {
    final Function1<BookElement, CharSequence> _function = new Function1<BookElement, CharSequence>() {
      public CharSequence apply(final BookElement it) {
        return BookElement_OwnedElements.ul_BookElement_OwnedElements(it);
      }
    };
    return Html.<BookElement>tag(object, "nav", _function);
  }
  
  public static Topic topic_BookElement(final BookElement object) {
    Topic _xifexpression = null;
    Element _documentation = object.getDocumentation();
    boolean _notEquals = (!Objects.equal(_documentation, null));
    if (_notEquals) {
      Element _documentation_1 = object.getDocumentation();
      _xifexpression = Sites.topic_EObject(_documentation_1);
    } else {
      _xifexpression = Sites.topic_fallback(object);
    }
    return _xifexpression;
  }
}
