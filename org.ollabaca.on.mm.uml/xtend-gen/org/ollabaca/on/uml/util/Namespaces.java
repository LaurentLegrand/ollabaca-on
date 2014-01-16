package org.ollabaca.on.uml.util;

import com.google.common.collect.Lists;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Content;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.uml.util.Constraints;

@SuppressWarnings("all")
public class Namespaces {
  public static CharSequence ordered_list_Namespace_OwnedRules(final Namespace self) {
    EList<Constraint> _ownedRules = self.getOwnedRules();
    final Function1<Constraint,CharSequence> _function = new Function1<Constraint,CharSequence>() {
      public CharSequence apply(final Constraint it) {
        CharSequence _div_Constraint = Constraints.div_Constraint(it);
        return _div_Constraint;
      }
    };
    Content<Constraint> _content = Html.<Constraint>content(_function);
    CharSequence _ol = Html.<Constraint>ol(_ownedRules, Collections.<Attr<Iterable<? extends Constraint>>>unmodifiableList(Lists.<Attr<Iterable<? extends Constraint>>>newArrayList()), _content);
    return _ol;
  }
}
