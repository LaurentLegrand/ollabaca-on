package org.ollabaca.on.mm.book.site;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.mm.book.Book;
import org.ollabaca.on.mm.book.site.Section_Element;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Levels;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class BookToHtml {
  public CharSequence html_Book(final Book self) {
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
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<div class=\"container-fluid\">");
      _builder.newLine();
      _builder.append("\t\t");
      CharSequence _section_Element = Section_Element.section_Element(self);
      _builder.append(_section_Element, "		");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence title_Element(final Element self) {
    String _xblockexpression = null;
    {
      final Topic topic = Sites.topic_EObject(self);
      boolean _notEquals = (!Objects.equal(topic, null));
      if (_notEquals) {
        String _title = topic.getTitle();
        return Html.span(_title);
      } else {
        if ((self instanceof NamedElement)) {
          String _name = ((NamedElement) self).getName();
          return Html.span(_name);
        }
      }
      String _escape = Html.escape("<undef>");
      _xblockexpression = (_escape);
    }
    return _xblockexpression;
  }
  
  public CharSequence link(final Element self) {
    CharSequence _xblockexpression = null;
    {
      Site _site = Sites.site();
      final Topic topic = _site.getTopic(self);
      CharSequence _xifexpression = null;
      boolean _notEquals = (!Objects.equal(topic, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a href=\"#");
        String _id = this.id(self);
        _builder.append(_id, "");
        _builder.append("\">");
        CharSequence _title_Element = this.title_Element(self);
        _builder.append(_title_Element, "");
        _builder.append("</a>");
        _xifexpression = _builder;
      } else {
        return Notation.notation_Object(self);
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String id(final Object self) {
    int _identityHashCode = System.identityHashCode(self);
    String _hexString = Long.toHexString(_identityHashCode);
    return _hexString;
  }
  
  protected boolean _isEmpty(final String self) {
    String _trim = self.trim();
    int _length = _trim.length();
    boolean _equals = (_length == 0);
    return _equals;
  }
  
  protected boolean _isEmpty(final Void self) {
    return true;
  }
  
  public boolean isEmpty(final String self) {
    if (self != null) {
      return _isEmpty(self);
    } else if (self == null) {
      return _isEmpty((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
