/**
 */
package es.unirioja.uml2prov.xtend.prov.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import es.unirioja.uml2prov.xtend.prov.Activity;
import es.unirioja.uml2prov.xtend.prov.Agent;
import es.unirioja.uml2prov.xtend.prov.Alternate;
import es.unirioja.uml2prov.xtend.prov.Association;
import es.unirioja.uml2prov.xtend.prov.Attribution;
import es.unirioja.uml2prov.xtend.prov.Bundle;
import es.unirioja.uml2prov.xtend.prov.BundleConstructor;
import es.unirioja.uml2prov.xtend.prov.Collection;
import es.unirioja.uml2prov.xtend.prov.Communication;
import es.unirioja.uml2prov.xtend.prov.Delegation;
import es.unirioja.uml2prov.xtend.prov.Derivation;
import es.unirioja.uml2prov.xtend.prov.Document;
import es.unirioja.uml2prov.xtend.prov.DocumentRoot;
import es.unirioja.uml2prov.xtend.prov.EmptyCollection;
import es.unirioja.uml2prov.xtend.prov.End;
import es.unirioja.uml2prov.xtend.prov.Entity;
import es.unirioja.uml2prov.xtend.prov.Generation;
import es.unirioja.uml2prov.xtend.prov.IDRef;
import es.unirioja.uml2prov.xtend.prov.Influence;
import es.unirioja.uml2prov.xtend.prov.InternationalizedString;
import es.unirioja.uml2prov.xtend.prov.Invalidation;
import es.unirioja.uml2prov.xtend.prov.Membership;
import es.unirioja.uml2prov.xtend.prov.Organization;
import es.unirioja.uml2prov.xtend.prov.Other;
import es.unirioja.uml2prov.xtend.prov.PAttribute;
import es.unirioja.uml2prov.xtend.prov.Person;
import es.unirioja.uml2prov.xtend.prov.Plan;
import es.unirioja.uml2prov.xtend.prov.PrimarySource;
import es.unirioja.uml2prov.xtend.prov.ProvFactory;
import es.unirioja.uml2prov.xtend.prov.ProvPackage;
import es.unirioja.uml2prov.xtend.prov.Quotation;
import es.unirioja.uml2prov.xtend.prov.Revision;
import es.unirioja.uml2prov.xtend.prov.SoftwareAgent;
import es.unirioja.uml2prov.xtend.prov.Specialization;
import es.unirioja.uml2prov.xtend.prov.Start;
import es.unirioja.uml2prov.xtend.prov.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProvPackageImpl extends EPackageImpl implements ProvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalizedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invalidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primarySourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pAttributeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see xtendCode.prov.ProvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProvPackageImpl() {
		super(eNS_URI, ProvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProvPackage init() {
		if (isInited) return (ProvPackage)EPackage.Registry.INSTANCE.getEPackage(ProvPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProvPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProvPackageImpl theProvPackage = registeredProvPackage instanceof ProvPackageImpl ? (ProvPackageImpl)registeredProvPackage : new ProvPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProvPackage.createPackageContents();

		// Initialize created meta-data
		theProvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProvPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProvPackage.eNS_URI, theProvPackage);
		return theProvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_StartTime() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_EndTime() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Label() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Location() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Type() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Any() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Id() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_AnyAttribute() {
		return (EReference)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Label() {
		return (EReference)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Location() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Type() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Any() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Id() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_AnyAttribute() {
		return (EReference)agentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternate() {
		return alternateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternate_Alternate1() {
		return (EReference)alternateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternate_Alternate2() {
		return (EReference)alternateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Activity() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Agent() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Plan() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Label() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Role() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Type() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Any() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Id() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AnyAttribute() {
		return (EReference)associationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribution() {
		return attributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribution_Entity() {
		return (EReference)attributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribution_Agent() {
		return (EReference)attributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribution_Label() {
		return (EReference)attributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribution_Type() {
		return (EAttribute)attributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribution_Any() {
		return (EAttribute)attributionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribution_Id() {
		return (EAttribute)attributionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribution_AnyAttribute() {
		return (EReference)attributionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleConstructor() {
		return bundleConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleConstructor_Group() {
		return (EAttribute)bundleConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Entity() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Activity() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasGeneratedBy() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Used() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasInformedBy() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasStartedBy() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasEndedBy() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasInvalidatedBy() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasDerivedFrom() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasRevisionOf() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasQuotedFrom() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_HadPrimarySource() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Agent() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Person() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Organization() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_SoftwareAgent() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasAttributedTo() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasAssociatedWith() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_ActedOnBehalfOf() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_WasInfluencedBy() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Bundle() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_SpecializationOf() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_AlternateOf() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Collection() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_EmptyCollection() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_HadMember() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Plan() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_Other() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleConstructor_InternalElementGroup() {
		return (EAttribute)bundleConstructorEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_InternalElement() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleConstructor_Id() {
		return (EAttribute)bundleConstructorEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleConstructor_AnyAttribute() {
		return (EReference)bundleConstructorEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Informed() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Informant() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Label() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_Type() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_Any() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunication_Id() {
		return (EAttribute)communicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_AnyAttribute() {
		return (EReference)communicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegation() {
		return delegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_Delegate() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_Responsible() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_Activity() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_Label() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_Type() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_Any() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_Id() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_AnyAttribute() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivation() {
		return derivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_GeneratedEntity() {
		return (EReference)derivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_UsedEntity() {
		return (EReference)derivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_Activity() {
		return (EReference)derivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_Generation() {
		return (EReference)derivationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_Usage() {
		return (EReference)derivationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_Label() {
		return (EReference)derivationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivation_Type() {
		return (EAttribute)derivationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivation_Any() {
		return (EAttribute)derivationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivation_Id() {
		return (EAttribute)derivationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_AnyAttribute() {
		return (EReference)derivationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Group() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Entity() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Activity() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasGeneratedBy() {
		return (EReference)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Used() {
		return (EReference)documentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasInformedBy() {
		return (EReference)documentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasStartedBy() {
		return (EReference)documentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasEndedBy() {
		return (EReference)documentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasInvalidatedBy() {
		return (EReference)documentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasDerivedFrom() {
		return (EReference)documentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasRevisionOf() {
		return (EReference)documentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasQuotedFrom() {
		return (EReference)documentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_HadPrimarySource() {
		return (EReference)documentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Agent() {
		return (EReference)documentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Person() {
		return (EReference)documentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Organization() {
		return (EReference)documentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_SoftwareAgent() {
		return (EReference)documentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasAttributedTo() {
		return (EReference)documentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasAssociatedWith() {
		return (EReference)documentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_ActedOnBehalfOf() {
		return (EReference)documentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_WasInfluencedBy() {
		return (EReference)documentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Bundle() {
		return (EReference)documentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_SpecializationOf() {
		return (EReference)documentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_AlternateOf() {
		return (EReference)documentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Collection() {
		return (EReference)documentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_EmptyCollection() {
		return (EReference)documentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_HadMember() {
		return (EReference)documentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Plan() {
		return (EReference)documentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Other() {
		return (EReference)documentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_InternalElementGroup() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_InternalElement() {
		return (EReference)documentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_BundleContent() {
		return (EReference)documentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Id() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ActedOnBehalfOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Activity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Agent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AlternateOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bundle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Collection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Document() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmptyCollection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HadMember() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HadPrimarySource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Entity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InternalElement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Label() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Location() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Organization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Other() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Person() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Plan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Role() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SoftwareAgent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpecializationOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Type() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Used() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasAssociatedWith() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasAttributedTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasDerivedFrom() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasEndedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasGeneratedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasInfluencedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasInformedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasInvalidatedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasQuotedFrom() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasRevisionOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WasStartedBy() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Ref() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyCollection() {
		return emptyCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnd_Activity() {
		return (EReference)endEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnd_Trigger() {
		return (EReference)endEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnd_Ender() {
		return (EReference)endEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Time() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnd_Label() {
		return (EReference)endEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Location() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Role() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Type() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Any() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnd_Id() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnd_AnyAttribute() {
		return (EReference)endEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Label() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Location() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Type() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Value() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Any() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Id() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_AnyAttribute() {
		return (EReference)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneration() {
		return generationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneration_Entity() {
		return (EReference)generationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneration_Activity() {
		return (EReference)generationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneration_Time() {
		return (EAttribute)generationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneration_Label() {
		return (EReference)generationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneration_Location() {
		return (EAttribute)generationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneration_Role() {
		return (EAttribute)generationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneration_Type() {
		return (EAttribute)generationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneration_Any() {
		return (EAttribute)generationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneration_Id() {
		return (EAttribute)generationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneration_AnyAttribute() {
		return (EReference)generationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDRef() {
		return idRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDRef_Ref() {
		return (EAttribute)idRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIDRef_AnyAttribute() {
		return (EReference)idRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluence() {
		return influenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluence_Influencee() {
		return (EReference)influenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluence_Influencer() {
		return (EReference)influenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluence_Label() {
		return (EReference)influenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfluence_Type() {
		return (EAttribute)influenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfluence_Any() {
		return (EAttribute)influenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfluence_Id() {
		return (EAttribute)influenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluence_AnyAttribute() {
		return (EReference)influenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternationalizedString() {
		return internationalizedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternationalizedString_Value() {
		return (EAttribute)internationalizedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternationalizedString_Lang() {
		return (EAttribute)internationalizedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvalidation() {
		return invalidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvalidation_Entity() {
		return (EReference)invalidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvalidation_Activity() {
		return (EReference)invalidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidation_Time() {
		return (EAttribute)invalidationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvalidation_Label() {
		return (EReference)invalidationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidation_Location() {
		return (EAttribute)invalidationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidation_Role() {
		return (EAttribute)invalidationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidation_Type() {
		return (EAttribute)invalidationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidation_Any() {
		return (EAttribute)invalidationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvalidation_Id() {
		return (EAttribute)invalidationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvalidation_AnyAttribute() {
		return (EReference)invalidationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMembership() {
		return membershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMembership_Collection() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMembership_Entity() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOther() {
		return otherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOther_Any() {
		return (EAttribute)otherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimarySource() {
		return primarySourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuotation() {
		return quotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareAgent() {
		return softwareAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialization() {
		return specializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialization_SpecificEntity() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialization_GeneralEntity() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStart_Activity() {
		return (EReference)startEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStart_Trigger() {
		return (EReference)startEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStart_Starter() {
		return (EReference)startEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Time() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStart_Label() {
		return (EReference)startEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Location() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Role() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Type() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Any() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStart_Id() {
		return (EAttribute)startEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStart_AnyAttribute() {
		return (EReference)startEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_Activity() {
		return (EReference)usageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_Entity() {
		return (EReference)usageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsage_Time() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_Label() {
		return (EReference)usageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsage_Location() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsage_Role() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsage_Type() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsage_Any() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsage_Id() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsage_AnyAttribute() {
		return (EReference)usageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAttribute() {
		return pAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPAttribute_Key() {
		return (EAttribute)pAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPAttribute_Value() {
		return (EAttribute)pAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvFactory getProvFactory() {
		return (ProvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__START_TIME);
		createEAttribute(activityEClass, ACTIVITY__END_TIME);
		createEReference(activityEClass, ACTIVITY__LABEL);
		createEAttribute(activityEClass, ACTIVITY__LOCATION);
		createEAttribute(activityEClass, ACTIVITY__TYPE);
		createEAttribute(activityEClass, ACTIVITY__ANY);
		createEAttribute(activityEClass, ACTIVITY__ID);
		createEReference(activityEClass, ACTIVITY__ANY_ATTRIBUTE);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__LABEL);
		createEAttribute(agentEClass, AGENT__LOCATION);
		createEAttribute(agentEClass, AGENT__TYPE);
		createEAttribute(agentEClass, AGENT__ANY);
		createEAttribute(agentEClass, AGENT__ID);
		createEReference(agentEClass, AGENT__ANY_ATTRIBUTE);

		alternateEClass = createEClass(ALTERNATE);
		createEReference(alternateEClass, ALTERNATE__ALTERNATE1);
		createEReference(alternateEClass, ALTERNATE__ALTERNATE2);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__ACTIVITY);
		createEReference(associationEClass, ASSOCIATION__AGENT);
		createEReference(associationEClass, ASSOCIATION__PLAN);
		createEReference(associationEClass, ASSOCIATION__LABEL);
		createEAttribute(associationEClass, ASSOCIATION__ROLE);
		createEAttribute(associationEClass, ASSOCIATION__TYPE);
		createEAttribute(associationEClass, ASSOCIATION__ANY);
		createEAttribute(associationEClass, ASSOCIATION__ID);
		createEReference(associationEClass, ASSOCIATION__ANY_ATTRIBUTE);

		attributionEClass = createEClass(ATTRIBUTION);
		createEReference(attributionEClass, ATTRIBUTION__ENTITY);
		createEReference(attributionEClass, ATTRIBUTION__AGENT);
		createEReference(attributionEClass, ATTRIBUTION__LABEL);
		createEAttribute(attributionEClass, ATTRIBUTION__TYPE);
		createEAttribute(attributionEClass, ATTRIBUTION__ANY);
		createEAttribute(attributionEClass, ATTRIBUTION__ID);
		createEReference(attributionEClass, ATTRIBUTION__ANY_ATTRIBUTE);

		bundleEClass = createEClass(BUNDLE);

		bundleConstructorEClass = createEClass(BUNDLE_CONSTRUCTOR);
		createEAttribute(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__GROUP);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__ENTITY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__ACTIVITY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_GENERATED_BY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__USED);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_INFORMED_BY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_STARTED_BY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_ENDED_BY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_INVALIDATED_BY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_DERIVED_FROM);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_REVISION_OF);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_QUOTED_FROM);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__HAD_PRIMARY_SOURCE);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__AGENT);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__PERSON);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__ORGANIZATION);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__SOFTWARE_AGENT);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_ATTRIBUTED_TO);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_ASSOCIATED_WITH);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__ACTED_ON_BEHALF_OF);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__WAS_INFLUENCED_BY);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__BUNDLE);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__SPECIALIZATION_OF);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__ALTERNATE_OF);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__COLLECTION);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__EMPTY_COLLECTION);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__HAD_MEMBER);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__PLAN);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__OTHER);
		createEAttribute(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__INTERNAL_ELEMENT_GROUP);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__INTERNAL_ELEMENT);
		createEAttribute(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__ID);
		createEReference(bundleConstructorEClass, BUNDLE_CONSTRUCTOR__ANY_ATTRIBUTE);

		collectionEClass = createEClass(COLLECTION);

		communicationEClass = createEClass(COMMUNICATION);
		createEReference(communicationEClass, COMMUNICATION__INFORMED);
		createEReference(communicationEClass, COMMUNICATION__INFORMANT);
		createEReference(communicationEClass, COMMUNICATION__LABEL);
		createEAttribute(communicationEClass, COMMUNICATION__TYPE);
		createEAttribute(communicationEClass, COMMUNICATION__ANY);
		createEAttribute(communicationEClass, COMMUNICATION__ID);
		createEReference(communicationEClass, COMMUNICATION__ANY_ATTRIBUTE);

		delegationEClass = createEClass(DELEGATION);
		createEReference(delegationEClass, DELEGATION__DELEGATE);
		createEReference(delegationEClass, DELEGATION__RESPONSIBLE);
		createEReference(delegationEClass, DELEGATION__ACTIVITY);
		createEReference(delegationEClass, DELEGATION__LABEL);
		createEAttribute(delegationEClass, DELEGATION__TYPE);
		createEAttribute(delegationEClass, DELEGATION__ANY);
		createEAttribute(delegationEClass, DELEGATION__ID);
		createEReference(delegationEClass, DELEGATION__ANY_ATTRIBUTE);

		derivationEClass = createEClass(DERIVATION);
		createEReference(derivationEClass, DERIVATION__GENERATED_ENTITY);
		createEReference(derivationEClass, DERIVATION__USED_ENTITY);
		createEReference(derivationEClass, DERIVATION__ACTIVITY);
		createEReference(derivationEClass, DERIVATION__GENERATION);
		createEReference(derivationEClass, DERIVATION__USAGE);
		createEReference(derivationEClass, DERIVATION__LABEL);
		createEAttribute(derivationEClass, DERIVATION__TYPE);
		createEAttribute(derivationEClass, DERIVATION__ANY);
		createEAttribute(derivationEClass, DERIVATION__ID);
		createEReference(derivationEClass, DERIVATION__ANY_ATTRIBUTE);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__GROUP);
		createEReference(documentEClass, DOCUMENT__ENTITY);
		createEReference(documentEClass, DOCUMENT__ACTIVITY);
		createEReference(documentEClass, DOCUMENT__WAS_GENERATED_BY);
		createEReference(documentEClass, DOCUMENT__USED);
		createEReference(documentEClass, DOCUMENT__WAS_INFORMED_BY);
		createEReference(documentEClass, DOCUMENT__WAS_STARTED_BY);
		createEReference(documentEClass, DOCUMENT__WAS_ENDED_BY);
		createEReference(documentEClass, DOCUMENT__WAS_INVALIDATED_BY);
		createEReference(documentEClass, DOCUMENT__WAS_DERIVED_FROM);
		createEReference(documentEClass, DOCUMENT__WAS_REVISION_OF);
		createEReference(documentEClass, DOCUMENT__WAS_QUOTED_FROM);
		createEReference(documentEClass, DOCUMENT__HAD_PRIMARY_SOURCE);
		createEReference(documentEClass, DOCUMENT__AGENT);
		createEReference(documentEClass, DOCUMENT__PERSON);
		createEReference(documentEClass, DOCUMENT__ORGANIZATION);
		createEReference(documentEClass, DOCUMENT__SOFTWARE_AGENT);
		createEReference(documentEClass, DOCUMENT__WAS_ATTRIBUTED_TO);
		createEReference(documentEClass, DOCUMENT__WAS_ASSOCIATED_WITH);
		createEReference(documentEClass, DOCUMENT__ACTED_ON_BEHALF_OF);
		createEReference(documentEClass, DOCUMENT__WAS_INFLUENCED_BY);
		createEReference(documentEClass, DOCUMENT__BUNDLE);
		createEReference(documentEClass, DOCUMENT__SPECIALIZATION_OF);
		createEReference(documentEClass, DOCUMENT__ALTERNATE_OF);
		createEReference(documentEClass, DOCUMENT__COLLECTION);
		createEReference(documentEClass, DOCUMENT__EMPTY_COLLECTION);
		createEReference(documentEClass, DOCUMENT__HAD_MEMBER);
		createEReference(documentEClass, DOCUMENT__PLAN);
		createEReference(documentEClass, DOCUMENT__OTHER);
		createEAttribute(documentEClass, DOCUMENT__INTERNAL_ELEMENT_GROUP);
		createEReference(documentEClass, DOCUMENT__INTERNAL_ELEMENT);
		createEReference(documentEClass, DOCUMENT__BUNDLE_CONTENT);
		createEAttribute(documentEClass, DOCUMENT__ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTED_ON_BEHALF_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AGENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ALTERNATE_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUNDLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLLECTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMPTY_COLLECTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAD_MEMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAD_PRIMARY_SOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERNAL_ELEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LABEL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORGANIZATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OTHER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSON);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLAN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ROLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOFTWARE_AGENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIALIZATION_OF);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_ASSOCIATED_WITH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_ATTRIBUTED_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_DERIVED_FROM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_ENDED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_GENERATED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_INFLUENCED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_INFORMED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_INVALIDATED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_QUOTED_FROM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_REVISION_OF);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WAS_STARTED_BY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REF);

		emptyCollectionEClass = createEClass(EMPTY_COLLECTION);

		endEClass = createEClass(END);
		createEReference(endEClass, END__ACTIVITY);
		createEReference(endEClass, END__TRIGGER);
		createEReference(endEClass, END__ENDER);
		createEAttribute(endEClass, END__TIME);
		createEReference(endEClass, END__LABEL);
		createEAttribute(endEClass, END__LOCATION);
		createEAttribute(endEClass, END__ROLE);
		createEAttribute(endEClass, END__TYPE);
		createEAttribute(endEClass, END__ANY);
		createEAttribute(endEClass, END__ID);
		createEReference(endEClass, END__ANY_ATTRIBUTE);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__LABEL);
		createEAttribute(entityEClass, ENTITY__LOCATION);
		createEAttribute(entityEClass, ENTITY__TYPE);
		createEAttribute(entityEClass, ENTITY__VALUE);
		createEAttribute(entityEClass, ENTITY__ANY);
		createEAttribute(entityEClass, ENTITY__ID);
		createEReference(entityEClass, ENTITY__ANY_ATTRIBUTE);

		generationEClass = createEClass(GENERATION);
		createEReference(generationEClass, GENERATION__ENTITY);
		createEReference(generationEClass, GENERATION__ACTIVITY);
		createEAttribute(generationEClass, GENERATION__TIME);
		createEReference(generationEClass, GENERATION__LABEL);
		createEAttribute(generationEClass, GENERATION__LOCATION);
		createEAttribute(generationEClass, GENERATION__ROLE);
		createEAttribute(generationEClass, GENERATION__TYPE);
		createEAttribute(generationEClass, GENERATION__ANY);
		createEAttribute(generationEClass, GENERATION__ID);
		createEReference(generationEClass, GENERATION__ANY_ATTRIBUTE);

		idRefEClass = createEClass(ID_REF);
		createEAttribute(idRefEClass, ID_REF__REF);
		createEReference(idRefEClass, ID_REF__ANY_ATTRIBUTE);

		influenceEClass = createEClass(INFLUENCE);
		createEReference(influenceEClass, INFLUENCE__INFLUENCEE);
		createEReference(influenceEClass, INFLUENCE__INFLUENCER);
		createEReference(influenceEClass, INFLUENCE__LABEL);
		createEAttribute(influenceEClass, INFLUENCE__TYPE);
		createEAttribute(influenceEClass, INFLUENCE__ANY);
		createEAttribute(influenceEClass, INFLUENCE__ID);
		createEReference(influenceEClass, INFLUENCE__ANY_ATTRIBUTE);

		internationalizedStringEClass = createEClass(INTERNATIONALIZED_STRING);
		createEAttribute(internationalizedStringEClass, INTERNATIONALIZED_STRING__VALUE);
		createEAttribute(internationalizedStringEClass, INTERNATIONALIZED_STRING__LANG);

		invalidationEClass = createEClass(INVALIDATION);
		createEReference(invalidationEClass, INVALIDATION__ENTITY);
		createEReference(invalidationEClass, INVALIDATION__ACTIVITY);
		createEAttribute(invalidationEClass, INVALIDATION__TIME);
		createEReference(invalidationEClass, INVALIDATION__LABEL);
		createEAttribute(invalidationEClass, INVALIDATION__LOCATION);
		createEAttribute(invalidationEClass, INVALIDATION__ROLE);
		createEAttribute(invalidationEClass, INVALIDATION__TYPE);
		createEAttribute(invalidationEClass, INVALIDATION__ANY);
		createEAttribute(invalidationEClass, INVALIDATION__ID);
		createEReference(invalidationEClass, INVALIDATION__ANY_ATTRIBUTE);

		membershipEClass = createEClass(MEMBERSHIP);
		createEReference(membershipEClass, MEMBERSHIP__COLLECTION);
		createEReference(membershipEClass, MEMBERSHIP__ENTITY);

		organizationEClass = createEClass(ORGANIZATION);

		otherEClass = createEClass(OTHER);
		createEAttribute(otherEClass, OTHER__ANY);

		personEClass = createEClass(PERSON);

		planEClass = createEClass(PLAN);

		primarySourceEClass = createEClass(PRIMARY_SOURCE);

		quotationEClass = createEClass(QUOTATION);

		revisionEClass = createEClass(REVISION);

		softwareAgentEClass = createEClass(SOFTWARE_AGENT);

		specializationEClass = createEClass(SPECIALIZATION);
		createEReference(specializationEClass, SPECIALIZATION__SPECIFIC_ENTITY);
		createEReference(specializationEClass, SPECIALIZATION__GENERAL_ENTITY);

		startEClass = createEClass(START);
		createEReference(startEClass, START__ACTIVITY);
		createEReference(startEClass, START__TRIGGER);
		createEReference(startEClass, START__STARTER);
		createEAttribute(startEClass, START__TIME);
		createEReference(startEClass, START__LABEL);
		createEAttribute(startEClass, START__LOCATION);
		createEAttribute(startEClass, START__ROLE);
		createEAttribute(startEClass, START__TYPE);
		createEAttribute(startEClass, START__ANY);
		createEAttribute(startEClass, START__ID);
		createEReference(startEClass, START__ANY_ATTRIBUTE);

		usageEClass = createEClass(USAGE);
		createEReference(usageEClass, USAGE__ACTIVITY);
		createEReference(usageEClass, USAGE__ENTITY);
		createEAttribute(usageEClass, USAGE__TIME);
		createEReference(usageEClass, USAGE__LABEL);
		createEAttribute(usageEClass, USAGE__LOCATION);
		createEAttribute(usageEClass, USAGE__ROLE);
		createEAttribute(usageEClass, USAGE__TYPE);
		createEAttribute(usageEClass, USAGE__ANY);
		createEAttribute(usageEClass, USAGE__ID);
		createEReference(usageEClass, USAGE__ANY_ATTRIBUTE);

		pAttributeEClass = createEClass(PATTRIBUTE);
		createEAttribute(pAttributeEClass, PATTRIBUTE__KEY);
		createEAttribute(pAttributeEClass, PATTRIBUTE__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bundleEClass.getESuperTypes().add(this.getEntity());
		collectionEClass.getESuperTypes().add(this.getEntity());
		emptyCollectionEClass.getESuperTypes().add(this.getCollection());
		organizationEClass.getESuperTypes().add(this.getAgent());
		personEClass.getESuperTypes().add(this.getAgent());
		planEClass.getESuperTypes().add(this.getEntity());
		primarySourceEClass.getESuperTypes().add(this.getDerivation());
		quotationEClass.getESuperTypes().add(this.getDerivation());
		revisionEClass.getESuperTypes().add(this.getDerivation());
		softwareAgentEClass.getESuperTypes().add(this.getAgent());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_StartTime(), theXMLTypePackage.getDateTime(), "startTime", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_EndTime(), theXMLTypePackage.getDateTime(), "endTime", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Id(), ecorePackage.getEString(), "id", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Agent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Id(), ecorePackage.getEString(), "id", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(alternateEClass, Alternate.class, "Alternate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternate_Alternate1(), this.getIDRef(), null, "alternate1", null, 1, 1, Alternate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlternate_Alternate2(), this.getIDRef(), null, "alternate2", null, 1, 1, Alternate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Activity(), this.getIDRef(), null, "activity", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Agent(), this.getIDRef(), null, "agent", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Plan(), this.getIDRef(), null, "plan", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Role(), theXMLTypePackage.getAnySimpleType(), "role", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(attributionEClass, Attribution.class, "Attribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribution_Entity(), this.getIDRef(), null, "entity", null, 1, 1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribution_Agent(), this.getIDRef(), null, "agent", null, 1, 1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribution_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribution_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribution_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribution_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribution_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Attribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleConstructorEClass, BundleConstructor.class, "BundleConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleConstructor_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, BundleConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Entity(), this.getEntity(), null, "entity", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Activity(), this.getActivity(), null, "activity", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasGeneratedBy(), this.getGeneration(), null, "wasGeneratedBy", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Used(), this.getUsage(), null, "used", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasInformedBy(), this.getCommunication(), null, "wasInformedBy", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasStartedBy(), this.getStart(), null, "wasStartedBy", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasEndedBy(), this.getEnd(), null, "wasEndedBy", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasInvalidatedBy(), this.getInvalidation(), null, "wasInvalidatedBy", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasDerivedFrom(), this.getDerivation(), null, "wasDerivedFrom", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasRevisionOf(), this.getRevision(), null, "wasRevisionOf", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasQuotedFrom(), this.getQuotation(), null, "wasQuotedFrom", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_HadPrimarySource(), this.getPrimarySource(), null, "hadPrimarySource", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Agent(), this.getAgent(), null, "agent", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Person(), this.getPerson(), null, "person", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Organization(), this.getOrganization(), null, "organization", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_SoftwareAgent(), this.getSoftwareAgent(), null, "softwareAgent", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasAttributedTo(), this.getAttribution(), null, "wasAttributedTo", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasAssociatedWith(), this.getAssociation(), null, "wasAssociatedWith", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_ActedOnBehalfOf(), this.getDelegation(), null, "actedOnBehalfOf", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_WasInfluencedBy(), this.getInfluence(), null, "wasInfluencedBy", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Bundle(), this.getBundle(), null, "bundle", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_SpecializationOf(), this.getSpecialization(), null, "specializationOf", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_AlternateOf(), this.getAlternate(), null, "alternateOf", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Collection(), this.getCollection(), null, "collection", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_EmptyCollection(), this.getEmptyCollection(), null, "emptyCollection", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_HadMember(), this.getMembership(), null, "hadMember", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Plan(), this.getPlan(), null, "plan", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_Other(), this.getOther(), null, "other", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleConstructor_InternalElementGroup(), ecorePackage.getEFeatureMapEntry(), "internalElementGroup", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_InternalElement(), ecorePackage.getEObject(), null, "internalElement", null, 0, -1, BundleConstructor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleConstructor_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, BundleConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleConstructor_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, BundleConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationEClass, Communication.class, "Communication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunication_Informed(), this.getIDRef(), null, "informed", null, 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Informant(), this.getIDRef(), null, "informant", null, 1, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunication_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunication_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunication_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunication_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Communication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegation_Delegate(), this.getIDRef(), null, "delegate", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_Responsible(), this.getIDRef(), null, "responsible", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_Activity(), this.getIDRef(), null, "activity", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(derivationEClass, Derivation.class, "Derivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivation_GeneratedEntity(), this.getIDRef(), null, "generatedEntity", null, 1, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivation_UsedEntity(), this.getIDRef(), null, "usedEntity", null, 1, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivation_Activity(), this.getIDRef(), null, "activity", null, 0, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivation_Generation(), this.getIDRef(), null, "generation", null, 0, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivation_Usage(), this.getIDRef(), null, "usage", null, 0, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivation_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivation_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerivation_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivation_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Entity(), this.getEntity(), null, "entity", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Activity(), this.getActivity(), null, "activity", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasGeneratedBy(), this.getGeneration(), null, "wasGeneratedBy", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Used(), this.getUsage(), null, "used", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasInformedBy(), this.getCommunication(), null, "wasInformedBy", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasStartedBy(), this.getStart(), null, "wasStartedBy", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasEndedBy(), this.getEnd(), null, "wasEndedBy", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasInvalidatedBy(), this.getInvalidation(), null, "wasInvalidatedBy", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasDerivedFrom(), this.getDerivation(), null, "wasDerivedFrom", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasRevisionOf(), this.getRevision(), null, "wasRevisionOf", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasQuotedFrom(), this.getQuotation(), null, "wasQuotedFrom", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_HadPrimarySource(), this.getPrimarySource(), null, "hadPrimarySource", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Agent(), this.getAgent(), null, "agent", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Person(), this.getPerson(), null, "person", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Organization(), this.getOrganization(), null, "organization", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_SoftwareAgent(), this.getSoftwareAgent(), null, "softwareAgent", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasAttributedTo(), this.getAttribution(), null, "wasAttributedTo", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasAssociatedWith(), this.getAssociation(), null, "wasAssociatedWith", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_ActedOnBehalfOf(), this.getDelegation(), null, "actedOnBehalfOf", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_WasInfluencedBy(), this.getInfluence(), null, "wasInfluencedBy", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Bundle(), this.getBundle(), null, "bundle", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_SpecializationOf(), this.getSpecialization(), null, "specializationOf", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_AlternateOf(), this.getAlternate(), null, "alternateOf", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Collection(), this.getCollection(), null, "collection", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_EmptyCollection(), this.getEmptyCollection(), null, "emptyCollection", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_HadMember(), this.getMembership(), null, "hadMember", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Plan(), this.getPlan(), null, "plan", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Other(), this.getOther(), null, "other", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_InternalElementGroup(), ecorePackage.getEFeatureMapEntry(), "internalElementGroup", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_InternalElement(), ecorePackage.getEObject(), null, "internalElement", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_BundleContent(), this.getBundleConstructor(), null, "bundleContent", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Id(), ecorePackage.getEString(), "id", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ActedOnBehalfOf(), this.getDelegation(), null, "actedOnBehalfOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Activity(), this.getActivity(), null, "activity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Agent(), this.getAgent(), null, "agent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AlternateOf(), this.getAlternate(), null, "alternateOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Bundle(), this.getBundle(), null, "bundle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Collection(), this.getCollection(), null, "collection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Document(), this.getDocument(), null, "document", null, 0, -1, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EmptyCollection(), this.getEmptyCollection(), null, "emptyCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HadMember(), this.getMembership(), null, "hadMember", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HadPrimarySource(), this.getPrimarySource(), null, "hadPrimarySource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Entity(), this.getEntity(), null, "entity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InternalElement(), ecorePackage.getEObject(), null, "internalElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Label(), this.getInternationalizedString(), null, "label", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Organization(), this.getOrganization(), null, "organization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Other(), this.getOther(), null, "other", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Person(), this.getPerson(), null, "person", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Plan(), this.getPlan(), null, "plan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Role(), theXMLTypePackage.getAnySimpleType(), "role", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SoftwareAgent(), this.getSoftwareAgent(), null, "softwareAgent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpecializationOf(), this.getSpecialization(), null, "specializationOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Used(), this.getUsage(), null, "used", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasAssociatedWith(), this.getAssociation(), null, "wasAssociatedWith", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasAttributedTo(), this.getAttribution(), null, "wasAttributedTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasDerivedFrom(), this.getDerivation(), null, "wasDerivedFrom", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasEndedBy(), this.getEnd(), null, "wasEndedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasGeneratedBy(), this.getGeneration(), null, "wasGeneratedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasInfluencedBy(), this.getInfluence(), null, "wasInfluencedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasInformedBy(), this.getCommunication(), null, "wasInformedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasInvalidatedBy(), this.getInvalidation(), null, "wasInvalidatedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasQuotedFrom(), this.getQuotation(), null, "wasQuotedFrom", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasRevisionOf(), this.getRevision(), null, "wasRevisionOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WasStartedBy(), this.getStart(), null, "wasStartedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Id(), ecorePackage.getEString(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Ref(), theXMLTypePackage.getQName(), "ref", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyCollectionEClass, EmptyCollection.class, "EmptyCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnd_Activity(), this.getIDRef(), null, "activity", null, 1, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnd_Trigger(), this.getIDRef(), null, "trigger", null, 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnd_Ender(), this.getIDRef(), null, "ender", null, 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnd_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_Role(), theXMLTypePackage.getAnySimpleType(), "role", null, 0, -1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnd_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(generationEClass, Generation.class, "Generation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneration_Entity(), this.getIDRef(), null, "entity", null, 1, 1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneration_Activity(), this.getIDRef(), null, "activity", null, 0, 1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneration_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneration_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneration_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneration_Role(), theXMLTypePackage.getAnySimpleType(), "role", null, 0, -1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneration_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneration_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneration_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneration_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Generation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(idRefEClass, IDRef.class, "IDRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDRef_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, IDRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIDRef_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, IDRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(influenceEClass, Influence.class, "Influence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluence_Influencee(), this.getIDRef(), null, "influencee", null, 1, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_Influencer(), this.getIDRef(), null, "influencer", null, 1, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfluence_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfluence_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfluence_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(internationalizedStringEClass, InternationalizedString.class, "InternationalizedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternationalizedString_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, InternationalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternationalizedString_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, InternationalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invalidationEClass, Invalidation.class, "Invalidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvalidation_Entity(), this.getIDRef(), null, "entity", null, 1, 1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvalidation_Activity(), this.getIDRef(), null, "activity", null, 0, 1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidation_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvalidation_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidation_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidation_Role(), theXMLTypePackage.getAnySimpleType(), "role", null, 0, -1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidation_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvalidation_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvalidation_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Invalidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(membershipEClass, Membership.class, "Membership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMembership_Collection(), this.getIDRef(), null, "collection", null, 1, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMembership_Entity(), this.getIDRef(), null, "entity", null, 1, -1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherEClass, Other.class, "Other", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOther_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Other.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primarySourceEClass, PrimarySource.class, "PrimarySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quotationEClass, Quotation.class, "Quotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareAgentEClass, SoftwareAgent.class, "SoftwareAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specializationEClass, Specialization.class, "Specialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialization_SpecificEntity(), this.getIDRef(), null, "specificEntity", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialization_GeneralEntity(), this.getIDRef(), null, "generalEntity", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStart_Activity(), this.getIDRef(), null, "activity", null, 1, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStart_Trigger(), this.getIDRef(), null, "trigger", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStart_Starter(), this.getIDRef(), null, "starter", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStart_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStart_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStart_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStart_Role(), theXMLTypePackage.getAnySimpleType(), "role", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStart_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStart_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStart_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStart_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsage_Activity(), this.getIDRef(), null, "activity", null, 1, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_Entity(), this.getIDRef(), null, "entity", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsage_Time(), theXMLTypePackage.getDateTime(), "time", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_Label(), this.getInternationalizedString(), null, "label", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsage_Location(), theXMLTypePackage.getAnySimpleType(), "location", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsage_Role(), theXMLTypePackage.getAnySimpleType(), "role", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsage_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsage_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsage_Id(), theXMLTypePackage.getQName(), "id", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_AnyAttribute(), this.getPAttribute(), null, "anyAttribute", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pAttributeEClass, PAttribute.class, "PAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPAttribute_Key(), ecorePackage.getEString(), "key", null, 1, 1, PAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPAttribute_Value(), ecorePackage.getEString(), "value", null, 1, 1, PAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "name", "Activity",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getActivity_StartTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActivity_EndTime(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endTime",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActivity_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActivity_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActivity_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActivity_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":5",
			   "processing", "lax"
		   });
		addAnnotation
		  (getActivity_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (agentEClass,
		   source,
		   new String[] {
			   "name", "Agent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAgent_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAgent_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAgent_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAgent_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":3",
			   "processing", "lax"
		   });
		addAnnotation
		  (getAgent_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (alternateEClass,
		   source,
		   new String[] {
			   "name", "Alternate",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAlternate_Alternate1(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alternate1",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAlternate_Alternate2(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alternate2",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (associationEClass,
		   source,
		   new String[] {
			   "name", "Association",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAssociation_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAssociation_Agent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "agent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAssociation_Plan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "plan",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAssociation_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAssociation_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAssociation_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAssociation_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":6",
			   "processing", "lax"
		   });
		addAnnotation
		  (getAssociation_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (attributionEClass,
		   source,
		   new String[] {
			   "name", "Attribution",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttribution_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribution_Agent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "agent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribution_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribution_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribution_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":4",
			   "processing", "lax"
		   });
		addAnnotation
		  (getAttribution_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bundleEClass,
		   source,
		   new String[] {
			   "name", "Bundle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (bundleConstructorEClass,
		   source,
		   new String[] {
			   "name", "BundleConstructor",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBundleConstructor_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasGeneratedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasGeneratedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Used(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "used",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasInformedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInformedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasStartedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasStartedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasEndedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasEndedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasInvalidatedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInvalidatedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasDerivedFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasDerivedFrom",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasRevisionOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasRevisionOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasQuotedFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasQuotedFrom",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_HadPrimarySource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadPrimarySource",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Agent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "agent",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Person(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "person",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Organization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "organization",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_SoftwareAgent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "softwareAgent",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasAttributedTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasAttributedTo",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasAssociatedWith(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasAssociatedWith",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_ActedOnBehalfOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "actedOnBehalfOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_WasInfluencedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInfluencedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Bundle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bundle",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_SpecializationOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "specializationOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_AlternateOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alternateOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Collection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "collection",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_EmptyCollection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "emptyCollection",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_HadMember(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadMember",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Plan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "plan",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_Other(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "other",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_InternalElementGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "internalElement:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getBundleConstructor_InternalElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "internalElement",
			   "namespace", "##targetNamespace",
			   "group", "internalElement:group"
		   });
		addAnnotation
		  (getBundleConstructor_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (collectionEClass,
		   source,
		   new String[] {
			   "name", "Collection",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (communicationEClass,
		   source,
		   new String[] {
			   "name", "Communication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCommunication_Informed(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "informed",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunication_Informant(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "informant",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunication_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunication_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunication_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":4",
			   "processing", "lax"
		   });
		addAnnotation
		  (getCommunication_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (delegationEClass,
		   source,
		   new String[] {
			   "name", "Delegation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDelegation_Delegate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "delegate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDelegation_Responsible(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "responsible",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDelegation_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDelegation_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDelegation_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDelegation_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":5",
			   "processing", "lax"
		   });
		addAnnotation
		  (getDelegation_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (derivationEClass,
		   source,
		   new String[] {
			   "name", "Derivation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDerivation_GeneratedEntity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "generatedEntity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDerivation_UsedEntity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "usedEntity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDerivation_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDerivation_Generation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "generation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDerivation_Usage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "usage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDerivation_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDerivation_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDerivation_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":7",
			   "processing", "lax"
		   });
		addAnnotation
		  (getDerivation_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentEClass,
		   source,
		   new String[] {
			   "name", "Document",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDocument_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getDocument_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasGeneratedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasGeneratedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Used(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "used",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasInformedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInformedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasStartedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasStartedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasEndedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasEndedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasInvalidatedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInvalidatedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasDerivedFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasDerivedFrom",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasRevisionOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasRevisionOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasQuotedFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasQuotedFrom",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_HadPrimarySource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadPrimarySource",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Agent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "agent",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Person(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "person",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Organization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "organization",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_SoftwareAgent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "softwareAgent",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasAttributedTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasAttributedTo",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasAssociatedWith(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasAssociatedWith",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_ActedOnBehalfOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "actedOnBehalfOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_WasInfluencedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInfluencedBy",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Bundle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bundle",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_SpecializationOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "specializationOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_AlternateOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alternateOf",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Collection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "collection",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_EmptyCollection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "emptyCollection",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_HadMember(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadMember",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Plan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "plan",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_Other(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "other",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_InternalElementGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "internalElement:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getDocument_InternalElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "internalElement",
			   "namespace", "##targetNamespace",
			   "group", "internalElement:group"
		   });
		addAnnotation
		  (getDocument_BundleContent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bundleContent",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_ActedOnBehalfOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "actedOnBehalfOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Agent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "agent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AlternateOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "alternateOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Bundle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bundle",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Collection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "collection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Document(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "document",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EmptyCollection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "emptyCollection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HadMember(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadMember",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_HadPrimarySource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "hadPrimarySource",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InternalElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "internalElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Organization(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "organization",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Other(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "other",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Person(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "person",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Plan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "plan",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SoftwareAgent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "softwareAgent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SpecializationOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "specializationOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Used(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "used",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasAssociatedWith(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasAssociatedWith",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasAttributedTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasAttributedTo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasDerivedFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasDerivedFrom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasEndedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasEndedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasGeneratedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasGeneratedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasInfluencedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInfluencedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasInformedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInformedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasInvalidatedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasInvalidatedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasQuotedFrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasQuotedFrom",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasRevisionOf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasRevisionOf",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_WasStartedBy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "wasStartedBy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Ref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (emptyCollectionEClass,
		   source,
		   new String[] {
			   "name", "EmptyCollection",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (endEClass,
		   source,
		   new String[] {
			   "name", "End",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEnd_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Trigger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "trigger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Ender(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ender",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEnd_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":8",
			   "processing", "lax"
		   });
		addAnnotation
		  (getEnd_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (entityEClass,
		   source,
		   new String[] {
			   "name", "Entity",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntity_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntity_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntity_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntity_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntity_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":4",
			   "processing", "lax"
		   });
		addAnnotation
		  (getEntity_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (generationEClass,
		   source,
		   new String[] {
			   "name", "Generation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeneration_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeneration_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeneration_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeneration_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeneration_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeneration_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeneration_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeneration_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":7",
			   "processing", "lax"
		   });
		addAnnotation
		  (getGeneration_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (idRefEClass,
		   source,
		   new String[] {
			   "name", "IDRef",
			   "kind", "empty"
		   });
		addAnnotation
		  (getIDRef_Ref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ref",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (influenceEClass,
		   source,
		   new String[] {
			   "name", "Influence",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInfluence_Influencee(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "influencee",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInfluence_Influencer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "influencer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInfluence_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInfluence_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInfluence_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":4",
			   "processing", "lax"
		   });
		addAnnotation
		  (getInfluence_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (internationalizedStringEClass,
		   source,
		   new String[] {
			   "name", "InternationalizedString",
			   "kind", "simple"
		   });
		addAnnotation
		  (getInternationalizedString_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getInternationalizedString_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (invalidationEClass,
		   source,
		   new String[] {
			   "name", "Invalidation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInvalidation_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvalidation_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvalidation_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvalidation_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvalidation_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvalidation_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvalidation_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvalidation_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":7",
			   "processing", "lax"
		   });
		addAnnotation
		  (getInvalidation_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (membershipEClass,
		   source,
		   new String[] {
			   "name", "Membership",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMembership_Collection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "collection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMembership_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (organizationEClass,
		   source,
		   new String[] {
			   "name", "Organization",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (otherEClass,
		   source,
		   new String[] {
			   "name", "Other",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOther_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "name", "Person",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (planEClass,
		   source,
		   new String[] {
			   "name", "Plan",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (primarySourceEClass,
		   source,
		   new String[] {
			   "name", "PrimarySource",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (quotationEClass,
		   source,
		   new String[] {
			   "name", "Quotation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (revisionEClass,
		   source,
		   new String[] {
			   "name", "Revision",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (softwareAgentEClass,
		   source,
		   new String[] {
			   "name", "SoftwareAgent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (specializationEClass,
		   source,
		   new String[] {
			   "name", "Specialization",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSpecialization_SpecificEntity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "specificEntity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSpecialization_GeneralEntity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "generalEntity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (startEClass,
		   source,
		   new String[] {
			   "name", "Start",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStart_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Trigger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "trigger",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Starter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "starter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getStart_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":8",
			   "processing", "lax"
		   });
		addAnnotation
		  (getStart_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (usageEClass,
		   source,
		   new String[] {
			   "name", "Usage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUsage_Activity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "activity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsage_Entity(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entity",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsage_Time(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "time",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsage_Label(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "label",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsage_Location(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "location",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsage_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsage_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getUsage_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":7",
			   "processing", "lax"
		   });
		addAnnotation
		  (getUsage_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
	}

} //ProvPackageImpl
