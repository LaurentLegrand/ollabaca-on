package org.ollabaca.on.mm.uml;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;

@SuppressWarnings("all")
public class Notation_Element {
  public static Function1<? super Object, ? extends CharSequence> register() {
    final Function1<Object, CharSequence> _function = new Function1<Object, CharSequence>() {
      public CharSequence apply(final Object it) {
        CharSequence _xifexpression = null;
        if ((it instanceof Element)) {
          _xifexpression = Notation_Element.notation_Element(((Element) it));
        }
        return _xifexpression;
      }
    };
    return Notation.instance.register(Element.class, _function);
  }
  
  protected static CharSequence _notation_Element(final Element object) {
    return null;
  }
  
  protected static CharSequence _notation_Element(final Property object) {
    CharSequence _xblockexpression = null;
    {
      final StringBuilder definition = new StringBuilder();
      boolean _isDerived = object.isDerived();
      if (_isDerived) {
        definition.append("/");
      }
      VisibilityKind _visibility = object.getVisibility();
      CharSequence _notation_Element = Notation_Element.notation_Element(_visibility);
      StringBuilder _append = definition.append(_notation_Element);
      CharSequence _link_EObject = Link.link_EObject(object);
      StringBuilder _append_1 = _append.append(_link_EObject);
      StringBuilder _append_2 = _append_1.append(":&nbsp;");
      Type _type = object.getType();
      CharSequence _link_EObject_1 = Link.link_EObject(_type);
      StringBuilder _append_3 = _append_2.append(_link_EObject_1);
      CharSequence _notation_Multiplicity = Notation_Element.notation_Multiplicity(object);
      _append_3.append(_notation_Multiplicity);
      String _default = object.getDefault();
      boolean _notEquals = (!Objects.equal(_default, null));
      if (_notEquals) {
        StringBuilder _append_4 = definition.append(" = ");
        String _default_1 = object.getDefault();
        _append_4.append(_default_1);
      }
      final List<String> modifiers = CollectionLiterals.<String>newArrayList();
      boolean _isReadOnly = object.isReadOnly();
      if (_isReadOnly) {
        modifiers.add("readOnly");
      }
      boolean _isDerivedUnion = object.isDerivedUnion();
      if (_isDerivedUnion) {
        modifiers.add("union");
      }
      EList<Property> _subsettedProperties = object.getSubsettedProperties();
      for (final Property e : _subsettedProperties) {
        CharSequence _link_EObject_2 = Link.link_EObject(e);
        String _plus = ("subsets " + _link_EObject_2);
        modifiers.add(_plus);
      }
      EList<Property> _redefinedProperties = object.getRedefinedProperties();
      for (final Property e_1 : _redefinedProperties) {
        CharSequence _link_EObject_3 = Link.link_EObject(e_1);
        String _plus_1 = ("redefines " + _link_EObject_3);
        modifiers.add(_plus_1);
      }
      boolean _isOrdered = object.isOrdered();
      if (_isOrdered) {
        modifiers.add("ordered");
      }
      boolean _and = false;
      boolean _isUnique = object.isUnique();
      if (!_isUnique) {
        _and = false;
      } else {
        boolean _isMultivalued = object.isMultivalued();
        _and = _isMultivalued;
      }
      if (_and) {
        modifiers.add("unique");
      }
      boolean _isID = object.isID();
      if (_isID) {
        modifiers.add("id");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<code ");
      {
        boolean _isStatic = object.isStatic();
        if (_isStatic) {
          _builder.append("style=\"text-decoration: underline;\"");
        }
      }
      _builder.append(">");
      _builder.append(definition, "");
      {
        boolean _hasElements = false;
        for(final String e_2 : modifiers) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append(" { ", "");
          } else {
            _builder.appendImmediate(", ", "");
          }
          _builder.append(e_2, "");
        }
        if (_hasElements) {
          _builder.append(" }", "");
        }
      }
      _builder.append("</code>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _notation_Element(final Operation that) {
    CharSequence _xblockexpression = null;
    {
      final StringBuilder definition = new StringBuilder();
      VisibilityKind _visibility = that.getVisibility();
      CharSequence _notation_Element = Notation_Element.notation_Element(_visibility);
      StringBuilder _append = definition.append(_notation_Element);
      CharSequence _link_EObject = Link.link_EObject(that);
      _append.append(_link_EObject);
      CharSequence _notation_BehavioralFeature_OwnedParameters = Notation_Element.notation_BehavioralFeature_OwnedParameters(that);
      definition.append(_notation_BehavioralFeature_OwnedParameters);
      EList<Parameter> _returnResult = that.returnResult();
      boolean _isEmpty = _returnResult.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<Parameter> _returnResult_1 = that.returnResult();
        final Parameter ret = IterableExtensions.<Parameter>head(_returnResult_1);
        StringBuilder _append_1 = definition.append(":&nbsp;");
        Type _type = ret.getType();
        CharSequence _link_EObject_1 = Link.link_EObject(_type);
        StringBuilder _append_2 = _append_1.append(_link_EObject_1);
        CharSequence _notation_Multiplicity = Notation_Element.notation_Multiplicity(ret);
        _append_2.append(_notation_Multiplicity);
      }
      final List<String> modifiers = CollectionLiterals.<String>newArrayList();
      boolean _isQuery = that.isQuery();
      if (_isQuery) {
        modifiers.add("query");
      }
      EList<Operation> _redefinedOperations = that.getRedefinedOperations();
      for (final Operation e : _redefinedOperations) {
        CharSequence _link_EObject_2 = Link.link_EObject(e);
        String _plus = ("redefines " + _link_EObject_2);
        modifiers.add(_plus);
      }
      boolean _isOrdered = that.isOrdered();
      if (_isOrdered) {
        modifiers.add("ordered");
      }
      boolean _isUnique = that.isUnique();
      if (_isUnique) {
        modifiers.add("unique");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<code ");
      {
        boolean _isStatic = that.isStatic();
        if (_isStatic) {
          _builder.append("style=\"text-decoration: underline;\"");
        }
      }
      _builder.append(">");
      _builder.append(definition, "");
      {
        boolean _hasElements = false;
        for(final String e_1 : modifiers) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append(" { ", "");
          } else {
            _builder.appendImmediate(", ", "");
          }
          _builder.append(e_1, "");
        }
        if (_hasElements) {
          _builder.append(" }", "");
        }
      }
      _builder.append("</code>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _notation_Element(final Parameter object) {
    CharSequence _xblockexpression = null;
    {
      final StringBuilder definition = new StringBuilder();
      ParameterDirectionKind _direction = object.getDirection();
      CharSequence _notation_Element = Notation_Element.notation_Element(_direction);
      StringBuilder _append = definition.append(_notation_Element);
      StringBuilder _append_1 = _append.append("&nbsp;");
      CharSequence _link_EObject = Link.link_EObject(object);
      StringBuilder _append_2 = _append_1.append(_link_EObject);
      StringBuilder _append_3 = _append_2.append(":&nbsp;");
      Type _type = object.getType();
      CharSequence _link_EObject_1 = Link.link_EObject(_type);
      StringBuilder _append_4 = _append_3.append(_link_EObject_1);
      CharSequence _notation_Multiplicity = Notation_Element.notation_Multiplicity(object);
      _append_4.append(_notation_Multiplicity);
      boolean _isSetDefault = object.isSetDefault();
      if (_isSetDefault) {
        StringBuilder _append_5 = definition.append(" = ");
        String _default = object.getDefault();
        _append_5.append(_default);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(definition, "");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public static CharSequence notation_BehavioralFeature_OwnedParameters(final BehavioralFeature object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      EList<Parameter> _ownedParameters = object.getOwnedParameters();
      final Function1<Parameter, Boolean> _function = new Function1<Parameter, Boolean>() {
        public Boolean apply(final Parameter it) {
          ParameterDirectionKind _direction = it.getDirection();
          return Boolean.valueOf((!Objects.equal(_direction, ParameterDirectionKind.RETURN_LITERAL)));
        }
      };
      Iterable<Parameter> _filter = IterableExtensions.<Parameter>filter(_ownedParameters, _function);
      boolean _hasElements = false;
      for(final Parameter e : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _notation_Element = Notation_Element.notation_Element(e);
        _builder.append(_notation_Element, "");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public static CharSequence notation_Multiplicity(final MultiplicityElement object) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      boolean _and = false;
      int _lower = object.getLower();
      boolean _equals = (_lower == 0);
      if (!_equals) {
        _and = false;
      } else {
        int _upper = object.getUpper();
        boolean _equals_1 = (_upper == 0);
        _and = _equals_1;
      }
      if (_and) {
        _matched=true;
        _switchResult = "";
      }
    }
    if (!_matched) {
      boolean _and_1 = false;
      int _lower_1 = object.getLower();
      boolean _equals_2 = (_lower_1 == 1);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        int _upper_1 = object.getUpper();
        boolean _equals_3 = (_upper_1 == 1);
        _and_1 = _equals_3;
      }
      if (_and_1) {
        _matched=true;
        _switchResult = "[1]";
      }
    }
    if (!_matched) {
      int _upper_2 = object.getUpper();
      boolean _greaterThan = (_upper_2 > 0);
      if (_greaterThan) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[");
        int _lower_2 = object.getLower();
        _builder.append(_lower_2, "");
        _builder.append("..");
        int _upper_3 = object.getUpper();
        _builder.append(_upper_3, "");
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("[");
      int _lower_3 = object.getLower();
      _builder_1.append(_lower_3, "");
      _builder_1.append("..*]");
      _switchResult = _builder_1;
    }
    return _switchResult;
  }
  
  protected static CharSequence _notation_Element(final ParameterDirectionKind object) {
    String _switchResult = null;
    if (object != null) {
      switch (object) {
        case IN_LITERAL:
          _switchResult = "in";
          break;
        case OUT_LITERAL:
          _switchResult = "out";
          break;
        case INOUT_LITERAL:
          _switchResult = "inout";
          break;
        case RETURN_LITERAL:
          _switchResult = "return";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected static CharSequence _notation_Element(final VisibilityKind object) {
    String _switchResult = null;
    if (object != null) {
      switch (object) {
        case PUBLIC_LITERAL:
          _switchResult = "+";
          break;
        case PRIVATE_LITERAL:
          _switchResult = "-";
          break;
        case PROTECTED_LITERAL:
          _switchResult = "#";
          break;
        case PACKAGE_LITERAL:
          _switchResult = "~";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  protected static CharSequence _notation_Element(final LiteralBoolean object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    boolean _isValue = object.isValue();
    _builder.append(_isValue, "");
    _builder.append("</code> as <code>Boolean</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final LiteralUnlimitedNatural object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    int _value = object.getValue();
    _builder.append(_value, "");
    _builder.append("</code> as <code>UnlimitedNatural</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final LiteralInteger object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    int _value = object.getValue();
    _builder.append(_value, "");
    _builder.append("</code> as <code>Integer</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final LiteralString object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    String _value = object.getValue();
    _builder.append(_value, "");
    _builder.append("</code> as <code>String</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final Generalization object) {
    StringConcatenation _builder = new StringConcatenation();
    Classifier _specific = object.getSpecific();
    CharSequence _link_EObject = Link.link_EObject(_specific);
    _builder.append(_link_EObject, "");
    _builder.append(" &#8680; ");
    Classifier _general = object.getGeneral();
    CharSequence _link_EObject_1 = Link.link_EObject(_general);
    _builder.append(_link_EObject_1, "");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final Reception object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("&#171; signal &#187; ");
    Signal _signal = object.getSignal();
    CharSequence _link_EObject = Link.link_EObject(_signal);
    _builder.append(_link_EObject, "");
    return _builder;
  }
  
  public static CharSequence notation_Element(final Object object) {
    if (object instanceof LiteralBoolean) {
      return _notation_Element((LiteralBoolean)object);
    } else if (object instanceof LiteralInteger) {
      return _notation_Element((LiteralInteger)object);
    } else if (object instanceof LiteralString) {
      return _notation_Element((LiteralString)object);
    } else if (object instanceof LiteralUnlimitedNatural) {
      return _notation_Element((LiteralUnlimitedNatural)object);
    } else if (object instanceof Operation) {
      return _notation_Element((Operation)object);
    } else if (object instanceof Property) {
      return _notation_Element((Property)object);
    } else if (object instanceof Reception) {
      return _notation_Element((Reception)object);
    } else if (object instanceof Parameter) {
      return _notation_Element((Parameter)object);
    } else if (object instanceof Generalization) {
      return _notation_Element((Generalization)object);
    } else if (object instanceof Element) {
      return _notation_Element((Element)object);
    } else if (object instanceof ParameterDirectionKind) {
      return _notation_Element((ParameterDirectionKind)object);
    } else if (object instanceof VisibilityKind) {
      return _notation_Element((VisibilityKind)object);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
