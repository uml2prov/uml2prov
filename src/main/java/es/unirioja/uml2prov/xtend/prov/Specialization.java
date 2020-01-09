/**
 */
package es.unirioja.uml2prov.xtend.prov;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.Specialization#getSpecificEntity <em>Specific Entity</em>}</li>
 *   <li>{@link xtendCode.prov.Specialization#getGeneralEntity <em>General Entity</em>}</li>
 * </ul>
 *
 * @see xtendCode.prov.ProvPackage#getSpecialization()
 * @model extendedMetaData="name='Specialization' kind='elementOnly'"
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Specific Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Entity</em>' containment reference.
	 * @see #setSpecificEntity(IDRef)
	 * @see xtendCode.prov.ProvPackage#getSpecialization_SpecificEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specificEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getSpecificEntity();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Specialization#getSpecificEntity <em>Specific Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Entity</em>' containment reference.
	 * @see #getSpecificEntity()
	 * @generated
	 */
	void setSpecificEntity(IDRef value);

	/**
	 * Returns the value of the '<em><b>General Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Entity</em>' containment reference.
	 * @see #setGeneralEntity(IDRef)
	 * @see xtendCode.prov.ProvPackage#getSpecialization_GeneralEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='generalEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getGeneralEntity();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Specialization#getGeneralEntity <em>General Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Entity</em>' containment reference.
	 * @see #getGeneralEntity()
	 * @generated
	 */
	void setGeneralEntity(IDRef value);

} // Specialization
