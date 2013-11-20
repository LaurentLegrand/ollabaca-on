package org.ollabaca.on.uml.util;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Constraints {
  public static CharSequence div_Constraint(final Constraint self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    CharSequence _documentation_EObject = Html.documentation_EObject(self);
    _builder.append(_documentation_EObject, "");
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    _builder.append("<div>");
    CharSequence _notation_Object = Notation.notation_Object(self);
    _builder.append(_notation_Object, "");
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
