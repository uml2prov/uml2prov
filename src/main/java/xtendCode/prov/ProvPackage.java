/**
 */
package xtendCode.prov;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see xtendCode.prov.ProvFactory
 * @model kind="package"
 * @generated
 */
public interface ProvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prov";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/ns/prov";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prov";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProvPackage eINSTANCE = xtendCode.prov.impl.ProvPackageImpl.init();

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.ActivityImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.AgentImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ANY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.AlternateImpl <em>Alternate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.AlternateImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getAlternate()
	 * @generated
	 */
	int ALTERNATE = 2;

	/**
	 * The feature id for the '<em><b>Alternate1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE__ALTERNATE1 = 0;

	/**
	 * The feature id for the '<em><b>Alternate2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE__ALTERNATE2 = 1;

	/**
	 * The number of structural features of the '<em>Alternate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Alternate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.AssociationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PLAN = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ID = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.AttributionImpl <em>Attribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.AttributionImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getAttribution()
	 * @generated
	 */
	int ATTRIBUTION = 4;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION__ANY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION__ID = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Attribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.EntityImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ANY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.BundleImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__LABEL = ENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__LOCATION = ENTITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__TYPE = ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VALUE = ENTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ANY = ENTITY__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ANY_ATTRIBUTE = ENTITY__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.BundleConstructorImpl <em>Bundle Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.BundleConstructorImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getBundleConstructor()
	 * @generated
	 */
	int BUNDLE_CONSTRUCTOR = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_GENERATED_BY = 3;

	/**
	 * The feature id for the '<em><b>Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__USED = 4;

	/**
	 * The feature id for the '<em><b>Was Informed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_INFORMED_BY = 5;

	/**
	 * The feature id for the '<em><b>Was Started By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_STARTED_BY = 6;

	/**
	 * The feature id for the '<em><b>Was Ended By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_ENDED_BY = 7;

	/**
	 * The feature id for the '<em><b>Was Invalidated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_INVALIDATED_BY = 8;

	/**
	 * The feature id for the '<em><b>Was Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_DERIVED_FROM = 9;

	/**
	 * The feature id for the '<em><b>Was Revision Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_REVISION_OF = 10;

	/**
	 * The feature id for the '<em><b>Was Quoted From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_QUOTED_FROM = 11;

	/**
	 * The feature id for the '<em><b>Had Primary Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__HAD_PRIMARY_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__AGENT = 13;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__PERSON = 14;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__ORGANIZATION = 15;

	/**
	 * The feature id for the '<em><b>Software Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__SOFTWARE_AGENT = 16;

	/**
	 * The feature id for the '<em><b>Was Attributed To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_ATTRIBUTED_TO = 17;

	/**
	 * The feature id for the '<em><b>Was Associated With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_ASSOCIATED_WITH = 18;

	/**
	 * The feature id for the '<em><b>Acted On Behalf Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__ACTED_ON_BEHALF_OF = 19;

	/**
	 * The feature id for the '<em><b>Was Influenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__WAS_INFLUENCED_BY = 20;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__BUNDLE = 21;

	/**
	 * The feature id for the '<em><b>Specialization Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__SPECIALIZATION_OF = 22;

	/**
	 * The feature id for the '<em><b>Alternate Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__ALTERNATE_OF = 23;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__COLLECTION = 24;

	/**
	 * The feature id for the '<em><b>Empty Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__EMPTY_COLLECTION = 25;

	/**
	 * The feature id for the '<em><b>Had Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__HAD_MEMBER = 26;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__PLAN = 27;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__OTHER = 28;

	/**
	 * The feature id for the '<em><b>Internal Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__INTERNAL_ELEMENT_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__INTERNAL_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__ID = 31;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR__ANY_ATTRIBUTE = 32;

	/**
	 * The number of structural features of the '<em>Bundle Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR_FEATURE_COUNT = 33;

	/**
	 * The number of operations of the '<em>Bundle Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONSTRUCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.CollectionImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__LABEL = ENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__LOCATION = ENTITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__TYPE = ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__VALUE = ENTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ANY = ENTITY__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ANY_ATTRIBUTE = ENTITY__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.CommunicationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 8;

	/**
	 * The feature id for the '<em><b>Informed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__INFORMED = 0;

	/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__INFORMANT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ANY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ID = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.DelegationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 9;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__DELEGATE = 0;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__RESPONSIBLE = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ANY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ID = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.DerivationImpl <em>Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.DerivationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getDerivation()
	 * @generated
	 */
	int DERIVATION = 10;

	/**
	 * The feature id for the '<em><b>Generated Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__GENERATED_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Used Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__USED_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__GENERATION = 3;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__USAGE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__LABEL = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__ANY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__ID = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.DocumentImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_GENERATED_BY = 3;

	/**
	 * The feature id for the '<em><b>Used</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__USED = 4;

	/**
	 * The feature id for the '<em><b>Was Informed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_INFORMED_BY = 5;

	/**
	 * The feature id for the '<em><b>Was Started By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_STARTED_BY = 6;

	/**
	 * The feature id for the '<em><b>Was Ended By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_ENDED_BY = 7;

	/**
	 * The feature id for the '<em><b>Was Invalidated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_INVALIDATED_BY = 8;

	/**
	 * The feature id for the '<em><b>Was Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_DERIVED_FROM = 9;

	/**
	 * The feature id for the '<em><b>Was Revision Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_REVISION_OF = 10;

	/**
	 * The feature id for the '<em><b>Was Quoted From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_QUOTED_FROM = 11;

	/**
	 * The feature id for the '<em><b>Had Primary Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__HAD_PRIMARY_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AGENT = 13;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PERSON = 14;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ORGANIZATION = 15;

	/**
	 * The feature id for the '<em><b>Software Agent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SOFTWARE_AGENT = 16;

	/**
	 * The feature id for the '<em><b>Was Attributed To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_ATTRIBUTED_TO = 17;

	/**
	 * The feature id for the '<em><b>Was Associated With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_ASSOCIATED_WITH = 18;

	/**
	 * The feature id for the '<em><b>Acted On Behalf Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ACTED_ON_BEHALF_OF = 19;

	/**
	 * The feature id for the '<em><b>Was Influenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__WAS_INFLUENCED_BY = 20;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BUNDLE = 21;

	/**
	 * The feature id for the '<em><b>Specialization Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SPECIALIZATION_OF = 22;

	/**
	 * The feature id for the '<em><b>Alternate Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ALTERNATE_OF = 23;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__COLLECTION = 24;

	/**
	 * The feature id for the '<em><b>Empty Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EMPTY_COLLECTION = 25;

	/**
	 * The feature id for the '<em><b>Had Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__HAD_MEMBER = 26;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PLAN = 27;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OTHER = 28;

	/**
	 * The feature id for the '<em><b>Internal Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__INTERNAL_ELEMENT_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__INTERNAL_ELEMENT = 30;

	/**
	 * The feature id for the '<em><b>Bundle Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BUNDLE_CONTENT = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = 32;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 33;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.DocumentRootImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Acted On Behalf Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTED_ON_BEHALF_OF = 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AGENT = 5;

	/**
	 * The feature id for the '<em><b>Alternate Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALTERNATE_OF = 6;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUNDLE = 7;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLECTION = 8;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT = 9;

	/**
	 * The feature id for the '<em><b>Empty Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMPTY_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Had Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAD_MEMBER = 11;

	/**
	 * The feature id for the '<em><b>Had Primary Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAD_PRIMARY_SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY = 13;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERNAL_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL = 15;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION = 17;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OTHER = 18;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON = 19;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAN = 20;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLE = 21;

	/**
	 * The feature id for the '<em><b>Software Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOFTWARE_AGENT = 22;

	/**
	 * The feature id for the '<em><b>Specialization Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIALIZATION_OF = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 24;

	/**
	 * The feature id for the '<em><b>Used</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USED = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 26;

	/**
	 * The feature id for the '<em><b>Was Associated With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_ASSOCIATED_WITH = 27;

	/**
	 * The feature id for the '<em><b>Was Attributed To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_ATTRIBUTED_TO = 28;

	/**
	 * The feature id for the '<em><b>Was Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_DERIVED_FROM = 29;

	/**
	 * The feature id for the '<em><b>Was Ended By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_ENDED_BY = 30;

	/**
	 * The feature id for the '<em><b>Was Generated By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_GENERATED_BY = 31;

	/**
	 * The feature id for the '<em><b>Was Influenced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_INFLUENCED_BY = 32;

	/**
	 * The feature id for the '<em><b>Was Informed By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_INFORMED_BY = 33;

	/**
	 * The feature id for the '<em><b>Was Invalidated By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_INVALIDATED_BY = 34;

	/**
	 * The feature id for the '<em><b>Was Quoted From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_QUOTED_FROM = 35;

	/**
	 * The feature id for the '<em><b>Was Revision Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_REVISION_OF = 36;

	/**
	 * The feature id for the '<em><b>Was Started By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WAS_STARTED_BY = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 38;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REF = 39;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 40;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.EmptyCollectionImpl <em>Empty Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.EmptyCollectionImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getEmptyCollection()
	 * @generated
	 */
	int EMPTY_COLLECTION = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__LABEL = COLLECTION__LABEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__LOCATION = COLLECTION__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__TYPE = COLLECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__VALUE = COLLECTION__VALUE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__ANY = COLLECTION__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__ID = COLLECTION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__ANY_ATTRIBUTE = COLLECTION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Empty Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.EndImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getEnd()
	 * @generated
	 */
	int END = 14;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Ender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ENDER = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TIME = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ANY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ID = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.GenerationImpl <em>Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.GenerationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getGeneration()
	 * @generated
	 */
	int GENERATION = 16;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__TIME = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__ANY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__ID = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.IDRefImpl <em>ID Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.IDRefImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getIDRef()
	 * @generated
	 */
	int ID_REF = 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF__REF = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>ID Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ID Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.InfluenceImpl <em>Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.InfluenceImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getInfluence()
	 * @generated
	 */
	int INFLUENCE = 18;

	/**
	 * The feature id for the '<em><b>Influencee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__INFLUENCEE = 0;

	/**
	 * The feature id for the '<em><b>Influencer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__INFLUENCER = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__ID = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.InternationalizedStringImpl <em>Internationalized String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.InternationalizedStringImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getInternationalizedString()
	 * @generated
	 */
	int INTERNATIONALIZED_STRING = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONALIZED_STRING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONALIZED_STRING__LANG = 1;

	/**
	 * The number of structural features of the '<em>Internationalized String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONALIZED_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Internationalized String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONALIZED_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.InvalidationImpl <em>Invalidation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.InvalidationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getInvalidation()
	 * @generated
	 */
	int INVALIDATION = 20;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__TIME = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__ANY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__ID = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Invalidation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Invalidation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALIDATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.MembershipImpl <em>Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.MembershipImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getMembership()
	 * @generated
	 */
	int MEMBERSHIP = 21;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.OrganizationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 22;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__LOCATION = AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TYPE = AGENT__TYPE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ANY = AGENT__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = AGENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ANY_ATTRIBUTE = AGENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.OtherImpl <em>Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.OtherImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getOther()
	 * @generated
	 */
	int OTHER = 23;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__ANY = 0;

	/**
	 * The number of structural features of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.PersonImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LOCATION = AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TYPE = AGENT__TYPE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ANY = AGENT__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = AGENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ANY_ATTRIBUTE = AGENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.PlanImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 25;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__LABEL = ENTITY__LABEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__LOCATION = ENTITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__TYPE = ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__VALUE = ENTITY__VALUE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ANY = ENTITY__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ANY_ATTRIBUTE = ENTITY__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.PrimarySourceImpl <em>Primary Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.PrimarySourceImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getPrimarySource()
	 * @generated
	 */
	int PRIMARY_SOURCE = 26;

	/**
	 * The feature id for the '<em><b>Generated Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__GENERATED_ENTITY = DERIVATION__GENERATED_ENTITY;

	/**
	 * The feature id for the '<em><b>Used Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__USED_ENTITY = DERIVATION__USED_ENTITY;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__ACTIVITY = DERIVATION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__GENERATION = DERIVATION__GENERATION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__USAGE = DERIVATION__USAGE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__LABEL = DERIVATION__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__TYPE = DERIVATION__TYPE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__ANY = DERIVATION__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__ID = DERIVATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE__ANY_ATTRIBUTE = DERIVATION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Primary Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE_FEATURE_COUNT = DERIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_SOURCE_OPERATION_COUNT = DERIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.QuotationImpl <em>Quotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.QuotationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getQuotation()
	 * @generated
	 */
	int QUOTATION = 27;

	/**
	 * The feature id for the '<em><b>Generated Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__GENERATED_ENTITY = DERIVATION__GENERATED_ENTITY;

	/**
	 * The feature id for the '<em><b>Used Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__USED_ENTITY = DERIVATION__USED_ENTITY;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__ACTIVITY = DERIVATION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__GENERATION = DERIVATION__GENERATION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__USAGE = DERIVATION__USAGE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__LABEL = DERIVATION__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__TYPE = DERIVATION__TYPE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__ANY = DERIVATION__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__ID = DERIVATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION__ANY_ATTRIBUTE = DERIVATION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Quotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION_FEATURE_COUNT = DERIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTATION_OPERATION_COUNT = DERIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.RevisionImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 28;

	/**
	 * The feature id for the '<em><b>Generated Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__GENERATED_ENTITY = DERIVATION__GENERATED_ENTITY;

	/**
	 * The feature id for the '<em><b>Used Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__USED_ENTITY = DERIVATION__USED_ENTITY;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ACTIVITY = DERIVATION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__GENERATION = DERIVATION__GENERATION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__USAGE = DERIVATION__USAGE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LABEL = DERIVATION__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__TYPE = DERIVATION__TYPE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ANY = DERIVATION__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ID = DERIVATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ANY_ATTRIBUTE = DERIVATION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = DERIVATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = DERIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.SoftwareAgentImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getSoftwareAgent()
	 * @generated
	 */
	int SOFTWARE_AGENT = 29;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__LABEL = AGENT__LABEL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__LOCATION = AGENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__TYPE = AGENT__TYPE;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__ANY = AGENT__ANY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__ID = AGENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT__ANY_ATTRIBUTE = AGENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Software Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Software Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_AGENT_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.SpecializationImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 30;

	/**
	 * The feature id for the '<em><b>Specific Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIFIC_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>General Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__GENERAL_ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.StartImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getStart()
	 * @generated
	 */
	int START = 31;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__STARTER = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TIME = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ANY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ID = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.UsageImpl <em>Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.UsageImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getUsage()
	 * @generated
	 */
	int USAGE = 32;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__TIME = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__ID = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xtendCode.prov.impl.PAttributeImpl <em>PAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xtendCode.prov.impl.PAttributeImpl
	 * @see xtendCode.prov.impl.ProvPackageImpl#getPAttribute()
	 * @generated
	 */
	int PATTRIBUTE = 33;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>PAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>PAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see xtendCode.prov.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Activity#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see xtendCode.prov.Activity#getStartTime()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Activity#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see xtendCode.prov.Activity#getEndTime()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_EndTime();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Activity#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Activity#getLabel()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Activity#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.Activity#getLocation()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Activity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Activity#getType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Activity#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Activity#getAny()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Activity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Activity#getId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Activity#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Activity#getAnyAttribute()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see xtendCode.prov.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Agent#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Agent#getLabel()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Agent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.Agent#getLocation()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Agent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Agent#getType()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Agent#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Agent#getAny()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Agent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Agent#getId()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Agent#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Agent#getAnyAttribute()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Alternate <em>Alternate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternate</em>'.
	 * @see xtendCode.prov.Alternate
	 * @generated
	 */
	EClass getAlternate();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Alternate#getAlternate1 <em>Alternate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternate1</em>'.
	 * @see xtendCode.prov.Alternate#getAlternate1()
	 * @see #getAlternate()
	 * @generated
	 */
	EReference getAlternate_Alternate1();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Alternate#getAlternate2 <em>Alternate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternate2</em>'.
	 * @see xtendCode.prov.Alternate#getAlternate2()
	 * @see #getAlternate()
	 * @generated
	 */
	EReference getAlternate_Alternate2();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see xtendCode.prov.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Association#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.Association#getActivity()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Association#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see xtendCode.prov.Association#getAgent()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Agent();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Association#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see xtendCode.prov.Association#getPlan()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Plan();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Association#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Association#getLabel()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Association#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see xtendCode.prov.Association#getRole()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Role();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Association#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Association#getType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Association#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Association#getAny()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Association#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Association#getId()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Association#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Association#getAnyAttribute()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Attribution <em>Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribution</em>'.
	 * @see xtendCode.prov.Attribution
	 * @generated
	 */
	EClass getAttribution();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Attribution#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see xtendCode.prov.Attribution#getEntity()
	 * @see #getAttribution()
	 * @generated
	 */
	EReference getAttribution_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Attribution#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see xtendCode.prov.Attribution#getAgent()
	 * @see #getAttribution()
	 * @generated
	 */
	EReference getAttribution_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Attribution#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Attribution#getLabel()
	 * @see #getAttribution()
	 * @generated
	 */
	EReference getAttribution_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Attribution#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Attribution#getType()
	 * @see #getAttribution()
	 * @generated
	 */
	EAttribute getAttribution_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Attribution#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Attribution#getAny()
	 * @see #getAttribution()
	 * @generated
	 */
	EAttribute getAttribution_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Attribution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Attribution#getId()
	 * @see #getAttribution()
	 * @generated
	 */
	EAttribute getAttribution_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Attribution#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Attribution#getAnyAttribute()
	 * @see #getAttribution()
	 * @generated
	 */
	EReference getAttribution_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see xtendCode.prov.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.BundleConstructor <em>Bundle Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Constructor</em>'.
	 * @see xtendCode.prov.BundleConstructor
	 * @generated
	 */
	EClass getBundleConstructor();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.BundleConstructor#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see xtendCode.prov.BundleConstructor#getGroup()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EAttribute getBundleConstructor_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see xtendCode.prov.BundleConstructor#getEntity()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see xtendCode.prov.BundleConstructor#getActivity()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasGeneratedBy <em>Was Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Generated By</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasGeneratedBy()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasGeneratedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used</em>'.
	 * @see xtendCode.prov.BundleConstructor#getUsed()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Used();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasInformedBy <em>Was Informed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Informed By</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasInformedBy()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasInformedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasStartedBy <em>Was Started By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Started By</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasStartedBy()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasStartedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasEndedBy <em>Was Ended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Ended By</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasEndedBy()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasEndedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasInvalidatedBy <em>Was Invalidated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Invalidated By</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasInvalidatedBy()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasInvalidatedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasDerivedFrom <em>Was Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Derived From</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasDerivedFrom()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasDerivedFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasRevisionOf <em>Was Revision Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Revision Of</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasRevisionOf()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasRevisionOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasQuotedFrom <em>Was Quoted From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Quoted From</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasQuotedFrom()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasQuotedFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getHadPrimarySource <em>Had Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Had Primary Source</em>'.
	 * @see xtendCode.prov.BundleConstructor#getHadPrimarySource()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_HadPrimarySource();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see xtendCode.prov.BundleConstructor#getAgent()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see xtendCode.prov.BundleConstructor#getPerson()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see xtendCode.prov.BundleConstructor#getOrganization()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Organization();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getSoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Agent</em>'.
	 * @see xtendCode.prov.BundleConstructor#getSoftwareAgent()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_SoftwareAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasAttributedTo <em>Was Attributed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Attributed To</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasAttributedTo()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasAttributedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasAssociatedWith <em>Was Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Associated With</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasAssociatedWith()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasAssociatedWith();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getActedOnBehalfOf <em>Acted On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acted On Behalf Of</em>'.
	 * @see xtendCode.prov.BundleConstructor#getActedOnBehalfOf()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_ActedOnBehalfOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getWasInfluencedBy <em>Was Influenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Influenced By</em>'.
	 * @see xtendCode.prov.BundleConstructor#getWasInfluencedBy()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_WasInfluencedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle</em>'.
	 * @see xtendCode.prov.BundleConstructor#getBundle()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Bundle();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getSpecializationOf <em>Specialization Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialization Of</em>'.
	 * @see xtendCode.prov.BundleConstructor#getSpecializationOf()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_SpecializationOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getAlternateOf <em>Alternate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternate Of</em>'.
	 * @see xtendCode.prov.BundleConstructor#getAlternateOf()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_AlternateOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see xtendCode.prov.BundleConstructor#getCollection()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getEmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empty Collection</em>'.
	 * @see xtendCode.prov.BundleConstructor#getEmptyCollection()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_EmptyCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getHadMember <em>Had Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Had Member</em>'.
	 * @see xtendCode.prov.BundleConstructor#getHadMember()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_HadMember();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan</em>'.
	 * @see xtendCode.prov.BundleConstructor#getPlan()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Plan();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other</em>'.
	 * @see xtendCode.prov.BundleConstructor#getOther()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_Other();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.BundleConstructor#getInternalElementGroup <em>Internal Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Internal Element Group</em>'.
	 * @see xtendCode.prov.BundleConstructor#getInternalElementGroup()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EAttribute getBundleConstructor_InternalElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see xtendCode.prov.BundleConstructor#getInternalElement()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_InternalElement();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.BundleConstructor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.BundleConstructor#getId()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EAttribute getBundleConstructor_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.BundleConstructor#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.BundleConstructor#getAnyAttribute()
	 * @see #getBundleConstructor()
	 * @generated
	 */
	EReference getBundleConstructor_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see xtendCode.prov.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see xtendCode.prov.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Communication#getInformed <em>Informed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Informed</em>'.
	 * @see xtendCode.prov.Communication#getInformed()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Informed();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Communication#getInformant <em>Informant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Informant</em>'.
	 * @see xtendCode.prov.Communication#getInformant()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Informant();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Communication#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Communication#getLabel()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Communication#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Communication#getType()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Communication#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Communication#getAny()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Communication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Communication#getId()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Communication#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Communication#getAnyAttribute()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see xtendCode.prov.Delegation
	 * @generated
	 */
	EClass getDelegation();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Delegation#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see xtendCode.prov.Delegation#getDelegate()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_Delegate();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Delegation#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responsible</em>'.
	 * @see xtendCode.prov.Delegation#getResponsible()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_Responsible();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Delegation#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.Delegation#getActivity()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Delegation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Delegation#getLabel()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Delegation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Delegation#getType()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Delegation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Delegation#getAny()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Delegation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Delegation#getId()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Delegation#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Delegation#getAnyAttribute()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation</em>'.
	 * @see xtendCode.prov.Derivation
	 * @generated
	 */
	EClass getDerivation();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Derivation#getGeneratedEntity <em>Generated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generated Entity</em>'.
	 * @see xtendCode.prov.Derivation#getGeneratedEntity()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_GeneratedEntity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Derivation#getUsedEntity <em>Used Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used Entity</em>'.
	 * @see xtendCode.prov.Derivation#getUsedEntity()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_UsedEntity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Derivation#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.Derivation#getActivity()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Derivation#getGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generation</em>'.
	 * @see xtendCode.prov.Derivation#getGeneration()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_Generation();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Derivation#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usage</em>'.
	 * @see xtendCode.prov.Derivation#getUsage()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Derivation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Derivation#getLabel()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Derivation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Derivation#getType()
	 * @see #getDerivation()
	 * @generated
	 */
	EAttribute getDerivation_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Derivation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Derivation#getAny()
	 * @see #getDerivation()
	 * @generated
	 */
	EAttribute getDerivation_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Derivation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Derivation#getId()
	 * @see #getDerivation()
	 * @generated
	 */
	EAttribute getDerivation_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Derivation#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Derivation#getAnyAttribute()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see xtendCode.prov.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Document#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see xtendCode.prov.Document#getGroup()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see xtendCode.prov.Document#getEntity()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see xtendCode.prov.Document#getActivity()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasGeneratedBy <em>Was Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Generated By</em>'.
	 * @see xtendCode.prov.Document#getWasGeneratedBy()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasGeneratedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used</em>'.
	 * @see xtendCode.prov.Document#getUsed()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Used();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasInformedBy <em>Was Informed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Informed By</em>'.
	 * @see xtendCode.prov.Document#getWasInformedBy()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasInformedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasStartedBy <em>Was Started By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Started By</em>'.
	 * @see xtendCode.prov.Document#getWasStartedBy()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasStartedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasEndedBy <em>Was Ended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Ended By</em>'.
	 * @see xtendCode.prov.Document#getWasEndedBy()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasEndedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasInvalidatedBy <em>Was Invalidated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Invalidated By</em>'.
	 * @see xtendCode.prov.Document#getWasInvalidatedBy()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasInvalidatedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasDerivedFrom <em>Was Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Derived From</em>'.
	 * @see xtendCode.prov.Document#getWasDerivedFrom()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasDerivedFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasRevisionOf <em>Was Revision Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Revision Of</em>'.
	 * @see xtendCode.prov.Document#getWasRevisionOf()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasRevisionOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasQuotedFrom <em>Was Quoted From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Quoted From</em>'.
	 * @see xtendCode.prov.Document#getWasQuotedFrom()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasQuotedFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getHadPrimarySource <em>Had Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Had Primary Source</em>'.
	 * @see xtendCode.prov.Document#getHadPrimarySource()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_HadPrimarySource();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agent</em>'.
	 * @see xtendCode.prov.Document#getAgent()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see xtendCode.prov.Document#getPerson()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organization</em>'.
	 * @see xtendCode.prov.Document#getOrganization()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Organization();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getSoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Agent</em>'.
	 * @see xtendCode.prov.Document#getSoftwareAgent()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_SoftwareAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasAttributedTo <em>Was Attributed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Attributed To</em>'.
	 * @see xtendCode.prov.Document#getWasAttributedTo()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasAttributedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasAssociatedWith <em>Was Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Associated With</em>'.
	 * @see xtendCode.prov.Document#getWasAssociatedWith()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasAssociatedWith();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getActedOnBehalfOf <em>Acted On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acted On Behalf Of</em>'.
	 * @see xtendCode.prov.Document#getActedOnBehalfOf()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ActedOnBehalfOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getWasInfluencedBy <em>Was Influenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Was Influenced By</em>'.
	 * @see xtendCode.prov.Document#getWasInfluencedBy()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_WasInfluencedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle</em>'.
	 * @see xtendCode.prov.Document#getBundle()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Bundle();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getSpecializationOf <em>Specialization Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialization Of</em>'.
	 * @see xtendCode.prov.Document#getSpecializationOf()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_SpecializationOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getAlternateOf <em>Alternate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternate Of</em>'.
	 * @see xtendCode.prov.Document#getAlternateOf()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_AlternateOf();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see xtendCode.prov.Document#getCollection()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getEmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empty Collection</em>'.
	 * @see xtendCode.prov.Document#getEmptyCollection()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_EmptyCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getHadMember <em>Had Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Had Member</em>'.
	 * @see xtendCode.prov.Document#getHadMember()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_HadMember();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan</em>'.
	 * @see xtendCode.prov.Document#getPlan()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Plan();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other</em>'.
	 * @see xtendCode.prov.Document#getOther()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Other();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Document#getInternalElementGroup <em>Internal Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Internal Element Group</em>'.
	 * @see xtendCode.prov.Document#getInternalElementGroup()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_InternalElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see xtendCode.prov.Document#getInternalElement()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_InternalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Document#getBundleContent <em>Bundle Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle Content</em>'.
	 * @see xtendCode.prov.Document#getBundleContent()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_BundleContent();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Document#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Document#getId()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Id();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see xtendCode.prov.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see xtendCode.prov.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link xtendCode.prov.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see xtendCode.prov.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link xtendCode.prov.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see xtendCode.prov.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getActedOnBehalfOf <em>Acted On Behalf Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acted On Behalf Of</em>'.
	 * @see xtendCode.prov.DocumentRoot#getActedOnBehalfOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ActedOnBehalfOf();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.DocumentRoot#getActivity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see xtendCode.prov.DocumentRoot#getAgent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Agent();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getAlternateOf <em>Alternate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternate Of</em>'.
	 * @see xtendCode.prov.DocumentRoot#getAlternateOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AlternateOf();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle</em>'.
	 * @see xtendCode.prov.DocumentRoot#getBundle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bundle();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see xtendCode.prov.DocumentRoot#getCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.DocumentRoot#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document</em>'.
	 * @see xtendCode.prov.DocumentRoot#getDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Document();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getEmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty Collection</em>'.
	 * @see xtendCode.prov.DocumentRoot#getEmptyCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EmptyCollection();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getHadMember <em>Had Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Had Member</em>'.
	 * @see xtendCode.prov.DocumentRoot#getHadMember()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HadMember();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getHadPrimarySource <em>Had Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Had Primary Source</em>'.
	 * @see xtendCode.prov.DocumentRoot#getHadPrimarySource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HadPrimarySource();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see xtendCode.prov.DocumentRoot#getEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Element</em>'.
	 * @see xtendCode.prov.DocumentRoot#getInternalElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InternalElement();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see xtendCode.prov.DocumentRoot#getLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Label();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see xtendCode.prov.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization</em>'.
	 * @see xtendCode.prov.DocumentRoot#getOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Other</em>'.
	 * @see xtendCode.prov.DocumentRoot#getOther()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Other();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see xtendCode.prov.DocumentRoot#getPerson()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Person();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see xtendCode.prov.DocumentRoot#getPlan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Plan();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.DocumentRoot#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see xtendCode.prov.DocumentRoot#getRole()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Role();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getSoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Agent</em>'.
	 * @see xtendCode.prov.DocumentRoot#getSoftwareAgent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SoftwareAgent();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getSpecializationOf <em>Specialization Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specialization Of</em>'.
	 * @see xtendCode.prov.DocumentRoot#getSpecializationOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpecializationOf();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see xtendCode.prov.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used</em>'.
	 * @see xtendCode.prov.DocumentRoot#getUsed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Used();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xtendCode.prov.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasAssociatedWith <em>Was Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Associated With</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasAssociatedWith()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasAssociatedWith();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasAttributedTo <em>Was Attributed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Attributed To</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasAttributedTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasAttributedTo();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasDerivedFrom <em>Was Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Derived From</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasDerivedFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasDerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasEndedBy <em>Was Ended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Ended By</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasEndedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasEndedBy();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasGeneratedBy <em>Was Generated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Generated By</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasGeneratedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasGeneratedBy();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasInfluencedBy <em>Was Influenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Influenced By</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasInfluencedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasInfluencedBy();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasInformedBy <em>Was Informed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Informed By</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasInformedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasInformedBy();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasInvalidatedBy <em>Was Invalidated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Invalidated By</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasInvalidatedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasInvalidatedBy();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasQuotedFrom <em>Was Quoted From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Quoted From</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasQuotedFrom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasQuotedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasRevisionOf <em>Was Revision Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Revision Of</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasRevisionOf()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasRevisionOf();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.DocumentRoot#getWasStartedBy <em>Was Started By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Was Started By</em>'.
	 * @see xtendCode.prov.DocumentRoot#getWasStartedBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WasStartedBy();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.DocumentRoot#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see xtendCode.prov.DocumentRoot#getRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Ref();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.EmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Collection</em>'.
	 * @see xtendCode.prov.EmptyCollection
	 * @generated
	 */
	EClass getEmptyCollection();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see xtendCode.prov.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.End#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.End#getActivity()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.End#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see xtendCode.prov.End#getTrigger()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.End#getEnder <em>Ender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ender</em>'.
	 * @see xtendCode.prov.End#getEnder()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_Ender();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.End#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see xtendCode.prov.End#getTime()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.End#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.End#getLabel()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.End#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.End#getLocation()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.End#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see xtendCode.prov.End#getRole()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Role();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.End#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.End#getType()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.End#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.End#getAny()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.End#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.End#getId()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.End#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.End#getAnyAttribute()
	 * @see #getEnd()
	 * @generated
	 */
	EReference getEnd_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see xtendCode.prov.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Entity#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Entity#getLabel()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Entity#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.Entity#getLocation()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Entity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Entity#getType()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Type();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Entity#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xtendCode.prov.Entity#getValue()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Value();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Entity#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Entity#getAny()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Entity#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Entity#getAnyAttribute()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Generation <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation</em>'.
	 * @see xtendCode.prov.Generation
	 * @generated
	 */
	EClass getGeneration();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Generation#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see xtendCode.prov.Generation#getEntity()
	 * @see #getGeneration()
	 * @generated
	 */
	EReference getGeneration_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Generation#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.Generation#getActivity()
	 * @see #getGeneration()
	 * @generated
	 */
	EReference getGeneration_Activity();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Generation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see xtendCode.prov.Generation#getTime()
	 * @see #getGeneration()
	 * @generated
	 */
	EAttribute getGeneration_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Generation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Generation#getLabel()
	 * @see #getGeneration()
	 * @generated
	 */
	EReference getGeneration_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Generation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.Generation#getLocation()
	 * @see #getGeneration()
	 * @generated
	 */
	EAttribute getGeneration_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Generation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see xtendCode.prov.Generation#getRole()
	 * @see #getGeneration()
	 * @generated
	 */
	EAttribute getGeneration_Role();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Generation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Generation#getType()
	 * @see #getGeneration()
	 * @generated
	 */
	EAttribute getGeneration_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Generation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Generation#getAny()
	 * @see #getGeneration()
	 * @generated
	 */
	EAttribute getGeneration_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Generation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Generation#getId()
	 * @see #getGeneration()
	 * @generated
	 */
	EAttribute getGeneration_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Generation#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Generation#getAnyAttribute()
	 * @see #getGeneration()
	 * @generated
	 */
	EReference getGeneration_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.IDRef <em>ID Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID Ref</em>'.
	 * @see xtendCode.prov.IDRef
	 * @generated
	 */
	EClass getIDRef();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.IDRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see xtendCode.prov.IDRef#getRef()
	 * @see #getIDRef()
	 * @generated
	 */
	EAttribute getIDRef_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.IDRef#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.IDRef#getAnyAttribute()
	 * @see #getIDRef()
	 * @generated
	 */
	EReference getIDRef_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Influence <em>Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence</em>'.
	 * @see xtendCode.prov.Influence
	 * @generated
	 */
	EClass getInfluence();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Influence#getInfluencee <em>Influencee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Influencee</em>'.
	 * @see xtendCode.prov.Influence#getInfluencee()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_Influencee();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Influence#getInfluencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Influencer</em>'.
	 * @see xtendCode.prov.Influence#getInfluencer()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_Influencer();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Influence#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Influence#getLabel()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Influence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Influence#getType()
	 * @see #getInfluence()
	 * @generated
	 */
	EAttribute getInfluence_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Influence#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Influence#getAny()
	 * @see #getInfluence()
	 * @generated
	 */
	EAttribute getInfluence_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Influence#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Influence#getId()
	 * @see #getInfluence()
	 * @generated
	 */
	EAttribute getInfluence_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Influence#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Influence#getAnyAttribute()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.InternationalizedString <em>Internationalized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internationalized String</em>'.
	 * @see xtendCode.prov.InternationalizedString
	 * @generated
	 */
	EClass getInternationalizedString();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.InternationalizedString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xtendCode.prov.InternationalizedString#getValue()
	 * @see #getInternationalizedString()
	 * @generated
	 */
	EAttribute getInternationalizedString_Value();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.InternationalizedString#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see xtendCode.prov.InternationalizedString#getLang()
	 * @see #getInternationalizedString()
	 * @generated
	 */
	EAttribute getInternationalizedString_Lang();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Invalidation <em>Invalidation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalidation</em>'.
	 * @see xtendCode.prov.Invalidation
	 * @generated
	 */
	EClass getInvalidation();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Invalidation#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see xtendCode.prov.Invalidation#getEntity()
	 * @see #getInvalidation()
	 * @generated
	 */
	EReference getInvalidation_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Invalidation#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.Invalidation#getActivity()
	 * @see #getInvalidation()
	 * @generated
	 */
	EReference getInvalidation_Activity();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Invalidation#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see xtendCode.prov.Invalidation#getTime()
	 * @see #getInvalidation()
	 * @generated
	 */
	EAttribute getInvalidation_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Invalidation#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Invalidation#getLabel()
	 * @see #getInvalidation()
	 * @generated
	 */
	EReference getInvalidation_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Invalidation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.Invalidation#getLocation()
	 * @see #getInvalidation()
	 * @generated
	 */
	EAttribute getInvalidation_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Invalidation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see xtendCode.prov.Invalidation#getRole()
	 * @see #getInvalidation()
	 * @generated
	 */
	EAttribute getInvalidation_Role();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Invalidation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Invalidation#getType()
	 * @see #getInvalidation()
	 * @generated
	 */
	EAttribute getInvalidation_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Invalidation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Invalidation#getAny()
	 * @see #getInvalidation()
	 * @generated
	 */
	EAttribute getInvalidation_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Invalidation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Invalidation#getId()
	 * @see #getInvalidation()
	 * @generated
	 */
	EAttribute getInvalidation_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Invalidation#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Invalidation#getAnyAttribute()
	 * @see #getInvalidation()
	 * @generated
	 */
	EReference getInvalidation_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Membership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership</em>'.
	 * @see xtendCode.prov.Membership
	 * @generated
	 */
	EClass getMembership();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Membership#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see xtendCode.prov.Membership#getCollection()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Membership#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see xtendCode.prov.Membership#getEntity()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_Entity();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see xtendCode.prov.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other</em>'.
	 * @see xtendCode.prov.Other
	 * @generated
	 */
	EClass getOther();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Other#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Other#getAny()
	 * @see #getOther()
	 * @generated
	 */
	EAttribute getOther_Any();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see xtendCode.prov.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see xtendCode.prov.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.PrimarySource <em>Primary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Source</em>'.
	 * @see xtendCode.prov.PrimarySource
	 * @generated
	 */
	EClass getPrimarySource();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Quotation <em>Quotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quotation</em>'.
	 * @see xtendCode.prov.Quotation
	 * @generated
	 */
	EClass getQuotation();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see xtendCode.prov.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.SoftwareAgent <em>Software Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Agent</em>'.
	 * @see xtendCode.prov.SoftwareAgent
	 * @generated
	 */
	EClass getSoftwareAgent();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see xtendCode.prov.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Specialization#getSpecificEntity <em>Specific Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specific Entity</em>'.
	 * @see xtendCode.prov.Specialization#getSpecificEntity()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SpecificEntity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Specialization#getGeneralEntity <em>General Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Entity</em>'.
	 * @see xtendCode.prov.Specialization#getGeneralEntity()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_GeneralEntity();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see xtendCode.prov.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Start#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.Start#getActivity()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Start#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see xtendCode.prov.Start#getTrigger()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Start#getStarter <em>Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starter</em>'.
	 * @see xtendCode.prov.Start#getStarter()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Starter();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Start#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see xtendCode.prov.Start#getTime()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Start#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Start#getLabel()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Start#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.Start#getLocation()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Start#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see xtendCode.prov.Start#getRole()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Role();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Start#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Start#getType()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Start#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Start#getAny()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Start#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Start#getId()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Start#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Start#getAnyAttribute()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage</em>'.
	 * @see xtendCode.prov.Usage
	 * @generated
	 */
	EClass getUsage();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Usage#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see xtendCode.prov.Usage#getActivity()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link xtendCode.prov.Usage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see xtendCode.prov.Usage#getEntity()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_Entity();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Usage#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see xtendCode.prov.Usage#getTime()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Time();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Usage#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see xtendCode.prov.Usage#getLabel()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_Label();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Usage#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see xtendCode.prov.Usage#getLocation()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Location();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Usage#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role</em>'.
	 * @see xtendCode.prov.Usage#getRole()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Role();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Usage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see xtendCode.prov.Usage#getType()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Type();

	/**
	 * Returns the meta object for the attribute list '{@link xtendCode.prov.Usage#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see xtendCode.prov.Usage#getAny()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Any();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.Usage#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see xtendCode.prov.Usage#getId()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link xtendCode.prov.Usage#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Attribute</em>'.
	 * @see xtendCode.prov.Usage#getAnyAttribute()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link xtendCode.prov.PAttribute <em>PAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAttribute</em>'.
	 * @see xtendCode.prov.PAttribute
	 * @generated
	 */
	EClass getPAttribute();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.PAttribute#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see xtendCode.prov.PAttribute#getKey()
	 * @see #getPAttribute()
	 * @generated
	 */
	EAttribute getPAttribute_Key();

	/**
	 * Returns the meta object for the attribute '{@link xtendCode.prov.PAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see xtendCode.prov.PAttribute#getValue()
	 * @see #getPAttribute()
	 * @generated
	 */
	EAttribute getPAttribute_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProvFactory getProvFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.ActivityImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__START_TIME = eINSTANCE.getActivity_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__END_TIME = eINSTANCE.getActivity_EndTime();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LABEL = eINSTANCE.getActivity_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__LOCATION = eINSTANCE.getActivity_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TYPE = eINSTANCE.getActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ANY = eINSTANCE.getActivity_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ID = eINSTANCE.getActivity_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ANY_ATTRIBUTE = eINSTANCE.getActivity_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.AgentImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__LABEL = eINSTANCE.getAgent_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__LOCATION = eINSTANCE.getAgent_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__TYPE = eINSTANCE.getAgent_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__ANY = eINSTANCE.getAgent_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__ID = eINSTANCE.getAgent_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ANY_ATTRIBUTE = eINSTANCE.getAgent_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.AlternateImpl <em>Alternate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.AlternateImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getAlternate()
		 * @generated
		 */
		EClass ALTERNATE = eINSTANCE.getAlternate();

		/**
		 * The meta object literal for the '<em><b>Alternate1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATE__ALTERNATE1 = eINSTANCE.getAlternate_Alternate1();

		/**
		 * The meta object literal for the '<em><b>Alternate2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATE__ALTERNATE2 = eINSTANCE.getAlternate_Alternate2();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.AssociationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ACTIVITY = eINSTANCE.getAssociation_Activity();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__AGENT = eINSTANCE.getAssociation_Agent();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__PLAN = eINSTANCE.getAssociation_Plan();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__LABEL = eINSTANCE.getAssociation_Label();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ROLE = eINSTANCE.getAssociation_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ANY = eINSTANCE.getAssociation_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ID = eINSTANCE.getAssociation_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ANY_ATTRIBUTE = eINSTANCE.getAssociation_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.AttributionImpl <em>Attribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.AttributionImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getAttribution()
		 * @generated
		 */
		EClass ATTRIBUTION = eINSTANCE.getAttribution();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION__ENTITY = eINSTANCE.getAttribution_Entity();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION__AGENT = eINSTANCE.getAttribution_Agent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION__LABEL = eINSTANCE.getAttribution_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTION__TYPE = eINSTANCE.getAttribution_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTION__ANY = eINSTANCE.getAttribution_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTION__ID = eINSTANCE.getAttribution_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION__ANY_ATTRIBUTE = eINSTANCE.getAttribution_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.BundleImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.BundleConstructorImpl <em>Bundle Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.BundleConstructorImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getBundleConstructor()
		 * @generated
		 */
		EClass BUNDLE_CONSTRUCTOR = eINSTANCE.getBundleConstructor();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CONSTRUCTOR__GROUP = eINSTANCE.getBundleConstructor_Group();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__ENTITY = eINSTANCE.getBundleConstructor_Entity();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__ACTIVITY = eINSTANCE.getBundleConstructor_Activity();

		/**
		 * The meta object literal for the '<em><b>Was Generated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_GENERATED_BY = eINSTANCE.getBundleConstructor_WasGeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__USED = eINSTANCE.getBundleConstructor_Used();

		/**
		 * The meta object literal for the '<em><b>Was Informed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_INFORMED_BY = eINSTANCE.getBundleConstructor_WasInformedBy();

		/**
		 * The meta object literal for the '<em><b>Was Started By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_STARTED_BY = eINSTANCE.getBundleConstructor_WasStartedBy();

		/**
		 * The meta object literal for the '<em><b>Was Ended By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_ENDED_BY = eINSTANCE.getBundleConstructor_WasEndedBy();

		/**
		 * The meta object literal for the '<em><b>Was Invalidated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_INVALIDATED_BY = eINSTANCE.getBundleConstructor_WasInvalidatedBy();

		/**
		 * The meta object literal for the '<em><b>Was Derived From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_DERIVED_FROM = eINSTANCE.getBundleConstructor_WasDerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Was Revision Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_REVISION_OF = eINSTANCE.getBundleConstructor_WasRevisionOf();

		/**
		 * The meta object literal for the '<em><b>Was Quoted From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_QUOTED_FROM = eINSTANCE.getBundleConstructor_WasQuotedFrom();

		/**
		 * The meta object literal for the '<em><b>Had Primary Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__HAD_PRIMARY_SOURCE = eINSTANCE.getBundleConstructor_HadPrimarySource();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__AGENT = eINSTANCE.getBundleConstructor_Agent();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__PERSON = eINSTANCE.getBundleConstructor_Person();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__ORGANIZATION = eINSTANCE.getBundleConstructor_Organization();

		/**
		 * The meta object literal for the '<em><b>Software Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__SOFTWARE_AGENT = eINSTANCE.getBundleConstructor_SoftwareAgent();

		/**
		 * The meta object literal for the '<em><b>Was Attributed To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_ATTRIBUTED_TO = eINSTANCE.getBundleConstructor_WasAttributedTo();

		/**
		 * The meta object literal for the '<em><b>Was Associated With</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_ASSOCIATED_WITH = eINSTANCE.getBundleConstructor_WasAssociatedWith();

		/**
		 * The meta object literal for the '<em><b>Acted On Behalf Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__ACTED_ON_BEHALF_OF = eINSTANCE.getBundleConstructor_ActedOnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Was Influenced By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__WAS_INFLUENCED_BY = eINSTANCE.getBundleConstructor_WasInfluencedBy();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__BUNDLE = eINSTANCE.getBundleConstructor_Bundle();

		/**
		 * The meta object literal for the '<em><b>Specialization Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__SPECIALIZATION_OF = eINSTANCE.getBundleConstructor_SpecializationOf();

		/**
		 * The meta object literal for the '<em><b>Alternate Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__ALTERNATE_OF = eINSTANCE.getBundleConstructor_AlternateOf();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__COLLECTION = eINSTANCE.getBundleConstructor_Collection();

		/**
		 * The meta object literal for the '<em><b>Empty Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__EMPTY_COLLECTION = eINSTANCE.getBundleConstructor_EmptyCollection();

		/**
		 * The meta object literal for the '<em><b>Had Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__HAD_MEMBER = eINSTANCE.getBundleConstructor_HadMember();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__PLAN = eINSTANCE.getBundleConstructor_Plan();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__OTHER = eINSTANCE.getBundleConstructor_Other();

		/**
		 * The meta object literal for the '<em><b>Internal Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CONSTRUCTOR__INTERNAL_ELEMENT_GROUP = eINSTANCE.getBundleConstructor_InternalElementGroup();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__INTERNAL_ELEMENT = eINSTANCE.getBundleConstructor_InternalElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_CONSTRUCTOR__ID = eINSTANCE.getBundleConstructor_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CONSTRUCTOR__ANY_ATTRIBUTE = eINSTANCE.getBundleConstructor_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.CollectionImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.CommunicationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Informed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__INFORMED = eINSTANCE.getCommunication_Informed();

		/**
		 * The meta object literal for the '<em><b>Informant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__INFORMANT = eINSTANCE.getCommunication_Informant();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__LABEL = eINSTANCE.getCommunication_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__TYPE = eINSTANCE.getCommunication_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__ANY = eINSTANCE.getCommunication_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__ID = eINSTANCE.getCommunication_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__ANY_ATTRIBUTE = eINSTANCE.getCommunication_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.DelegationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__DELEGATE = eINSTANCE.getDelegation_Delegate();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__RESPONSIBLE = eINSTANCE.getDelegation_Responsible();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__ACTIVITY = eINSTANCE.getDelegation_Activity();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__LABEL = eINSTANCE.getDelegation_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__TYPE = eINSTANCE.getDelegation_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__ANY = eINSTANCE.getDelegation_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__ID = eINSTANCE.getDelegation_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__ANY_ATTRIBUTE = eINSTANCE.getDelegation_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.DerivationImpl <em>Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.DerivationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getDerivation()
		 * @generated
		 */
		EClass DERIVATION = eINSTANCE.getDerivation();

		/**
		 * The meta object literal for the '<em><b>Generated Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__GENERATED_ENTITY = eINSTANCE.getDerivation_GeneratedEntity();

		/**
		 * The meta object literal for the '<em><b>Used Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__USED_ENTITY = eINSTANCE.getDerivation_UsedEntity();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__ACTIVITY = eINSTANCE.getDerivation_Activity();

		/**
		 * The meta object literal for the '<em><b>Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__GENERATION = eINSTANCE.getDerivation_Generation();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__USAGE = eINSTANCE.getDerivation_Usage();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__LABEL = eINSTANCE.getDerivation_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION__TYPE = eINSTANCE.getDerivation_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION__ANY = eINSTANCE.getDerivation_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION__ID = eINSTANCE.getDerivation_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__ANY_ATTRIBUTE = eINSTANCE.getDerivation_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.DocumentImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__GROUP = eINSTANCE.getDocument_Group();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ENTITY = eINSTANCE.getDocument_Entity();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ACTIVITY = eINSTANCE.getDocument_Activity();

		/**
		 * The meta object literal for the '<em><b>Was Generated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_GENERATED_BY = eINSTANCE.getDocument_WasGeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__USED = eINSTANCE.getDocument_Used();

		/**
		 * The meta object literal for the '<em><b>Was Informed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_INFORMED_BY = eINSTANCE.getDocument_WasInformedBy();

		/**
		 * The meta object literal for the '<em><b>Was Started By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_STARTED_BY = eINSTANCE.getDocument_WasStartedBy();

		/**
		 * The meta object literal for the '<em><b>Was Ended By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_ENDED_BY = eINSTANCE.getDocument_WasEndedBy();

		/**
		 * The meta object literal for the '<em><b>Was Invalidated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_INVALIDATED_BY = eINSTANCE.getDocument_WasInvalidatedBy();

		/**
		 * The meta object literal for the '<em><b>Was Derived From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_DERIVED_FROM = eINSTANCE.getDocument_WasDerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Was Revision Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_REVISION_OF = eINSTANCE.getDocument_WasRevisionOf();

		/**
		 * The meta object literal for the '<em><b>Was Quoted From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_QUOTED_FROM = eINSTANCE.getDocument_WasQuotedFrom();

		/**
		 * The meta object literal for the '<em><b>Had Primary Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__HAD_PRIMARY_SOURCE = eINSTANCE.getDocument_HadPrimarySource();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__AGENT = eINSTANCE.getDocument_Agent();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__PERSON = eINSTANCE.getDocument_Person();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ORGANIZATION = eINSTANCE.getDocument_Organization();

		/**
		 * The meta object literal for the '<em><b>Software Agent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SOFTWARE_AGENT = eINSTANCE.getDocument_SoftwareAgent();

		/**
		 * The meta object literal for the '<em><b>Was Attributed To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_ATTRIBUTED_TO = eINSTANCE.getDocument_WasAttributedTo();

		/**
		 * The meta object literal for the '<em><b>Was Associated With</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_ASSOCIATED_WITH = eINSTANCE.getDocument_WasAssociatedWith();

		/**
		 * The meta object literal for the '<em><b>Acted On Behalf Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ACTED_ON_BEHALF_OF = eINSTANCE.getDocument_ActedOnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Was Influenced By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__WAS_INFLUENCED_BY = eINSTANCE.getDocument_WasInfluencedBy();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__BUNDLE = eINSTANCE.getDocument_Bundle();

		/**
		 * The meta object literal for the '<em><b>Specialization Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SPECIALIZATION_OF = eINSTANCE.getDocument_SpecializationOf();

		/**
		 * The meta object literal for the '<em><b>Alternate Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ALTERNATE_OF = eINSTANCE.getDocument_AlternateOf();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__COLLECTION = eINSTANCE.getDocument_Collection();

		/**
		 * The meta object literal for the '<em><b>Empty Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__EMPTY_COLLECTION = eINSTANCE.getDocument_EmptyCollection();

		/**
		 * The meta object literal for the '<em><b>Had Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__HAD_MEMBER = eINSTANCE.getDocument_HadMember();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__PLAN = eINSTANCE.getDocument_Plan();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OTHER = eINSTANCE.getDocument_Other();

		/**
		 * The meta object literal for the '<em><b>Internal Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__INTERNAL_ELEMENT_GROUP = eINSTANCE.getDocument_InternalElementGroup();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__INTERNAL_ELEMENT = eINSTANCE.getDocument_InternalElement();

		/**
		 * The meta object literal for the '<em><b>Bundle Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__BUNDLE_CONTENT = eINSTANCE.getDocument_BundleContent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__ID = eINSTANCE.getDocument_Id();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.DocumentRootImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Acted On Behalf Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTED_ON_BEHALF_OF = eINSTANCE.getDocumentRoot_ActedOnBehalfOf();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACTIVITY = eINSTANCE.getDocumentRoot_Activity();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AGENT = eINSTANCE.getDocumentRoot_Agent();

		/**
		 * The meta object literal for the '<em><b>Alternate Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ALTERNATE_OF = eINSTANCE.getDocumentRoot_AlternateOf();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUNDLE = eINSTANCE.getDocumentRoot_Bundle();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLECTION = eINSTANCE.getDocumentRoot_Collection();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT = eINSTANCE.getDocumentRoot_Document();

		/**
		 * The meta object literal for the '<em><b>Empty Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMPTY_COLLECTION = eINSTANCE.getDocumentRoot_EmptyCollection();

		/**
		 * The meta object literal for the '<em><b>Had Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HAD_MEMBER = eINSTANCE.getDocumentRoot_HadMember();

		/**
		 * The meta object literal for the '<em><b>Had Primary Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HAD_PRIMARY_SOURCE = eINSTANCE.getDocumentRoot_HadPrimarySource();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY = eINSTANCE.getDocumentRoot_Entity();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERNAL_ELEMENT = eINSTANCE.getDocumentRoot_InternalElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LABEL = eINSTANCE.getDocumentRoot_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LOCATION = eINSTANCE.getDocumentRoot_Location();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORGANIZATION = eINSTANCE.getDocumentRoot_Organization();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OTHER = eINSTANCE.getDocumentRoot_Other();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSON = eINSTANCE.getDocumentRoot_Person();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLAN = eINSTANCE.getDocumentRoot_Plan();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ROLE = eINSTANCE.getDocumentRoot_Role();

		/**
		 * The meta object literal for the '<em><b>Software Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOFTWARE_AGENT = eINSTANCE.getDocumentRoot_SoftwareAgent();

		/**
		 * The meta object literal for the '<em><b>Specialization Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIALIZATION_OF = eINSTANCE.getDocumentRoot_SpecializationOf();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USED = eINSTANCE.getDocumentRoot_Used();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '<em><b>Was Associated With</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_ASSOCIATED_WITH = eINSTANCE.getDocumentRoot_WasAssociatedWith();

		/**
		 * The meta object literal for the '<em><b>Was Attributed To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_ATTRIBUTED_TO = eINSTANCE.getDocumentRoot_WasAttributedTo();

		/**
		 * The meta object literal for the '<em><b>Was Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_DERIVED_FROM = eINSTANCE.getDocumentRoot_WasDerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Was Ended By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_ENDED_BY = eINSTANCE.getDocumentRoot_WasEndedBy();

		/**
		 * The meta object literal for the '<em><b>Was Generated By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_GENERATED_BY = eINSTANCE.getDocumentRoot_WasGeneratedBy();

		/**
		 * The meta object literal for the '<em><b>Was Influenced By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_INFLUENCED_BY = eINSTANCE.getDocumentRoot_WasInfluencedBy();

		/**
		 * The meta object literal for the '<em><b>Was Informed By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_INFORMED_BY = eINSTANCE.getDocumentRoot_WasInformedBy();

		/**
		 * The meta object literal for the '<em><b>Was Invalidated By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_INVALIDATED_BY = eINSTANCE.getDocumentRoot_WasInvalidatedBy();

		/**
		 * The meta object literal for the '<em><b>Was Quoted From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_QUOTED_FROM = eINSTANCE.getDocumentRoot_WasQuotedFrom();

		/**
		 * The meta object literal for the '<em><b>Was Revision Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_REVISION_OF = eINSTANCE.getDocumentRoot_WasRevisionOf();

		/**
		 * The meta object literal for the '<em><b>Was Started By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WAS_STARTED_BY = eINSTANCE.getDocumentRoot_WasStartedBy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REF = eINSTANCE.getDocumentRoot_Ref();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.EmptyCollectionImpl <em>Empty Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.EmptyCollectionImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getEmptyCollection()
		 * @generated
		 */
		EClass EMPTY_COLLECTION = eINSTANCE.getEmptyCollection();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.EndImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__ACTIVITY = eINSTANCE.getEnd_Activity();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__TRIGGER = eINSTANCE.getEnd_Trigger();

		/**
		 * The meta object literal for the '<em><b>Ender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__ENDER = eINSTANCE.getEnd_Ender();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__TIME = eINSTANCE.getEnd_Time();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__LABEL = eINSTANCE.getEnd_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__LOCATION = eINSTANCE.getEnd_Location();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__ROLE = eINSTANCE.getEnd_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__TYPE = eINSTANCE.getEnd_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__ANY = eINSTANCE.getEnd_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__ID = eINSTANCE.getEnd_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END__ANY_ATTRIBUTE = eINSTANCE.getEnd_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.EntityImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__LABEL = eINSTANCE.getEntity_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__LOCATION = eINSTANCE.getEntity_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__VALUE = eINSTANCE.getEntity_Value();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ANY = eINSTANCE.getEntity_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ANY_ATTRIBUTE = eINSTANCE.getEntity_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.GenerationImpl <em>Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.GenerationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getGeneration()
		 * @generated
		 */
		EClass GENERATION = eINSTANCE.getGeneration();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION__ENTITY = eINSTANCE.getGeneration_Entity();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION__ACTIVITY = eINSTANCE.getGeneration_Activity();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION__TIME = eINSTANCE.getGeneration_Time();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION__LABEL = eINSTANCE.getGeneration_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION__LOCATION = eINSTANCE.getGeneration_Location();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION__ROLE = eINSTANCE.getGeneration_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION__TYPE = eINSTANCE.getGeneration_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION__ANY = eINSTANCE.getGeneration_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION__ID = eINSTANCE.getGeneration_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION__ANY_ATTRIBUTE = eINSTANCE.getGeneration_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.IDRefImpl <em>ID Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.IDRefImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getIDRef()
		 * @generated
		 */
		EClass ID_REF = eINSTANCE.getIDRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_REF__REF = eINSTANCE.getIDRef_Ref();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_REF__ANY_ATTRIBUTE = eINSTANCE.getIDRef_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.InfluenceImpl <em>Influence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.InfluenceImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getInfluence()
		 * @generated
		 */
		EClass INFLUENCE = eINSTANCE.getInfluence();

		/**
		 * The meta object literal for the '<em><b>Influencee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__INFLUENCEE = eINSTANCE.getInfluence_Influencee();

		/**
		 * The meta object literal for the '<em><b>Influencer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__INFLUENCER = eINSTANCE.getInfluence_Influencer();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__LABEL = eINSTANCE.getInfluence_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE__TYPE = eINSTANCE.getInfluence_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE__ANY = eINSTANCE.getInfluence_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE__ID = eINSTANCE.getInfluence_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__ANY_ATTRIBUTE = eINSTANCE.getInfluence_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.InternationalizedStringImpl <em>Internationalized String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.InternationalizedStringImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getInternationalizedString()
		 * @generated
		 */
		EClass INTERNATIONALIZED_STRING = eINSTANCE.getInternationalizedString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNATIONALIZED_STRING__VALUE = eINSTANCE.getInternationalizedString_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNATIONALIZED_STRING__LANG = eINSTANCE.getInternationalizedString_Lang();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.InvalidationImpl <em>Invalidation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.InvalidationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getInvalidation()
		 * @generated
		 */
		EClass INVALIDATION = eINSTANCE.getInvalidation();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALIDATION__ENTITY = eINSTANCE.getInvalidation_Entity();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALIDATION__ACTIVITY = eINSTANCE.getInvalidation_Activity();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALIDATION__TIME = eINSTANCE.getInvalidation_Time();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALIDATION__LABEL = eINSTANCE.getInvalidation_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALIDATION__LOCATION = eINSTANCE.getInvalidation_Location();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALIDATION__ROLE = eINSTANCE.getInvalidation_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALIDATION__TYPE = eINSTANCE.getInvalidation_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALIDATION__ANY = eINSTANCE.getInvalidation_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVALIDATION__ID = eINSTANCE.getInvalidation_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVALIDATION__ANY_ATTRIBUTE = eINSTANCE.getInvalidation_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.MembershipImpl <em>Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.MembershipImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getMembership()
		 * @generated
		 */
		EClass MEMBERSHIP = eINSTANCE.getMembership();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__COLLECTION = eINSTANCE.getMembership_Collection();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP__ENTITY = eINSTANCE.getMembership_Entity();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.OrganizationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.OtherImpl <em>Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.OtherImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getOther()
		 * @generated
		 */
		EClass OTHER = eINSTANCE.getOther();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER__ANY = eINSTANCE.getOther_Any();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.PersonImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.PlanImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.PrimarySourceImpl <em>Primary Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.PrimarySourceImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getPrimarySource()
		 * @generated
		 */
		EClass PRIMARY_SOURCE = eINSTANCE.getPrimarySource();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.QuotationImpl <em>Quotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.QuotationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getQuotation()
		 * @generated
		 */
		EClass QUOTATION = eINSTANCE.getQuotation();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.RevisionImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.SoftwareAgentImpl <em>Software Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.SoftwareAgentImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getSoftwareAgent()
		 * @generated
		 */
		EClass SOFTWARE_AGENT = eINSTANCE.getSoftwareAgent();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.SpecializationImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Specific Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SPECIFIC_ENTITY = eINSTANCE.getSpecialization_SpecificEntity();

		/**
		 * The meta object literal for the '<em><b>General Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__GENERAL_ENTITY = eINSTANCE.getSpecialization_GeneralEntity();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.StartImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__ACTIVITY = eINSTANCE.getStart_Activity();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__TRIGGER = eINSTANCE.getStart_Trigger();

		/**
		 * The meta object literal for the '<em><b>Starter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__STARTER = eINSTANCE.getStart_Starter();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__TIME = eINSTANCE.getStart_Time();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__LABEL = eINSTANCE.getStart_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__LOCATION = eINSTANCE.getStart_Location();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__ROLE = eINSTANCE.getStart_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__TYPE = eINSTANCE.getStart_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__ANY = eINSTANCE.getStart_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__ID = eINSTANCE.getStart_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__ANY_ATTRIBUTE = eINSTANCE.getStart_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.UsageImpl <em>Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.UsageImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getUsage()
		 * @generated
		 */
		EClass USAGE = eINSTANCE.getUsage();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__ACTIVITY = eINSTANCE.getUsage_Activity();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__ENTITY = eINSTANCE.getUsage_Entity();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__TIME = eINSTANCE.getUsage_Time();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__LABEL = eINSTANCE.getUsage_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__LOCATION = eINSTANCE.getUsage_Location();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__ROLE = eINSTANCE.getUsage_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__TYPE = eINSTANCE.getUsage_Type();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__ANY = eINSTANCE.getUsage_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__ID = eINSTANCE.getUsage_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__ANY_ATTRIBUTE = eINSTANCE.getUsage_AnyAttribute();

		/**
		 * The meta object literal for the '{@link xtendCode.prov.impl.PAttributeImpl <em>PAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xtendCode.prov.impl.PAttributeImpl
		 * @see xtendCode.prov.impl.ProvPackageImpl#getPAttribute()
		 * @generated
		 */
		EClass PATTRIBUTE = eINSTANCE.getPAttribute();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTRIBUTE__KEY = eINSTANCE.getPAttribute_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTRIBUTE__VALUE = eINSTANCE.getPAttribute_Value();

	}

} //ProvPackage
