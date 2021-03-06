package org.ollabaca.on.site.servlets;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.servlets.Scope;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Ref extends Template<Object> {
  public final static Ref instance = new Ref();
  
  public static CharSequence ref_Object(final Object object) {
    return Ref.instance.transform(object);
  }
  
  public static Scope scope(final String path, final EObject target) {
    return new Scope(path, target);
  }
  
  protected CharSequence _doFallback(final Void object) {
    return "null";
  }
  
  protected CharSequence _doFallback(final EObject object) {
    Scope _scope = new Scope("pages", object);
    return Ref.ref_Object(_scope);
  }
  
  protected CharSequence _doFallback(final Scope object) {
    String _path = object.getPath();
    EObject _target = object.getTarget();
    return this.path(_path, _target);
  }
  
  protected String _path(final String scope, final Site object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    String _name = object.getName();
    _builder.append(_name, "");
    return _builder.toString();
  }
  
  protected String _path(final String scope, final Topic object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    Site _site = Sites.site();
    String _name = _site.getName();
    _builder.append(_name, "");
    _builder.append("/topics/");
    String _name_1 = object.getName();
    _builder.append(_name_1, "");
    return _builder.toString();
  }
  
  protected String _path(final String scope, final Tag object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    Site _site = Sites.site();
    String _name = _site.getName();
    _builder.append(_name, "");
    _builder.append("/tags/");
    String _name_1 = object.getName();
    _builder.append(_name_1, "");
    return _builder.toString();
  }
  
  protected String _path(final String scope, final EObject object) {
    String _xblockexpression = null;
    {
      final Topic topic = Sites.topic_EObject(object);
      String _xifexpression = null;
      boolean _equals = Objects.equal(topic, null);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("#404/");
        _builder.append(scope, "");
        _builder.append("/");
        _builder.append(object, "");
        _xifexpression = _builder.toString();
      } else {
        _xifexpression = this.path(scope, topic);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected String _path(final String scope, final Type object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/site/");
    _builder.append(scope, "");
    _builder.append("/");
    Site _site = Sites.site();
    String _name = _site.getName();
    _builder.append(_name, "");
    _builder.append("/types/");
    String _name_1 = object.getName();
    _builder.append(_name_1, "");
    return _builder.toString();
  }
  
  public CharSequence doFallback(final Object object) {
    if (object instanceof EObject) {
      return _doFallback((EObject)object);
    } else if (object == null) {
      return _doFallback((Void)null);
    } else if (object instanceof Scope) {
      return _doFallback((Scope)object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public String path(final String scope, final EObject object) {
    if (object instanceof Site) {
      return _path(scope, (Site)object);
    } else if (object instanceof Tag) {
      return _path(scope, (Tag)object);
    } else if (object instanceof Topic) {
      return _path(scope, (Topic)object);
    } else if (object instanceof Type) {
      return _path(scope, (Type)object);
    } else if (object != null) {
      return _path(scope, object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scope, object).toString());
    }
  }
}
