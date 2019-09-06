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

import xtendCode.prov.IDRef;
import xtendCode.prov.Influence;
import xtendCode.prov.InternationalizedString;
import xtendCode.prov.PAttribute;
import xtendCode.prov.ProvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.InfluenceImpl#getInfluencee <em>Influencee</em>}</li>
 *   <li>{@link xtendCode.prov.impl.InfluenceImpl#getInfluencer <em>Influencer</em>}</li>
 *   <li>{@link xtendCode.prov.impl.InfluenceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.InfluenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.InfluenceImpl#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.impl.InfluenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.InfluenceImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceImpl extends MinimalEObjectImpl.Container implements Influence {
	/**
	 * The cached value of the '{@link #getInfluencee() <em>Influencee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluencee()
	 * @generated
	 * @ordered
	 */
	protected IDRef influencee;

	/**
	 * The cached value of the '{@link #getInfluencer() <em>Influencer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluencer()
	 * @generated
	 * @ordered
	 */
	protected IDRef influencer;

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
	protected InfluenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.INFLUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getInfluencee() {
		return influencee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfluencee(IDRef newInfluencee, NotificationChain msgs) {
		IDRef oldInfluencee = influencee;
		influencee = newInfluencee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.INFLUENCE__INFLUENCEE, oldInfluencee, newInfluencee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfluencee(IDRef newInfluencee) {
		if (newInfluencee != influencee) {
			NotificationChain msgs = null;
			if (influencee != null)
				msgs = ((InternalEObject)influencee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.INFLUENCE__INFLUENCEE, null, msgs);
			if (newInfluencee != null)
				msgs = ((InternalEObject)newInfluencee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.INFLUENCE__INFLUENCEE, null, msgs);
			msgs = basicSetInfluencee(newInfluencee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.INFLUENCE__INFLUENCEE, newInfluencee, newInfluencee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getInfluencer() {
		return influencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfluencer(IDRef newInfluencer, NotificationChain msgs) {
		IDRef oldInfluencer = influencer;
		influencer = newInfluencer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.INFLUENCE__INFLUENCER, oldInfluencer, newInfluencer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfluencer(IDRef newInfluencer) {
		if (newInfluencer != influencer) {
			NotificationChain msgs = null;
			if (influencer != null)
				msgs = ((InternalEObject)influencer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.INFLUENCE__INFLUENCER, null, msgs);
			if (newInfluencer != null)
				msgs = ((InternalEObject)newInfluencer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.INFLUENCE__INFLUENCER, null, msgs);
			msgs = basicSetInfluencer(newInfluencer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.INFLUENCE__INFLUENCER, newInfluencer, newInfluencer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternationalizedString> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<InternationalizedString>(InternationalizedString.class, this, ProvPackage.INFLUENCE__LABEL);
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
			type = new EDataTypeEList<Object>(Object.class, this, ProvPackage.INFLUENCE__TYPE);
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
			any = new BasicFeatureMap(this, ProvPackage.INFLUENCE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.INFLUENCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAttribute> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EObjectContainmentEList<PAttribute>(PAttribute.class, this, ProvPackage.INFLUENCE__ANY_ATTRIBUTE);
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
			case ProvPackage.INFLUENCE__INFLUENCEE:
				return basicSetInfluencee(null, msgs);
			case ProvPackage.INFLUENCE__INFLUENCER:
				return basicSetInfluencer(null, msgs);
			case ProvPackage.INFLUENCE__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ProvPackage.INFLUENCE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ProvPackage.INFLUENCE__ANY_ATTRIBUTE:
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
			case ProvPackage.INFLUENCE__INFLUENCEE:
				return getInfluencee();
			case ProvPackage.INFLUENCE__INFLUENCER:
				return getInfluencer();
			case ProvPackage.INFLUENCE__LABEL:
				return getLabel();
			case ProvPackage.INFLUENCE__TYPE:
				return getType();
			case ProvPackage.INFLUENCE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ProvPackage.INFLUENCE__ID:
				return getId();
			case ProvPackage.INFLUENCE__ANY_ATTRIBUTE:
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
			case ProvPackage.INFLUENCE__INFLUENCEE:
				setInfluencee((IDRef)newValue);
				return;
			case ProvPackage.INFLUENCE__INFLUENCER:
				setInfluencer((IDRef)newValue);
				return;
			case ProvPackage.INFLUENCE__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends InternationalizedString>)newValue);
				return;
			case ProvPackage.INFLUENCE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.INFLUENCE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ProvPackage.INFLUENCE__ID:
				setId((QName)newValue);
				return;
			case ProvPackage.INFLUENCE__ANY_ATTRIBUTE:
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
			case ProvPackage.INFLUENCE__INFLUENCEE:
				setInfluencee((IDRef)null);
				return;
			case ProvPackage.INFLUENCE__INFLUENCER:
				setInfluencer((IDRef)null);
				return;
			case ProvPackage.INFLUENCE__LABEL:
				getLabel().clear();
				return;
			case ProvPackage.INFLUENCE__TYPE:
				getType().clear();
				return;
			case ProvPackage.INFLUENCE__ANY:
				getAny().clear();
				return;
			case ProvPackage.INFLUENCE__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.INFLUENCE__ANY_ATTRIBUTE:
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
			case ProvPackage.INFLUENCE__INFLUENCEE:
				return influencee != null;
			case ProvPackage.INFLUENCE__INFLUENCER:
				return influencer != null;
			case ProvPackage.INFLUENCE__LABEL:
				return label != null && !label.isEmpty();
			case ProvPackage.INFLUENCE__TYPE:
				return type != null && !type.isEmpty();
			case ProvPackage.INFLUENCE__ANY:
				return any != null && !any.isEmpty();
			case ProvPackage.INFLUENCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.INFLUENCE__ANY_ATTRIBUTE:
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

} //InfluenceImpl
