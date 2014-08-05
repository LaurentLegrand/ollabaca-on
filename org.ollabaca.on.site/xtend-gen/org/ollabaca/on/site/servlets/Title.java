package org.ollabaca.on.site.servlets;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Named;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Title extends Template<Element> {
  public final static Title instance = new Title();
  
  public static CharSequence title_Element(final Element object) {
    return Title.instance.transform(object);
  }
  
  protected CharSequence _doFallback(final Site object) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = object.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final EObject object) {
    StringConcatenation _builder = new StringConcatenation();
    Site _site_Object = Sites.site_Object(object);
    String _name = _site_Object.getName();
    _builder.append(_name, "");
    _builder.append(" - ");
    Topic _pic_EObject = Sites.topic_EObject(object);
    String _title = _pic_EObject.getTitle();
    _builder.append(_title, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    Site _site_Object = Sites.site_Object(object);
    String _name = _site_Object.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Named object) {
    StringConcatenation _builder = new StringConcatenation();
    Site _site_Object = Sites.site_Object(object);
    String _name = _site_Object.getName();
    _builder.append(_name, "");
    _builder.append(" - ");
    String _name_1 = object.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Void object) {
    return "";
  }
  
  public CharSequence doFallback(final EObject object) {
    if (object instanceof Site) {
      return _doFallback((Site)object);
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
