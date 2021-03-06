/**
 */
package es.unirioja.uml2prov.xtend.prov.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;
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

import es.unirioja.uml2prov.xtend.prov.Generation;
import es.unirioja.uml2prov.xtend.prov.IDRef;
import es.unirioja.uml2prov.xtend.prov.InternationalizedString;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getTime <em>Time</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.GenerationImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationImpl extends MinimalEObjectImpl.Container implements Generation {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected IDRef entity;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected IDRef activity;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar time = TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> location;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> role;

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
	protected GenerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.GENERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(IDRef newEntity, NotificationChain msgs) {
		IDRef oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.GENERATION__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(IDRef newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.GENERATION__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.GENERATION__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.GENERATION__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(IDRef newActivity, NotificationChain msgs) {
		IDRef oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.GENERATION__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(IDRef newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.GENERATION__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.GENERATION__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.GENERATION__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(XMLGregorianCalendar newTime) {
		XMLGregorianCalendar oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.GENERATION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternationalizedString> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<InternationalizedString>(InternationalizedString.class, this, ProvPackage.GENERATION__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getLocation() {
		if (location == null) {
			location = new EDataTypeEList<Object>(Object.class, this, ProvPackage.GENERATION__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getRole() {
		if (role == null) {
			role = new EDataTypeEList<Object>(Object.class, this, ProvPackage.GENERATION__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getType() {
		if (type == null) {
			type = new EDataTypeEList<Object>(Object.class, this, ProvPackage.GENERATION__TYPE);
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
			any = new BasicFeatureMap(this, ProvPackage.GENERATION__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.GENERATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAttribute> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EObjectContainmentEList<PAttribute>(PAttribute.class, this, ProvPackage.GENERATION__ANY_ATTRIBUTE);
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
			case ProvPackage.GENERATION__ENTITY:
				return basicSetEntity(null, msgs);
			case ProvPackage.GENERATION__ACTIVITY:
				return basicSetActivity(null, msgs);
			case ProvPackage.GENERATION__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ProvPackage.GENERATION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ProvPackage.GENERATION__ANY_ATTRIBUTE:
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
			case ProvPackage.GENERATION__ENTITY:
				return getEntity();
			case ProvPackage.GENERATION__ACTIVITY:
				return getActivity();
			case ProvPackage.GENERATION__TIME:
				return getTime();
			case ProvPackage.GENERATION__LABEL:
				return getLabel();
			case ProvPackage.GENERATION__LOCATION:
				return getLocation();
			case ProvPackage.GENERATION__ROLE:
				return getRole();
			case ProvPackage.GENERATION__TYPE:
				return getType();
			case ProvPackage.GENERATION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ProvPackage.GENERATION__ID:
				return getId();
			case ProvPackage.GENERATION__ANY_ATTRIBUTE:
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
			case ProvPackage.GENERATION__ENTITY:
				setEntity((IDRef)newValue);
				return;
			case ProvPackage.GENERATION__ACTIVITY:
				setActivity((IDRef)newValue);
				return;
			case ProvPackage.GENERATION__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case ProvPackage.GENERATION__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends InternationalizedString>)newValue);
				return;
			case ProvPackage.GENERATION__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.GENERATION__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.GENERATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.GENERATION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ProvPackage.GENERATION__ID:
				setId((QName)newValue);
				return;
			case ProvPackage.GENERATION__ANY_ATTRIBUTE:
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
			case ProvPackage.GENERATION__ENTITY:
				setEntity((IDRef)null);
				return;
			case ProvPackage.GENERATION__ACTIVITY:
				setActivity((IDRef)null);
				return;
			case ProvPackage.GENERATION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ProvPackage.GENERATION__LABEL:
				getLabel().clear();
				return;
			case ProvPackage.GENERATION__LOCATION:
				getLocation().clear();
				return;
			case ProvPackage.GENERATION__ROLE:
				getRole().clear();
				return;
			case ProvPackage.GENERATION__TYPE:
				getType().clear();
				return;
			case ProvPackage.GENERATION__ANY:
				getAny().clear();
				return;
			case ProvPackage.GENERATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.GENERATION__ANY_ATTRIBUTE:
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
			case ProvPackage.GENERATION__ENTITY:
				return entity != null;
			case ProvPackage.GENERATION__ACTIVITY:
				return activity != null;
			case ProvPackage.GENERATION__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ProvPackage.GENERATION__LABEL:
				return label != null && !label.isEmpty();
			case ProvPackage.GENERATION__LOCATION:
				return location != null && !location.isEmpty();
			case ProvPackage.GENERATION__ROLE:
				return role != null && !role.isEmpty();
			case ProvPackage.GENERATION__TYPE:
				return type != null && !type.isEmpty();
			case ProvPackage.GENERATION__ANY:
				return any != null && !any.isEmpty();
			case ProvPackage.GENERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.GENERATION__ANY_ATTRIBUTE:
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
		result.append(" (time: ");
		result.append(time);
		result.append(", location: ");
		result.append(location);
		result.append(", role: ");
		result.append(role);
		result.append(", type: ");
		result.append(type);
		result.append(", any: ");
		result.append(any);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GenerationImpl
