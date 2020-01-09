package xtendCode.generatorAspect

import UML2PROV.utilities.AspectConstructor

import java.io.File
import java.io.PrintStream
import java.util.ArrayList
import java.util.List
import org.apache.commons.io.FileUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Namespace
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource
import java.io.InputStream
import java.io.FileOutputStream

class AspectGenerator {


	def static void main(String[] args) {
		generateBGM("Stack.uml","ListenerPROVN.java");
	}
	
	
	def static void generateBGM(String propertiesFile, String interfaceImpl){

//		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("uml", new XMIResourceFactoryImpl);
//		val resourceSet = new ResourceSetImpl
//		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);		
//		
//		val resource = resourceSet.getResource(URI.createURI("model1.uml"), true)
//
//		//vacio y creo de nuevo la ruta
//		if(new File("src-gen/"+"aspects").exists)	FileUtils.deleteDirectory(new File("src-gen/"+"aspects"));
//		new File("src-gen/"+"aspects").mkdirs;
		var set = new ResourceSetImpl()
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE)
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
			UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
			UMLResource.Factory.INSTANCE);

		var res = set.getResource(URI.createFileURI(propertiesFile), true);

		// vacio y creo de nuevo la ruta
		if(new File("src-gen/aspect").exists) FileUtils.deleteDirectory(new File("src-gen/aspects"));
		new File("src-gen/aspects/events").mkdirs;
		new File("src-gen/aspects/listeners").mkdirs;
//		new File("src-gen/aspects/dependencies").mkdirs;
		new File("src-gen/dependencies").mkdirs;
		

		var provenanceExtractorAJ = new PrintStream(new File("src-gen/aspects/BGMEventInstrumenter.aj"));
//		provenanceExtractorAJ.println(AspectConstructor.codeVariablesDeclarationAJ());
		provenanceExtractorAJ.println(parents(interfaceImpl))

		for (element : res.contents.filter(typeof(Model))) {
			provenanceExtractorAJ.println(parents(element, true));
			provenanceExtractorAJ.println(news(element, true));
			provenanceExtractorAJ.println(operations(element, true));
			provenanceExtractorAJ.println()
			provenanceExtractorAJ.println(element.beforeBlock)
			provenanceExtractorAJ.println()
			provenanceExtractorAJ.println(element.afterBlock)
			provenanceExtractorAJ.println()
			provenanceExtractorAJ.println(element.aroundBlock)
		}
		provenanceExtractorAJ.println(AspectConstructor.codeMethodsDeclarationAJ)
		provenanceExtractorAJ.close;
		
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/StateManager.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateStateManager)
//		provenanceExtractorAJ.close;
		
		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspects/UML2PROVTreeMap.java"));
		provenanceExtractorAJ.println(AspectConstructor.generateUML2PROVTreeMap)
		provenanceExtractorAJ.close;
		
		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspects/UUID.java"));
		provenanceExtractorAJ.println(AspectConstructor.generateUUID)
		provenanceExtractorAJ.close;

		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspects/events/BGMEvent.java"));
		provenanceExtractorAJ.println(AspectConstructor.generateBGMEvent)
		provenanceExtractorAJ.close;


		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspects/events/EventHelper.java"));
		provenanceExtractorAJ.println(AspectConstructor.generateEventHelper)
		provenanceExtractorAJ.close;


		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspects/listeners/BGMEventListener.java"));
		provenanceExtractorAJ.println(AspectConstructor.generateBGMEventListener)
		provenanceExtractorAJ.close;

//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspects/listeners/ListenerPROVN.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateListenerPROVN)
//		provenanceExtractorAJ.close;
		
		var target = new FileOutputStream(new File("src-gen/dependencies/org.aspectj.runtime_1.9.2.201811011643.jar"));
		AspectConstructor.copiar(AspectConstructor.jarDependency,target);
		target.close();
		
//		FileUtils.copyFile(new File("src/main/resources/codeBlocks/org.aspectj.runtime_1.9.2.201811011643.jar"), fos);


	}
	

//	def static void main(String[] args) {
////		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("uml", new XMIResourceFactoryImpl);
////		val resourceSet = new ResourceSetImpl
////		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);		
////		
////		val resource = resourceSet.getResource(URI.createURI("model1.uml"), true)
////
////		//vacio y creo de nuevo la ruta
////		if(new File("src-gen/"+"aspects").exists)	FileUtils.deleteDirectory(new File("src-gen/"+"aspects"));
////		new File("src-gen/"+"aspects").mkdirs;
//		packagesUsed.add("RootElement");
//
//		var set = new ResourceSetImpl()
//		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE)
//		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
//			UMLResource.Factory.INSTANCE);
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
//			UMLResource.Factory.INSTANCE);
//
//		var res = set.getResource(URI.createFileURI("model1.uml"), true);
//
//		// vacio y creo de nuevo la ruta
//		if(new File("src-gen/aspect").exists) FileUtils.deleteDirectory(new File("src-gen/aspect"));
//		new File("src-gen/aspect/events").mkdirs;
//		new File("src-gen/aspect/listeners").mkdirs;
//
//		var provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/provenanceExtractor.aj"));
//		provenanceExtractorAJ.println(AspectConstructor.codeVariablesDeclarationAJ());
//
//		for (element : res.contents.filter(typeof(Model))) {
//			provenanceExtractorAJ.println(parents(element, true));
//			provenanceExtractorAJ.println(news(element, true));
//			provenanceExtractorAJ.println(operations(element, true));
//			provenanceExtractorAJ.println()
//			provenanceExtractorAJ.println(element.beforeBlock)
//			provenanceExtractorAJ.println()
//			provenanceExtractorAJ.println(element.afterBlock)
//			provenanceExtractorAJ.println()
//			provenanceExtractorAJ.println(element.aroundBlock)
//		}
//		
//		provenanceExtractorAJ.println(AspectConstructor.codeMethodsDeclarationAJ)
//		provenanceExtractorAJ.close;
//		
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/StateManager.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateStateManager)
//		provenanceExtractorAJ.close;
//		
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/UML2PROVTreeMap.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateUML2PROVTreeMap)
//		provenanceExtractorAJ.close;
//		
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/UUID.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateUUID)
//		provenanceExtractorAJ.close;
//
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/events/BGMEvent.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateBGMEvent)
//		provenanceExtractorAJ.close;
//
//
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/events/EventHelper.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateEventHelper)
//		provenanceExtractorAJ.close;
//
//
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/listeners/BGMListener.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateBGMListener)
//		provenanceExtractorAJ.close;
//
//		provenanceExtractorAJ = new PrintStream(new File("src-gen/aspect/listeners/ListenerPROVN.java"));
//		provenanceExtractorAJ.println(AspectConstructor.generateListenerPROVN)
//		provenanceExtractorAJ.close;
//
//	}

	def static operations(EObject root, boolean searchForNestedNodes) {
		var i = 0;
		var j = 0;
		var result = new StringBuffer;
		var iter = root.eAllContents();

		while (iter.hasNext()) {
			var obj = iter.next();
			if (obj instanceof Class) {
				if (obj.class.canonicalName.compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0) {
					if (!obj.operations.empty) {
						result.append("pointcut captureOperations" + obj.name + "(): ")
						for (operation : obj.operations) {
							result.append("\tcall(* " + obj.Namespaces + "." + operation.name + "(..))")
							if(!obj.operations.last.equals(operation)) result.append(" || ") else {
								result.append(";\n")
							}
						}
						iter.prune();
					}
				}
			}
		}
		result.append(" ;")
		return result
	}
	
	def static aroundBlock(EObject root) {
		var result = new StringBuffer
		result.append("Object around(Identified targetIdentified): target(targetIdentified) &&  !execution(* *.getUUID()) && !execution(* *.setUUID()) && (")
		result.append(pointCutsOperations(root,true))
		result.append("){\n")
		result.append(AspectConstructor.codeInsideAround);
		result.append("}")
		return result;

	}
	

	def static pointCutsOperations(EObject root, boolean searchForNestedNodes) {
		var i = 0;
		var j = 0;
		var result = new StringBuffer;
		var iter = root.eAllContents().filter( e |
			e.class.name.compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0
		);

		while (iter.hasNext()) {
			var obj = iter.next();
			if (obj instanceof Class) {
				if (obj.class.canonicalName.compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0) {
					result.append("captureOperations" + obj.name + "()")
					if(iter.hasNext) result.append(" || \n")
				}
			}
		}
		return result
	}

	def static beforeBlock(EObject root) {
		var result = new StringBuffer
		result.append(
			"before(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (")
		result.append("captureNews0()")
		result.append("){\n")
		result.append(AspectConstructor.codeInsideBefore);
		result.append("}")
		return result;

	}

	def static afterBlock(EObject root) {
		var result = new StringBuffer
		result.append(
			"after(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (")
		result.append("captureNews0()")
		result.append("){\n")
		result.append(AspectConstructor.codeInsideAfter);
		result.append("}")
		return result;
	}

	def static news(EObject root, boolean searchForNestedNodes) {
		var i = 0;
		var j = 0;
		var result = new StringBuffer;
		var iter = root.eAllContents().filter( e |
			e.class.name.compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0
		);
		result.append("pointcut captureNews" + j + "(): ")

		while (iter.hasNext()) {
			var obj = iter.next();
			if (obj instanceof Class) {
					result.append("initialization(" + obj.Namespaces + ".new(..))")
					if(iter.hasNext) result.append(" || \n")
			}
		}
		result.append(" ;\n")
		return result
	}

	def static parents(EObject root, boolean searchForNestedNodes) {
		var result = new StringBuffer;
		var iter = root.eAllContents();
		while (iter.hasNext()) {
			var obj = iter.next();
			if (obj instanceof Class) {
				if (obj.class.canonicalName.compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0) {
					result.append("declare parents : " + obj.Namespaces + " implements Identified;\n")
					iter.prune();
				}
			}
		}
		return result
	}

	def static getFirstNamespace(Namespace cl) {
		if (cl.namespace == null) {
			return cl.name
		} else {
			getFirstNamespace(cl.namespace)
		}
	}

	def static Namespaces(Namespace cl) 
		'''«IF cl.namespace==null»«ENDIF»«IF cl.namespace!=null»«Namespaces(cl.namespace)»«IF cl.namespace.namespace!=null».«ENDIF»«cl.name»«ENDIF»'''


	def static parents(String interfImp)'''
package aspects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.aspectj.lang.reflect.MethodSignature;

import aspects.events.BGMEvent;
import aspects.events.EventHelper;
import aspects.listeners.BGMEventListener;
import aspects.listeners.«interfImp.split("\\.").get(0)»;

public aspect BGMEventInstrumenter {

	ExecutorService exec = Executors.newFixedThreadPool(16, new ThreadFactory() {
		public Thread newThread(Runnable r) {
			Thread t = Executors.defaultThreadFactory().newThread(r);
			t.setDaemon(true);
			return t;
		}
	});

//ExecutorService exec = MoreExecutors.getExitingExecutorService(
//      (ThreadPoolExecutor) Executors.newFixedThreadPool(8), 
//      100_000, TimeUnit.DAYS//period after which executor will be automatically closed
//                           //I assume that 100_000 days is enough to simulate infinity
//);

	private static Integer n = 0;
	private static Long sum = new Long(0);

	public interface Identified {
	};

	private UUID Identified.uuid;
	public String Identified.stateSM = new String();

	public void Identified.setUUID(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID Identified.getUUID() {
		return uuid;
	}

	public void Identified.setStateSM(String state) {
		this.stateSM = state;
	}

	public String Identified.getStateSM() {
		return stateSM;
	}

	public static class IdentifiersManager {
		private static Set<Class> WRAPPER_TYPES = new HashSet(
				Arrays.asList(String.class, Boolean.class, Character.class, Byte.class, Short.class, Integer.class,
						Long.class, Float.class, Double.class, Void.class));

		// static Map<Object, UUID> objectIdentifier = new WeakHashMap<Object, UUID>();

		private static boolean isWrapperType(Class clazz) {
			return WRAPPER_TYPES.contains(clazz);
		}

		static String incrementIdentifier(Object obj) {
			String rslt;
			if (!Identified.class.isAssignableFrom(obj.getClass())) {
				rslt = new UUID(obj).incrementUUID();
			} else {
				rslt = ((Identified) obj).getUUID().incrementUUID();
			}
			return rslt;
		}

		static UUID getIdentifier(Object obj) {
			UUID rtn = null;
//    		if(obj instanceof Identified){

			if (Identified.class.isAssignableFrom(obj.getClass())) {
				if (((Identified) obj).getUUID() == null)
					((Identified) obj).setUUID(new UUID(obj));
				rtn = ((Identified) obj).getUUID();
			} else {
				rtn = new UUID(obj);
			}
			return rtn;
		}

////    		System.out.println(rtn.getCompleteUUID());
//    		long swTime= sw.elapsedTime();
//    		System.out.println("[Parallel] "+ swTime);

//    		UUID rtn = null;
//    		if(obj instanceof Identified){
//    			rtn = ((Identified)obj).getUUID();
//    		}else{
//    			rtn = objectIdentifier.get(obj);
//    			if (rtn == null) {
//    				rtn = new UUID(obj);
//    				objectIdentifier.put(obj, rtn);
//    			}
//    		}
//    		
//    		return rtn;
//    	}
		static synchronized public String randomUUID() {
			return UUID.randomUUID();
		}

		static public UUID newUUID(Object obj) {
			UUID uuid = new UUID(obj);
			return uuid;
		}

	}

	public static class StateManager {

		synchronized static void newState(Object obj, String state) {
			if (Identified.class.isAssignableFrom(obj.getClass())) {
				((Identified) obj).setStateSM(state);
			}
		}

		synchronized static String getState(Object obj) {
			if (obj instanceof Identified) {
				return ((Identified) obj).getStateSM();
			} else
				return "noState";
		}

	}

	// send the eventes
	private static EventHelper<BGMEventListener> bgmm = new EventHelper<>(BGMEventListener.class);

	// identificador de la ejecucion (del binding)
	private static final String EXECUTION_ID = IdentifiersManager.randomUUID();

	// represents the deeper level of the last method executed
	static Integer level = 0;

	// it is a boolean which allows us to know if the level has ended
	// realmente no se como llamarlo, es algo parecido a un semaforo que me dice
	// si el nivel ha finalizado o no.
	static Boolean previousMethod = false;
	static long timeNestedMethods = 0;

	// por cada nivel

	// <nombreClase>.<nombreMetodo>@<idMessage>
	// <replyMessageID>
	private static ArrayList<List<SimpleEntry<String, String>>> returnsArray;

	// por cada nivel
	// <nombreClase>.<nombreMetodo>@<idMessage>
	// time
	private static ArrayList<List<SimpleEntry<String, Long>>> returnsArrayTimes;

	// por cada nivel
	// <nombreClase>.<nombreMetodo>@<idMessage>
	// <starter>
	private static ArrayList<List<SimpleEntry<String, String>>> startersArray;

	// identificadores de los objetos, por nivel
	private static ArrayList<String> objIdArray = new ArrayList<String>();

	// variable que guarda en memoria el fichero de propiedades
	private static HashMap<String, String> propertiesMemory;
	private static HashMap<String, List<String>> propertiesMemoryAttributes;

	static {
			bgmm.addListener(new «interfImp.split("\\.").get(0)»());

			returnsArray = new ArrayList<List<SimpleEntry<String, String>>>();
			startersArray = new ArrayList<List<SimpleEntry<String, String>>>();
			returnsArrayTimes = new ArrayList<List<SimpleEntry<String, Long>>>();

//			Properties properties = new Properties();
//			properties.load(new FileInputStream("src/aspects/pp.properties"));
			propertiesMemory = new HashMap<String, String>();
			propertiesMemoryAttributes = new HashMap<String, List<String>>();
			LoadProperties.loadProperties(propertiesMemory, propertiesMemoryAttributes);
			
//			for (Object key : properties.keySet()) {
//				if (((String) key).contains(".attributes")) {
//					propertiesMemoryAttributes.put((String) key,Arrays.asList(properties.getProperty((String) key).split("\\|")));
//				} else {
//					propertiesMemory.put((String) key, properties.getProperty((String) key));
//				}
//			}

//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	// identificador del mensaje (operacion)
	private String id_msg_new = "";
	'''


}
