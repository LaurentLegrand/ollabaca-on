package org.ollabaca.on.site.servlets;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Features extends Template<EObject> {
  public final static Features instance = new Features();
  
  public static CharSequence features_EObject(final EObject object) {
    return Features.instance.transform(object);
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
