/**
 */
package xtendCode.prov.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xtendCode.prov.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvFactoryImpl extends EFactoryImpl implements ProvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProvFactory init() {
		try {
			ProvFactory theProvFactory = (ProvFactory)EPackage.Registry.INSTANCE.getEFactory(ProvPackage.eNS_URI);
			if (theProvFactory != null) {
				return theProvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProvPackage.ACTIVITY: return createActivity();
			case ProvPackage.AGENT: return createAgent();
			case ProvPackage.ALTERNATE: return createAlternate();
			case ProvPackage.ASSOCIATION: return createAssociation();
			case ProvPackage.ATTRIBUTION: return createAttribution();
			case ProvPackage.BUNDLE: return createBundle();
			case ProvPackage.BUNDLE_CONSTRUCTOR: return createBundleConstructor();
			case ProvPackage.COLLECTION: return createCollection();
			case ProvPackage.COMMUNICATION: return createCommunication();
			case ProvPackage.DELEGATION: return createDelegation();
			case ProvPackage.DERIVATION: return createDerivation();
			case ProvPackage.DOCUMENT: return createDocument();
			case ProvPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ProvPackage.EMPTY_COLLECTION: return createEmptyCollection();
			case ProvPackage.END: return createEnd();
			case ProvPackage.ENTITY: return createEntity();
			case ProvPackage.GENERATION: return createGeneration();
			case ProvPackage.ID_REF: return createIDRef();
			case ProvPackage.INFLUENCE: return createInfluence();
			case ProvPackage.INTERNATIONALIZED_STRING: return createInternationalizedString();
			case ProvPackage.INVALIDATION: return createInvalidation();
			case ProvPackage.MEMBERSHIP: return createMembership();
			case ProvPackage.ORGANIZATION: return createOrganization();
			case ProvPackage.OTHER: return createOther();
			case ProvPackage.PERSON: return createPerson();
			case ProvPackage.PLAN: return createPlan();
			case ProvPackage.PRIMARY_SOURCE: return createPrimarySource();
			case ProvPackage.QUOTATION: return createQuotation();
			case ProvPackage.REVISION: return createRevision();
			case ProvPackage.SOFTWARE_AGENT: return createSoftwareAgent();
			case ProvPackage.SPECIALIZATION: return createSpecialization();
			case ProvPackage.START: return createStart();
			case ProvPackage.USAGE: return createUsage();
			case ProvPackage.PATTRIBUTE: return createPAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternate createAlternate() {
		AlternateImpl alternate = new AlternateImpl();
		return alternate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribution createAttribution() {
		AttributionImpl attribution = new AttributionImpl();
		return attribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle createBundle() {
		BundleImpl bundle = new BundleImpl();
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleConstructor createBundleConstructor() {
		BundleConstructorImpl bundleConstructor = new BundleConstructorImpl();
		return bundleConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication createCommunication() {
		CommunicationImpl communication = new CommunicationImpl();
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation createDelegation() {
		DelegationImpl delegation = new DelegationImpl();
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derivation createDerivation() {
		DerivationImpl derivation = new DerivationImpl();
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyCollection createEmptyCollection() {
		EmptyCollectionImpl emptyCollection = new EmptyCollectionImpl();
		return emptyCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation createGeneration() {
		GenerationImpl generation = new GenerationImpl();
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDRef createIDRef() {
		IDRefImpl idRef = new IDRefImpl();
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Influence createInfluence() {
		InfluenceImpl influence = new InfluenceImpl();
		return influence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternationalizedString createInternationalizedString() {
		InternationalizedStringImpl internationalizedString = new InternationalizedStringImpl();
		return internationalizedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invalidation createInvalidation() {
		InvalidationImpl invalidation = new InvalidationImpl();
		return invalidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership createMembership() {
		MembershipImpl membership = new MembershipImpl();
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Other createOther() {
		OtherImpl other = new OtherImpl();
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimarySource createPrimarySource() {
		PrimarySourceImpl primarySource = new PrimarySourceImpl();
		return primarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quotation createQuotation() {
		QuotationImpl quotation = new QuotationImpl();
		return quotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAgent createSoftwareAgent() {
		SoftwareAgentImpl softwareAgent = new SoftwareAgentImpl();
		return softwareAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAttribute createPAttribute() {
		PAttributeImpl pAttribute = new PAttributeImpl();
		return pAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvPackage getProvPackage() {
		return (ProvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProvPackage getPackage() {
		return ProvPackage.eINSTANCE;
	}

} //ProvFactoryImpl
