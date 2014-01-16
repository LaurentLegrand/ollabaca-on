package org.ollabaca.on.mm.book.site;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.site.BookElements;
import org.ollabaca.on.mm.uml.Section_Element_OwnedElements;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Title;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class Section_Book {
  public static CharSequence section_Book(final Book object) {
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
    Topic _pic_EObject = Sites.topic_EObject(object);
    CharSequence _title_Element = Title.title_Element(_pic_EObject);
    _builder.append(_title_Element, "\t\t\t");
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
    CharSequence _c_BookElement = BookElements.toc_BookElement(object);
    _builder.append(_c_BookElement, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    CharSequence _section_Element_OwnedElements = Section_Element_OwnedElements.section_Element_OwnedElements(object);
    _builder.append(_section_Element_OwnedElements, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
