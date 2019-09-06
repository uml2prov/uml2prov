/**
 */
package xtendCode.prov.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import xtendCode.prov.Activity;
import xtendCode.prov.Agent;
import xtendCode.prov.Alternate;
import xtendCode.prov.Association;
import xtendCode.prov.Attribution;
import xtendCode.prov.Bundle;
import xtendCode.prov.Collection;
import xtendCode.prov.Communication;
import xtendCode.prov.Delegation;
import xtendCode.prov.Derivation;
import xtendCode.prov.Document;
import xtendCode.prov.DocumentRoot;
import xtendCode.prov.EmptyCollection;
import xtendCode.prov.End;
import xtendCode.prov.Entity;
import xtendCode.prov.Generation;
import xtendCode.prov.Influence;
import xtendCode.prov.InternationalizedString;
import xtendCode.prov.Invalidation;
import xtendCode.prov.Membership;
import xtendCode.prov.Organization;
import xtendCode.prov.Other;
import xtendCode.prov.Person;
import xtendCode.prov.Plan;
import xtendCode.prov.PrimarySource;
import xtendCode.prov.ProvPackage;
import xtendCode.prov.Quotation;
import xtendCode.prov.Revision;
import xtendCode.prov.SoftwareAgent;
import xtendCode.prov.Specialization;
import xtendCode.prov.Start;
import xtendCode.prov.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getActedOnBehalfOf <em>Acted On Behalf Of</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getAlternateOf <em>Alternate Of</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getEmptyCollection <em>Empty Collection</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getHadMember <em>Had Member</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getHadPrimarySource <em>Had Primary Source</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getOther <em>Other</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getSoftwareAgent <em>Software Agent</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getSpecializationOf <em>Specialization Of</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getUsed <em>Used</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasAssociatedWith <em>Was Associated With</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasAttributedTo <em>Was Attributed To</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasDerivedFrom <em>Was Derived From</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasEndedBy <em>Was Ended By</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasGeneratedBy <em>Was Generated By</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasInfluencedBy <em>Was Influenced By</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasInformedBy <em>Was Informed By</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasInvalidatedBy <em>Was Invalidated By</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasQuotedFrom <em>Was Quoted From</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasRevisionOf <em>Was Revision Of</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getWasStartedBy <em>Was Started By</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link xtendCode.prov.impl.DocumentRootImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Object ROLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

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
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected QName ref = REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProvPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ProvPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ProvPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ProvPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation getActedOnBehalfOf() {
		return (Delegation)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActedOnBehalfOf(Delegation newActedOnBehalfOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF, newActedOnBehalfOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActedOnBehalfOf(Delegation newActedOnBehalfOf) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF, newActedOnBehalfOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return (Activity)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__ACTIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__ACTIVITY, newActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__ACTIVITY, newActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAgent() {
		return (Agent)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__AGENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__AGENT, newAgent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Agent newAgent) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__AGENT, newAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternate getAlternateOf() {
		return (Alternate)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__ALTERNATE_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternateOf(Alternate newAlternateOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__ALTERNATE_OF, newAlternateOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternateOf(Alternate newAlternateOf) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__ALTERNATE_OF, newAlternateOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getBundle() {
		return (Bundle)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__BUNDLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundle(Bundle newBundle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__BUNDLE, newBundle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(Bundle newBundle) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__BUNDLE, newBundle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getCollection() {
		return (Collection)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(Collection newCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__COLLECTION, newCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(Collection newCollection) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__COLLECTION, newCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocument() {
		return getMixed().list(ProvPackage.Literals.DOCUMENT_ROOT__DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyCollection getEmptyCollection() {
		return (EmptyCollection)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__EMPTY_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyCollection(EmptyCollection newEmptyCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__EMPTY_COLLECTION, newEmptyCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyCollection(EmptyCollection newEmptyCollection) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__EMPTY_COLLECTION, newEmptyCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership getHadMember() {
		return (Membership)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__HAD_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHadMember(Membership newHadMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__HAD_MEMBER, newHadMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHadMember(Membership newHadMember) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__HAD_MEMBER, newHadMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimarySource getHadPrimarySource() {
		return (PrimarySource)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHadPrimarySource(PrimarySource newHadPrimarySource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE, newHadPrimarySource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHadPrimarySource(PrimarySource newHadPrimarySource) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE, newHadPrimarySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		return (Entity)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__ENTITY, newEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getInternalElement() {
		return (EObject)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__INTERNAL_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalElement(EObject newInternalElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__INTERNAL_ELEMENT, newInternalElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalizedString getLabel() {
		return (InternationalizedString)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(InternationalizedString newLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(InternationalizedString newLabel) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLocation() {
		return getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Object newLocation) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		return (Organization)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Other getOther() {
		return (Other)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__OTHER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOther(Other newOther, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__OTHER, newOther, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(Other newOther) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__OTHER, newOther);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		return (Person)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__PERSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__PERSON, newPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__PERSON, newPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getPlan() {
		return (Plan)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__PLAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(Plan newPlan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__PLAN, newPlan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(Plan newPlan) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__PLAN, newPlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRole() {
		return getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Object newRole) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAgent getSoftwareAgent() {
		return (SoftwareAgent)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__SOFTWARE_AGENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareAgent(SoftwareAgent newSoftwareAgent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__SOFTWARE_AGENT, newSoftwareAgent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareAgent(SoftwareAgent newSoftwareAgent) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__SOFTWARE_AGENT, newSoftwareAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getSpecializationOf() {
		return (Specialization)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__SPECIALIZATION_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializationOf(Specialization newSpecializationOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__SPECIALIZATION_OF, newSpecializationOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializationOf(Specialization newSpecializationOf) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__SPECIALIZATION_OF, newSpecializationOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage getUsed() {
		return (Usage)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__USED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsed(Usage newUsed, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__USED, newUsed, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsed(Usage newUsed) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__USED, newUsed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getWasAssociatedWith() {
		return (Association)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasAssociatedWith(Association newWasAssociatedWith, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH, newWasAssociatedWith, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasAssociatedWith(Association newWasAssociatedWith) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH, newWasAssociatedWith);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribution getWasAttributedTo() {
		return (Attribution)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasAttributedTo(Attribution newWasAttributedTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO, newWasAttributedTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasAttributedTo(Attribution newWasAttributedTo) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO, newWasAttributedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derivation getWasDerivedFrom() {
		return (Derivation)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_DERIVED_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasDerivedFrom(Derivation newWasDerivedFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_DERIVED_FROM, newWasDerivedFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasDerivedFrom(Derivation newWasDerivedFrom) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_DERIVED_FROM, newWasDerivedFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getWasEndedBy() {
		return (End)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ENDED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasEndedBy(End newWasEndedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ENDED_BY, newWasEndedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasEndedBy(End newWasEndedBy) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_ENDED_BY, newWasEndedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation getWasGeneratedBy() {
		return (Generation)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_GENERATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasGeneratedBy(Generation newWasGeneratedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_GENERATED_BY, newWasGeneratedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasGeneratedBy(Generation newWasGeneratedBy) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_GENERATED_BY, newWasGeneratedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Influence getWasInfluencedBy() {
		return (Influence)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INFLUENCED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasInfluencedBy(Influence newWasInfluencedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INFLUENCED_BY, newWasInfluencedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasInfluencedBy(Influence newWasInfluencedBy) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INFLUENCED_BY, newWasInfluencedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication getWasInformedBy() {
		return (Communication)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INFORMED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasInformedBy(Communication newWasInformedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INFORMED_BY, newWasInformedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasInformedBy(Communication newWasInformedBy) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INFORMED_BY, newWasInformedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invalidation getWasInvalidatedBy() {
		return (Invalidation)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INVALIDATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasInvalidatedBy(Invalidation newWasInvalidatedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INVALIDATED_BY, newWasInvalidatedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasInvalidatedBy(Invalidation newWasInvalidatedBy) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_INVALIDATED_BY, newWasInvalidatedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quotation getWasQuotedFrom() {
		return (Quotation)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_QUOTED_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasQuotedFrom(Quotation newWasQuotedFrom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_QUOTED_FROM, newWasQuotedFrom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasQuotedFrom(Quotation newWasQuotedFrom) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_QUOTED_FROM, newWasQuotedFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getWasRevisionOf() {
		return (Revision)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_REVISION_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasRevisionOf(Revision newWasRevisionOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_REVISION_OF, newWasRevisionOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasRevisionOf(Revision newWasRevisionOf) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_REVISION_OF, newWasRevisionOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getWasStartedBy() {
		return (Start)getMixed().get(ProvPackage.Literals.DOCUMENT_ROOT__WAS_STARTED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWasStartedBy(Start newWasStartedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ProvPackage.Literals.DOCUMENT_ROOT__WAS_STARTED_BY, newWasStartedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWasStartedBy(Start newWasStartedBy) {
		((FeatureMap.Internal)getMixed()).set(ProvPackage.Literals.DOCUMENT_ROOT__WAS_STARTED_BY, newWasStartedBy);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(QName newRef) {
		QName oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProvPackage.DOCUMENT_ROOT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProvPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ProvPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ProvPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ProvPackage.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF:
				return basicSetActedOnBehalfOf(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__ACTIVITY:
				return basicSetActivity(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__AGENT:
				return basicSetAgent(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__ALTERNATE_OF:
				return basicSetAlternateOf(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__BUNDLE:
				return basicSetBundle(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__COLLECTION:
				return basicSetCollection(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
			case ProvPackage.DOCUMENT_ROOT__EMPTY_COLLECTION:
				return basicSetEmptyCollection(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__HAD_MEMBER:
				return basicSetHadMember(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE:
				return basicSetHadPrimarySource(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__ENTITY:
				return basicSetEntity(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__INTERNAL_ELEMENT:
				return basicSetInternalElement(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__LABEL:
				return basicSetLabel(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__OTHER:
				return basicSetOther(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__PERSON:
				return basicSetPerson(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__PLAN:
				return basicSetPlan(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__SOFTWARE_AGENT:
				return basicSetSoftwareAgent(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__SPECIALIZATION_OF:
				return basicSetSpecializationOf(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__USED:
				return basicSetUsed(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH:
				return basicSetWasAssociatedWith(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO:
				return basicSetWasAttributedTo(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_DERIVED_FROM:
				return basicSetWasDerivedFrom(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_ENDED_BY:
				return basicSetWasEndedBy(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_GENERATED_BY:
				return basicSetWasGeneratedBy(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_INFLUENCED_BY:
				return basicSetWasInfluencedBy(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_INFORMED_BY:
				return basicSetWasInformedBy(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_INVALIDATED_BY:
				return basicSetWasInvalidatedBy(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_QUOTED_FROM:
				return basicSetWasQuotedFrom(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_REVISION_OF:
				return basicSetWasRevisionOf(null, msgs);
			case ProvPackage.DOCUMENT_ROOT__WAS_STARTED_BY:
				return basicSetWasStartedBy(null, msgs);
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
			case ProvPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ProvPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ProvPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ProvPackage.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF:
				return getActedOnBehalfOf();
			case ProvPackage.DOCUMENT_ROOT__ACTIVITY:
				return getActivity();
			case ProvPackage.DOCUMENT_ROOT__AGENT:
				return getAgent();
			case ProvPackage.DOCUMENT_ROOT__ALTERNATE_OF:
				return getAlternateOf();
			case ProvPackage.DOCUMENT_ROOT__BUNDLE:
				return getBundle();
			case ProvPackage.DOCUMENT_ROOT__COLLECTION:
				return getCollection();
			case ProvPackage.DOCUMENT_ROOT__DOCUMENT:
				return getDocument();
			case ProvPackage.DOCUMENT_ROOT__EMPTY_COLLECTION:
				return getEmptyCollection();
			case ProvPackage.DOCUMENT_ROOT__HAD_MEMBER:
				return getHadMember();
			case ProvPackage.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE:
				return getHadPrimarySource();
			case ProvPackage.DOCUMENT_ROOT__ENTITY:
				return getEntity();
			case ProvPackage.DOCUMENT_ROOT__INTERNAL_ELEMENT:
				return getInternalElement();
			case ProvPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case ProvPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case ProvPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case ProvPackage.DOCUMENT_ROOT__OTHER:
				return getOther();
			case ProvPackage.DOCUMENT_ROOT__PERSON:
				return getPerson();
			case ProvPackage.DOCUMENT_ROOT__PLAN:
				return getPlan();
			case ProvPackage.DOCUMENT_ROOT__ROLE:
				return getRole();
			case ProvPackage.DOCUMENT_ROOT__SOFTWARE_AGENT:
				return getSoftwareAgent();
			case ProvPackage.DOCUMENT_ROOT__SPECIALIZATION_OF:
				return getSpecializationOf();
			case ProvPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case ProvPackage.DOCUMENT_ROOT__USED:
				return getUsed();
			case ProvPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case ProvPackage.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH:
				return getWasAssociatedWith();
			case ProvPackage.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO:
				return getWasAttributedTo();
			case ProvPackage.DOCUMENT_ROOT__WAS_DERIVED_FROM:
				return getWasDerivedFrom();
			case ProvPackage.DOCUMENT_ROOT__WAS_ENDED_BY:
				return getWasEndedBy();
			case ProvPackage.DOCUMENT_ROOT__WAS_GENERATED_BY:
				return getWasGeneratedBy();
			case ProvPackage.DOCUMENT_ROOT__WAS_INFLUENCED_BY:
				return getWasInfluencedBy();
			case ProvPackage.DOCUMENT_ROOT__WAS_INFORMED_BY:
				return getWasInformedBy();
			case ProvPackage.DOCUMENT_ROOT__WAS_INVALIDATED_BY:
				return getWasInvalidatedBy();
			case ProvPackage.DOCUMENT_ROOT__WAS_QUOTED_FROM:
				return getWasQuotedFrom();
			case ProvPackage.DOCUMENT_ROOT__WAS_REVISION_OF:
				return getWasRevisionOf();
			case ProvPackage.DOCUMENT_ROOT__WAS_STARTED_BY:
				return getWasStartedBy();
			case ProvPackage.DOCUMENT_ROOT__ID:
				return getId();
			case ProvPackage.DOCUMENT_ROOT__REF:
				return getRef();
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
			case ProvPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF:
				setActedOnBehalfOf((Delegation)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__AGENT:
				setAgent((Agent)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__ALTERNATE_OF:
				setAlternateOf((Alternate)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__COLLECTION:
				setCollection((Collection)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((java.util.Collection<? extends Document>)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__EMPTY_COLLECTION:
				setEmptyCollection((EmptyCollection)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__HAD_MEMBER:
				setHadMember((Membership)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE:
				setHadPrimarySource((PrimarySource)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__ENTITY:
				setEntity((Entity)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__LABEL:
				setLabel((InternationalizedString)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__LOCATION:
				setLocation(newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__OTHER:
				setOther((Other)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__PLAN:
				setPlan((Plan)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__ROLE:
				setRole(newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__SOFTWARE_AGENT:
				setSoftwareAgent((SoftwareAgent)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__SPECIALIZATION_OF:
				setSpecializationOf((Specialization)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__TYPE:
				setType(newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__USED:
				setUsed((Usage)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__VALUE:
				setValue(newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH:
				setWasAssociatedWith((Association)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO:
				setWasAttributedTo((Attribution)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_DERIVED_FROM:
				setWasDerivedFrom((Derivation)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_ENDED_BY:
				setWasEndedBy((End)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_GENERATED_BY:
				setWasGeneratedBy((Generation)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_INFLUENCED_BY:
				setWasInfluencedBy((Influence)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_INFORMED_BY:
				setWasInformedBy((Communication)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_INVALIDATED_BY:
				setWasInvalidatedBy((Invalidation)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_QUOTED_FROM:
				setWasQuotedFrom((Quotation)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_REVISION_OF:
				setWasRevisionOf((Revision)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_STARTED_BY:
				setWasStartedBy((Start)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case ProvPackage.DOCUMENT_ROOT__REF:
				setRef((QName)newValue);
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
			case ProvPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ProvPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ProvPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ProvPackage.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF:
				setActedOnBehalfOf((Delegation)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__ACTIVITY:
				setActivity((Activity)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__AGENT:
				setAgent((Agent)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__ALTERNATE_OF:
				setAlternateOf((Alternate)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__BUNDLE:
				setBundle((Bundle)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__COLLECTION:
				setCollection((Collection)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__DOCUMENT:
				getDocument().clear();
				return;
			case ProvPackage.DOCUMENT_ROOT__EMPTY_COLLECTION:
				setEmptyCollection((EmptyCollection)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__HAD_MEMBER:
				setHadMember((Membership)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE:
				setHadPrimarySource((PrimarySource)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__ENTITY:
				setEntity((Entity)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__LABEL:
				setLabel((InternationalizedString)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ProvPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__OTHER:
				setOther((Other)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__PLAN:
				setPlan((Plan)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ProvPackage.DOCUMENT_ROOT__SOFTWARE_AGENT:
				setSoftwareAgent((SoftwareAgent)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__SPECIALIZATION_OF:
				setSpecializationOf((Specialization)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProvPackage.DOCUMENT_ROOT__USED:
				setUsed((Usage)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH:
				setWasAssociatedWith((Association)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO:
				setWasAttributedTo((Attribution)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_DERIVED_FROM:
				setWasDerivedFrom((Derivation)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_ENDED_BY:
				setWasEndedBy((End)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_GENERATED_BY:
				setWasGeneratedBy((Generation)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_INFLUENCED_BY:
				setWasInfluencedBy((Influence)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_INFORMED_BY:
				setWasInformedBy((Communication)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_INVALIDATED_BY:
				setWasInvalidatedBy((Invalidation)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_QUOTED_FROM:
				setWasQuotedFrom((Quotation)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_REVISION_OF:
				setWasRevisionOf((Revision)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__WAS_STARTED_BY:
				setWasStartedBy((Start)null);
				return;
			case ProvPackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case ProvPackage.DOCUMENT_ROOT__REF:
				setRef(REF_EDEFAULT);
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
			case ProvPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ProvPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ProvPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ProvPackage.DOCUMENT_ROOT__ACTED_ON_BEHALF_OF:
				return getActedOnBehalfOf() != null;
			case ProvPackage.DOCUMENT_ROOT__ACTIVITY:
				return getActivity() != null;
			case ProvPackage.DOCUMENT_ROOT__AGENT:
				return getAgent() != null;
			case ProvPackage.DOCUMENT_ROOT__ALTERNATE_OF:
				return getAlternateOf() != null;
			case ProvPackage.DOCUMENT_ROOT__BUNDLE:
				return getBundle() != null;
			case ProvPackage.DOCUMENT_ROOT__COLLECTION:
				return getCollection() != null;
			case ProvPackage.DOCUMENT_ROOT__DOCUMENT:
				return !getDocument().isEmpty();
			case ProvPackage.DOCUMENT_ROOT__EMPTY_COLLECTION:
				return getEmptyCollection() != null;
			case ProvPackage.DOCUMENT_ROOT__HAD_MEMBER:
				return getHadMember() != null;
			case ProvPackage.DOCUMENT_ROOT__HAD_PRIMARY_SOURCE:
				return getHadPrimarySource() != null;
			case ProvPackage.DOCUMENT_ROOT__ENTITY:
				return getEntity() != null;
			case ProvPackage.DOCUMENT_ROOT__INTERNAL_ELEMENT:
				return getInternalElement() != null;
			case ProvPackage.DOCUMENT_ROOT__LABEL:
				return getLabel() != null;
			case ProvPackage.DOCUMENT_ROOT__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case ProvPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization() != null;
			case ProvPackage.DOCUMENT_ROOT__OTHER:
				return getOther() != null;
			case ProvPackage.DOCUMENT_ROOT__PERSON:
				return getPerson() != null;
			case ProvPackage.DOCUMENT_ROOT__PLAN:
				return getPlan() != null;
			case ProvPackage.DOCUMENT_ROOT__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
			case ProvPackage.DOCUMENT_ROOT__SOFTWARE_AGENT:
				return getSoftwareAgent() != null;
			case ProvPackage.DOCUMENT_ROOT__SPECIALIZATION_OF:
				return getSpecializationOf() != null;
			case ProvPackage.DOCUMENT_ROOT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case ProvPackage.DOCUMENT_ROOT__USED:
				return getUsed() != null;
			case ProvPackage.DOCUMENT_ROOT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case ProvPackage.DOCUMENT_ROOT__WAS_ASSOCIATED_WITH:
				return getWasAssociatedWith() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_ATTRIBUTED_TO:
				return getWasAttributedTo() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_DERIVED_FROM:
				return getWasDerivedFrom() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_ENDED_BY:
				return getWasEndedBy() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_GENERATED_BY:
				return getWasGeneratedBy() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_INFLUENCED_BY:
				return getWasInfluencedBy() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_INFORMED_BY:
				return getWasInformedBy() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_INVALIDATED_BY:
				return getWasInvalidatedBy() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_QUOTED_FROM:
				return getWasQuotedFrom() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_REVISION_OF:
				return getWasRevisionOf() != null;
			case ProvPackage.DOCUMENT_ROOT__WAS_STARTED_BY:
				return getWasStartedBy() != null;
			case ProvPackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProvPackage.DOCUMENT_ROOT__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", id: ");
		result.append(id);
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
