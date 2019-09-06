/**
 */
package xtendCode.prov;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.Alternate#getAlternate1 <em>Alternate1</em>}</li>
 *   <li>{@link xtendCode.prov.Alternate#getAlternate2 <em>Alternate2</em>}</li>
 * </ul>
 *
 * @see xtendCode.prov.ProvPackage#getAlternate()
 * @model extendedMetaData="name='Alternate' kind='elementOnly'"
 * @generated
 */
public interface Alternate extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternate1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate1</em>' containment reference.
	 * @see #setAlternate1(IDRef)
	 * @see xtendCode.prov.ProvPackage#getAlternate_Alternate1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='alternate1' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getAlternate1();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Alternate#getAlternate1 <em>Alternate1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate1</em>' containment reference.
	 * @see #getAlternate1()
	 * @generated
	 */
	void setAlternate1(IDRef value);

	/**
	 * Returns the value of the '<em><b>Alternate2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate2</em>' containment reference.
	 * @see #setAlternate2(IDRef)
	 * @see xtendCode.prov.ProvPackage#getAlternate_Alternate2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='alternate2' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getAlternate2();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Alternate#getAlternate2 <em>Alternate2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate2</em>' containment reference.
	 * @see #getAlternate2()
	 * @generated
	 */
	void setAlternate2(IDRef value);

} // Alternate
