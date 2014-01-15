package org.ollabaca.on.site.servlets;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Named;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Title extends Template<Element> {
  public final static Title instance = new Function0<Title>() {
    public Title apply() {
      Title _title = new Title();
      return _title;
    }
  }.apply();
  
  public static CharSequence title_Element(final Element self) {
    CharSequence _transform = Title.instance.transform(self);
    return _transform;
  }
  
  protected CharSequence _doFallback(final Site self) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = self.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final EObject self) {
    StringConcatenation _builder = new StringConcatenation();
    Site _site_Object = Sites.site_Object(self);
    String _name = _site_Object.getName();
    _builder.append(_name, "");
    _builder.append(" - ");
    Topic _pic_EObject = Sites.topic_EObject(self);
    String _title = _pic_EObject.getTitle();
    _builder.append(_title, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    Site _site_Object = Sites.site_Object(self);
    String _name = _site_Object.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Named self) {
    StringConcatenation _builder = new StringConcatenation();
    Site _site_Object = Sites.site_Object(self);
    String _name = _site_Object.getName();
    _builder.append(_name, "");
    _builder.append(" - ");
    String _name_1 = self.getName();
    _builder.append(_name_1, "");
    return _builder;
  }
  
  protected CharSequence _doFallback(final Void self) {
    return "";
  }
  
  public CharSequence doFallback(final EObject self) {
    if (self instanceof Site) {
      return _doFallback((Site)self);
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
