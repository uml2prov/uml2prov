/**
 */
package es.unirioja.uml2prov.xtend.prov;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.Start#getActivity <em>Activity</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getStarter <em>Starter</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getTime <em>Time</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getLocation <em>Location</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getRole <em>Role</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.Start#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see xtendCode.prov.ProvPackage#getStart()
 * @model extendedMetaData="name='Start' kind='elementOnly'"
 * @generated
 */
public interface Start extends EObject {
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
	 * @see xtendCode.prov.ProvPackage#getStart_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getActivity();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Start#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(IDRef value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(IDRef)
	 * @see xtendCode.prov.ProvPackage#getStart_Trigger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getTrigger();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Start#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(IDRef value);

	/**
	 * Returns the value of the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starter</em>' containment reference.
	 * @see #setStarter(IDRef)
	 * @see xtendCode.prov.ProvPackage#getStart_Starter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='starter' namespace='##targetNamespace'"
	 * @generated
	 */
	IDRef getStarter();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Start#getStarter <em>Starter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starter</em>' containment reference.
	 * @see #getStarter()
	 * @generated
	 */
	void setStarter(IDRef value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(XMLGregorianCalendar)
	 * @see xtendCode.prov.ProvPackage#getStart_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTime();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Start#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(XMLGregorianCalendar value);

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
	 * @see xtendCode.prov.ProvPackage#getStart_Label()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalizedString> getLabel();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute list.
	 * @see xtendCode.prov.ProvPackage#getStart_Location()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Object> getLocation();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute list.
	 * @see xtendCode.prov.ProvPackage#getStart_Role()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Object> getRole();

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
	 * @see xtendCode.prov.ProvPackage#getStart_Type()
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
	 * @see xtendCode.prov.ProvPackage#getStart_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='lax'"
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
	 * @see xtendCode.prov.ProvPackage#getStart_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getId();

	/**
	 * Sets the value of the '{@link xtendCode.prov.Start#getId <em>Id</em>}' attribute.
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
	 * @see xtendCode.prov.ProvPackage#getStart_AnyAttribute()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<PAttribute> getAnyAttribute();

} // Start
