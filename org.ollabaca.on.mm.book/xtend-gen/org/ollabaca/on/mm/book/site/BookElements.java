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
    final Function1<BookElement,CharSequence> _function = new Function1<BookElement,CharSequence>() {
      public CharSequence apply(final BookElement it) {
        CharSequence _ul_BookElement_OwnedElements = BookElement_OwnedElements.ul_BookElement_OwnedElements(it);
        return _ul_BookElement_OwnedElements;
      }
    };
    CharSequence _tag = Html.<BookElement>tag(object, "nav", _function);
    return _tag;
  }
  
  public static Topic topic_BookElement(final BookElement object) {
    Topic _xifexpression = null;
    Element _documentation = object.getDocumentation();
    boolean _notEquals = (!Objects.equal(_documentation, null));
    if (_notEquals) {
      Element _documentation_1 = object.getDocumentation();
      Topic _pic_EObject = Sites.topic_EObject(_documentation_1);
      _xifexpression = _pic_EObject;
    } else {
      Topic _pic_fallback = Sites.topic_fallback(object);
      _xifexpression = _pic_fallback;
    }
    return _xifexpression;
  }
}
