package org.ollabaca.on.site.servlets;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Named;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Link extends Template<EObject> {
  public final static Link instance = new Function0<Link>() {
    public Link apply() {
      Link _link = new Link();
      return _link;
    }
  }.apply();
  
  public static CharSequence link_EObject(final EObject self) {
    CharSequence _transform = Link.instance.transform(self);
    return _transform;
  }
  
  protected CharSequence _doFallback(final Void self) {
    return "null";
  }
  
  protected CharSequence _doFallback(final Named self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    CharSequence _ref_Object = Ref.ref_Object(self);
    _builder.append(_ref_Object, "");
    _builder.append("\">");
    String _name = self.getName();
    _builder.append(_name, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Type self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    CharSequence _ref_Object = Ref.ref_Object(self);
    _builder.append(_ref_Object, "");
    _builder.append("\">");
    String _name = self.getName();
    String[] _split = _name.split("\\.");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    _builder.append(_last, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    CharSequence _ref_Object = Ref.ref_Object(self);
    _builder.append(_ref_Object, "");
    _builder.append("\">");
    String _title = self.getTitle();
    CharSequence _span = Html.span(_title);
    _builder.append(_span, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _doFallback(final EClass self) {
    CharSequence _xblockexpression = null;
    {
      final Type type = Sites.type_EClass(self);
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equal(type, null);
      if (_equals) {
        String _name = self.getName();
        _xifexpression = _name;
      } else {
        CharSequence _link_EObject = Link.link_EObject(type);
        _xifexpression = _link_EObject;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _doFallback(final EObject self) {
    CharSequence _xblockexpression = null;
    {
      final Topic topic = Sites.topic_EObject(self);
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equal(topic, null);
      if (_equals) {
        String _string = self.toString();
        _xifexpression = _string;
      } else {
        CharSequence _link_EObject = Link.link_EObject(topic);
        _xifexpression = _link_EObject;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _doFallback(final Element self) {
    Site _site = Sites.site();
    CharSequence _link_EObject = Link.link_EObject(_site);
    return _link_EObject;
  }
  
  public CharSequence doFallback(final EObject self) {
    if (self instanceof EClass) {
      return _doFallback((EClass)self);
    } else if (self instanceof Topic) {
      return _doFallback((Topic)self);
    } else if (self instanceof Type) {
      return _doFallback((Type)self);
    } else if (self instanceof Named) {
      return _doFallback((Named)self);
    } else if (self instanceof Element) {
      return _doFallback((Element)self);
    } else if (self != null) {
      return _doFallback(self);
    } else if (self == null) {
      return _doFallback((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
