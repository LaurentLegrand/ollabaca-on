package org.ollabaca.on.mm.book.site;

import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pair;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.BookElement;
import org.ollabaca.on.mm.book.site.Body_BookElement;
import org.ollabaca.on.mm.book.site.BookElements;
import org.ollabaca.on.mm.book.site.Page_Book;
import org.ollabaca.on.mm.book.site.Section_Book;
import org.ollabaca.on.mm.book.site.Section_BookElement_OwnedElements;
import org.ollabaca.on.mm.uml.Body_Element;
import org.ollabaca.on.mm.uml.Section_Element;
import org.ollabaca.on.mm.uml.Section_Element_OwnedElements;
import org.ollabaca.on.site.SitePlugin;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.renderers.Renderers;
import org.ollabaca.on.site.renderers.Text;
import org.ollabaca.on.site.servlets.Page;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.servlets.Scope;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class BookSitePlugin implements SitePlugin {
  private final static String BOOK = "book";
  
  public Map<String, String> activate() {
    final Function1<EObject, Topic> _function = new Function1<EObject, Topic>() {
      public Topic apply(final EObject it) {
        Topic _xifexpression = null;
        if ((it instanceof BookElement)) {
          _xifexpression = BookElements.topic_BookElement(((BookElement) it));
        }
        return _xifexpression;
      }
    };
    Sites.topic.register(BookElement.class, _function);
    final Function1<EObject, String> _function_1 = new Function1<EObject, String>() {
      public String apply(final EObject it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a href=\"");
        Topic _pic_EObject = Sites.topic_EObject(it);
        Scope _scope = Ref.scope(BookSitePlugin.BOOK, _pic_EObject);
        CharSequence _ref_Object = Ref.ref_Object(_scope);
        _builder.append(_ref_Object, "");
        _builder.append("\" target=\"_blank\">Read more...</a>");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    };
    Page.article.beforeEnd.register(Book.class, _function_1);
    final Function1<Element, CharSequence> _function_2 = new Function1<Element, CharSequence>() {
      public CharSequence apply(final Element it) {
        return Section_Book.section_Book(((Book) it));
      }
    };
    Section_Element.instance.register(Book.class, _function_2);
    final Function1<Element, CharSequence> _function_3 = new Function1<Element, CharSequence>() {
      public CharSequence apply(final Element it) {
        return Section_BookElement_OwnedElements.section_Element_OwnedElements(((BookElement) it));
      }
    };
    Section_Element_OwnedElements.instance.register(BookElement.class, _function_3);
    final Function1<Element, CharSequence> _function_4 = new Function1<Element, CharSequence>() {
      public CharSequence apply(final Element it) {
        return Body_BookElement.body_BookElement(((BookElement) it));
      }
    };
    Body_Element.instance.register(BookElement.class, _function_4);
    final Function1<Topic, Text> _function_5 = new Function1<Topic, Text>() {
      public Text apply(final Topic it) {
        EObject _target = it.getTarget();
        CharSequence _page_Book = Page_Book.page_Book(((Book) _target));
        return new Text("text/html", _page_Book);
      }
    };
    Renderers.topicRenderers.registerRenderer(BookSitePlugin.BOOK, _function_5);
    Pair<String, String> _mappedTo = Pair.<String, String>of("/site/book-assets", "/org/ollabaca/on/mm/book/site/assets");
    return Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo));
  }
}
