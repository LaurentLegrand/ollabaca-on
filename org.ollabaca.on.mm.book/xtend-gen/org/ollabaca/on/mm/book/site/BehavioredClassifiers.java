package org.ollabaca.on.mm.book.site;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.ollabaca.on.mm.book.site.Section_Element;

@SuppressWarnings("all")
public class BehavioredClassifiers {
  public static CharSequence section_BehavioredClassifier_OwnedBehaviors(final BehavioredClassifier self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Behavior> _ownedBehaviors = self.getOwnedBehaviors();
      for(final Behavior e : _ownedBehaviors) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
