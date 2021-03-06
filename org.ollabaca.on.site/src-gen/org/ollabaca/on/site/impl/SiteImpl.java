/**
 */
package org.ollabaca.on.site.impl;

import com.google.common.base.Objects;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import org.ollabaca.on.site.Abbreviation;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.SiteFactory;
import org.ollabaca.on.site.SitePackage;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.impl.SiteImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.SiteImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.SiteImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.SiteImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteImpl extends NamedImpl implements Site {
	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topics;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getAbbreviations() <em>Abbreviations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviations()
	 * @generated
	 * @ordered
	 */
	protected EList<Abbreviation> abbreviations;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitePackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopics() {
		if (topics == null) {
			topics = new EObjectContainmentEList<Topic>(Topic.class, this, SitePackage.SITE__TOPICS);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentWithInverseEList<Tag>(Tag.class, this, SitePackage.SITE__TAGS, SitePackage.TAG__SITE);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Abbreviation> getAbbreviations() {
		if (abbreviations == null) {
			abbreviations = new EObjectContainmentWithInverseEList<Abbreviation>(Abbreviation.class, this, SitePackage.SITE__ABBREVIATIONS, SitePackage.ABBREVIATION__SITE);
		}
		return abbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<Type>(Type.class, this, SitePackage.SITE__TYPES, SitePackage.TYPE__SITE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getOrCreateTag(final String name) {
		final String n = name;
		EList<Tag> _tags = this.getTags();
		final Function1<Tag, Boolean> _function = new Function1<Tag, Boolean>() {
			public Boolean apply(final Tag it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, n));
			}
		};
		Tag tag = IterableExtensions.<Tag>findFirst(_tags, _function);
		boolean _equals = Objects.equal(tag, null);
		if (_equals) {
			Tag _createTag = SiteFactory.eINSTANCE.createTag();
			tag = _createTag;
			tag.setName(name);
			EList<Tag> _tags_1 = this.getTags();
			_tags_1.add(tag);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abbreviation getOrCreateAbbr(final String name) {
		final String n = name;
		EList<Abbreviation> _abbreviations = this.getAbbreviations();
		final Function1<Abbreviation, Boolean> _function = new Function1<Abbreviation, Boolean>() {
			public Boolean apply(final Abbreviation it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, n));
			}
		};
		Abbreviation abbreviation = IterableExtensions.<Abbreviation>findFirst(_abbreviations, _function);
		boolean _equals = Objects.equal(abbreviation, null);
		if (_equals) {
			Abbreviation _createAbbreviation = SiteFactory.eINSTANCE.createAbbreviation();
			abbreviation = _createAbbreviation;
			abbreviation.setName(name);
			EList<Abbreviation> _abbreviations_1 = this.getAbbreviations();
			_abbreviations_1.add(abbreviation);
		}
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOrCreateType(final String name) {
		final String n = name;
		EList<Type> _types = this.getTypes();
		final Function1<Type, Boolean> _function = new Function1<Type, Boolean>() {
			public Boolean apply(final Type it) {
				String _name = it.getName();
				return Boolean.valueOf(Objects.equal(_name, n));
			}
		};
		Type e = IterableExtensions.<Type>findFirst(_types, _function);
		boolean _equals = Objects.equal(e, null);
		if (_equals) {
			Type _createType = SiteFactory.eINSTANCE.createType();
			e = _createType;
			e.setName(name);
			EList<Type> _types_1 = this.getTypes();
			_types_1.add(e);
		}
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic(final String name) {
		Topic _xblockexpression = null;
		{
			final String n = name;
			EList<Topic> _topics = this.getTopics();
			final Function1<Topic, Boolean> _function = new Function1<Topic, Boolean>() {
				public Boolean apply(final Topic it) {
					String _name = it.getName();
					return Boolean.valueOf(Objects.equal(_name, n));
				}
			};
			_xblockexpression = IterableExtensions.<Topic>findFirst(_topics, _function);
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getRoots() {
		EList<Topic> _topics = this.getTopics();
		final Function1<Topic, Boolean> _function = new Function1<Topic, Boolean>() {
			public Boolean apply(final Topic it) {
				boolean _and = false;
				Topic _parent = it.getParent();
				boolean _equals = Objects.equal(_parent, null);
				if (!_equals) {
					_and = false;
				} else {
					boolean _isAnonymous = it.isAnonymous();
					boolean _not = (!_isAnonymous);
					_and = _not;
				}
				return Boolean.valueOf(_and);
			}
		};
		Iterable<Topic> _filter = IterableExtensions.<Topic>filter(_topics, _function);
		List<Topic> _list = IterableExtensions.<Topic>toList(_filter);
		return new BasicEList<Topic>(_list);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic(final EObject target) {
		final EObject t = target;
		EList<Topic> _topics = this.getTopics();
		final Function1<Topic, Boolean> _function = new Function1<Topic, Boolean>() {
			public Boolean apply(final Topic it) {
				EObject _target = it.getTarget();
				return Boolean.valueOf(Objects.equal(_target, t));
			}
		};
		return IterableExtensions.<Topic>findFirst(_topics, _function);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SitePackage.SITE__TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTags()).basicAdd(otherEnd, msgs);
			case SitePackage.SITE__ABBREVIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbbreviations()).basicAdd(otherEnd, msgs);
			case SitePackage.SITE__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SitePackage.SITE__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case SitePackage.SITE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case SitePackage.SITE__ABBREVIATIONS:
				return ((InternalEList<?>)getAbbreviations()).basicRemove(otherEnd, msgs);
			case SitePackage.SITE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SitePackage.SITE__TOPICS:
				return getTopics();
			case SitePackage.SITE__TAGS:
				return getTags();
			case SitePackage.SITE__ABBREVIATIONS:
				return getAbbreviations();
			case SitePackage.SITE__TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SitePackage.SITE__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case SitePackage.SITE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case SitePackage.SITE__ABBREVIATIONS:
				getAbbreviations().clear();
				getAbbreviations().addAll((Collection<? extends Abbreviation>)newValue);
				return;
			case SitePackage.SITE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SitePackage.SITE__TOPICS:
				getTopics().clear();
				return;
			case SitePackage.SITE__TAGS:
				getTags().clear();
				return;
			case SitePackage.SITE__ABBREVIATIONS:
				getAbbreviations().clear();
				return;
			case SitePackage.SITE__TYPES:
				getTypes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SitePackage.SITE__TOPICS:
				return topics != null && !topics.isEmpty();
			case SitePackage.SITE__TAGS:
				return tags != null && !tags.isEmpty();
			case SitePackage.SITE__ABBREVIATIONS:
				return abbreviations != null && !abbreviations.isEmpty();
			case SitePackage.SITE__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SitePackage.SITE___GET_OR_CREATE_TAG__STRING:
				return getOrCreateTag((String)arguments.get(0));
			case SitePackage.SITE___GET_OR_CREATE_ABBR__STRING:
				return getOrCreateAbbr((String)arguments.get(0));
			case SitePackage.SITE___GET_OR_CREATE_TYPE__STRING:
				return getOrCreateType((String)arguments.get(0));
			case SitePackage.SITE___GET_TOPIC__STRING:
				return getTopic((String)arguments.get(0));
			case SitePackage.SITE___GET_ROOTS:
				return getRoots();
			case SitePackage.SITE___GET_TOPIC__EOBJECT:
				return getTopic((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SiteImpl
