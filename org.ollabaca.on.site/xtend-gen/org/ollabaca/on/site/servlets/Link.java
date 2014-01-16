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
  
  public static CharSequence link_EObject(final EObject object) {
    CharSequence _transform = Link.instance.transform(object);
    return _transform;
  }
  
  protected CharSequence _doFallback(final Void object) {
    return "null";
  }
  
  protected CharSequence _doFallback(final Named object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    CharSequence _ref_Object = Ref.ref_Object(object);
    _builder.append(_ref_Object, "");
    _builder.append("\">");
    String _name = object.getName();
    _builder.append(_name, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Type object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    CharSequence _ref_Object = Ref.ref_Object(object);
    _builder.append(_ref_Object, "");
    _builder.append("\">");
    String _name = object.getName();
    String[] _split = _name.split("\\.");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    _builder.append(_last, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Topic object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"");
    CharSequence _ref_Object = Ref.ref_Object(object);
    _builder.append(_ref_Object, "");
    _builder.append("\">");
    String _title = object.getTitle();
    CharSequence _span = Html.span(_title);
    _builder.append(_span, "");
    _builder.append("</a>");
    return _builder;
  }
  
  protected CharSequence _doFallback(final EClass object) {
    CharSequence _xblockexpression = null;
    {
      final Type type = Sites.type_EClass(object);
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equal(type, null);
      if (_equals) {
        String _name = object.getName();
        _xifexpression = _name;
      } else {
        CharSequence _link_EObject = Link.link_EObject(type);
        _xifexpression = _link_EObject;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _doFallback(final EObject object) {
    CharSequence _xblockexpression = null;
    {
      final Topic topic = Sites.topic_EObject(object);
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equal(topic, null);
      if (_equals) {
        String _string = object.toString();
        _xifexpression = _string;
      } else {
        CharSequence _link_EObject = Link.link_EObject(topic);
        _xifexpression = _link_EObject;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _doFallback(final Element object) {
    Site _site = Sites.site();
    CharSequence _link_EObject = Link.link_EObject(_site);
    return _link_EObject;
  }
  
  public CharSequence doFallback(final EObject object) {
    if (object instanceof EClass) {
      return _doFallback((EClass)object);
    } else if (object instanceof Topic) {
      return _doFallback((Topic)object);
    } else if (object instanceof Type) {
      return _doFallback((Type)object);
    } else if (object instanceof Named) {
      return _doFallback((Named)object);
    } else if (object instanceof Element) {
      return _doFallback((Element)object);
    } else if (object != null) {
      return _doFallback(object);
    } else if (object == null) {
      return _doFallback((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
