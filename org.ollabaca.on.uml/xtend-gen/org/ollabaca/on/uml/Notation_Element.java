package org.ollabaca.on.uml;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.uml.book.BookElement;
import org.ollabaca.on.uml.util.BookElements;

@SuppressWarnings("all")
public class Notation_Element {
  public static Function1<? super EObject,? extends Topic> register() {
    Function1<? super EObject,? extends Topic> _xblockexpression = null;
    {
      final Function1<Object,CharSequence> _function = new Function1<Object,CharSequence>() {
        public CharSequence apply(final Object it) {
          CharSequence _xifexpression = null;
          if ((it instanceof Element)) {
            CharSequence _notation_Element = Notation_Element.notation_Element(((Element) it));
            _xifexpression = _notation_Element;
          }
          return _xifexpression;
        }
      };
      Notation.instance.register(Element.class, _function);
      final Function1<EObject,Topic> _function_1 = new Function1<EObject,Topic>() {
        public Topic apply(final EObject it) {
          Topic _xifexpression = null;
          if ((it instanceof BookElement)) {
            Topic _pic_BookElement = BookElements.topic_BookElement(((BookElement) it));
            _xifexpression = _pic_BookElement;
          }
          return _xifexpression;
        }
      };
      Function1<? super EObject,? extends Topic> _register = Sites.topic.register(BookElement.class, _function_1);
      _xblockexpression = (_register);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _notation_Element(final Element self) {
    return null;
  }
  
  protected static CharSequence _notation_Element(final Property self) {
    CharSequence _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder definition = _stringBuilder;
      boolean _isDerived = self.isDerived();
      if (_isDerived) {
        definition.append("/");
      }
      VisibilityKind _visibility = self.getVisibility();
      CharSequence _notation_Element = Notation_Element.notation_Element(_visibility);
      StringBuilder _append = definition.append(_notation_Element);
      CharSequence _link_EObject = Link.link_EObject(self);
      StringBuilder _append_1 = _append.append(_link_EObject);
      StringBuilder _append_2 = _append_1.append(":&nbsp;");
      Type _type = self.getType();
      CharSequence _link_EObject_1 = Link.link_EObject(_type);
      StringBuilder _append_3 = _append_2.append(_link_EObject_1);
      CharSequence _notation_Multiplicity = Notation_Element.notation_Multiplicity(self);
      _append_3.append(_notation_Multiplicity);
      boolean _isSetDefault = self.isSetDefault();
      if (_isSetDefault) {
        StringBuilder _append_4 = definition.append(" = ");
        String _default = self.getDefault();
        _append_4.append(_default);
      }
      final List<String> modifiers = CollectionLiterals.<String>newArrayList();
      boolean _isReadOnly = self.isReadOnly();
      if (_isReadOnly) {
        modifiers.add("readOnly");
      }
      boolean _isDerivedUnion = self.isDerivedUnion();
      if (_isDerivedUnion) {
        modifiers.add("union");
      }
      EList<Property> _subsettedProperties = self.getSubsettedProperties();
      for (final Property e : _subsettedProperties) {
        CharSequence _link_EObject_2 = Link.link_EObject(e);
        String _plus = ("subsets " + _link_EObject_2);
        modifiers.add(_plus);
      }
      EList<Property> _redefinedProperties = self.getRedefinedProperties();
      for (final Property e_1 : _redefinedProperties) {
        CharSequence _link_EObject_3 = Link.link_EObject(e_1);
        String _plus_1 = ("redefines " + _link_EObject_3);
        modifiers.add(_plus_1);
      }
      boolean _isOrdered = self.isOrdered();
      if (_isOrdered) {
        modifiers.add("ordered");
      }
      boolean _and = false;
      boolean _isUnique = self.isUnique();
      if (!_isUnique) {
        _and = false;
      } else {
        boolean _isMultivalued = self.isMultivalued();
        _and = (_isUnique && _isMultivalued);
      }
      if (_and) {
        modifiers.add("unique");
      }
      boolean _isID = self.isID();
      if (_isID) {
        modifiers.add("id");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<code>");
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
          _builder.append(" } ", "");
        }
      }
      _builder.append("</code>");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _notation_Element(final Operation self) {
    CharSequence _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder definition = _stringBuilder;
      VisibilityKind _visibility = self.getVisibility();
      CharSequence _notation_Element = Notation_Element.notation_Element(_visibility);
      StringBuilder _append = definition.append(_notation_Element);
      CharSequence _link_EObject = Link.link_EObject(self);
      _append.append(_link_EObject);
      CharSequence _notation_BehavioralFeature_OwnedParameters = Notation_Element.notation_BehavioralFeature_OwnedParameters(self);
      definition.append(_notation_BehavioralFeature_OwnedParameters);
      EList<Parameter> _returnResult = self.returnResult();
      boolean _isEmpty = _returnResult.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<Parameter> _returnResult_1 = self.returnResult();
        final Parameter ret = IterableExtensions.<Parameter>head(_returnResult_1);
        StringBuilder _append_1 = definition.append(":&nbsp;");
        Type _type = ret.getType();
        CharSequence _link_EObject_1 = Link.link_EObject(_type);
        StringBuilder _append_2 = _append_1.append(_link_EObject_1);
        CharSequence _notation_Multiplicity = Notation_Element.notation_Multiplicity(ret);
        _append_2.append(_notation_Multiplicity);
      }
      final List<String> modifiers = CollectionLiterals.<String>newArrayList();
      boolean _isQuery = self.isQuery();
      if (_isQuery) {
        modifiers.add("query");
      }
      EList<Operation> _redefinedOperations = self.getRedefinedOperations();
      for (final Operation e : _redefinedOperations) {
        CharSequence _link_EObject_2 = Link.link_EObject(e);
        String _plus = ("redefines " + _link_EObject_2);
        modifiers.add(_plus);
      }
      boolean _isOrdered = self.isOrdered();
      if (_isOrdered) {
        modifiers.add("ordered");
      }
      boolean _isUnique = self.isUnique();
      if (_isUnique) {
        modifiers.add("unique");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<code>");
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
          _builder.append(" } ", "");
        }
      }
      _builder.append("</code>");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected static CharSequence _notation_Element(final Parameter self) {
    CharSequence _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder definition = _stringBuilder;
      ParameterDirectionKind _direction = self.getDirection();
      CharSequence _notation_Element = Notation_Element.notation_Element(_direction);
      StringBuilder _append = definition.append(_notation_Element);
      StringBuilder _append_1 = _append.append("&nbsp;");
      CharSequence _link_EObject = Link.link_EObject(self);
      StringBuilder _append_2 = _append_1.append(_link_EObject);
      StringBuilder _append_3 = _append_2.append(":&nbsp;");
      Type _type = self.getType();
      CharSequence _link_EObject_1 = Link.link_EObject(_type);
      StringBuilder _append_4 = _append_3.append(_link_EObject_1);
      CharSequence _notation_Multiplicity = Notation_Element.notation_Multiplicity(self);
      _append_4.append(_notation_Multiplicity);
      boolean _isSetDefault = self.isSetDefault();
      if (_isSetDefault) {
        StringBuilder _append_5 = definition.append(" = ");
        String _default = self.getDefault();
        _append_5.append(_default);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(definition, "");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public static CharSequence notation_BehavioralFeature_OwnedParameters(final BehavioralFeature self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      EList<Parameter> _ownedParameters = self.getOwnedParameters();
      final Function1<Parameter,Boolean> _function = new Function1<Parameter,Boolean>() {
        public Boolean apply(final Parameter it) {
          ParameterDirectionKind _direction = it.getDirection();
          boolean _notEquals = (!Objects.equal(_direction, ParameterDirectionKind.RETURN_LITERAL));
          return Boolean.valueOf(_notEquals);
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
  
  public static CharSequence notation_Multiplicity(final MultiplicityElement self) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      boolean _and = false;
      int _lower = self.getLower();
      boolean _equals = (_lower == 0);
      if (!_equals) {
        _and = false;
      } else {
        int _upper = self.getUpper();
        boolean _equals_1 = (_upper == 0);
        _and = (_equals && _equals_1);
      }
      if (_and) {
        _matched=true;
        _switchResult = "";
      }
    }
    if (!_matched) {
      boolean _and_1 = false;
      int _lower_1 = self.getLower();
      boolean _equals_2 = (_lower_1 == 1);
      if (!_equals_2) {
        _and_1 = false;
      } else {
        int _upper_1 = self.getUpper();
        boolean _equals_3 = (_upper_1 == 1);
        _and_1 = (_equals_2 && _equals_3);
      }
      if (_and_1) {
        _matched=true;
        _switchResult = "[1]";
      }
    }
    if (!_matched) {
      int _upper_2 = self.getUpper();
      boolean _greaterThan = (_upper_2 > 0);
      if (_greaterThan) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("[");
        int _lower_2 = self.getLower();
        _builder.append(_lower_2, "");
        _builder.append("..");
        int _upper_3 = self.getUpper();
        _builder.append(_upper_3, "");
        _builder.append("]");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("[");
      int _lower_3 = self.getLower();
      _builder_1.append(_lower_3, "");
      _builder_1.append("..*]");
      _switchResult = _builder_1;
    }
    return _switchResult;
  }
  
  protected static CharSequence _notation_Element(final ParameterDirectionKind self) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(self,ParameterDirectionKind.IN_LITERAL)) {
        _matched=true;
        _switchResult = "in";
      }
    }
    if (!_matched) {
      if (Objects.equal(self,ParameterDirectionKind.OUT_LITERAL)) {
        _matched=true;
        _switchResult = "out";
      }
    }
    if (!_matched) {
      if (Objects.equal(self,ParameterDirectionKind.INOUT_LITERAL)) {
        _matched=true;
        _switchResult = "inout";
      }
    }
    if (!_matched) {
      if (Objects.equal(self,ParameterDirectionKind.RETURN_LITERAL)) {
        _matched=true;
        _switchResult = "return";
      }
    }
    return _switchResult;
  }
  
  protected static CharSequence _notation_Element(final VisibilityKind self) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(self,VisibilityKind.PUBLIC_LITERAL)) {
        _matched=true;
        _switchResult = "+";
      }
    }
    if (!_matched) {
      if (Objects.equal(self,VisibilityKind.PRIVATE_LITERAL)) {
        _matched=true;
        _switchResult = "-";
      }
    }
    if (!_matched) {
      if (Objects.equal(self,VisibilityKind.PROTECTED_LITERAL)) {
        _matched=true;
        _switchResult = "#";
      }
    }
    if (!_matched) {
      if (Objects.equal(self,VisibilityKind.PACKAGE_LITERAL)) {
        _matched=true;
        _switchResult = "~";
      }
    }
    return _switchResult;
  }
  
  protected static CharSequence _notation_Element(final LiteralBoolean self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    boolean _isValue = self.isValue();
    _builder.append(_isValue, "");
    _builder.append("</code> as <code>Boolean</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final LiteralUnlimitedNatural self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    int _value = self.getValue();
    _builder.append(_value, "");
    _builder.append("</code> as <code>UnlimitedNatural</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final LiteralInteger self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    int _value = self.getValue();
    _builder.append(_value, "");
    _builder.append("</code> as <code>Integer</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final LiteralString self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>");
    String _value = self.getValue();
    _builder.append(_value, "");
    _builder.append("</code> as <code>String</code>");
    return _builder;
  }
  
  protected static CharSequence _notation_Element(final Generalization self) {
    StringConcatenation _builder = new StringConcatenation();
    Classifier _specific = self.getSpecific();
    CharSequence _link_EObject = Link.link_EObject(_specific);
    _builder.append(_link_EObject, "");
    _builder.append(" &#8680; ");
    Classifier _general = self.getGeneral();
    CharSequence _link_EObject_1 = Link.link_EObject(_general);
    _builder.append(_link_EObject_1, "");
    return _builder;
  }
  
  public static CharSequence notation_Element(final Object self) {
    if (self instanceof LiteralBoolean) {
      return _notation_Element((LiteralBoolean)self);
    } else if (self instanceof LiteralInteger) {
      return _notation_Element((LiteralInteger)self);
    } else if (self instanceof LiteralString) {
      return _notation_Element((LiteralString)self);
    } else if (self instanceof LiteralUnlimitedNatural) {
      return _notation_Element((LiteralUnlimitedNatural)self);
    } else if (self instanceof Operation) {
      return _notation_Element((Operation)self);
    } else if (self instanceof Property) {
      return _notation_Element((Property)self);
    } else if (self instanceof Parameter) {
      return _notation_Element((Parameter)self);
    } else if (self instanceof Generalization) {
      return _notation_Element((Generalization)self);
    } else if (self instanceof Element) {
      return _notation_Element((Element)self);
    } else if (self instanceof ParameterDirectionKind) {
      return _notation_Element((ParameterDirectionKind)self);
    } else if (self instanceof VisibilityKind) {
      return _notation_Element((VisibilityKind)self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
