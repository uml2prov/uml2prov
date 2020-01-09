/**
 */
package es.unirioja.uml2prov.xtend.properties.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.unirioja.uml2prov.xtend.properties.Document;
import es.unirioja.uml2prov.xtend.properties.PropertiesDocument;
import es.unirioja.uml2prov.xtend.properties.PropertiesPackage;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link properties.impl.DocumentImpl#getPropertiesDocument <em>Properties Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The cached value of the '{@link #getPropertiesDocument() <em>Properties Document</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertiesDocument> propertiesDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertiesDocument> getPropertiesDocument() {
		if (propertiesDocument == null) {
			propertiesDocument = new EObjectResolvingEList<PropertiesDocument>(PropertiesDocument.class, this, PropertiesPackage.DOCUMENT__PROPERTIES_DOCUMENT);
		}
		return propertiesDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PropertiesPackage.DOCUMENT__PROPERTIES_DOCUMENT:
				return getPropertiesDocument();
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
			case PropertiesPackage.DOCUMENT__PROPERTIES_DOCUMENT:
				getPropertiesDocument().clear();
				getPropertiesDocument().addAll((Collection<? extends PropertiesDocument>)newValue);
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
			case PropertiesPackage.DOCUMENT__PROPERTIES_DOCUMENT:
				getPropertiesDocument().clear();
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
			case PropertiesPackage.DOCUMENT__PROPERTIES_DOCUMENT:
				return propertiesDocument != null && !propertiesDocument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentImpl
