package org.ollabaca.on.site.servlets;

import java.util.Arrays;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
    super("div", Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap()), null);
  }
  
  protected CharSequence _content_Element(final Topic object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ol class=\"breadcrumb\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<li>");
    Site _site = Sites.site();
    CharSequence _link_EObject = Link.link_EObject(_site);
    _builder.append(_link_EObject, "\t");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    {
      EList<Topic> _ancestors = object.getAncestors();
      for(final Topic e : _ancestors) {
        _builder.append("\t");
        _builder.append("<li>");
        CharSequence _link_EObject_1 = Link.link_EObject(e);
        _builder.append(_link_EObject_1, "\t");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("<li class=\"active\">");
    String _title = object.getTitle();
    CharSequence _span = Html.span(_title);
    _builder.append(_span, "\t");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    _builder.append("</ol>\t");
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
