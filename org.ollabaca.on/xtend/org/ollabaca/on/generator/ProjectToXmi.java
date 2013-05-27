package org.ollabaca.on.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.ollabaca.on.QualifiedNameProvider;
import org.ollabaca.on.model.Array;
import org.ollabaca.on.model.BooleanValue;
import org.ollabaca.on.model.Container;
import org.ollabaca.on.model.EnumValue;
import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.InstanceRef;
import org.ollabaca.on.model.Literal;
import org.ollabaca.on.model.NullValue;
import org.ollabaca.on.model.NumberValue;
import org.ollabaca.on.model.Slot;
import org.ollabaca.on.model.StringValue;
import org.ollabaca.on.model.Unit;
import org.ollabaca.on.model.Value;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.SiteFactory;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.util.Units;

@SuppressWarnings("all")
public class ProjectToXmi {
  private QualifiedNameProvider qualifiedNameProvider = new Function0<QualifiedNameProvider>() {
    public QualifiedNameProvider apply() {
      QualifiedNameProvider _qualifiedNameProvider = new QualifiedNameProvider();
      return _qualifiedNameProvider;
    }
  }.apply();
  
  private Units units = new Function0<Units>() {
    public Units apply() {
      Units _units = new Units();
      return _units;
    }
  }.apply();
  
  private Map<Instance,EObject> instances = new Function0<Map<Instance,EObject>>() {
    public Map<Instance,EObject> apply() {
      HashMap<Instance,EObject> _hashMap = new HashMap<Instance,EObject>();
      return _hashMap;
    }
  }.apply();
  
  private Map<Instance,Topic> topics = new Function0<Map<Instance,Topic>>() {
    public Map<Instance,Topic> apply() {
      HashMap<Instance,Topic> _hashMap = new HashMap<Instance,Topic>();
      return _hashMap;
    }
  }.apply();
  
  private Set<Unit> all = new Function0<Set<Unit>>() {
    public Set<Unit> apply() {
      HashSet<Unit> _hashSet = new HashSet<Unit>();
      return _hashSet;
    }
  }.apply();
  
  private ResourceSet set;
  
  public ProjectToXmi(final ResourceSet set) {
    this.set = set;
  }
  
  public Collection<EObject> build() {
    TreeIterator<Notifier> _allContents = this.set.getAllContents();
    Iterable<Notifier> _iterable = IteratorExtensions.<Notifier>toIterable(_allContents);
    Iterable<Instance> _filter = Iterables.<Instance>filter(_iterable, Instance.class);
    for (final Instance e : _filter) {
      Unit _unit = this.units.getUnit(e);
      boolean _notEquals = (!Objects.equal(_unit, null));
      if (_notEquals) {
        Unit _unit_1 = this.units.getUnit(e);
        this.all.add(_unit_1);
      } else {
        String _plus = ("unit null for " + e);
        System.out.println(_plus);
      }
    }
    TreeIterator<Notifier> _allContents_1 = this.set.getAllContents();
    Iterable<Notifier> _iterable_1 = IteratorExtensions.<Notifier>toIterable(_allContents_1);
    Iterable<InstanceRef> _filter_1 = Iterables.<InstanceRef>filter(_iterable_1, InstanceRef.class);
    for (final InstanceRef e_1 : _filter_1) {
      Instance _value = e_1.getValue();
      Unit _unit_2 = this.units.getUnit(_value);
      boolean _notEquals_1 = (!Objects.equal(_unit_2, null));
      if (_notEquals_1) {
        Instance _value_1 = e_1.getValue();
        Unit _unit_3 = this.units.getUnit(_value_1);
        this.all.add(_unit_3);
      } else {
        String _plus_1 = ("unit null for " + e_1);
        System.out.println(_plus_1);
      }
    }
    TreeIterator<Notifier> _allContents_2 = this.set.getAllContents();
    Iterable<Notifier> _iterable_2 = IteratorExtensions.<Notifier>toIterable(_allContents_2);
    Iterable<Container> _filter_2 = Iterables.<Container>filter(_iterable_2, Container.class);
    for (final Container e_2 : _filter_2) {
      Instance _instance = e_2.getInstance();
      Unit _unit_4 = this.units.getUnit(_instance);
      boolean _notEquals_2 = (!Objects.equal(_unit_4, null));
      if (_notEquals_2) {
        Instance _instance_1 = e_2.getInstance();
        Unit _unit_5 = this.units.getUnit(_instance_1);
        this.all.add(_unit_5);
      } else {
        String _plus_2 = ("unit null for " + e_2);
        System.out.println(_plus_2);
      }
    }
    for (final Unit u : this.all) {
      TreeIterator<EObject> _eAllContents = u.eAllContents();
      Iterable<EObject> _iterable_3 = IteratorExtensions.<EObject>toIterable(_eAllContents);
      Iterable<Instance> _filter_3 = Iterables.<Instance>filter(_iterable_3, Instance.class);
      for (final Instance e_3 : _filter_3) {
        EClass _classifier = this.units.getClassifier(e_3);
        EPackage _ePackage = _classifier.getEPackage();
        EFactory _eFactoryInstance = _ePackage.getEFactoryInstance();
        EClass _classifier_1 = this.units.getClassifier(e_3);
        EObject _create = _eFactoryInstance.create(_classifier_1);
        this.instances.put(e_3, _create);
      }
    }
    Set<Instance> _keySet = this.instances.keySet();
    for (final Instance e_4 : _keySet) {
      this.setFeatures(e_4);
    }
    ArrayList<EObject> _arrayList = new ArrayList<EObject>();
    final Collection<EObject> result = _arrayList;
    for (final Unit u_1 : this.all) {
      Container _container = u_1.getContainer();
      boolean _equals = Objects.equal(_container, null);
      if (_equals) {
        EList<Instance> _instances = u_1.getInstances();
        for (final Instance i : _instances) {
          EObject _get = this.instances.get(i);
          result.add(_get);
        }
      } else {
        Container _container_1 = u_1.getContainer();
        Instance _instance_2 = _container_1.getInstance();
        EObject container = this.instances.get(_instance_2);
        boolean _equals_1 = Objects.equal(container, null);
        if (_equals_1) {
        } else {
          EClass _eClass = container.eClass();
          Container _container_2 = u_1.getContainer();
          String _feature = _container_2.getFeature();
          final EStructuralFeature feature = _eClass.getEStructuralFeature(_feature);
          boolean _equals_2 = Objects.equal(feature, null);
          if (_equals_2) {
          } else {
            Object _eGet = container.eGet(feature);
            Collection<EObject> collection = ((Collection) _eGet);
            EList<Instance> _instances_1 = u_1.getInstances();
            for (final Instance i_1 : _instances_1) {
              EObject _get_1 = this.instances.get(i_1);
              collection.add(_get_1);
            }
          }
        }
      }
    }
    Site site = SiteFactory.eINSTANCE.createSite();
    result.add(site);
    Set<Instance> _keySet_1 = this.instances.keySet();
    for (final Instance e_5 : _keySet_1) {
      {
        final Topic topic = SiteFactory.eINSTANCE.createTopic();
        EList<Topic> _topics = site.getTopics();
        _topics.add(topic);
        final QualifiedName name = this.qualifiedNameProvider.getFullyQualifiedName(e_5);
        boolean _notEquals_3 = (!Objects.equal(name, null));
        if (_notEquals_3) {
          String _string = name.toString();
          topic.setName(_string);
        }
        String _documentation = e_5.getDocumentation();
        String _normalize = this.normalize(_documentation);
        topic.setDocumentation(_normalize);
        String _title = e_5.getTitle();
        boolean _notEquals_4 = (!Objects.equal(_title, null));
        if (_notEquals_4) {
          String _title_1 = e_5.getTitle();
          String _normalize_1 = this.normalize(_title_1);
          topic.setTitle(_normalize_1);
        } else {
          String _name = e_5.getName();
          topic.setTitle(_name);
        }
        String _abstract = e_5.getAbstract();
        String _normalize_2 = this.normalize(_abstract);
        topic.setAbstract(_normalize_2);
        EObject _get_2 = this.instances.get(e_5);
        topic.setTarget(_get_2);
        this.topics.put(e_5, topic);
      }
    }
    Set<Instance> _keySet_2 = this.topics.keySet();
    for (final Instance e_6 : _keySet_2) {
      {
        final Topic topic = this.topics.get(e_6);
        EList<Instance> _see = e_6.getSee();
        for (final Instance see : _see) {
          {
            final Topic t = this.topics.get(see);
            boolean _notEquals_3 = (!Objects.equal(t, null));
            if (_notEquals_3) {
              EList<Topic> _see_1 = topic.getSee();
              _see_1.add(t);
            }
          }
        }
      }
    }
    Set<Instance> _keySet_3 = this.topics.keySet();
    for (final Instance e_7 : _keySet_3) {
      {
        final Topic topic = this.topics.get(e_7);
        final Instance parent = this.units.getParent(e_7);
        boolean _notEquals_3 = (!Objects.equal(parent, null));
        if (_notEquals_3) {
          Topic _get_2 = this.topics.get(parent);
          topic.setParent(_get_2);
        }
      }
    }
    return result;
  }
  
  public void setFeatures(final Instance self) {
    final EClass eClass = this.units.getClassifier(self);
    final EObject object = this.instances.get(self);
    EList<Slot> _slots = self.getSlots();
    for (final Slot slot : _slots) {
      {
        final EStructuralFeature feature = this.units.getFeature(slot);
        Value _value = slot.getValue();
        final Object value = this.compute(_value);
        String _plus = (self + ":");
        String _name = slot.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + ":");
        String _plus_3 = (_plus_2 + value);
        System.out.println(_plus_3);
        boolean _isMany = feature.isMany();
        if (_isMany) {
          Object _eGet = object.eGet(feature);
          ((Collection) _eGet).addAll(((Collection) value));
        } else {
          object.eSet(feature, value);
        }
      }
    }
    String _name = self.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      final EStructuralFeature name = eClass.getEStructuralFeature("name");
      boolean _and = false;
      boolean _notEquals_1 = (!Objects.equal(name, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        Object _eGet = object.eGet(name);
        boolean _equals = Objects.equal(_eGet, null);
        _and = (_notEquals_1 && _equals);
      }
      if (_and) {
        String _name_1 = self.getName();
        object.eSet(name, _name_1);
      }
    }
  }
  
  protected Object _compute(final Instance self) {
    return this.instances.get(self);
  }
  
  protected Object _compute(final InstanceRef self) {
    Instance _value = self.getValue();
    final EObject ref = this.instances.get(_value);
    boolean _equals = Objects.equal(ref, null);
    if (_equals) {
      Instance _value_1 = self.getValue();
      String _plus = ("No instance for ref: " + _value_1);
      System.err.println(_plus);
    }
    Instance _value_2 = self.getValue();
    return this.instances.get(_value_2);
  }
  
  protected Object _compute(final Literal self) {
    final Slot slot = this.units.getSlot(self);
    EStructuralFeature _feature = this.units.getFeature(slot);
    final EDataType type = ((EAttribute) _feature).getEAttributeType();
    EPackage _ePackage = type.getEPackage();
    EFactory _eFactoryInstance = _ePackage.getEFactoryInstance();
    Object _value = this.value(self);
    String _valueOf = String.valueOf(_value);
    return _eFactoryInstance.createFromString(type, _valueOf);
  }
  
  public Object value(final Literal self) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (self instanceof BooleanValue) {
        final BooleanValue _booleanValue = (BooleanValue)self;
        _matched=true;
        String _value = _booleanValue.getValue();
        _switchResult = _value;
      }
    }
    if (!_matched) {
      if (self instanceof StringValue) {
        final StringValue _stringValue = (StringValue)self;
        _matched=true;
        String _value = _stringValue.getValue();
        _switchResult = _value;
      }
    }
    if (!_matched) {
      if (self instanceof NullValue) {
        final NullValue _nullValue = (NullValue)self;
        _matched=true;
        _switchResult = null;
      }
    }
    if (!_matched) {
      if (self instanceof NumberValue) {
        final NumberValue _numberValue = (NumberValue)self;
        _matched=true;
        String _value = _numberValue.getValue();
        _switchResult = _value;
      }
    }
    if (!_matched) {
      if (self instanceof EnumValue) {
        final EnumValue _enumValue = (EnumValue)self;
        _matched=true;
        String _value = _enumValue.getValue();
        _switchResult = _value;
      }
    }
    return _switchResult;
  }
  
  protected Object _compute(final Array self) {
    ArrayList<?> _arrayList = new ArrayList<Object>();
    final Collection result = _arrayList;
    EList<Value> _value = self.getValue();
    for (final Value v : _value) {
      Object _compute = this.compute(v);
      result.add(_compute);
    }
    return result;
  }
  
  public String normalize(final String s) {
    boolean _equals = Objects.equal(s, null);
    if (_equals) {
      return "";
    }
    final String[] lines = s.split("\\r?\\n");
    int _size = ((List<String>)Conversions.doWrapArray(lines)).size();
    boolean _lessEqualsThan = (_size <= 1);
    if (_lessEqualsThan) {
      return s;
    }
    StringBuilder _stringBuilder = new StringBuilder();
    final StringBuilder builder = _stringBuilder;
    int _size_1 = ((List<String>)Conversions.doWrapArray(lines)).size();
    int _minus = (_size_1 - 1);
    final String last = ((List<String>)Conversions.doWrapArray(lines)).get(_minus);
    final boolean emptylast = last.matches("\\s*");
    boolean join = false;
    for (final String line : lines) {
      {
        String i = line;
        boolean _endsWith = i.endsWith("\\");
        final boolean newline = (!_endsWith);
        boolean _and = false;
        if (!emptylast) {
          _and = false;
        } else {
          boolean _startsWith = i.startsWith(last);
          _and = (emptylast && _startsWith);
        }
        if (_and) {
          int _length = last.length();
          String _substring = i.substring(_length);
          i = _substring;
        }
        if (join) {
          String _replaceAll = i.replaceAll("^\\s+", "");
          i = _replaceAll;
          boolean _and_1 = false;
          int _length_1 = builder.length();
          boolean _notEquals = (_length_1 != 0);
          if (!_notEquals) {
            _and_1 = false;
          } else {
            int _length_2 = builder.length();
            int _minus_1 = (_length_2 - 1);
            char _charAt = builder.charAt(_minus_1);
            boolean _isWhitespace = Character.isWhitespace(_charAt);
            boolean _not = (!_isWhitespace);
            _and_1 = (_notEquals && _not);
          }
          if (_and_1) {
            String _plus = (" " + i);
            i = _plus;
          }
        }
        if (newline) {
          StringBuilder _append = builder.append(i);
          _append.append("\n");
        } else {
          char[] _charArray = i.toCharArray();
          int _length_3 = i.length();
          int _minus_2 = (_length_3 - 1);
          builder.append(_charArray, 0, _minus_2);
        }
        boolean _not_1 = (!newline);
        join = _not_1;
      }
    }
    String _string = builder.toString();
    return _string.trim();
  }
  
  public Object compute(final Value self) {
    if (self instanceof Array) {
      return _compute((Array)self);
    } else if (self instanceof Instance) {
      return _compute((Instance)self);
    } else if (self instanceof InstanceRef) {
      return _compute((InstanceRef)self);
    } else if (self instanceof Literal) {
      return _compute((Literal)self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
