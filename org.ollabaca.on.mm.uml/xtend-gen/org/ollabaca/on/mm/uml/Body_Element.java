package org.ollabaca.on.mm.uml;

import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Body_Element extends Template<Element> {
  public final static Body_Element instance = new Body_Element();
  
  public static CharSequence body_Element(final Element object) {
    return Body_Element.instance.transform(object);
  }
  
  public CharSequence doFallback(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
