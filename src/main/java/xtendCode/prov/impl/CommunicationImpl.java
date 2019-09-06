/**
 */
package xtendCode.prov.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import xtendCode.prov.Communication;
import xtendCode.prov.IDRef;
import xtendCode.prov.InternationalizedString;
import xtendCode.prov.PAttribute;
import xtendCode.prov.ProvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.CommunicationImpl#getInformed <em>Informed</em>}</li>
 *   <li>{@link xtendCode.prov.impl.CommunicationImpl#getInformant <em>Informant</em>}</li>
 *   <li>{@link xtendCode.prov.impl.CommunicationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.CommunicationImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.CommunicationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.impl.CommunicationImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.CommunicationImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends MinimalEObjectImpl.Container implements Communication {
	/**
	 * The cached value of the '{@link #getInformed() <em>Informed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformed()
	 * @generated
	 * @ordered
	 */
	protected IDRef informed;

	/**
	 * The cached value of the '{@link #getInformant() <em>Informant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformant()
	 * @generated
	 * @ordered
	 */
	protected IDRef informant;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalizedString> label;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> type;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final QName ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected QName id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<PAttribute> anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getInformed() {
		return informed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformed(IDRef newInformed, NotificationChain msgs) {
		IDRef oldInformed = informed;
		informed = newInformed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.COMMUNICATION__INFORMED, oldInformed, newInformed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformed(IDRef newInformed) {
		if (newInformed != informed) {
			NotificationChain msgs = null;
			if (informed != null)
				msgs = ((InternalEObject)informed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.COMMUNICATION__INFORMED, null, msgs);
			if (newInformed != null)
				msgs = ((InternalEObject)newInformed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.COMMUNICATION__INFORMED, null, msgs);
			msgs = basicSetInformed(newInformed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.COMMUNICATION__INFORMED, newInformed, newInformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getInformant() {
		return informant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformant(IDRef newInformant, NotificationChain msgs) {
		IDRef oldInformant = informant;
		informant = newInformant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.COMMUNICATION__INFORMANT, oldInformant, newInformant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformant(IDRef newInformant) {
		if (newInformant != informant) {
			NotificationChain msgs = null;
			if (informant != null)
				msgs = ((InternalEObject)informant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.COMMUNICATION__INFORMANT, null, msgs);
			if (newInformant != null)
				msgs = ((InternalEObject)newInformant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.COMMUNICATION__INFORMANT, null, msgs);
			msgs = basicSetInformant(newInformant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.COMMUNICATION__INFORMANT, newInformant, newInformant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternationalizedString> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<InternationalizedString>(InternationalizedString.class, this, ProvPackage.COMMUNICATION__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getType() {
		if (type == null) {
			type = new EDataTypeEList<Object>(Object.class, this, ProvPackage.COMMUNICATION__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ProvPackage.COMMUNICATION__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(QName newId) {
		QName oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.COMMUNICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAttribute> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EObjectContainmentEList<PAttribute>(PAttribute.class, this, ProvPackage.COMMUNICATION__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvPackage.COMMUNICATION__INFORMED:
				return basicSetInformed(null, msgs);
			case ProvPackage.COMMUNICATION__INFORMANT:
				return basicSetInformant(null, msgs);
			case ProvPackage.COMMUNICATION__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ProvPackage.COMMUNICATION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ProvPackage.COMMUNICATION__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProvPackage.COMMUNICATION__INFORMED:
				return getInformed();
			case ProvPackage.COMMUNICATION__INFORMANT:
				return getInformant();
			case ProvPackage.COMMUNICATION__LABEL:
				return getLabel();
			case ProvPackage.COMMUNICATION__TYPE:
				return getType();
			case ProvPackage.COMMUNICATION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ProvPackage.COMMUNICATION__ID:
				return getId();
			case ProvPackage.COMMUNICATION__ANY_ATTRIBUTE:
				return getAnyAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProvPackage.COMMUNICATION__INFORMED:
				setInformed((IDRef)newValue);
				return;
			case ProvPackage.COMMUNICATION__INFORMANT:
				setInformant((IDRef)newValue);
				return;
			case ProvPackage.COMMUNICATION__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends InternationalizedString>)newValue);
				return;
			case ProvPackage.COMMUNICATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.COMMUNICATION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ProvPackage.COMMUNICATION__ID:
				setId((QName)newValue);
				return;
			case ProvPackage.COMMUNICATION__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				getAnyAttribute().addAll((Collection<? extends PAttribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProvPackage.COMMUNICATION__INFORMED:
				setInformed((IDRef)null);
				return;
			case ProvPackage.COMMUNICATION__INFORMANT:
				setInformant((IDRef)null);
				return;
			case ProvPackage.COMMUNICATION__LABEL:
				getLabel().clear();
				return;
			case ProvPackage.COMMUNICATION__TYPE:
				getType().clear();
				return;
			case ProvPackage.COMMUNICATION__ANY:
				getAny().clear();
				return;
			case ProvPackage.COMMUNICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.COMMUNICATION__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProvPackage.COMMUNICATION__INFORMED:
				return informed != null;
			case ProvPackage.COMMUNICATION__INFORMANT:
				return informant != null;
			case ProvPackage.COMMUNICATION__LABEL:
				return label != null && !label.isEmpty();
			case ProvPackage.COMMUNICATION__TYPE:
				return type != null && !type.isEmpty();
			case ProvPackage.COMMUNICATION__ANY:
				return any != null && !any.isEmpty();
			case ProvPackage.COMMUNICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.COMMUNICATION__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", any: ");
		result.append(any);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CommunicationImpl
