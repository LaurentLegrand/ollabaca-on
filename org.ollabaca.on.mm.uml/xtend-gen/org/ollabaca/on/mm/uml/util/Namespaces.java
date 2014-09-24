package org.ollabaca.on.mm.uml.util;

import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.uml.util.Constraints;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Content;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Namespaces {
  public static CharSequence ordered_list_Namespace_OwnedRules(final Namespace object) {
    EList<Constraint> _ownedRules = object.getOwnedRules();
    final Function1<Constraint, CharSequence> _function = new Function1<Constraint, CharSequence>() {
      public CharSequence apply(final Constraint it) {
        return Constraints.div_Constraint(it);
      }
    };
    Content<Constraint> _content = Html.<Constraint>content(_function);
    return Html.<Constraint>ol(_ownedRules, Collections.<Attr<Iterable<? extends Constraint>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends Constraint>>>newArrayList()), _content);
  }
}
