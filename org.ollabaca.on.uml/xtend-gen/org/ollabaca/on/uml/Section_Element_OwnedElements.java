package org.ollabaca.on.uml;

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
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.uml.Layout_Element;
import org.ollabaca.on.uml.Section_Element;
import org.ollabaca.on.uml.book.Book;
import org.ollabaca.on.uml.book.Chapter;
import org.ollabaca.on.uml.book.Environment;
import org.ollabaca.on.uml.book.Part;
import org.ollabaca.on.uml.book.Section;
import org.ollabaca.on.uml.util.BehavioralFeatures;
import org.ollabaca.on.uml.util.BehavioredClassifiers;
import org.ollabaca.on.uml.util.Classifiers;
import org.ollabaca.on.uml.util.Constraints;
import org.ollabaca.on.uml.util.Environments;
import org.ollabaca.on.uml.util.Namespaces;

@SuppressWarnings("all")
public class Section_Element_OwnedElements {
  protected static CharSequence _section_Element_OwnedElements(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Book self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Part> _parts = self.getParts();
      for(final Part e : _parts) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Part self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Chapter> _chapters = self.getChapters();
      for(final Chapter e : _chapters) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Environment self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Nodes");
    final Function1<Environment,CharSequence> _function = new Function1<Environment,CharSequence>() {
      public CharSequence apply(final Environment it) {
        CharSequence _table_Environment_Nodes = Environments.table_Environment_Nodes(it);
        return _table_Environment_Nodes;
      }
    };
    CharSequence _layout_Element = Layout_Element.<Environment>layout_Element(_plus, "Nodes", self, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(self);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Deployments");
    final Function1<Environment,CharSequence> _function_1 = new Function1<Environment,CharSequence>() {
      public CharSequence apply(final Environment it) {
        CharSequence _table_Environment_Deployments = Environments.table_Environment_Deployments(it);
        return _table_Environment_Deployments;
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Environment>layout_Element(_plus_1, "Deployments", self, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_2 = Ref.ref_Object(self);
    String _string_2 = _ref_Object_2.toString();
    String _plus_2 = (_string_2 + "-CommunicationPaths");
    CharSequence _layout_Element_2 = Layout_Element.<Environment>layout_Element(_plus_2, "Communication Paths", self, null, null);
    _builder.append(_layout_Element_2, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final UseCase self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence __section_Element_OwnedElements = Section_Element_OwnedElements._section_Element_OwnedElements(((Classifier) self));
    _builder.append(__section_Element_OwnedElements, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-OwnedRules");
    final Function1<UseCase,CharSequence> _function = new Function1<UseCase,CharSequence>() {
      public CharSequence apply(final UseCase it) {
        CharSequence _ordered_list_Namespace_OwnedRules = Namespaces.ordered_list_Namespace_OwnedRules(it);
        return _ordered_list_Namespace_OwnedRules;
      }
    };
    CharSequence _layout_Element = Layout_Element.<UseCase>layout_Element(_plus, "Constraints", self, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(self);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-OwnedBehaviors");
    final Function1<UseCase,CharSequence> _function_1 = new Function1<UseCase,CharSequence>() {
      public CharSequence apply(final UseCase it) {
        CharSequence _section_BehavioredClassifier_OwnedBehaviors = BehavioredClassifiers.section_BehavioredClassifier_OwnedBehaviors(it);
        return _section_BehavioredClassifier_OwnedBehaviors;
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<UseCase>layout_Element(_plus_1, "Behaviors", self, null, _function_1);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Classifier self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Generals");
    final Function1<Classifier,CharSequence> _function = new Function1<Classifier,CharSequence>() {
      public CharSequence apply(final Classifier it) {
        CharSequence _ul_Classifier_Generals = Classifiers.ul_Classifier_Generals(it);
        return _ul_Classifier_Generals;
      }
    };
    CharSequence _layout_Element = Layout_Element.<Classifier>layout_Element(_plus, "Generalizations", self, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(self);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Attributes");
    final Function1<Classifier,CharSequence> _function_1 = new Function1<Classifier,CharSequence>() {
      public CharSequence apply(final Classifier it) {
        CharSequence _dl_Classifier_Attributes = Classifiers.dl_Classifier_Attributes(it);
        return _dl_Classifier_Attributes;
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Classifier>layout_Element(_plus_1, "Attributes", self, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_2 = Ref.ref_Object(self);
    String _string_2 = _ref_Object_2.toString();
    String _plus_2 = (_string_2 + "-Associations");
    final Function1<Classifier,CharSequence> _function_2 = new Function1<Classifier,CharSequence>() {
      public CharSequence apply(final Classifier it) {
        CharSequence _dl_Classifier_Associations = Classifiers.dl_Classifier_Associations(it);
        return _dl_Classifier_Associations;
      }
    };
    CharSequence _layout_Element_2 = Layout_Element.<Classifier>layout_Element(_plus_2, "Associations", self, _function_2, null);
    _builder.append(_layout_Element_2, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_3 = Ref.ref_Object(self);
    String _string_3 = _ref_Object_3.toString();
    String _plus_3 = (_string_3 + "-Operations");
    final Function1<Classifier,CharSequence> _function_3 = new Function1<Classifier,CharSequence>() {
      public CharSequence apply(final Classifier it) {
        CharSequence _dl_Classifier_Operations = Classifiers.dl_Classifier_Operations(it);
        return _dl_Classifier_Operations;
      }
    };
    CharSequence _layout_Element_3 = Layout_Element.<Classifier>layout_Element(_plus_3, "Operations", self, _function_3, null);
    _builder.append(_layout_Element_3, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Component self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Generals");
    final Function1<Component,CharSequence> _function = new Function1<Component,CharSequence>() {
      public CharSequence apply(final Component it) {
        CharSequence _ul_Classifier_Generals = Classifiers.ul_Classifier_Generals(it);
        return _ul_Classifier_Generals;
      }
    };
    CharSequence _layout_Element = Layout_Element.<Component>layout_Element(_plus, "Generalizations", self, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(self);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Required");
    final Function1<Component,CharSequence> _function_1 = new Function1<Component,CharSequence>() {
      public CharSequence apply(final Component it) {
        EList<Interface> _requireds = it.getRequireds();
        final Function1<Interface,CharSequence> _function = new Function1<Interface,CharSequence>() {
          public CharSequence apply(final Interface it) {
            CharSequence _link_EObject = Link.link_EObject(it);
            return _link_EObject;
          }
        };
        CharSequence _ul = Html.<Interface>ul(_requireds, _function);
        return _ul;
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Component>layout_Element(_plus_1, "Required Interfaces", self, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_2 = Ref.ref_Object(self);
    String _string_2 = _ref_Object_2.toString();
    String _plus_2 = (_string_2 + "-Provided");
    final Function1<Component,CharSequence> _function_2 = new Function1<Component,CharSequence>() {
      public CharSequence apply(final Component it) {
        EList<Interface> _provideds = it.getProvideds();
        final Function1<Interface,CharSequence> _function = new Function1<Interface,CharSequence>() {
          public CharSequence apply(final Interface it) {
            CharSequence _link_EObject = Link.link_EObject(it);
            return _link_EObject;
          }
        };
        CharSequence _ul = Html.<Interface>ul(_provideds, _function);
        return _ul;
      }
    };
    CharSequence _layout_Element_2 = Layout_Element.<Component>layout_Element(_plus_2, "Provided Interfaces", self, _function_2, null);
    _builder.append(_layout_Element_2, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_3 = Ref.ref_Object(self);
    String _string_3 = _ref_Object_3.toString();
    String _plus_3 = (_string_3 + "-Parts");
    final Function1<Component,CharSequence> _function_3 = new Function1<Component,CharSequence>() {
      public CharSequence apply(final Component it) {
        CharSequence _dl_Classifier_Attributes = Classifiers.dl_Classifier_Attributes(it);
        return _dl_Classifier_Attributes;
      }
    };
    CharSequence _layout_Element_3 = Layout_Element.<Component>layout_Element(_plus_3, "Parts", self, _function_3, null);
    _builder.append(_layout_Element_3, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Operation self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-RaisedExceptions");
    final Function1<Operation,CharSequence> _function = new Function1<Operation,CharSequence>() {
      public CharSequence apply(final Operation it) {
        CharSequence _dl_BehavioralFeature_RaisedException = BehavioralFeatures.dl_BehavioralFeature_RaisedException(it);
        return _dl_BehavioralFeature_RaisedException;
      }
    };
    CharSequence _layout_Element = Layout_Element.<Operation>layout_Element(_plus, "Raised Exceptions", self, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(self);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Preconditions");
    final Function1<Operation,CharSequence> _function_1 = new Function1<Operation,CharSequence>() {
      public CharSequence apply(final Operation it) {
        EList<Constraint> _preconditions = it.getPreconditions();
        final Function1<Constraint,CharSequence> _function = new Function1<Constraint,CharSequence>() {
          public CharSequence apply(final Constraint it) {
            CharSequence _div_Constraint = Constraints.div_Constraint(it);
            return _div_Constraint;
          }
        };
        CharSequence _ol = Html.<Constraint>ol(_preconditions, _function);
        return _ol;
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Operation>layout_Element(_plus_1, "Preconditions", self, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_2 = Ref.ref_Object(self);
    String _string_2 = _ref_Object_2.toString();
    String _plus_2 = (_string_2 + "-Postconditions");
    final Function1<Operation,CharSequence> _function_2 = new Function1<Operation,CharSequence>() {
      public CharSequence apply(final Operation it) {
        EList<Constraint> _postconditions = it.getPostconditions();
        final Function1<Constraint,CharSequence> _function = new Function1<Constraint,CharSequence>() {
          public CharSequence apply(final Constraint it) {
            CharSequence _div_Constraint = Constraints.div_Constraint(it);
            return _div_Constraint;
          }
        };
        CharSequence _ol = Html.<Constraint>ol(_postconditions, _function);
        return _ol;
      }
    };
    CharSequence _layout_Element_2 = Layout_Element.<Operation>layout_Element(_plus_2, "Postconditions", self, _function_2, null);
    _builder.append(_layout_Element_2, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final OpaqueBehavior self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Postconditions");
    final Function1<OpaqueBehavior,CharSequence> _function = new Function1<OpaqueBehavior,CharSequence>() {
      public CharSequence apply(final OpaqueBehavior it) {
        EList<Constraint> _postconditions = it.getPostconditions();
        final Function1<Constraint,CharSequence> _function = new Function1<Constraint,CharSequence>() {
          public CharSequence apply(final Constraint it) {
            CharSequence _div_Constraint = Constraints.div_Constraint(it);
            return _div_Constraint;
          }
        };
        CharSequence _ol = Html.<Constraint>ol(_postconditions, _function);
        return _ol;
      }
    };
    CharSequence _layout_Element = Layout_Element.<OpaqueBehavior>layout_Element(_plus, "Postconditions", self, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(self);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Body");
    final Function1<OpaqueBehavior,CharSequence> _function_1 = new Function1<OpaqueBehavior,CharSequence>() {
      public CharSequence apply(final OpaqueBehavior it) {
        EList<String> _bodies = it.getBodies();
        final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String it) {
            String _html = Html.html(it);
            return _html;
          }
        };
        CharSequence _ul = Html.<String>ul(_bodies, _function);
        return _ul;
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<OpaqueBehavior>layout_Element(_plus_1, "Body", self, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Port self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    String _plus = (_string + "-Required");
    final Function1<Port,CharSequence> _function = new Function1<Port,CharSequence>() {
      public CharSequence apply(final Port it) {
        EList<Interface> _requireds = it.getRequireds();
        final Function1<Interface,CharSequence> _function = new Function1<Interface,CharSequence>() {
          public CharSequence apply(final Interface it) {
            CharSequence _link_EObject = Link.link_EObject(it);
            return _link_EObject;
          }
        };
        CharSequence _ul = Html.<Interface>ul(_requireds, _function);
        return _ul;
      }
    };
    CharSequence _layout_Element = Layout_Element.<Port>layout_Element(_plus, "Required Interfaces", self, _function, null);
    _builder.append(_layout_Element, "");
    _builder.newLineIfNotEmpty();
    CharSequence _ref_Object_1 = Ref.ref_Object(self);
    String _string_1 = _ref_Object_1.toString();
    String _plus_1 = (_string_1 + "-Provided");
    final Function1<Port,CharSequence> _function_1 = new Function1<Port,CharSequence>() {
      public CharSequence apply(final Port it) {
        EList<Interface> _provideds = it.getProvideds();
        final Function1<Interface,CharSequence> _function = new Function1<Interface,CharSequence>() {
          public CharSequence apply(final Interface it) {
            CharSequence _link_EObject = Link.link_EObject(it);
            return _link_EObject;
          }
        };
        CharSequence _ul = Html.<Interface>ul(_provideds, _function);
        return _ul;
      }
    };
    CharSequence _layout_Element_1 = Layout_Element.<Port>layout_Element(_plus_1, "Provided Interfaces", self, _function_1, null);
    _builder.append(_layout_Element_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _section_Element_OwnedElements(final Section self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Element> _elements = self.getElements();
      for(final Element e : _elements) {
        CharSequence _section_Element = Section_Element.section_Element(e);
        _builder.append(_section_Element, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Section> _sections = self.getSections();
      for(final Section e_1 : _sections) {
        CharSequence _section_Element_1 = Section_Element.section_Element(e_1);
        _builder.append(_section_Element_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence section_Element_OwnedElements(final Element self) {
    if (self instanceof Environment) {
      return _section_Element_OwnedElements((Environment)self);
    } else if (self instanceof OpaqueBehavior) {
      return _section_Element_OwnedElements((OpaqueBehavior)self);
    } else if (self instanceof Component) {
      return _section_Element_OwnedElements((Component)self);
    } else if (self instanceof Port) {
      return _section_Element_OwnedElements((Port)self);
    } else if (self instanceof UseCase) {
      return _section_Element_OwnedElements((UseCase)self);
    } else if (self instanceof Operation) {
      return _section_Element_OwnedElements((Operation)self);
    } else if (self instanceof Classifier) {
      return _section_Element_OwnedElements((Classifier)self);
    } else if (self instanceof Book) {
      return _section_Element_OwnedElements((Book)self);
    } else if (self instanceof Part) {
      return _section_Element_OwnedElements((Part)self);
    } else if (self instanceof Section) {
      return _section_Element_OwnedElements((Section)self);
    } else if (self != null) {
      return _section_Element_OwnedElements(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
