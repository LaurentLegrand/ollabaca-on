package org.ollabaca.on.mm.uml;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.uml.Layout_Element;
import org.ollabaca.on.mm.uml.util.BehavioralFeatures;
import org.ollabaca.on.mm.uml.util.BehavioredClassifiers;
import org.ollabaca.on.mm.uml.util.Classifiers;
import org.ollabaca.on.mm.uml.util.Constraints;
import org.ollabaca.on.mm.uml.util.Namespaces;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Section_Element_OwnedElements extends Template<Element> {
  public final static Section_Element_OwnedElements instance = new Section_Element_OwnedElements();
  
  public static CharSequence section_Element_OwnedElements(final Element object) {
    return Section_Element_OwnedElements.instance.transform(object);
  }
  
  protected CharSequence _doFallback(final UseCase object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence __doFallback = this._doFallback(((Classifier) object));
    _builder.append(__doFallback, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object = Ref.ref_Object(object);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-OwnedRules");
    final Function1<UseCase, CharSequence> _function = new Function1<UseCase, CharSequence>() {
      public CharSequence apply(final UseCase it) {
        return Namespaces.ordered_list_Namespace_OwnedRules(it);
      }
    };
    CharSequence _layout_Element = Layout_Element.<UseCase>layout_Element(_plus, "Constraints", object, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(object);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-OwnedBehaviors");
    final Function1<UseCase, CharSequence> _function_1 = new Function1<UseCase, CharSequence>() {
      public CharSequence apply(final UseCase it) {
        return BehavioredClassifiers.section_BehavioredClassifier_OwnedBehaviors(it);
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<UseCase>layout_Element(_plus_1, "Behaviors", object, null, _function_1);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _doFallback(final Classifier object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(object);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Generals");
    final Function1<Classifier, CharSequence> _function = new Function1<Classifier, CharSequence>() {
      public CharSequence apply(final Classifier it) {
        return Classifiers.ul_Classifier_Generals(it);
      }
    };
    CharSequence _layout_Element = Layout_Element.<Classifier>layout_Element(_plus, "Generalizations", object, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(object);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Attributes");
    final Function1<Classifier, CharSequence> _function_1 = new Function1<Classifier, CharSequence>() {
      public CharSequence apply(final Classifier it) {
        return Classifiers.dl_Classifier_Attributes(it);
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Classifier>layout_Element(_plus_1, "Attributes", object, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_2 = Ref.ref_Object(object);
    String _string_2 = _ref_Object_2.toString();
    String _plus_2 = (_string_2 + "-Associations");
    final Function1<Classifier, CharSequence> _function_2 = new Function1<Classifier, CharSequence>() {
      public CharSequence apply(final Classifier it) {
        return Classifiers.dl_Classifier_Associations(it);
      }
    };
    CharSequence _layout_Element_2 = Layout_Element.<Classifier>layout_Element(_plus_2, "Associations", object, _function_2, null);
    _builder.append(_layout_Element_2, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_3 = Ref.ref_Object(object);
    String _string_3 = _ref_Object_3.toString();
    String _plus_3 = (_string_3 + "-Operations");
    final Function1<Classifier, CharSequence> _function_3 = new Function1<Classifier, CharSequence>() {
      public CharSequence apply(final Classifier it) {
        return Classifiers.dl_Classifier_Operations(it);
      }
    };
    CharSequence _layout_Element_3 = Layout_Element.<Classifier>layout_Element(_plus_3, "Operations", object, _function_3, null);
    _builder.append(_layout_Element_3, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _doFallback(final Component object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(object);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Generals");
    final Function1<Component, CharSequence> _function = new Function1<Component, CharSequence>() {
      public CharSequence apply(final Component it) {
        return Classifiers.ul_Classifier_Generals(it);
      }
    };
    CharSequence _layout_Element = Layout_Element.<Component>layout_Element(_plus, "Generalizations", object, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(object);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Required");
    final Function1<Component, CharSequence> _function_1 = new Function1<Component, CharSequence>() {
      public CharSequence apply(final Component it) {
        EList<Interface> _requireds = it.getRequireds();
        final Function1<Interface, CharSequence> _function = new Function1<Interface, CharSequence>() {
          public CharSequence apply(final Interface it) {
            return Link.link_EObject(it);
          }
        };
        return Html.<Interface>ul(_requireds, _function);
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Component>layout_Element(_plus_1, "Required Interfaces", object, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_2 = Ref.ref_Object(object);
    String _string_2 = _ref_Object_2.toString();
    String _plus_2 = (_string_2 + "-Provided");
    final Function1<Component, CharSequence> _function_2 = new Function1<Component, CharSequence>() {
      public CharSequence apply(final Component it) {
        EList<Interface> _provideds = it.getProvideds();
        final Function1<Interface, CharSequence> _function = new Function1<Interface, CharSequence>() {
          public CharSequence apply(final Interface it) {
            return Link.link_EObject(it);
          }
        };
        return Html.<Interface>ul(_provideds, _function);
      }
    };
    CharSequence _layout_Element_2 = Layout_Element.<Component>layout_Element(_plus_2, "Provided Interfaces", object, _function_2, null);
    _builder.append(_layout_Element_2, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_3 = Ref.ref_Object(object);
    String _string_3 = _ref_Object_3.toString();
    String _plus_3 = (_string_3 + "-Parts");
    final Function1<Component, CharSequence> _function_3 = new Function1<Component, CharSequence>() {
      public CharSequence apply(final Component it) {
        return Classifiers.dl_Classifier_Attributes(it);
      }
    };
    CharSequence _layout_Element_3 = Layout_Element.<Component>layout_Element(_plus_3, "Parts", object, _function_3, null);
    _builder.append(_layout_Element_3, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _doFallback(final Operation object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(object);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-RaisedExceptions");
    final Function1<Operation, CharSequence> _function = new Function1<Operation, CharSequence>() {
      public CharSequence apply(final Operation it) {
        return BehavioralFeatures.dl_BehavioralFeature_RaisedException(it);
      }
    };
    CharSequence _layout_Element = Layout_Element.<Operation>layout_Element(_plus, "Raised Exceptions", object, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(object);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Preconditions");
    final Function1<Operation, CharSequence> _function_1 = new Function1<Operation, CharSequence>() {
      public CharSequence apply(final Operation it) {
        EList<Constraint> _preconditions = it.getPreconditions();
        final Function1<Constraint, CharSequence> _function = new Function1<Constraint, CharSequence>() {
          public CharSequence apply(final Constraint it) {
            return Constraints.div_Constraint(it);
          }
        };
        return Html.<Constraint>ol(_preconditions, _function);
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Operation>layout_Element(_plus_1, "Preconditions", object, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_2 = Ref.ref_Object(object);
    String _string_2 = _ref_Object_2.toString();
    String _plus_2 = (_string_2 + "-Postconditions");
    final Function1<Operation, CharSequence> _function_2 = new Function1<Operation, CharSequence>() {
      public CharSequence apply(final Operation it) {
        EList<Constraint> _postconditions = it.getPostconditions();
        final Function1<Constraint, CharSequence> _function = new Function1<Constraint, CharSequence>() {
          public CharSequence apply(final Constraint it) {
            return Constraints.div_Constraint(it);
          }
        };
        return Html.<Constraint>ol(_postconditions, _function);
      }
    };
    CharSequence _layout_Element_2 = Layout_Element.<Operation>layout_Element(_plus_2, "Postconditions", object, _function_2, null);
    _builder.append(_layout_Element_2, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _doFallback(final OpaqueBehavior object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(object);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Postconditions");
    final Function1<OpaqueBehavior, CharSequence> _function = new Function1<OpaqueBehavior, CharSequence>() {
      public CharSequence apply(final OpaqueBehavior it) {
        EList<Constraint> _postconditions = it.getPostconditions();
        final Function1<Constraint, CharSequence> _function = new Function1<Constraint, CharSequence>() {
          public CharSequence apply(final Constraint it) {
            return Constraints.div_Constraint(it);
          }
        };
        return Html.<Constraint>ol(_postconditions, _function);
      }
    };
    CharSequence _layout_Element = Layout_Element.<OpaqueBehavior>layout_Element(_plus, "Postconditions", object, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(object);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Body");
    final Function1<OpaqueBehavior, CharSequence> _function_1 = new Function1<OpaqueBehavior, CharSequence>() {
      public CharSequence apply(final OpaqueBehavior it) {
        EList<String> _bodies = it.getBodies();
        final Function1<String, String> _function = new Function1<String, String>() {
          public String apply(final String it) {
            return Html.html(it);
          }
        };
        return Html.<String>ul(_bodies, _function);
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<OpaqueBehavior>layout_Element(_plus_1, "Body", object, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _doFallback(final Port object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(object);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Required");
    final Function1<Port, CharSequence> _function = new Function1<Port, CharSequence>() {
      public CharSequence apply(final Port it) {
        EList<Interface> _requireds = it.getRequireds();
        final Function1<Interface, CharSequence> _function = new Function1<Interface, CharSequence>() {
          public CharSequence apply(final Interface it) {
            return Link.link_EObject(it);
          }
        };
        return Html.<Interface>ul(_requireds, _function);
      }
    };
    CharSequence _layout_Element = Layout_Element.<Port>layout_Element(_plus, "Required Interfaces", object, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(object);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Provided");
    final Function1<Port, CharSequence> _function_1 = new Function1<Port, CharSequence>() {
      public CharSequence apply(final Port it) {
        EList<Interface> _provideds = it.getProvideds();
        final Function1<Interface, CharSequence> _function = new Function1<Interface, CharSequence>() {
          public CharSequence apply(final Interface it) {
            return Link.link_EObject(it);
          }
        };
        return Html.<Interface>ul(_provideds, _function);
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Port>layout_Element(_plus_1, "Provided Interfaces", object, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _doFallback(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<! -- TODO : ");
    String _string = object.toString();
    _builder.append(_string, "");
    _builder.append(" -->");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence doFallback(final Element object) {
    if (object instanceof OpaqueBehavior) {
      return _doFallback((OpaqueBehavior)object);
    } else if (object instanceof Component) {
      return _doFallback((Component)object);
    } else if (object instanceof Port) {
      return _doFallback((Port)object);
    } else if (object instanceof UseCase) {
      return _doFallback((UseCase)object);
    } else if (object instanceof Operation) {
      return _doFallback((Operation)object);
    } else if (object instanceof Classifier) {
      return _doFallback((Classifier)object);
    } else if (object != null) {
      return _doFallback(object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
