/**
 */
package xtendCode.prov;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.Membership#getCollection <em>Collection</em>}</li>
 *   <li>{@link xtendCode.prov.Membership#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see xtendCode.prov.ProvPackage#getMembership()
 * @model extendedMetaData="name='Membership' kind='elementOnly'"
 * @generated
 */
public interface Membership extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(IDRef)
	 * @see xtendCode.prov.ProvPackage#getMembership_Collection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getCollection();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Membership#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(IDRef value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link xtendCode.prov.IDRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see xtendCode.prov.ProvPackage#getMembership_Entity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IDRef> getEntity();

} // Membership
