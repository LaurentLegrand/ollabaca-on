package org.ollabaca.on.mm.book.site;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.Chapter;
import org.ollabaca.on.mm.book.Part;
import org.ollabaca.on.mm.book.Section;
import org.ollabaca.on.mm.uml.Section_Element;

@SuppressWarnings("all")
public class Section_BookElement_OwnedElements {
  protected static CharSequence _section_Element_OwnedElements(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Book object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Part> _parts = object.getParts();
      for(final Part e : _parts) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Part object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Chapter> _chapters = object.getChapters();
      for(final Chapter e : _chapters) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Section object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Element> _elements = object.getElements();
      for(final Element e : _elements) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Section> _sections = object.getSections();
      for(final Section e_1 : _sections) {
        CharSequence _section_Element_1 = Section_Element.section_Element(e_1);
        _builder.append(_section_Element_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence section_Element_OwnedElements(final Element object) {
    if (object instanceof Book) {
      return _section_Element_OwnedElements((Book)object);
    } else if (object instanceof Part) {
      return _section_Element_OwnedElements((Part)object);
    } else if (object instanceof Section) {
      return _section_Element_OwnedElements((Section)object);
    } else if (object != null) {
      return _section_Element_OwnedElements(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
