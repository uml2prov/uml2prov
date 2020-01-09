/**
 */
package es.unirioja.uml2prov.xtend.prov;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.Delegation#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link xtendCode.prov.Delegation#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link xtendCode.prov.Delegation#getActivity <em>Activity</em>}</li>
 *   <li>{@link xtendCode.prov.Delegation#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.Delegation#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.Delegation#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.Delegation#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.Delegation#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see xtendCode.prov.ProvPackage#getDelegation()
 * @model extendedMetaData="name='Delegation' kind='elementOnly'"
 * @generated
 */
public interface Delegation extends EObject {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' containment reference.
	 * @see #setDelegate(IDRef)
	 * @see xtendCode.prov.ProvPackage#getDelegation_Delegate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='delegate' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getDelegate();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Delegation#getDelegate <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' containment reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(IDRef value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(IDRef)
	 * @see xtendCode.prov.ProvPackage#getDelegation_Responsible()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='responsible' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getResponsible();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Delegation#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(IDRef value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(IDRef)
	 * @see xtendCode.prov.ProvPackage#getDelegation_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getActivity();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Delegation#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(IDRef value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link xtendCode.prov.InternationalizedString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see xtendCode.prov.ProvPackage#getDelegation_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalizedString> getLabel();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see xtendCode.prov.ProvPackage#getDelegation_Type()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Object> getType();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see xtendCode.prov.ProvPackage#getDelegation_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(QName)
	 * @see xtendCode.prov.ProvPackage#getDelegation_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getId();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Delegation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(QName value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link xtendCode.prov.PAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' containment reference list.
	 * @see xtendCode.prov.ProvPackage#getDelegation_AnyAttribute()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<PAttribute> getAnyAttribute();

} // Delegation
