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

import es.unirioja.uml2prov.xtend.prov.IDRef;
import es.unirioja.uml2prov.xtend.prov.InternationalizedString;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;
import es.unirioja.uml2prov.xtend.prov.Start;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getTime <em>Time</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getRole <em>Role</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.StartImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartImpl extends MinimalEObjectImpl.Container implements Start {
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
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected IDRef trigger;

	/**
	 * The cached value of the '{@link #getStarter() <em>Starter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarter()
	 * @generated
	 * @ordered
	 */
	protected IDRef starter;

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
	protected StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.START;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.START__ACTIVITY, oldActivity, newActivity);
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
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.START__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.START__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.START__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(IDRef newTrigger, NotificationChain msgs) {
		IDRef oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.START__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(IDRef newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.START__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.START__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.START__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getStarter() {
		return starter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(IDRef newStarter, NotificationChain msgs) {
		IDRef oldStarter = starter;
		starter = newStarter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.START__STARTER, oldStarter, newStarter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarter(IDRef newStarter) {
		if (newStarter != starter) {
			NotificationChain msgs = null;
			if (starter != null)
				msgs = ((InternalEObject)starter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.START__STARTER, null, msgs);
			if (newStarter != null)
				msgs = ((InternalEObject)newStarter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.START__STARTER, null, msgs);
			msgs = basicSetStarter(newStarter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.START__STARTER, newStarter, newStarter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.START__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternationalizedString> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<InternationalizedString>(InternationalizedString.class, this, ProvPackage.START__LABEL);
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
			location = new EDataTypeEList<Object>(Object.class, this, ProvPackage.START__LOCATION);
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
			role = new EDataTypeEList<Object>(Object.class, this, ProvPackage.START__ROLE);
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
			type = new EDataTypeEList<Object>(Object.class, this, ProvPackage.START__TYPE);
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
			any = new BasicFeatureMap(this, ProvPackage.START__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.START__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAttribute> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EObjectContainmentEList<PAttribute>(PAttribute.class, this, ProvPackage.START__ANY_ATTRIBUTE);
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
			case ProvPackage.START__ACTIVITY:
				return basicSetActivity(null, msgs);
			case ProvPackage.START__TRIGGER:
				return basicSetTrigger(null, msgs);
			case ProvPackage.START__STARTER:
				return basicSetStarter(null, msgs);
			case ProvPackage.START__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ProvPackage.START__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ProvPackage.START__ANY_ATTRIBUTE:
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
			case ProvPackage.START__ACTIVITY:
				return getActivity();
			case ProvPackage.START__TRIGGER:
				return getTrigger();
			case ProvPackage.START__STARTER:
				return getStarter();
			case ProvPackage.START__TIME:
				return getTime();
			case ProvPackage.START__LABEL:
				return getLabel();
			case ProvPackage.START__LOCATION:
				return getLocation();
			case ProvPackage.START__ROLE:
				return getRole();
			case ProvPackage.START__TYPE:
				return getType();
			case ProvPackage.START__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ProvPackage.START__ID:
				return getId();
			case ProvPackage.START__ANY_ATTRIBUTE:
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
			case ProvPackage.START__ACTIVITY:
				setActivity((IDRef)newValue);
				return;
			case ProvPackage.START__TRIGGER:
				setTrigger((IDRef)newValue);
				return;
			case ProvPackage.START__STARTER:
				setStarter((IDRef)newValue);
				return;
			case ProvPackage.START__TIME:
				setTime((XMLGregorianCalendar)newValue);
				return;
			case ProvPackage.START__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends InternationalizedString>)newValue);
				return;
			case ProvPackage.START__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.START__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.START__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.START__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ProvPackage.START__ID:
				setId((QName)newValue);
				return;
			case ProvPackage.START__ANY_ATTRIBUTE:
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
			case ProvPackage.START__ACTIVITY:
				setActivity((IDRef)null);
				return;
			case ProvPackage.START__TRIGGER:
				setTrigger((IDRef)null);
				return;
			case ProvPackage.START__STARTER:
				setStarter((IDRef)null);
				return;
			case ProvPackage.START__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ProvPackage.START__LABEL:
				getLabel().clear();
				return;
			case ProvPackage.START__LOCATION:
				getLocation().clear();
				return;
			case ProvPackage.START__ROLE:
				getRole().clear();
				return;
			case ProvPackage.START__TYPE:
				getType().clear();
				return;
			case ProvPackage.START__ANY:
				getAny().clear();
				return;
			case ProvPackage.START__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.START__ANY_ATTRIBUTE:
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
			case ProvPackage.START__ACTIVITY:
				return activity != null;
			case ProvPackage.START__TRIGGER:
				return trigger != null;
			case ProvPackage.START__STARTER:
				return starter != null;
			case ProvPackage.START__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ProvPackage.START__LABEL:
				return label != null && !label.isEmpty();
			case ProvPackage.START__LOCATION:
				return location != null && !location.isEmpty();
			case ProvPackage.START__ROLE:
				return role != null && !role.isEmpty();
			case ProvPackage.START__TYPE:
				return type != null && !type.isEmpty();
			case ProvPackage.START__ANY:
				return any != null && !any.isEmpty();
			case ProvPackage.START__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.START__ANY_ATTRIBUTE:
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

} //StartImpl
