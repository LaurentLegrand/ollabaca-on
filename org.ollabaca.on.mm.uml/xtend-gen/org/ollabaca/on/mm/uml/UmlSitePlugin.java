package org.ollabaca.on.mm.uml;

import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.uml.Notation_Element;
import org.ollabaca.on.mm.uml.Section_Element;
import org.ollabaca.on.site.SitePlugin;
import org.ollabaca.on.site.servlets.Features;

@SuppressWarnings("all")
public class UmlSitePlugin implements SitePlugin {
  public Map<String, String> activate() {
    Notation_Element.register();
    final Function1<EObject, CharSequence> _function = new Function1<EObject, CharSequence>() {
      public CharSequence apply(final EObject it) {
        return Section_Element.section_Element(((Element) it));
      }
    };
    Features.instance.register(Element.class, _function);
    return Collections.<String, String>emptyMap();
  }
}
