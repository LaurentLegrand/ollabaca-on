package org.ollabaca.on.mm.book.site;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.uml.Section_Element;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Levels;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class Page_Book {
  public static CharSequence page_Book(final Book object) {
    CharSequence _xblockexpression = null;
    {
      Levels.reset();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!DOCTYPE html>");
      _builder.newLine();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<link href=\"/site/assets/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<link href=\"/site/assets/site.css\" rel=\"stylesheet\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<style>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("body {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-reset: part chapter;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("section.level-1 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-increment: part;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("section.level-2 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-increment: chapter;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-reset: section-3;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("section.level-3 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-increment: section-3;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-reset: section-4;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("section.level-4 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-increment: section-4;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-reset: section-5;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("section.level-5 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("counter-increment: section-5;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("h1.marker:after {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("content: \"Part \" counter(part, upper-roman);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("h2.marker:after {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("content: \"Chapter \" counter(chapter);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("h3.marker:after {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("content: counter(section-3);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("h4.marker:after {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("content: counter(section-3) \".\" counter(section-4);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("h5.marker:after {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("content: counter(section-3) \".\" counter(section-4) \".\" counter(section-5);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</style>");
      _builder.newLine();
      _builder.append("<script src=\"/site/assets/jquery/jquery-2.0.2.min.js\"></script>");
      _builder.newLine();
      _builder.append("<script src=\"/site/assets/bootstrap/js/bootstrap.js\"></script>");
      _builder.newLine();
      _builder.append("<script src=\"/site/book-assets/book.js\"></script>");
      _builder.newLine();
      _builder.append("<script>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("$(document).ready(function() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$(\"table\").wrap(\"<div class=\'table\' style=\'overflow: auto;\'/>\");");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("$(\"a[href]\").each(function() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("var a = $(this);");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("var href = a.attr(\"href\");");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("var id = \"#\" + href.replace( /(\\/|:|\\.|\\[|\\])/g, \"\\\\$1\" );");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if ($(id).length != 0) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("a.attr(\"href\", \"#\" + href);");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("} catch (err) { }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("});");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("});");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("</script>");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<div class=\"container\">");
      _builder.newLine();
      _builder.append("\t\t");
      CharSequence _section_Element = Section_Element.section_Element(object);
      _builder.append(_section_Element, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public static CharSequence title_Element(final Element object) {
    String _xblockexpression = null;
    {
      final Topic topic = Sites.topic_EObject(object);
      boolean _notEquals = (!Objects.equal(topic, null));
      if (_notEquals) {
        String _title = topic.getTitle();
        return Html.span(_title);
      } else {
        if ((object instanceof NamedElement)) {
          String _name = ((NamedElement) object).getName();
          return Html.span(_name);
        }
      }
      _xblockexpression = Html.escape("<undef>");
    }
    return _xblockexpression;
  }
  
  public static CharSequence link(final Element object) {
    CharSequence _xblockexpression = null;
    {
      Site _site = Sites.site();
      final Topic topic = _site.getTopic(object);
      CharSequence _xifexpression = null;
      boolean _notEquals = (!Objects.equal(topic, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a href=\"#");
        String _id = Page_Book.id(object);
        _builder.append(_id, "");
        _builder.append("\">");
        CharSequence _title_Element = Page_Book.title_Element(object);
        _builder.append(_title_Element, "");
        _builder.append("</a>");
        _xifexpression = _builder;
      } else {
        return Notation.notation_Object(object);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String id(final Object object) {
    int _identityHashCode = System.identityHashCode(object);
    return Long.toHexString(_identityHashCode);
  }
  
  protected static boolean _isEmpty(final String object) {
    String _trim = object.trim();
    int _length = _trim.length();
    return (_length == 0);
  }
  
  protected static boolean _isEmpty(final Void object) {
    return true;
  }
  
  public static boolean isEmpty(final String object) {
    if (object != null) {
      return _isEmpty(object);
    } else if (object == null) {
      return _isEmpty((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
