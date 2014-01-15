package org.ollabaca.on.site.servlets;

import com.google.common.base.Objects;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Locales;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Notation extends Template<Object> {
  public final static Notation instance = new Function0<Notation>() {
    public Notation apply() {
      Notation _notation = new Notation();
      return _notation;
    }
  }.apply();
  
  public static CharSequence notation_Object(final Object self) {
    CharSequence _transform = Notation.instance.transform(self);
    return _transform;
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
    CharSequence _link_EObject = Link.link_EObject(self);
    return _link_EObject;
  }
  
  protected CharSequence _doFallback(final Object self) {
    String _string = self.toString();
    return _string;
  }
  
  protected CharSequence _doFallback(final Iterable<? extends Object> self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final Object e : self) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<ul>", "");
        }
        _builder.append("<li>");
        CharSequence _notation_Object = Notation.notation_Object(e);
        _builder.append(_notation_Object, "");
        _builder.append("</li>");
      }
      if (_hasElements) {
        _builder.append("</ul>", "");
      }
    }
    return _builder;
  }
  
  protected CharSequence _doFallback(final String self) {
    CharSequence _span = Html.span(self);
    return _span;
  }
  
  protected CharSequence _doFallback(final Void self) {
    return "<code class=\'null\'>null</code>";
  }
  
  protected CharSequence _doFallback(final Number self) {
    Locale _get = Locales.get();
    NumberFormat _instance = NumberFormat.getInstance(_get);
    String _format = _instance.format(self);
    return _format;
  }
  
  protected CharSequence _doFallback(final Date self) {
    Locale _get = Locales.get();
    DateFormat _dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, _get);
    String _format = _dateTimeInstance.format(self);
    return _format;
  }
  
  public CharSequence doFallback(final Object self) {
    if (self instanceof Element) {
      return _doFallback((Element)self);
    } else if (self instanceof Number) {
      return _doFallback((Number)self);
    } else if (self instanceof String) {
      return _doFallback((String)self);
    } else if (self instanceof Date) {
      return _doFallback((Date)self);
    } else if (self instanceof EObject) {
      return _doFallback((EObject)self);
    } else if (self instanceof Iterable) {
      return _doFallback((Iterable<?>)self);
    } else if (self == null) {
      return _doFallback((Void)null);
    } else if (self != null) {
      return _doFallback(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
