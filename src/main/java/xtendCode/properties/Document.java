/**
 */
package xtendCode.properties;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link properties.Document#getPropertiesDocument <em>Properties Document</em>}</li>
 * </ul>
 *
 * @see properties.PropertiesPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties Document</b></em>' reference list.
	 * The list contents are of type {@link properties.PropertiesDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Document</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Document</em>' reference list.
	 * @see properties.PropertiesPackage#getDocument_PropertiesDocument()
	 * @model
	 * @generated
	 */
	EList<PropertiesDocument> getPropertiesDocument();

} // Document
