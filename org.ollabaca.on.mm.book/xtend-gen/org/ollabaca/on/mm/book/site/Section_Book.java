package org.ollabaca.on.mm.book.site;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.site.BookElements;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Title;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.uml.Section_Element_OwnedElements;

@SuppressWarnings("all")
public class Section_Book {
  public static CharSequence section_Book(final Book self) {
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
}
