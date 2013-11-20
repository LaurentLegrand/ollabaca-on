package org.ollabaca.on.uml.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class StructuredClassifiers {
  public CharSequence definition_list_StructuredClassifier_Parts(final StructuredClassifier self) {
    EList<Property> _parts = self.getParts();
    final Function1<Property,CharSequence> _function = new Function1<Property,CharSequence>() {
      public CharSequence apply(final Property it) {
        CharSequence _notation_Object = Notation.notation_Object(it);
        return _notation_Object;
      }
    };
    final Function1<Property,CharSequence> _function_1 = new Function1<Property,CharSequence>() {
      public CharSequence apply(final Property it) {
        CharSequence _documentation_EObject = Html.documentation_EObject(it);
        return _documentation_EObject;
      }
    };
    CharSequence _dl = Html.<Property>dl(_parts, _function, _function_1);
    return _dl;
  }
}
