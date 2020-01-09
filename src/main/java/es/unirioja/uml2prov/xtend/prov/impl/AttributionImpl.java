/**
 */
package es.unirioja.uml2prov.xtend.prov.impl;

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

import es.unirioja.uml2prov.xtend.prov.Attribution;
import es.unirioja.uml2prov.xtend.prov.IDRef;
import es.unirioja.uml2prov.xtend.prov.InternationalizedString;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.AttributionImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AttributionImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AttributionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AttributionImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AttributionImpl#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AttributionImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AttributionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributionImpl extends MinimalEObjectImpl.Container implements Attribution {
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
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected IDRef agent;

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
	protected AttributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.ATTRIBUTION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.ATTRIBUTION__ENTITY, oldEntity, newEntity);
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
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ATTRIBUTION__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ATTRIBUTION__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.ATTRIBUTION__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(IDRef newAgent, NotificationChain msgs) {
		IDRef oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.ATTRIBUTION__AGENT, oldAgent, newAgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(IDRef newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ATTRIBUTION__AGENT, null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ATTRIBUTION__AGENT, null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.ATTRIBUTION__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternationalizedString> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<InternationalizedString>(InternationalizedString.class, this, ProvPackage.ATTRIBUTION__LABEL);
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
			type = new EDataTypeEList<Object>(Object.class, this, ProvPackage.ATTRIBUTION__TYPE);
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
			any = new BasicFeatureMap(this, ProvPackage.ATTRIBUTION__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.ATTRIBUTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAttribute> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EObjectContainmentEList<PAttribute>(PAttribute.class, this, ProvPackage.ATTRIBUTION__ANY_ATTRIBUTE);
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
			case ProvPackage.ATTRIBUTION__ENTITY:
				return basicSetEntity(null, msgs);
			case ProvPackage.ATTRIBUTION__AGENT:
				return basicSetAgent(null, msgs);
			case ProvPackage.ATTRIBUTION__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ProvPackage.ATTRIBUTION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ProvPackage.ATTRIBUTION__ANY_ATTRIBUTE:
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
			case ProvPackage.ATTRIBUTION__ENTITY:
				return getEntity();
			case ProvPackage.ATTRIBUTION__AGENT:
				return getAgent();
			case ProvPackage.ATTRIBUTION__LABEL:
				return getLabel();
			case ProvPackage.ATTRIBUTION__TYPE:
				return getType();
			case ProvPackage.ATTRIBUTION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ProvPackage.ATTRIBUTION__ID:
				return getId();
			case ProvPackage.ATTRIBUTION__ANY_ATTRIBUTE:
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
			case ProvPackage.ATTRIBUTION__ENTITY:
				setEntity((IDRef)newValue);
				return;
			case ProvPackage.ATTRIBUTION__AGENT:
				setAgent((IDRef)newValue);
				return;
			case ProvPackage.ATTRIBUTION__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends InternationalizedString>)newValue);
				return;
			case ProvPackage.ATTRIBUTION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.ATTRIBUTION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ProvPackage.ATTRIBUTION__ID:
				setId((QName)newValue);
				return;
			case ProvPackage.ATTRIBUTION__ANY_ATTRIBUTE:
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
			case ProvPackage.ATTRIBUTION__ENTITY:
				setEntity((IDRef)null);
				return;
			case ProvPackage.ATTRIBUTION__AGENT:
				setAgent((IDRef)null);
				return;
			case ProvPackage.ATTRIBUTION__LABEL:
				getLabel().clear();
				return;
			case ProvPackage.ATTRIBUTION__TYPE:
				getType().clear();
				return;
			case ProvPackage.ATTRIBUTION__ANY:
				getAny().clear();
				return;
			case ProvPackage.ATTRIBUTION__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.ATTRIBUTION__ANY_ATTRIBUTE:
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
			case ProvPackage.ATTRIBUTION__ENTITY:
				return entity != null;
			case ProvPackage.ATTRIBUTION__AGENT:
				return agent != null;
			case ProvPackage.ATTRIBUTION__LABEL:
				return label != null && !label.isEmpty();
			case ProvPackage.ATTRIBUTION__TYPE:
				return type != null && !type.isEmpty();
			case ProvPackage.ATTRIBUTION__ANY:
				return any != null && !any.isEmpty();
			case ProvPackage.ATTRIBUTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.ATTRIBUTION__ANY_ATTRIBUTE:
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

} //AttributionImpl
