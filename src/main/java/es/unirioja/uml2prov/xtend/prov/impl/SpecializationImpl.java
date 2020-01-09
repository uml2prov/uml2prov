/**
 */
package es.unirioja.uml2prov.xtend.prov.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import es.unirioja.uml2prov.xtend.prov.IDRef;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;
import es.unirioja.uml2prov.xtend.prov.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.SpecializationImpl#getSpecificEntity <em>Specific Entity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.SpecializationImpl#getGeneralEntity <em>General Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The cached value of the '{@link #getSpecificEntity() <em>Specific Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificEntity()
	 * @generated
	 * @ordered
	 */
	protected IDRef specificEntity;

	/**
	 * The cached value of the '{@link #getGeneralEntity() <em>General Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralEntity()
	 * @generated
	 * @ordered
	 */
	protected IDRef generalEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getSpecificEntity() {
		return specificEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificEntity(IDRef newSpecificEntity, NotificationChain msgs) {
		IDRef oldSpecificEntity = specificEntity;
		specificEntity = newSpecificEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY, oldSpecificEntity, newSpecificEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificEntity(IDRef newSpecificEntity) {
		if (newSpecificEntity != specificEntity) {
			NotificationChain msgs = null;
			if (specificEntity != null)
				msgs = ((InternalEObject)specificEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY, null, msgs);
			if (newSpecificEntity != null)
				msgs = ((InternalEObject)newSpecificEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY, null, msgs);
			msgs = basicSetSpecificEntity(newSpecificEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY, newSpecificEntity, newSpecificEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getGeneralEntity() {
		return generalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralEntity(IDRef newGeneralEntity, NotificationChain msgs) {
		IDRef oldGeneralEntity = generalEntity;
		generalEntity = newGeneralEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.SPECIALIZATION__GENERAL_ENTITY, oldGeneralEntity, newGeneralEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralEntity(IDRef newGeneralEntity) {
		if (newGeneralEntity != generalEntity) {
			NotificationChain msgs = null;
			if (generalEntity != null)
				msgs = ((InternalEObject)generalEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.SPECIALIZATION__GENERAL_ENTITY, null, msgs);
			if (newGeneralEntity != null)
				msgs = ((InternalEObject)newGeneralEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.SPECIALIZATION__GENERAL_ENTITY, null, msgs);
			msgs = basicSetGeneralEntity(newGeneralEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.SPECIALIZATION__GENERAL_ENTITY, newGeneralEntity, newGeneralEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY:
				return basicSetSpecificEntity(null, msgs);
			case ProvPackage.SPECIALIZATION__GENERAL_ENTITY:
				return basicSetGeneralEntity(null, msgs);
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
			case ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY:
				return getSpecificEntity();
			case ProvPackage.SPECIALIZATION__GENERAL_ENTITY:
				return getGeneralEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY:
				setSpecificEntity((IDRef)newValue);
				return;
			case ProvPackage.SPECIALIZATION__GENERAL_ENTITY:
				setGeneralEntity((IDRef)newValue);
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
			case ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY:
				setSpecificEntity((IDRef)null);
				return;
			case ProvPackage.SPECIALIZATION__GENERAL_ENTITY:
				setGeneralEntity((IDRef)null);
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
			case ProvPackage.SPECIALIZATION__SPECIFIC_ENTITY:
				return specificEntity != null;
			case ProvPackage.SPECIALIZATION__GENERAL_ENTITY:
				return generalEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializationImpl
