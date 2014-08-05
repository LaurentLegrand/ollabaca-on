package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.util.Transformer;

@SuppressWarnings("all")
public class Sites {
  public final static Transformer<EObject, Topic> topic = new Transformer<EObject, Topic>(new Function1<EObject, Topic>() {
    public Topic apply(final EObject it) {
      return Sites.topic_fallback(it);
    }
  });
  
  public static Topic topic_EObject(final EObject object) {
    return Sites.topic.transform(object);
  }
  
  protected static Topic _topic_fallback(final EObject object) {
    Site _site_Object = Sites.site_Object(object);
    return _site_Object.getTopic(object);
  }
  
  protected static Topic _topic_fallback(final Void object) {
    return null;
  }
  
  protected static Topic _topic_fallback(final Topic object) {
    return object;
  }
  
  public final static ThreadLocal<Site> current = new ThreadLocal<Site>();
  
  public static Site site() {
    return Sites.current.get();
  }
  
  public static Site site_Object(final EObject object) {
    return Sites.current.get();
  }
  
  public static Type type_EClass(final EClass object) {
    final String n = object.getInstanceClassName();
    Site _site = Sites.site();
    EList<Type> _types = _site.getTypes();
    final Function1<Type, Boolean> _function = new Function1<Type, Boolean>() {
      public Boolean apply(final Type it) {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, n));
      }
    };
    return IterableExtensions.<Type>findFirst(_types, _function);
  }
  
  public static boolean isTargetInstanceOf(final Element element, final Class<?> type) {
    boolean _and = false;
    if (!(element instanceof Topic)) {
      _and = false;
    } else {
      EObject _target = ((Topic) element).getTarget();
      boolean _isInstance = type.isInstance(_target);
      _and = _isInstance;
    }
    return _and;
  }
  
  public static Topic topic_fallback(final EObject object) {
    if (object instanceof Topic) {
      return _topic_fallback((Topic)object);
    } else if (object != null) {
      return _topic_fallback(object);
    } else if (object == null) {
      return _topic_fallback((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
