/**
 */
package es.unirioja.uml2prov.xtend.prov.impl;

import java.util.Collection;

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

import es.unirioja.uml2prov.xtend.prov.Agent;
import es.unirioja.uml2prov.xtend.prov.InternationalizedString;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.AgentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AgentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AgentImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AgentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AgentImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AgentImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent {
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
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternationalizedString> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<InternationalizedString>(InternationalizedString.class, this, ProvPackage.AGENT__LABEL);
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
			location = new EDataTypeEList<Object>(Object.class, this, ProvPackage.AGENT__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getType() {
		if (type == null) {
			type = new EDataTypeEList<Object>(Object.class, this, ProvPackage.AGENT__TYPE);
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
			any = new BasicFeatureMap(this, ProvPackage.AGENT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.AGENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAttribute> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EObjectContainmentEList<PAttribute>(PAttribute.class, this, ProvPackage.AGENT__ANY_ATTRIBUTE);
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
			case ProvPackage.AGENT__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ProvPackage.AGENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ProvPackage.AGENT__ANY_ATTRIBUTE:
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
			case ProvPackage.AGENT__LABEL:
				return getLabel();
			case ProvPackage.AGENT__LOCATION:
				return getLocation();
			case ProvPackage.AGENT__TYPE:
				return getType();
			case ProvPackage.AGENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ProvPackage.AGENT__ID:
				return getId();
			case ProvPackage.AGENT__ANY_ATTRIBUTE:
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
			case ProvPackage.AGENT__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends InternationalizedString>)newValue);
				return;
			case ProvPackage.AGENT__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.AGENT__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.AGENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ProvPackage.AGENT__ID:
				setId((String)newValue);
				return;
			case ProvPackage.AGENT__ANY_ATTRIBUTE:
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
			case ProvPackage.AGENT__LABEL:
				getLabel().clear();
				return;
			case ProvPackage.AGENT__LOCATION:
				getLocation().clear();
				return;
			case ProvPackage.AGENT__TYPE:
				getType().clear();
				return;
			case ProvPackage.AGENT__ANY:
				getAny().clear();
				return;
			case ProvPackage.AGENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.AGENT__ANY_ATTRIBUTE:
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
			case ProvPackage.AGENT__LABEL:
				return label != null && !label.isEmpty();
			case ProvPackage.AGENT__LOCATION:
				return location != null && !location.isEmpty();
			case ProvPackage.AGENT__TYPE:
				return type != null && !type.isEmpty();
			case ProvPackage.AGENT__ANY:
				return any != null && !any.isEmpty();
			case ProvPackage.AGENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.AGENT__ANY_ATTRIBUTE:
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
		result.append(" (location: ");
		result.append(location);
		result.append(", type: ");
		result.append(type);
		result.append(", any: ");
		result.append(any);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
