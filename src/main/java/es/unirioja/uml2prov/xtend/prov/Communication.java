/**
 */
package es.unirioja.uml2prov.xtend.prov;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.Communication#getInformed <em>Informed</em>}</li>
 *   <li>{@link xtendCode.prov.Communication#getInformant <em>Informant</em>}</li>
 *   <li>{@link xtendCode.prov.Communication#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.Communication#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.Communication#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.Communication#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.Communication#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see xtendCode.prov.ProvPackage#getCommunication()
 * @model extendedMetaData="name='Communication' kind='elementOnly'"
 * @generated
 */
public interface Communication extends EObject {
	/**
	 * Returns the value of the '<em><b>Informed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informed</em>' containment reference.
	 * @see #setInformed(IDRef)
	 * @see xtendCode.prov.ProvPackage#getCommunication_Informed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='informed' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getInformed();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Communication#getInformed <em>Informed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informed</em>' containment reference.
	 * @see #getInformed()
	 * @generated
	 */
	void setInformed(IDRef value);

	/**
	 * Returns the value of the '<em><b>Informant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informant</em>' containment reference.
	 * @see #setInformant(IDRef)
	 * @see xtendCode.prov.ProvPackage#getCommunication_Informant()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='informant' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getInformant();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Communication#getInformant <em>Informant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informant</em>' containment reference.
	 * @see #getInformant()
	 * @generated
	 */
	void setInformant(IDRef value);

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
	 * @see xtendCode.prov.ProvPackage#getCommunication_Label()
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
	 * @see xtendCode.prov.ProvPackage#getCommunication_Type()
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
	 * @see xtendCode.prov.ProvPackage#getCommunication_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
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
	 * @see xtendCode.prov.ProvPackage#getCommunication_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getId();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Communication#getId <em>Id</em>}' attribute.
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
	 * @see xtendCode.prov.ProvPackage#getCommunication_AnyAttribute()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<PAttribute> getAnyAttribute();

} // Communication
