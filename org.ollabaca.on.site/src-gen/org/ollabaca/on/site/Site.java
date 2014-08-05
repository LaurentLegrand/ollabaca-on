/**
 */
package org.ollabaca.on.site;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.Site#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Site#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Site#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Site#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.site.SitePackage#getSite()
 * @model
 * @generated
 */
public interface Site extends Named {
	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see org.ollabaca.on.site.SitePackage#getSite_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Tag}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Tag#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.ollabaca.on.site.SitePackage#getSite_Tags()
	 * @see org.ollabaca.on.site.Tag#getSite
	 * @model opposite="site" containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Abbreviation}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Abbreviation#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviations</em>' containment reference list.
	 * @see org.ollabaca.on.site.SitePackage#getSite_Abbreviations()
	 * @see org.ollabaca.on.site.Abbreviation#getSite
	 * @model opposite="site" containment="true"
	 * @generated
	 */
	EList<Abbreviation> getAbbreviations();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Type}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Type#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.ollabaca.on.site.SitePackage#getSite_Types()
	 * @see org.ollabaca.on.site.Type#getSite
	 * @model opposite="site" containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get or create a tag with a given name
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%java.lang.String%> n = name;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Tag%>> _tags = this.getTags();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Tag%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Tag%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Tag%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, n));\n\t}\n};\n<%org.ollabaca.on.site.Tag%> tag = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Tag%>>findFirst(_tags, _function);\nboolean _equals = <%com.google.common.base.Objects%>.equal(tag, null);\nif (_equals)\n{\n\t<%org.ollabaca.on.site.Tag%> _createTag = <%org.ollabaca.on.site.SiteFactory%>.eINSTANCE.createTag();\n\ttag = _createTag;\n\ttag.setName(name);\n\t<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Tag%>> _tags_1 = this.getTags();\n\t_tags_1.add(tag);\n}\nreturn tag;'"
	 * @generated
	 */
	Tag getOrCreateTag(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get or create a abbreviation with a given name
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%java.lang.String%> n = name;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Abbreviation%>> _abbreviations = this.getAbbreviations();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Abbreviation%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Abbreviation%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Abbreviation%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, n));\n\t}\n};\n<%org.ollabaca.on.site.Abbreviation%> abbreviation = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Abbreviation%>>findFirst(_abbreviations, _function);\nboolean _equals = <%com.google.common.base.Objects%>.equal(abbreviation, null);\nif (_equals)\n{\n\t<%org.ollabaca.on.site.Abbreviation%> _createAbbreviation = <%org.ollabaca.on.site.SiteFactory%>.eINSTANCE.createAbbreviation();\n\tabbreviation = _createAbbreviation;\n\tabbreviation.setName(name);\n\t<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Abbreviation%>> _abbreviations_1 = this.getAbbreviations();\n\t_abbreviations_1.add(abbreviation);\n}\nreturn abbreviation;'"
	 * @generated
	 */
	Abbreviation getOrCreateAbbr(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get or create a type with a given name
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%java.lang.String%> n = name;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Type%>> _types = this.getTypes();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Type%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Type%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Type%> it)\n\t{\n\t\t<%java.lang.String%> _name = it.getName();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, n));\n\t}\n};\n<%org.ollabaca.on.site.Type%> e = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Type%>>findFirst(_types, _function);\nboolean _equals = <%com.google.common.base.Objects%>.equal(e, null);\nif (_equals)\n{\n\t<%org.ollabaca.on.site.Type%> _createType = <%org.ollabaca.on.site.SiteFactory%>.eINSTANCE.createType();\n\te = _createType;\n\te.setName(name);\n\t<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Type%>> _types_1 = this.getTypes();\n\t_types_1.add(e);\n}\nreturn e;'"
	 * @generated
	 */
	Type getOrCreateType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.ollabaca.on.site.Topic%> _xblockexpression = null;\n{\n\tfinal <%java.lang.String%> n = name;\n\t<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> _topics = this.getTopics();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>, <%java.lang.Boolean%>>()\n\t{\n\t\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Topic%> it)\n\t\t{\n\t\t\t<%java.lang.String%> _name = it.getName();\n\t\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_name, n));\n\t\t}\n\t};\n\t_xblockexpression = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>findFirst(_topics, _function);\n}\nreturn _xblockexpression;'"
	 * @generated
	 */
	Topic getTopic(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get the root topics
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> _topics = this.getTopics();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Topic%> it)\n\t{\n\t\tboolean _and = false;\n\t\t<%org.ollabaca.on.site.Topic%> _parent = it.getParent();\n\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_parent, null);\n\t\tif (!_equals)\n\t\t{\n\t\t\t_and = false;\n\t\t} else\n\t\t{\n\t\t\tboolean _isAnonymous = it.isAnonymous();\n\t\t\tboolean _not = (!_isAnonymous);\n\t\t\t_and = _not;\n\t\t}\n\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t}\n};\n<%java.lang.Iterable%><<%org.ollabaca.on.site.Topic%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>filter(_topics, _function);\n<%java.util.List%><<%org.ollabaca.on.site.Topic%>> _list = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>toList(_filter);\nreturn new <%org.eclipse.emf.common.util.BasicEList%><<%org.ollabaca.on.site.Topic%>>(_list);'"
	 * @generated
	 */
	EList<Topic> getRoots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get topic which target ...
	 * <!-- end-model-doc -->
	 * @model unique="false" targetUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.ecore.EObject%> t = target;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> _topics = this.getTopics();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Topic%> it)\n\t{\n\t\t<%org.eclipse.emf.ecore.EObject%> _target = it.getTarget();\n\t\treturn <%java.lang.Boolean%>.valueOf(<%com.google.common.base.Objects%>.equal(_target, t));\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>findFirst(_topics, _function);'"
	 * @generated
	 */
	Topic getTopic(EObject target);

} // Site
