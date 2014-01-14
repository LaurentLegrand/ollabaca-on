package org.ollabaca.on.mm.book.site;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.book.BookElement;
import org.ollabaca.on.mm.book.site.BookContentProvider;
import org.ollabaca.on.mm.book.site.BookElements;
import org.ollabaca.on.site.SitePlugin;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class BookSitePlugin implements SitePlugin {
  public void activate() {
    final Function1<EObject,Topic> _function = new Function1<EObject,Topic>() {
      public Topic apply(final EObject it) {
        Topic _xifexpression = null;
        if ((it instanceof BookElement)) {
          Topic _pic_BookElement = BookElements.topic_BookElement(((BookElement) it));
          _xifexpression = _pic_BookElement;
        }
        return _xifexpression;
      }
    };
    Sites.topic.register(BookElement.class, _function);
    BookContentProvider.register();
  }
}
