package org.ollabaca.on.mm.book.site;

import java.util.Arrays;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.site.Body_Element;
import org.ollabaca.on.mm.book.site.BookElements;
import org.ollabaca.on.mm.book.site.Section_Element_OwnedElements;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.servlets.Title;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.uml.Layout_Element;

@SuppressWarnings("all")
public class Section_Element {
  protected static CharSequence _section_Element(final Book self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row-fluid\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"span12\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"page-header\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    Topic _pic_EObject = Sites.topic_EObject(self);
    CharSequence _title_Element = Title.title_Element(_pic_EObject);
    _builder.append(_title_Element, "			");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"span12\">");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _c_BookElement = BookElements.toc_BookElement(self);
    _builder.append(_c_BookElement, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    CharSequence _section_Element_OwnedElements = Section_Element_OwnedElements.section_Element_OwnedElements(self);
    _builder.append(_section_Element_OwnedElements, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element(final Element self) {
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    Topic _pic_EObject = Sites.topic_EObject(self);
    String _title = _pic_EObject.getTitle();
    CharSequence _span = Html.span(_title);
    String _string_1 = _span.toString();
    final Function1<Element,String> _function = new Function1<Element,String>() {
      public String apply(final Element it) {
        StringConcatenation _builder = new StringConcatenation();
        CharSequence _documentation_EObject = Html.documentation_EObject(it);
        _builder.append(_documentation_EObject, "");
        _builder.newLineIfNotEmpty();
        CharSequence _body_Element = Body_Element.body_Element(it);
        _builder.append(_body_Element, "");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    };
    final Function1<Element,CharSequence> _function_1 = new Function1<Element,CharSequence>() {
      public CharSequence apply(final Element it) {
        CharSequence _section_Element_OwnedElements = Section_Element_OwnedElements.section_Element_OwnedElements(it);
        return _section_Element_OwnedElements;
      }
    };
    CharSequence _layout_Element = Layout_Element.<Element>layout_Element(_string, _string_1, self, _function, _function_1);
    return _layout_Element;
  }
  
  public static CharSequence section_Element(final Element self) {
    if (self instanceof Book) {
      return _section_Element((Book)self);
    } else if (self != null) {
      return _section_Element(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
