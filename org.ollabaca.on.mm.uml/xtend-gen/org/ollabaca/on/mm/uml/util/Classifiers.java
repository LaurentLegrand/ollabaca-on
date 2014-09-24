package org.ollabaca.on.mm.uml.util;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.mm.uml.util.Types;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Content;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Classifiers {
  public static CharSequence dl_Classifier_Associations(final Classifier object) {
    List<Property> _associationEnds = Types.getAssociationEnds(object);
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
    return Html.<Property>dl(_associationEnds, _function, _function_1);
  }
  
  public static CharSequence ul_Classifier_Generals(final Classifier object) {
    EList<Classifier> _generals = object.getGenerals();
    final Function1<Classifier, CharSequence> _function = new Function1<Classifier, CharSequence>() {
      public CharSequence apply(final Classifier it) {
        return Link.link_EObject(it);
      }
    };
    return Html.<Classifier>ul(_generals, _function);
  }
  
  public static CharSequence dl_Classifier_Attributes(final Classifier object) {
    EList<Property> _attributes = object.getAttributes();
    final Function1<Property, Boolean> _function = new Function1<Property, Boolean>() {
      public Boolean apply(final Property it) {
        Association _association = it.getAssociation();
        return Boolean.valueOf(Objects.equal(_association, null));
      }
    };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(_attributes, _function);
    final Function1<Property, CharSequence> _function_1 = new Function1<Property, CharSequence>() {
      public CharSequence apply(final Property it) {
        return Notation.notation_Object(it);
      }
    };
    final Function1<Property, CharSequence> _function_2 = new Function1<Property, CharSequence>() {
      public CharSequence apply(final Property it) {
        return Html.documentation_EObject(it);
      }
    };
    return Html.<Property>dl(_filter, _function_1, _function_2);
  }
  
  public static CharSequence dl_Classifier_Operations(final Classifier object) {
    EList<Operation> _operations = object.getOperations();
    final Function1<Operation, CharSequence> _function = new Function1<Operation, CharSequence>() {
      public CharSequence apply(final Operation it) {
        return Notation.notation_Object(it);
      }
    };
    final Function1<Operation, String> _function_1 = new Function1<Operation, String>() {
      public String apply(final Operation it) {
        StringConcatenation _builder = new StringConcatenation();
        CharSequence _documentation_EObject = Html.documentation_EObject(it);
        _builder.append(_documentation_EObject, "");
        _builder.newLineIfNotEmpty();
        CharSequence _dl_Operation_Parameters = Classifiers.dl_Operation_Parameters(it);
        _builder.append(_dl_Operation_Parameters, "");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    };
    return Html.<Operation>dl(_operations, _function, _function_1);
  }
  
  public static CharSequence dl_Operation_Parameters(final Operation object) {
    EList<Parameter> _ownedParameters = object.getOwnedParameters();
    final Function1<Iterable<? extends Parameter>, String> _function = new Function1<Iterable<? extends Parameter>, String>() {
      public String apply(final Iterable<? extends Parameter> it) {
        return "dl-horizontal";
      }
    };
    Attr<Iterable<? extends Parameter>> _attr = Html.<Iterable<? extends Parameter>>attr("class", _function);
    final Function1<Parameter, CharSequence> _function_1 = new Function1<Parameter, CharSequence>() {
      public CharSequence apply(final Parameter it) {
        return Notation.notation_Object(it);
      }
    };
    Content<Parameter> _content = Html.<Parameter>content(_function_1);
    final Function1<Parameter, CharSequence> _function_2 = new Function1<Parameter, CharSequence>() {
      public CharSequence apply(final Parameter it) {
        return Html.documentation_EObject(it);
      }
    };
    Content<Parameter> _content_1 = Html.<Parameter>content(_function_2);
    return Html.<Parameter>dl(_ownedParameters, 
      Collections.<Attr<Iterable<? extends Parameter>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends Parameter>>>newArrayList(_attr)), _content, _content_1);
  }
}
