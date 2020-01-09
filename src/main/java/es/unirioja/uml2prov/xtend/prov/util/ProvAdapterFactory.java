/**
 */
package es.unirioja.uml2prov.xtend.prov.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
import es.unirioja.uml2prov.xtend.prov.ProvPackage;
import es.unirioja.uml2prov.xtend.prov.Quotation;
import es.unirioja.uml2prov.xtend.prov.Revision;
import es.unirioja.uml2prov.xtend.prov.SoftwareAgent;
import es.unirioja.uml2prov.xtend.prov.Specialization;
import es.unirioja.uml2prov.xtend.prov.Start;
import es.unirioja.uml2prov.xtend.prov.Usage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xtendCode.prov.ProvPackage
 * @generated
 */
public class ProvAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProvPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProvPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvSwitch<Adapter> modelSwitch =
		new ProvSwitch<Adapter>() {
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseAlternate(Alternate object) {
				return createAlternateAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseAttribution(Attribution object) {
				return createAttributionAdapter();
			}
			@Override
			public Adapter caseBundle(Bundle object) {
				return createBundleAdapter();
			}
			@Override
			public Adapter caseBundleConstructor(BundleConstructor object) {
				return createBundleConstructorAdapter();
			}
			@Override
			public Adapter caseCollection(Collection object) {
				return createCollectionAdapter();
			}
			@Override
			public Adapter caseCommunication(Communication object) {
				return createCommunicationAdapter();
			}
			@Override
			public Adapter caseDelegation(Delegation object) {
				return createDelegationAdapter();
			}
			@Override
			public Adapter caseDerivation(Derivation object) {
				return createDerivationAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEmptyCollection(EmptyCollection object) {
				return createEmptyCollectionAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseGeneration(Generation object) {
				return createGenerationAdapter();
			}
			@Override
			public Adapter caseIDRef(IDRef object) {
				return createIDRefAdapter();
			}
			@Override
			public Adapter caseInfluence(Influence object) {
				return createInfluenceAdapter();
			}
			@Override
			public Adapter caseInternationalizedString(InternationalizedString object) {
				return createInternationalizedStringAdapter();
			}
			@Override
			public Adapter caseInvalidation(Invalidation object) {
				return createInvalidationAdapter();
			}
			@Override
			public Adapter caseMembership(Membership object) {
				return createMembershipAdapter();
			}
			@Override
			public Adapter caseOrganization(Organization object) {
				return createOrganizationAdapter();
			}
			@Override
			public Adapter caseOther(Other object) {
				return createOtherAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePlan(Plan object) {
				return createPlanAdapter();
			}
			@Override
			public Adapter casePrimarySource(PrimarySource object) {
				return createPrimarySourceAdapter();
			}
			@Override
			public Adapter caseQuotation(Quotation object) {
				return createQuotationAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseSoftwareAgent(SoftwareAgent object) {
				return createSoftwareAgentAdapter();
			}
			@Override
			public Adapter caseSpecialization(Specialization object) {
				return createSpecializationAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseUsage(Usage object) {
				return createUsageAdapter();
			}
			@Override
			public Adapter casePAttribute(PAttribute object) {
				return createPAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Alternate <em>Alternate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Alternate
	 * @generated
	 */
	public Adapter createAlternateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Attribution <em>Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Attribution
	 * @generated
	 */
	public Adapter createAttributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Bundle
	 * @generated
	 */
	public Adapter createBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.BundleConstructor <em>Bundle Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.BundleConstructor
	 * @generated
	 */
	public Adapter createBundleConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Communication
	 * @generated
	 */
	public Adapter createCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Delegation
	 * @generated
	 */
	public Adapter createDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Derivation
	 * @generated
	 */
	public Adapter createDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.EmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.EmptyCollection
	 * @generated
	 */
	public Adapter createEmptyCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Generation <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Generation
	 * @generated
	 */
	public Adapter createGenerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.IDRef <em>ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.IDRef
	 * @generated
	 */
	public Adapter createIDRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Influence <em>Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Influence
	 * @generated
	 */
	public Adapter createInfluenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.InternationalizedString <em>Internationalized String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.InternationalizedString
	 * @generated
	 */
	public Adapter createInternationalizedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Invalidation <em>Invalidation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Invalidation
	 * @generated
	 */
	public Adapter createInvalidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Membership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Membership
	 * @generated
	 */
	public Adapter createMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Other
	 * @generated
	 */
	public Adapter createOtherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Plan
	 * @generated
	 */
	public Adapter createPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.PrimarySource <em>Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.PrimarySource
	 * @generated
	 */
	public Adapter createPrimarySourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Quotation <em>Quotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Quotation
	 * @generated
	 */
	public Adapter createQuotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.SoftwareAgent
	 * @generated
	 */
	public Adapter createSoftwareAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Specialization
	 * @generated
	 */
	public Adapter createSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.Usage
	 * @generated
	 */
	public Adapter createUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xtendCode.prov.PAttribute <em>PAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xtendCode.prov.PAttribute
	 * @generated
	 */
	public Adapter createPAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProvAdapterFactory
