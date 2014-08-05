package org.ollabaca.on.mm.uml.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class StructuredClassifiers {
  public CharSequence definition_list_StructuredClassifier_Parts(final StructuredClassifier object) {
    EList<Property> _parts = object.getParts();
    final Function1<Property, CharSequence> _function = new Function1<Property, CharSequence>() {
      public CharSequence apply(final Property it) {
        return Notation.notation_Object(it);
      }
    };
    final Function1<Property, CharSequence> _function_1 = new Function1<Property, CharSequence>() {
      public CharSequence apply(final Property it) {
        return Html.documentation_EObject(it);
      }
    };
    return Html.<Property>dl(_parts, _function, _function_1);
  }
}
