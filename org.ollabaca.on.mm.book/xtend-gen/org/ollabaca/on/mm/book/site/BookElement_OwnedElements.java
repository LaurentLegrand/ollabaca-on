package org.ollabaca.on.mm.book.site;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.BookElement;
import org.ollabaca.on.mm.book.Chapter;
import org.ollabaca.on.mm.book.Part;
import org.ollabaca.on.mm.book.Section;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class BookElement_OwnedElements {
  protected static CharSequence _ul_BookElement_OwnedElements(final BookElement object) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected static CharSequence _ul_BookElement_OwnedElements(final Book object) {
    EList<Part> _parts = object.getParts();
    final Function1<Part, String> _function = new Function1<Part, String>() {
      public String apply(final Part it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        CharSequence _link_EObject = Link.link_EObject(it);
        _builder.append(_link_EObject, " ");
        _builder.append(" ");
        CharSequence _ul_BookElement_OwnedElements = BookElement_OwnedElements.ul_BookElement_OwnedElements(it);
        _builder.append(_ul_BookElement_OwnedElements, " ");
        return _builder.toString();
      }
    };
    return Html.<Part>ul(_parts, _function);
  }
  
  protected static CharSequence _ul_BookElement_OwnedElements(final Part object) {
    EList<Chapter> _chapters = object.getChapters();
    final Function1<Chapter, String> _function = new Function1<Chapter, String>() {
      public String apply(final Chapter it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        CharSequence _link_EObject = Link.link_EObject(it);
        _builder.append(_link_EObject, " ");
        _builder.append(" ");
        CharSequence _ul_BookElement_OwnedElements = BookElement_OwnedElements.ul_BookElement_OwnedElements(it);
        _builder.append(_ul_BookElement_OwnedElements, " ");
        return _builder.toString();
      }
    };
    return Html.<Chapter>ul(_chapters, _function);
  }
  
  protected static CharSequence _ul_BookElement_OwnedElements(final Section object) {
    CharSequence _xblockexpression = null;
    {
      boolean _and = false;
      EList<Element> _elements = object.getElements();
      boolean _isEmpty = _elements.isEmpty();
      if (!_isEmpty) {
        _and = false;
      } else {
        EList<Section> _sections = object.getSections();
        boolean _isEmpty_1 = _sections.isEmpty();
        _and = _isEmpty_1;
      }
      if (_and) {
        return "";
      }
      final Function1<Section, String> _function = new Function1<Section, String>() {
        public String apply(final Section it) {
          StringConcatenation _builder = new StringConcatenation();
          {
            EList<Element> _elements = it.getElements();
            for(final Element e : _elements) {
              _builder.append("<li>");
              CharSequence _link_EObject = Link.link_EObject(e);
              _builder.append(_link_EObject, "");
              _builder.append("</li> ");
              _builder.append("\t\t\t\t");
            }
          }
          _builder.newLineIfNotEmpty();
          {
            EList<Section> _sections = it.getSections();
            for(final Section e_1 : _sections) {
              _builder.append("<li>");
              CharSequence _link_EObject_1 = Link.link_EObject(e_1);
              _builder.append(_link_EObject_1, "");
              _builder.append(" ");
              _builder.append("\t\t\t\t\t\t");
              CharSequence _ul_BookElement_OwnedElements = BookElement_OwnedElements.ul_BookElement_OwnedElements(e_1);
              _builder.append(_ul_BookElement_OwnedElements, "");
              _builder.newLineIfNotEmpty();
              _builder.append("</li>");
              _builder.newLine();
            }
          }
          return _builder.toString();
        }
      };
      _xblockexpression = Html.<Section>tag(object, "ul", _function);
    }
    return _xblockexpression;
  }
  
  public static CharSequence ul_BookElement_OwnedElements(final BookElement object) {
    if (object instanceof Book) {
      return _ul_BookElement_OwnedElements((Book)object);
    } else if (object instanceof Part) {
      return _ul_BookElement_OwnedElements((Part)object);
    } else if (object instanceof Section) {
      return _ul_BookElement_OwnedElements((Section)object);
    } else if (object != null) {
      return _ul_BookElement_OwnedElements(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
