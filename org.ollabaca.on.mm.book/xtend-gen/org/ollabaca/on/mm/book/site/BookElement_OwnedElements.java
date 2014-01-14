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
  protected static CharSequence _ul_BookElement_OwnedElements(final BookElement self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected static CharSequence _ul_BookElement_OwnedElements(final Book self) {
    EList<Part> _parts = self.getParts();
    final Function1<Part,String> _function = new Function1<Part,String>() {
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
    CharSequence _ul = Html.<Part>ul(_parts, _function);
    return _ul;
  }
  
  protected static CharSequence _ul_BookElement_OwnedElements(final Part self) {
    EList<Chapter> _chapters = self.getChapters();
    final Function1<Chapter,String> _function = new Function1<Chapter,String>() {
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
    CharSequence _ul = Html.<Chapter>ul(_chapters, _function);
    return _ul;
  }
  
  protected static CharSequence _ul_BookElement_OwnedElements(final Section self) {
    CharSequence _xblockexpression = null;
    {
      boolean _and = false;
      EList<Element> _elements = self.getElements();
      boolean _isEmpty = _elements.isEmpty();
      if (!_isEmpty) {
        _and = false;
      } else {
        EList<Section> _sections = self.getSections();
        boolean _isEmpty_1 = _sections.isEmpty();
        _and = (_isEmpty && _isEmpty_1);
      }
      if (_and) {
        return "";
      }
      final Function1<Section,String> _function = new Function1<Section,String>() {
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
      CharSequence _tag = Html.<Section>tag(self, "ul", _function);
      _xblockexpression = (_tag);
    }
    return _xblockexpression;
  }
  
  public static CharSequence ul_BookElement_OwnedElements(final BookElement self) {
    if (self instanceof Book) {
      return _ul_BookElement_OwnedElements((Book)self);
    } else if (self instanceof Part) {
      return _ul_BookElement_OwnedElements((Part)self);
    } else if (self instanceof Section) {
      return _ul_BookElement_OwnedElements((Section)self);
    } else if (self != null) {
      return _ul_BookElement_OwnedElements(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
