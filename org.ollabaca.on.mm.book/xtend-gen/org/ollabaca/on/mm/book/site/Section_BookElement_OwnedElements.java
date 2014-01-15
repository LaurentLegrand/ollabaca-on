package org.ollabaca.on.mm.book.site;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.Chapter;
import org.ollabaca.on.mm.book.Part;
import org.ollabaca.on.mm.book.Section;
import org.ollabaca.on.uml.Section_Element;

@SuppressWarnings("all")
public class Section_BookElement_OwnedElements {
  protected static CharSequence _section_Element_OwnedElements(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Book self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Part> _parts = self.getParts();
      for(final Part e : _parts) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Part self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Chapter> _chapters = self.getChapters();
      for(final Chapter e : _chapters) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Section self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Element> _elements = self.getElements();
      for(final Element e : _elements) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Section> _sections = self.getSections();
      for(final Section e_1 : _sections) {
        CharSequence _section_Element_1 = Section_Element.section_Element(e_1);
        _builder.append(_section_Element_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence section_Element_OwnedElements(final Element self) {
    if (self instanceof Book) {
      return _section_Element_OwnedElements((Book)self);
    } else if (self instanceof Part) {
      return _section_Element_OwnedElements((Part)self);
    } else if (self instanceof Section) {
      return _section_Element_OwnedElements((Section)self);
    } else if (self != null) {
      return _section_Element_OwnedElements(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
