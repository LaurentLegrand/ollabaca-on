package org.ollabaca.on.mm.uml.util;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.uml.util.Types;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Classifiers {
  public static CharSequence dl_Classifier_Associations(final Classifier object) {
    List<Property> _associationEnds = Types.getAssociationEnds(object);
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
    CharSequence _dl = Html.<Property>dl(_associationEnds, _function, _function_1);
    return _dl;
  }
  
  public static CharSequence ul_Classifier_Generals(final Classifier object) {
    EList<Classifier> _generals = object.getGenerals();
    final Function1<Classifier,CharSequence> _function = new Function1<Classifier,CharSequence>() {
      public CharSequence apply(final Classifier it) {
        CharSequence _link_EObject = Link.link_EObject(it);
        return _link_EObject;
      }
    };
    CharSequence _ul = Html.<Classifier>ul(_generals, _function);
    return _ul;
  }
  
  public static CharSequence dl_Classifier_Attributes(final Classifier object) {
    EList<Property> _attributes = object.getAttributes();
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
    CharSequence _dl = Html.<Property>dl(_attributes, _function, _function_1);
    return _dl;
  }
  
  public static CharSequence dl_Classifier_Operations(final Classifier object) {
    EList<Operation> _operations = object.getOperations();
    final Function1<Operation,CharSequence> _function = new Function1<Operation,CharSequence>() {
      public CharSequence apply(final Operation it) {
        CharSequence _notation_Object = Notation.notation_Object(it);
        return _notation_Object;
      }
    };
    final Function1<Operation,CharSequence> _function_1 = new Function1<Operation,CharSequence>() {
      public CharSequence apply(final Operation it) {
        CharSequence _documentation_EObject = Html.documentation_EObject(it);
        return _documentation_EObject;
      }
    };
    CharSequence _dl = Html.<Operation>dl(_operations, _function, _function_1);
    return _dl;
  }
}
