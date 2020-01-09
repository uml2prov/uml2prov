/**
 */
package es.unirioja.uml2prov.xtend.prov;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.Derivation#getGeneratedEntity <em>Generated Entity</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getUsedEntity <em>Used Entity</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getActivity <em>Activity</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getGeneration <em>Generation</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getUsage <em>Usage</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.Derivation#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see xtendCode.prov.ProvPackage#getDerivation()
 * @model extendedMetaData="name='Derivation' kind='elementOnly'"
 * @generated
 */
public interface Derivation extends EObject {
	/**
	 * Returns the value of the '<em><b>Generated Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Entity</em>' containment reference.
	 * @see #setGeneratedEntity(IDRef)
	 * @see xtendCode.prov.ProvPackage#getDerivation_GeneratedEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='generatedEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getGeneratedEntity();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Derivation#getGeneratedEntity <em>Generated Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Entity</em>' containment reference.
	 * @see #getGeneratedEntity()
	 * @generated
	 */
	void setGeneratedEntity(IDRef value);

	/**
	 * Returns the value of the '<em><b>Used Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Entity</em>' containment reference.
	 * @see #setUsedEntity(IDRef)
	 * @see xtendCode.prov.ProvPackage#getDerivation_UsedEntity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usedEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getUsedEntity();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Derivation#getUsedEntity <em>Used Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Entity</em>' containment reference.
	 * @see #getUsedEntity()
	 * @generated
	 */
	void setUsedEntity(IDRef value);

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
	 * @see xtendCode.prov.ProvPackage#getDerivation_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getActivity();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Derivation#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(IDRef value);

	/**
	 * Returns the value of the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation</em>' containment reference.
	 * @see #setGeneration(IDRef)
	 * @see xtendCode.prov.ProvPackage#getDerivation_Generation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generation' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getGeneration();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Derivation#getGeneration <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' containment reference.
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(IDRef value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference.
	 * @see #setUsage(IDRef)
	 * @see xtendCode.prov.ProvPackage#getDerivation_Usage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getUsage();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Derivation#getUsage <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' containment reference.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(IDRef value);

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
	 * @see xtendCode.prov.ProvPackage#getDerivation_Label()
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
	 * @see xtendCode.prov.ProvPackage#getDerivation_Type()
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
	 * @see xtendCode.prov.ProvPackage#getDerivation_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
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
	 * @see xtendCode.prov.ProvPackage#getDerivation_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getId();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Derivation#getId <em>Id</em>}' attribute.
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
	 * @see xtendCode.prov.ProvPackage#getDerivation_AnyAttribute()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<PAttribute> getAnyAttribute();

} // Derivation
