/**
 */
package org.ollabaca.on.site;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.Tag#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Tag#getSite <em>Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.site.SitePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Named {
	/**
	 * Returns the value of the '<em><b>Topics</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.site.Topic}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Topic#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' reference list.
	 * @see org.ollabaca.on.site.SitePackage#getTag_Topics()
	 * @see org.ollabaca.on.site.Topic#getTags
	 * @model opposite="tags"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Site#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' container reference.
	 * @see #setSite(Site)
	 * @see org.ollabaca.on.site.SitePackage#getTag_Site()
	 * @see org.ollabaca.on.site.Site#getTags
	 * @model opposite="tags" transient="false"
	 * @generated
	 */
	Site getSite();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Tag#getSite <em>Site</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site</em>' container reference.
	 * @see #getSite()
	 * @generated
	 */
	void setSite(Site value);

} // Tag
