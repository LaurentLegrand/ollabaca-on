package org.ollabaca.on.mm.uml.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class BehavioralFeatures {
  public static CharSequence dl_BehavioralFeature_RaisedException(final BehavioralFeature object) {
    EList<Type> _raisedExceptions = object.getRaisedExceptions();
    final Function1<Type, CharSequence> _function = new Function1<Type, CharSequence>() {
      public CharSequence apply(final Type it) {
        return Notation.notation_Object(it);
      }
    };
    final Function1<Type, CharSequence> _function_1 = new Function1<Type, CharSequence>() {
      public CharSequence apply(final Type it) {
        return Html.abstract_EObject(it);
      }
    };
    return Html.<Type>dl(_raisedExceptions, _function, _function_1);
  }
}
