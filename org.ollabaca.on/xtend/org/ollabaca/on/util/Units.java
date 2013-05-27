package org.ollabaca.on.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.ollabaca.on.model.Array;
import org.ollabaca.on.model.BooleanValue;
import org.ollabaca.on.model.Import;
import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.InstanceRef;
import org.ollabaca.on.model.Literal;
import org.ollabaca.on.model.Slot;
import org.ollabaca.on.model.StringValue;
import org.ollabaca.on.model.Unit;
import org.ollabaca.on.model.Value;

@SuppressWarnings("all")
public class Units {
  public Unit getUnit(final EObject self) {
    EObject container = self.eContainer();
    boolean _notEquals = (!Objects.equal(container, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        if ((container instanceof Unit)) {
          return ((Unit) container);
        }
        EObject _eContainer = container.eContainer();
        container = _eContainer;
      }
      boolean _notEquals_1 = (!Objects.equal(container, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  public Instance getInstance(final EObject object) {
    EObject container = object.eContainer();
    boolean _notEquals = (!Objects.equal(container, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        if ((container instanceof Instance)) {
          return ((Instance) container);
        }
        EObject _eContainer = container.eContainer();
        container = _eContainer;
      }
      boolean _notEquals_1 = (!Objects.equal(container, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  public Slot getSlot(final EObject object) {
    EObject container = object.eContainer();
    boolean _notEquals = (!Objects.equal(container, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        if ((container instanceof Slot)) {
          return ((Slot) container);
        }
        EObject _eContainer = container.eContainer();
        container = _eContainer;
      }
      boolean _notEquals_1 = (!Objects.equal(container, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  public EPackage[] getPackages(final Unit self) {
    ArrayList<EPackage> _arrayList = new ArrayList<EPackage>();
    List<EPackage> list = _arrayList;
    EList<Import> _imports = self.getImports();
    for (final Import i : _imports) {
      {
        String _name = i.getName();
        EPackage p = Registry.INSTANCE.getEPackage(_name);
        boolean _notEquals = (!Objects.equal(p, null));
        if (_notEquals) {
          list.add(p);
        }
      }
    }
    return ((EPackage[])Conversions.unwrapArray(list, EPackage.class));
  }
  
  public Instance[] getAncestorsAndSelf(final Instance self) {
    ArrayList<Instance> _arrayList = new ArrayList<Instance>();
    List<Instance> list = _arrayList;
    EObject e = self;
    boolean _notEquals = (!Objects.equal(e, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        if ((e instanceof Instance)) {
          list.add(0, ((Instance) e));
        }
        EObject _eContainer = e.eContainer();
        e = _eContainer;
      }
      boolean _notEquals_1 = (!Objects.equal(e, null));
      _while = _notEquals_1;
    }
    return ((Instance[])Conversions.unwrapArray(list, Instance.class));
  }
  
  public Instance getParent(final Instance self) {
    EObject e = self.eContainer();
    boolean _notEquals = (!Objects.equal(e, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        if ((e instanceof Instance)) {
          return ((Instance) e);
        }
        EObject _eContainer = e.eContainer();
        e = _eContainer;
      }
      boolean _notEquals_1 = (!Objects.equal(e, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  public EPackage getPackage(final Import self) {
    String _name = self.getName();
    return Registry.INSTANCE.getEPackage(_name);
  }
  
  public EClass[] getClasses(final Import self) {
    EPackage _package = this.getPackage(self);
    EList<EClassifier> _eClassifiers = _package.getEClassifiers();
    return ((EClass[])Conversions.unwrapArray(Iterables.<EClass>filter(_eClassifiers, EClass.class), EClass.class));
  }
  
  public EClass[] getClasses(final Unit self) {
    ArrayList<EClass> _arrayList = new ArrayList<EClass>();
    final List<EClass> list = _arrayList;
    EList<Import> _imports = self.getImports();
    final Procedure1<Import> _function = new Procedure1<Import>() {
        public void apply(final Import it) {
          EClass[] _classes = Units.this.getClasses(it);
          list.addAll(((Collection<? extends EClass>)Conversions.doWrapArray(_classes)));
        }
      };
    IterableExtensions.<Import>forEach(_imports, _function);
    return ((EClass[])Conversions.unwrapArray(list, EClass.class));
  }
  
  public EStructuralFeature[] getFeatures(final Instance self) {
    EClass _classifier = this.getClassifier(self);
    EList<EStructuralFeature> _eAllStructuralFeatures = _classifier.getEAllStructuralFeatures();
    final Function1<EStructuralFeature,Boolean> _function = new Function1<EStructuralFeature,Boolean>() {
        public Boolean apply(final EStructuralFeature it) {
          boolean _isSettable = Units.this.isSettable(it);
          return Boolean.valueOf(_isSettable);
        }
      };
    Iterable<EStructuralFeature> _filter = IterableExtensions.<EStructuralFeature>filter(_eAllStructuralFeatures, _function);
    return ((EStructuralFeature[])Conversions.unwrapArray(_filter, EStructuralFeature.class));
  }
  
  public EClass getClassifier(final Instance self) {
    Unit _unit = this.getUnit(self);
    EClass[] _classes = this.getClasses(_unit);
    final Function1<EClass,Boolean> _function = new Function1<EClass,Boolean>() {
        public Boolean apply(final EClass it) {
          String _name = it.getName();
          String _type = self.getType();
          boolean _equals = Objects.equal(_name, _type);
          return Boolean.valueOf(_equals);
        }
      };
    EClass _findFirst = IterableExtensions.<EClass>findFirst(((Iterable<EClass>)Conversions.doWrapArray(_classes)), _function);
    return _findFirst;
  }
  
  public EStructuralFeature getFeature(final Slot self) {
    Instance _instance = this.getInstance(self);
    EStructuralFeature[] _features = this.getFeatures(_instance);
    final Function1<EStructuralFeature,Boolean> _function = new Function1<EStructuralFeature,Boolean>() {
        public Boolean apply(final EStructuralFeature it) {
          String _name = it.getName();
          String _name_1 = self.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          return Boolean.valueOf(_equals);
        }
      };
    EStructuralFeature _findFirst = IterableExtensions.<EStructuralFeature>findFirst(((Iterable<EStructuralFeature>)Conversions.doWrapArray(_features)), _function);
    return _findFirst;
  }
  
  public EStructuralFeature getFeature(final Instance self, final String name) {
    EStructuralFeature[] _features = this.getFeatures(self);
    final Function1<EStructuralFeature,Boolean> _function = new Function1<EStructuralFeature,Boolean>() {
        public Boolean apply(final EStructuralFeature it) {
          String _name = it.getName();
          boolean _equals = Objects.equal(_name, name);
          return Boolean.valueOf(_equals);
        }
      };
    EStructuralFeature _findFirst = IterableExtensions.<EStructuralFeature>findFirst(((Iterable<EStructuralFeature>)Conversions.doWrapArray(_features)), _function);
    return _findFirst;
  }
  
  public EReference getReference(final Slot self) {
    EReference _xifexpression = null;
    EStructuralFeature _feature = this.getFeature(self);
    if ((_feature instanceof EReference)) {
      EStructuralFeature _feature_1 = this.getFeature(self);
      _xifexpression = ((EReference) _feature_1);
    }
    return _xifexpression;
  }
  
  public EEnum getEnum(final Slot self) {
    EStructuralFeature _feature = this.getFeature(self);
    EClassifier _eType = _feature==null?(EClassifier)null:_feature.getEType();
    if ((_eType instanceof EEnum)) {
      EStructuralFeature _feature_1 = this.getFeature(self);
      EClassifier _eType_1 = _feature_1.getEType();
      return ((EEnum) _eType_1);
    }
    return null;
  }
  
  public boolean isSettable(final EStructuralFeature self) {
    return self.isChangeable();
  }
  
  public boolean isMandatory(final EStructuralFeature self) {
    boolean _and = false;
    int _lowerBound = self.getLowerBound();
    boolean _greaterThan = (_lowerBound > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      String _defaultValueLiteral = self.getDefaultValueLiteral();
      boolean _equals = Objects.equal(_defaultValueLiteral, null);
      _and = (_greaterThan && _equals);
    }
    return _and;
  }
  
  protected boolean _isValid(final Value self) {
    return false;
  }
  
  protected boolean _isValid(final Array self) {
    Slot _slot = this.getSlot(self);
    EStructuralFeature _feature = this.getFeature(_slot);
    boolean _isMany = _feature.isMany();
    return _isMany;
  }
  
  protected boolean _isValid(final InstanceRef self) {
    boolean _xblockexpression = false;
    {
      EClass _eObject = EcorePackage.eINSTANCE.getEObject();
      Slot _slot = this.getSlot(self);
      EStructuralFeature _feature = this.getFeature(_slot);
      EClassifier _eType = _feature.getEType();
      boolean _equals = _eObject.equals(_eType);
      if (_equals) {
        return true;
      }
      Slot _slot_1 = this.getSlot(self);
      EStructuralFeature _feature_1 = this.getFeature(_slot_1);
      EClassifier _eType_1 = _feature_1.getEType();
      Instance _value = self.getValue();
      Instance _instance = this.getInstance(_value);
      EClass _classifier = this.getClassifier(_instance);
      boolean _isSuperTypeOf = ((EClass) _eType_1).isSuperTypeOf(_classifier);
      Slot _slot_2 = this.getSlot(self);
      EStructuralFeature _feature_2 = this.getFeature(_slot_2);
      EClassifier _eType_2 = _feature_2.getEType();
      Instance _value_1 = self.getValue();
      Instance _instance_1 = this.getInstance(_value_1);
      EClass _classifier_1 = this.getClassifier(_instance_1);
      System.out.format("VALIDATION IS VALID REF: %s = supertype: %s : current type: %s\n", Boolean.valueOf(_isSuperTypeOf), _eType_2, _classifier_1);
      Slot _slot_3 = this.getSlot(self);
      EStructuralFeature _feature_3 = this.getFeature(_slot_3);
      EClassifier _eType_3 = _feature_3.getEType();
      Instance _value_2 = self.getValue();
      EClass _classifier_2 = this.getClassifier(_value_2);
      boolean _isSuperTypeOf_1 = ((EClass) _eType_3).isSuperTypeOf(_classifier_2);
      _xblockexpression = (_isSuperTypeOf_1);
    }
    return _xblockexpression;
  }
  
  protected boolean _isValidInstance(final BooleanValue self) {
    Slot _slot = this.getSlot(self);
    EStructuralFeature _feature = _slot==null?(EStructuralFeature)null:this.getFeature(_slot);
    EClassifier _eType = _feature==null?(EClassifier)null:_feature.getEType();
    Class<? extends Object> o = _eType==null?(Class<? extends Object>)null:_eType.getInstanceClass();
    System.out.println(o);
    boolean _or = false;
    boolean _equals = Boolean.TYPE.equals(o);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Boolean.class.equals(o);
      _or = (_equals || _equals_1);
    }
    return _or;
  }
  
  protected boolean _isValidInstance(final StringValue self) {
    Slot _slot = this.getSlot(self);
    EStructuralFeature _feature = _slot==null?(EStructuralFeature)null:this.getFeature(_slot);
    EClassifier _eType = _feature==null?(EClassifier)null:_feature.getEType();
    Class<? extends Object> o = _eType==null?(Class<? extends Object>)null:_eType.getInstanceClass();
    return String.class.equals(o);
  }
  
  public String getDocumentation(final EModelElement self) {
    EAnnotation a = self.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
    boolean _equals = Objects.equal(a, null);
    if (_equals) {
      return null;
    } else {
      EMap<String,String> _details = a.getDetails();
      return _details.get("documentation");
    }
  }
  
  public boolean isValid(final Value self) {
    if (self instanceof Array) {
      return _isValid((Array)self);
    } else if (self instanceof InstanceRef) {
      return _isValid((InstanceRef)self);
    } else if (self != null) {
      return _isValid(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public boolean isValidInstance(final Literal self) {
    if (self instanceof BooleanValue) {
      return _isValidInstance((BooleanValue)self);
    } else if (self instanceof StringValue) {
      return _isValidInstance((StringValue)self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
