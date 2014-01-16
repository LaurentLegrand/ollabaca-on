package org.ollabaca.on.site.servlets;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.util.Component;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class Breadcrumb extends Component {
  public Breadcrumb() {
    super("div", new Function0<Map<String,String>>() {
      public Map<String,String> apply() {
        Map<String,String> _xsetliteral = null;
        Map<String,String> _tempMap = Maps.<String, String>newHashMap();
        _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
        return _xsetliteral;
      }
    }.apply(), null);
  }
  
  protected CharSequence _content_Element(final Topic object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul class=\"breadcrumb\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<li>");
    Site _site = Sites.site();
    CharSequence _link_EObject = Link.link_EObject(_site);
    _builder.append(_link_EObject, "\t");
    _builder.append(" <span class=\"divider\">/</span></li>");
    _builder.newLineIfNotEmpty();
    {
      EList<Topic> _ancestors = object.getAncestors();
      for(final Topic e : _ancestors) {
        _builder.append("\t");
        _builder.append("<li>");
        CharSequence _link_EObject_1 = Link.link_EObject(e);
        _builder.append(_link_EObject_1, "\t");
        _builder.append(" <span class=\"divider\">/</span></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("<li class=\"active\">");
    String _title = object.getTitle();
    String _html = Html.html(_title);
    _builder.append(_html, "\t");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    _builder.append("</ul>\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence content_Element(final Element object) {
    if (object instanceof Topic) {
      return _content_Element((Topic)object);
    } else if (object != null) {
      return _content_Element(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
