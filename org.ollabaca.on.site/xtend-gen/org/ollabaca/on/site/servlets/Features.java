package org.ollabaca.on.site.servlets;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Features extends Template<EObject> {
  public final static Features instance = new Function0<Features>() {
    public Features apply() {
      Features _features = new Features();
      return _features;
    }
  }.apply();
  
  public static CharSequence features_EObject(final EObject object) {
    CharSequence _transform = Features.instance.transform(object);
    return _transform;
  }
  
  protected CharSequence _doFallback(final EObject object) {
    return "";
  }
  
  protected CharSequence _doFallback(final Void object) {
    return "";
  }
  
  protected CharSequence doFallback(final EObject object) {
    if (object != null) {
      return _doFallback(object);
    } else if (object == null) {
      return _doFallback((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
