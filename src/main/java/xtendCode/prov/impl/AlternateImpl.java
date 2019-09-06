/**
 */
package xtendCode.prov.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtendCode.prov.Alternate;
import xtendCode.prov.IDRef;
import xtendCode.prov.ProvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.AlternateImpl#getAlternate1 <em>Alternate1</em>}</li>
 *   <li>{@link xtendCode.prov.impl.AlternateImpl#getAlternate2 <em>Alternate2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternateImpl extends MinimalEObjectImpl.Container implements Alternate {
	/**
	 * The cached value of the '{@link #getAlternate1() <em>Alternate1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternate1()
	 * @generated
	 * @ordered
	 */
	protected IDRef alternate1;

	/**
	 * The cached value of the '{@link #getAlternate2() <em>Alternate2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternate2()
	 * @generated
	 * @ordered
	 */
	protected IDRef alternate2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.ALTERNATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getAlternate1() {
		return alternate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternate1(IDRef newAlternate1, NotificationChain msgs) {
		IDRef oldAlternate1 = alternate1;
		alternate1 = newAlternate1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.ALTERNATE__ALTERNATE1, oldAlternate1, newAlternate1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternate1(IDRef newAlternate1) {
		if (newAlternate1 != alternate1) {
			NotificationChain msgs = null;
			if (alternate1 != null)
				msgs = ((InternalEObject)alternate1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ALTERNATE__ALTERNATE1, null, msgs);
			if (newAlternate1 != null)
				msgs = ((InternalEObject)newAlternate1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ALTERNATE__ALTERNATE1, null, msgs);
			msgs = basicSetAlternate1(newAlternate1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.ALTERNATE__ALTERNATE1, newAlternate1, newAlternate1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef getAlternate2() {
		return alternate2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternate2(IDRef newAlternate2, NotificationChain msgs) {
		IDRef oldAlternate2 = alternate2;
		alternate2 = newAlternate2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProvPackage.ALTERNATE__ALTERNATE2, oldAlternate2, newAlternate2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternate2(IDRef newAlternate2) {
		if (newAlternate2 != alternate2) {
			NotificationChain msgs = null;
			if (alternate2 != null)
				msgs = ((InternalEObject)alternate2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ALTERNATE__ALTERNATE2, null, msgs);
			if (newAlternate2 != null)
				msgs = ((InternalEObject)newAlternate2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProvPackage.ALTERNATE__ALTERNATE2, null, msgs);
			msgs = basicSetAlternate2(newAlternate2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.ALTERNATE__ALTERNATE2, newAlternate2, newAlternate2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvPackage.ALTERNATE__ALTERNATE1:
				return basicSetAlternate1(null, msgs);
			case ProvPackage.ALTERNATE__ALTERNATE2:
				return basicSetAlternate2(null, msgs);
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
			case ProvPackage.ALTERNATE__ALTERNATE1:
				return getAlternate1();
			case ProvPackage.ALTERNATE__ALTERNATE2:
				return getAlternate2();
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
			case ProvPackage.ALTERNATE__ALTERNATE1:
				setAlternate1((IDRef)newValue);
				return;
			case ProvPackage.ALTERNATE__ALTERNATE2:
				setAlternate2((IDRef)newValue);
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
			case ProvPackage.ALTERNATE__ALTERNATE1:
				setAlternate1((IDRef)null);
				return;
			case ProvPackage.ALTERNATE__ALTERNATE2:
				setAlternate2((IDRef)null);
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
			case ProvPackage.ALTERNATE__ALTERNATE1:
				return alternate1 != null;
			case ProvPackage.ALTERNATE__ALTERNATE2:
				return alternate2 != null;
		}
		return super.eIsSet(featureID);
	}

} //AlternateImpl
