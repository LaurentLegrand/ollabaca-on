package org.ollabaca.on.site.servlets;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.servlets.Scope;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Ref extends Template<Object> {
  public final static Ref instance = new Function0<Ref>() {
    public Ref apply() {
      Ref _ref = new Ref();
      return _ref;
    }
  }.apply();
  
  public static CharSequence ref_Object(final Object self) {
    CharSequence _transform = Ref.instance.transform(self);
    return _transform;
  }
  
  public static Scope scope(final String path, final EObject target) {
    Scope _scope = new Scope(path, target);
    return _scope;
  }
  
  protected CharSequence _doFallback(final Void self) {
    return "null";
  }
  
  protected CharSequence _doFallback(final EObject self) {
    Scope _scope = new Scope("pages", self);
    CharSequence _ref_Object = Ref.ref_Object(_scope);
    return _ref_Object;
  }
  
  protected CharSequence _doFallback(final Scope self) {
    String _path = self.getPath();
    EObject _target = self.getTarget();
    String _path_1 = this.path(_path, _target);
    return _path_1;
  }
  
  protected String _path(final String scope, final Site self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    String _name = self.getName();
    _builder.append(_name, "");
    return _builder.toString();
  }
  
  protected String _path(final String scope, final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    Site _site = Sites.site();
    String _name = _site.getName();
    _builder.append(_name, "");
    _builder.append("/topics/");
    String _name_1 = self.getName();
    _builder.append(_name_1, "");
    return _builder.toString();
  }
  
  protected String _path(final String scope, final Tag self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    Site _site = Sites.site();
    String _name = _site.getName();
    _builder.append(_name, "");
    _builder.append("/tags/");
    String _name_1 = self.getName();
    _builder.append(_name_1, "");
    return _builder.toString();
  }
  
  protected String _path(final String scope, final EObject self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    Site _site = Sites.site();
    String _name = _site.getName();
    _builder.append(_name, "");
    _builder.append("/unknwon/");
    _builder.append(self, "");
    return _builder.toString();
  }
  
  protected String _path(final String scope, final Type self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    Site _site = Sites.site();
    String _name = _site.getName();
    _builder.append(_name, "");
    _builder.append("/types/");
    String _name_1 = self.getName();
    _builder.append(_name_1, "");
    return _builder.toString();
  }
  
  public CharSequence doFallback(final Object self) {
    if (self instanceof EObject) {
      return _doFallback((EObject)self);
    } else if (self == null) {
      return _doFallback((Void)null);
    } else if (self instanceof Scope) {
      return _doFallback((Scope)self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public String path(final String scope, final EObject self) {
    if (self instanceof Site) {
      return _path(scope, (Site)self);
    } else if (self instanceof Tag) {
      return _path(scope, (Tag)self);
    } else if (self instanceof Topic) {
      return _path(scope, (Topic)self);
    } else if (self instanceof Type) {
      return _path(scope, (Type)self);
    } else if (self != null) {
      return _path(scope, self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scope, self).toString());
    }
  }
}
