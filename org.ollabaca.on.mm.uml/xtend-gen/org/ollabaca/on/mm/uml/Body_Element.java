package org.ollabaca.on.mm.uml;

import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Body_Element extends Template<Element> {
  public final static Body_Element instance = new Function0<Body_Element>() {
    public Body_Element apply() {
      Body_Element _body_Element = new Body_Element();
      return _body_Element;
    }
  }.apply();
  
  public static CharSequence body_Element(final Element self) {
    return Body_Element.instance.transform(self);
  }
  
  public CharSequence doFallback(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
