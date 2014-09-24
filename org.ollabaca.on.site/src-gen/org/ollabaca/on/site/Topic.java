/**
 */
package org.ollabaca.on.site;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.Topic#getTitle <em>Title</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getParent <em>Parent</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getSee <em>See</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getType <em>Type</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Topic#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.site.SitePackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends Named {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Topic#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Topic#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Documentation with Markdown syntax
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Documentation()
	 * @model unique="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Topic#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Tag}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Tag#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Tags()
	 * @see org.ollabaca.on.site.Tag#getTopics
	 * @model opposite="topics"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Topic#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Topic)
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Parent()
	 * @see org.ollabaca.on.site.Topic#getTopics
	 * @model opposite="topics"
	 * @generated
	 */
	Topic getParent();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Topic#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Topic value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Topic}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Topic#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' reference list.
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Topics()
	 * @see org.ollabaca.on.site.Topic#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>See</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>See</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See</em>' reference list.
	 * @see org.ollabaca.on.site.SitePackage#getTopic_See()
	 * @model
	 * @generated
	 */
	EList<Topic> getSee();

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Abbreviation#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' reference.
	 * @see #setAbbreviation(Abbreviation)
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Abbreviation()
	 * @see org.ollabaca.on.site.Abbreviation#getTopics
	 * @model opposite="topics"
	 * @generated
	 */
	Abbreviation getAbbreviation();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Topic#getAbbreviation <em>Abbreviation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' reference.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(Abbreviation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Type#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Type()
	 * @see org.ollabaca.on.site.Type#getTopics
	 * @model opposite="topics"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Topic#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The annotated element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see org.ollabaca.on.site.SitePackage#getTopic_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Topic#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\n<%java.lang.String%> _name = this.getName();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_name, null);\nif (_equals)\n{\n\t_or = true;\n} else\n{\n\t<%java.lang.String%> _name_1 = this.getName();\n\t<%java.lang.String%> _trim = _name_1.trim();\n\tint _length = _trim.length();\n\tboolean _equals_1 = (_length == 0);\n\t_or = _equals_1;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isAnonymous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%org.ollabaca.on.site.Topic%>>();\n<%org.ollabaca.on.site.Topic%> e = this;\nwhile ((!<%com.google.common.base.Objects%>.equal(e, null)))\n{\n\t{\n\t\tlist.add(0, e);\n\t\t<%org.ollabaca.on.site.Topic%> _parent = e.getParent();\n\t\te = _parent;\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<Topic> getAncestorsAndSelf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%org.ollabaca.on.site.Topic%>>();\n<%org.ollabaca.on.site.Topic%> e = this.getParent();\nwhile ((!<%com.google.common.base.Objects%>.equal(e, null)))\n{\n\t{\n\t\tlist.add(0, e);\n\t\t<%org.ollabaca.on.site.Topic%> _parent = e.getParent();\n\t\te = _parent;\n\t}\n}\nreturn list;'"
	 * @generated
	 */
	EList<Topic> getAncestors();

} // Topic
