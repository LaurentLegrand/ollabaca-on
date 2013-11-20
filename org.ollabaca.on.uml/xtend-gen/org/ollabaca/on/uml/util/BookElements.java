package org.ollabaca.on.uml.util;

import com.google.common.base.Objects;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.uml.book.BookElement;
import org.ollabaca.on.uml.util.BookElement_OwnedElements;

@SuppressWarnings("all")
public class BookElements {
  public static CharSequence toc_BookElement(final BookElement self) {
    final Function1<BookElement,CharSequence> _function = new Function1<BookElement,CharSequence>() {
      public CharSequence apply(final BookElement it) {
        CharSequence _ul_BookElement_OwnedElements = BookElement_OwnedElements.ul_BookElement_OwnedElements(it);
        return _ul_BookElement_OwnedElements;
      }
    };
    CharSequence _tag = Html.<BookElement>tag(self, "nav", _function);
    return _tag;
  }
  
  public static Topic topic_BookElement(final BookElement self) {
    Topic _xifexpression = null;
    Element _documentation = self.getDocumentation();
    boolean _notEquals = (!Objects.equal(_documentation, null));
    if (_notEquals) {
      Element _documentation_1 = self.getDocumentation();
      Topic _pic_EObject = Sites.topic_EObject(_documentation_1);
      _xifexpression = _pic_EObject;
    } else {
      Topic _pic_fallback = Sites.topic_fallback(self);
      _xifexpression = _pic_fallback;
    }
    return _xifexpression;
  }
}
