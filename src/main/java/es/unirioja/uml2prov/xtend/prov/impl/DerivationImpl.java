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

import es.unirioja.uml2prov.xtend.prov.Derivation;
import es.unirioja.uml2prov.xtend.prov.IDRef;
import es.unirioja.uml2prov.xtend.prov.InternationalizedString;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getGeneratedEntity <em>Generated Entity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getUsedEntity <em>Used Entity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getGeneration <em>Generation</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DerivationImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivationImpl extends MinimalEObjectImpl.Container implements Derivation {
	/**
	 * The cached value of the '{@link #getGeneratedEntity() <em>Generated Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedEntity()
	 * @generated
	 * @ordered
	 */
	protected IDRef generatedEntity;

	/**
	 * The cached value of the '{@link #getUsedEntity() <em>Used Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedEntity()
	 * @generated
	 * @ordered
	 */
	protected IDRef usedEntity;

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
	 * The cached value of the '{@link #getGeneration() <em>Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected IDRef generation;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected IDRef usage;

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
	protected DerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getGeneratedEntity() {
		return generatedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratedEntity(IDRef newGeneratedEntity, NotificationChain msgs) {
		IDRef oldGeneratedEntity = generatedEntity;
		generatedEntity = newGeneratedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__GENERATED_ENTITY, oldGeneratedEntity, newGeneratedEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedEntity(IDRef newGeneratedEntity) {
		if (newGeneratedEntity != generatedEntity) {
			NotificationChain msgs = null;
			if (generatedEntity != null)
				msgs = ((InternalEObject)generatedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__GENERATED_ENTITY, null, msgs);
			if (newGeneratedEntity != null)
				msgs = ((InternalEObject)newGeneratedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__GENERATED_ENTITY, null, msgs);
			msgs = basicSetGeneratedEntity(newGeneratedEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__GENERATED_ENTITY, newGeneratedEntity, newGeneratedEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getUsedEntity() {
		return usedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedEntity(IDRef newUsedEntity, NotificationChain msgs) {
		IDRef oldUsedEntity = usedEntity;
		usedEntity = newUsedEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__USED_ENTITY, oldUsedEntity, newUsedEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedEntity(IDRef newUsedEntity) {
		if (newUsedEntity != usedEntity) {
			NotificationChain msgs = null;
			if (usedEntity != null)
				msgs = ((InternalEObject)usedEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__USED_ENTITY, null, msgs);
			if (newUsedEntity != null)
				msgs = ((InternalEObject)newUsedEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__USED_ENTITY, null, msgs);
			msgs = basicSetUsedEntity(newUsedEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__USED_ENTITY, newUsedEntity, newUsedEntity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__ACTIVITY, oldActivity, newActivity);
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
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getGeneration() {
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneration(IDRef newGeneration, NotificationChain msgs) {
		IDRef oldGeneration = generation;
		generation = newGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__GENERATION, oldGeneration, newGeneration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneration(IDRef newGeneration) {
		if (newGeneration != generation) {
			NotificationChain msgs = null;
			if (generation != null)
				msgs = ((InternalEObject)generation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__GENERATION, null, msgs);
			if (newGeneration != null)
				msgs = ((InternalEObject)newGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__GENERATION, null, msgs);
			msgs = basicSetGeneration(newGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__GENERATION, newGeneration, newGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsage(IDRef newUsage, NotificationChain msgs) {
		IDRef oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__USAGE, oldUsage, newUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(IDRef newUsage) {
		if (newUsage != usage) {
			NotificationChain msgs = null;
			if (usage != null)
				msgs = ((InternalEObject)usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__USAGE, null, msgs);
			if (newUsage != null)
				msgs = ((InternalEObject)newUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.DERIVATION__USAGE, null, msgs);
			msgs = basicSetUsage(newUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__USAGE, newUsage, newUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternationalizedString> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<InternationalizedString>(InternationalizedString.class, this, ProvPackage.DERIVATION__LABEL);
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
			type = new EDataTypeEList<Object>(Object.class, this, ProvPackage.DERIVATION__TYPE);
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
			any = new BasicFeatureMap(this, ProvPackage.DERIVATION__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DERIVATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PAttribute> getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new EObjectContainmentEList<PAttribute>(PAttribute.class, this, ProvPackage.DERIVATION__ANY_ATTRIBUTE);
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
			case ProvPackage.DERIVATION__GENERATED_ENTITY:
				return basicSetGeneratedEntity(null, msgs);
			case ProvPackage.DERIVATION__USED_ENTITY:
				return basicSetUsedEntity(null, msgs);
			case ProvPackage.DERIVATION__ACTIVITY:
				return basicSetActivity(null, msgs);
			case ProvPackage.DERIVATION__GENERATION:
				return basicSetGeneration(null, msgs);
			case ProvPackage.DERIVATION__USAGE:
				return basicSetUsage(null, msgs);
			case ProvPackage.DERIVATION__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case ProvPackage.DERIVATION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ProvPackage.DERIVATION__ANY_ATTRIBUTE:
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
			case ProvPackage.DERIVATION__GENERATED_ENTITY:
				return getGeneratedEntity();
			case ProvPackage.DERIVATION__USED_ENTITY:
				return getUsedEntity();
			case ProvPackage.DERIVATION__ACTIVITY:
				return getActivity();
			case ProvPackage.DERIVATION__GENERATION:
				return getGeneration();
			case ProvPackage.DERIVATION__USAGE:
				return getUsage();
			case ProvPackage.DERIVATION__LABEL:
				return getLabel();
			case ProvPackage.DERIVATION__TYPE:
				return getType();
			case ProvPackage.DERIVATION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ProvPackage.DERIVATION__ID:
				return getId();
			case ProvPackage.DERIVATION__ANY_ATTRIBUTE:
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
			case ProvPackage.DERIVATION__GENERATED_ENTITY:
				setGeneratedEntity((IDRef)newValue);
				return;
			case ProvPackage.DERIVATION__USED_ENTITY:
				setUsedEntity((IDRef)newValue);
				return;
			case ProvPackage.DERIVATION__ACTIVITY:
				setActivity((IDRef)newValue);
				return;
			case ProvPackage.DERIVATION__GENERATION:
				setGeneration((IDRef)newValue);
				return;
			case ProvPackage.DERIVATION__USAGE:
				setUsage((IDRef)newValue);
				return;
			case ProvPackage.DERIVATION__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends InternationalizedString>)newValue);
				return;
			case ProvPackage.DERIVATION__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Object>)newValue);
				return;
			case ProvPackage.DERIVATION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ProvPackage.DERIVATION__ID:
				setId((QName)newValue);
				return;
			case ProvPackage.DERIVATION__ANY_ATTRIBUTE:
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
			case ProvPackage.DERIVATION__GENERATED_ENTITY:
				setGeneratedEntity((IDRef)null);
				return;
			case ProvPackage.DERIVATION__USED_ENTITY:
				setUsedEntity((IDRef)null);
				return;
			case ProvPackage.DERIVATION__ACTIVITY:
				setActivity((IDRef)null);
				return;
			case ProvPackage.DERIVATION__GENERATION:
				setGeneration((IDRef)null);
				return;
			case ProvPackage.DERIVATION__USAGE:
				setUsage((IDRef)null);
				return;
			case ProvPackage.DERIVATION__LABEL:
				getLabel().clear();
				return;
			case ProvPackage.DERIVATION__TYPE:
				getType().clear();
				return;
			case ProvPackage.DERIVATION__ANY:
				getAny().clear();
				return;
			case ProvPackage.DERIVATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.DERIVATION__ANY_ATTRIBUTE:
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
			case ProvPackage.DERIVATION__GENERATED_ENTITY:
				return generatedEntity != null;
			case ProvPackage.DERIVATION__USED_ENTITY:
				return usedEntity != null;
			case ProvPackage.DERIVATION__ACTIVITY:
				return activity != null;
			case ProvPackage.DERIVATION__GENERATION:
				return generation != null;
			case ProvPackage.DERIVATION__USAGE:
				return usage != null;
			case ProvPackage.DERIVATION__LABEL:
				return label != null && !label.isEmpty();
			case ProvPackage.DERIVATION__TYPE:
				return type != null && !type.isEmpty();
			case ProvPackage.DERIVATION__ANY:
				return any != null && !any.isEmpty();
			case ProvPackage.DERIVATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.DERIVATION__ANY_ATTRIBUTE:
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

} //DerivationImpl
