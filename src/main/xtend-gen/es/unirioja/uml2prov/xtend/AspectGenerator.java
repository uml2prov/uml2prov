package es.unirioja.uml2prov.xtend;

import es.unirioja.uml2prov.utilities.AspectConstructor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class AspectGenerator {
  public static final String PATH_UML2PROV_BGM = "/es/unirioja/uml2prov/bgm";
  
  public static void generateBGM(final String propertiesFile, final String[] interfaceImpl, final String outputDirectory) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nResourceSetImpl cannot be resolved."
      + "\nThe method or field UMLPackage is undefined"
      + "\nThe method or field UMLPackage is undefined"
      + "\nThe method or field UMLResource is undefined"
      + "\nThe method or field UMLResource is undefined"
      + "\nThe method or field Resource is undefined"
      + "\nThe method or field UMLResource is undefined"
      + "\nThe method or field UMLResource is undefined"
      + "\nThe method or field URI is undefined"
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\nThe method parents(EObject, boolean) from the type AspectGenerator refers to the missing type EObject"
      + "\nThe method news(EObject, boolean) from the type AspectGenerator refers to the missing type EObject"
      + "\nThe method operations(EObject, boolean) from the type AspectGenerator refers to the missing type EObject"
      + "\ngetPackageRegistry cannot be resolved"
      + "\nput cannot be resolved"
      + "\neNS_URI cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ngetResourceFactoryRegistry cannot be resolved"
      + "\ngetExtensionToFactoryMap cannot be resolved"
      + "\nput cannot be resolved"
      + "\nFILE_EXTENSION cannot be resolved"
      + "\nFactory cannot be resolved"
      + "\nINSTANCE cannot be resolved"
      + "\nFactory cannot be resolved"
      + "\nRegistry cannot be resolved"
      + "\nINSTANCE cannot be resolved"
      + "\ngetExtensionToFactoryMap cannot be resolved"
      + "\nput cannot be resolved"
      + "\nFILE_EXTENSION cannot be resolved"
      + "\nFactory cannot be resolved"
      + "\nINSTANCE cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\ncreateFileURI cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nbeforeBlock cannot be resolved"
      + "\nafterBlock cannot be resolved"
      + "\naroundBlock cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public static StringBuffer operations(final /* EObject */Object root, final boolean searchForNestedNodes) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\neAllContents cannot be resolved"
      + "\nhasNext cannot be resolved"
      + "\nnext cannot be resolved"
      + "\nclass cannot be resolved"
      + "\ncanonicalName cannot be resolved"
      + "\ncompareTo cannot be resolved"
      + "\n== cannot be resolved"
      + "\noperations cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\noperations cannot be resolved"
      + "\nNamespaces cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\noperations cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n! cannot be resolved"
      + "\nprune cannot be resolved");
  }
  
  public static StringBuffer aroundBlock(final /* EObject */Object root) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method pointCutsOperations(EObject, boolean) from the type AspectGenerator refers to the missing type EObject");
  }
  
  public static StringBuffer pointCutsOperations(final /* EObject */Object root, final boolean searchForNestedNodes) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\neAllContents cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nclass cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncompareTo cannot be resolved"
      + "\n== cannot be resolved"
      + "\nhasNext cannot be resolved"
      + "\nnext cannot be resolved"
      + "\nclass cannot be resolved"
      + "\ncanonicalName cannot be resolved"
      + "\ncompareTo cannot be resolved"
      + "\n== cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nhasNext cannot be resolved");
  }
  
  public static StringBuffer beforeBlock(final /* EObject */Object root) {
    try {
      StringBuffer result = new StringBuffer();
      result.append(
        "before(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (");
      result.append("captureNews0()");
      result.append("){\n");
      result.append(AspectConstructor.codeInsideBefore());
      result.append("}");
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static StringBuffer afterBlock(final /* EObject */Object root) {
    try {
      StringBuffer result = new StringBuffer();
      result.append(
        "after(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (");
      result.append("captureNews0()");
      result.append("){\n");
      result.append(AspectConstructor.codeInsideAfter());
      result.append("}");
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static StringBuffer news(final /* EObject */Object root, final boolean searchForNestedNodes) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\neAllContents cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nclass cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncompareTo cannot be resolved"
      + "\n== cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nhasNext cannot be resolved"
      + "\nnext cannot be resolved"
      + "\nNamespaces cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nhasNext cannot be resolved");
  }
  
  public static StringBuffer parents(final /* EObject */Object root, final boolean searchForNestedNodes) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\neAllContents cannot be resolved"
      + "\nhasNext cannot be resolved"
      + "\nnext cannot be resolved"
      + "\nclass cannot be resolved"
      + "\ncanonicalName cannot be resolved"
      + "\ncompareTo cannot be resolved"
      + "\n== cannot be resolved"
      + "\nNamespaces cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nprune cannot be resolved");
  }
  
  public static Object getFirstNamespace(final /* Namespace */Object cl) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getFirstNamespace(Namespace) from the type AspectGenerator refers to the missing type Namespace"
      + "\nnamespace cannot be resolved"
      + "\n== cannot be resolved"
      + "\nname cannot be resolved"
      + "\nnamespace cannot be resolved");
  }
  
  public static CharSequence Namespaces(final /* Namespace */Object cl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("�IF cl.namespace==null��ENDIF��IF cl.namespace!=null��Namespaces(cl.namespace)��IF cl.namespace.namespace!=null�.�ENDIF��cl.name��ENDIF�");
    return _builder;
  }
  
  public static CharSequence parents(final String[] interfImp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package es.unirioja.uml2prov.bgm.aspect;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.lang.reflect.InvocationTargetException;");
    _builder.newLine();
    _builder.append("import java.lang.reflect.Method;");
    _builder.newLine();
    _builder.append("import java.util.AbstractCollection;");
    _builder.newLine();
    _builder.append("import java.util.AbstractMap.SimpleEntry;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.HashSet;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.Set;");
    _builder.newLine();
    _builder.append("import java.util.Stack;");
    _builder.newLine();
    _builder.append("import java.util.concurrent.ExecutorService;");
    _builder.newLine();
    _builder.append("import java.util.concurrent.Executors;");
    _builder.newLine();
    _builder.append("import java.util.concurrent.ThreadFactory;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.aspectj.lang.reflect.MethodSignature;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import es.unirioja.uml2prov.bgm.BGMEvent;");
    _builder.newLine();
    _builder.append("import es.unirioja.uml2prov.bgm.EventHelper;");
    _builder.newLine();
    _builder.append("import es.unirioja.uml2prov.bgm.BGMEventListener;");
    _builder.newLine();
    _builder.append("//import �interfImp�;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public aspect BGMEventInstrumenter {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ExecutorService exec = Executors.newFixedThreadPool(16, new ThreadFactory() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Thread newThread(Runnable r) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Thread t = Executors.defaultThreadFactory().newThread(r);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("t.setDaemon(true);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return t;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//ExecutorService exec = MoreExecutors.getExitingExecutorService(");
    _builder.newLine();
    _builder.append("//      (ThreadPoolExecutor) Executors.newFixedThreadPool(8), ");
    _builder.newLine();
    _builder.append("//      100_000, TimeUnit.DAYS//period after which executor will be automatically closed");
    _builder.newLine();
    _builder.append("//                           //I assume that 100_000 days is enough to simulate infinity");
    _builder.newLine();
    _builder.append("//);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static Integer n = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static Long sum = new Long(0);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public interface Identified {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private UUID Identified.uuid;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String Identified.stateSM = new String();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void Identified.setUUID(UUID uuid) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.uuid = uuid;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public UUID Identified.getUUID() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return uuid;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void Identified.setStateSM(String state) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.stateSM = state;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String Identified.getStateSM() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return stateSM;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static class IdentifiersManager {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private static Set<Class> WRAPPER_TYPES = new HashSet(");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Arrays.asList(String.class, Boolean.class, Character.class, Byte.class, Short.class, Integer.class,");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("Long.class, Float.class, Double.class, Void.class));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// static Map<Object, UUID> objectIdentifier = new WeakHashMap<Object, UUID>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private static boolean isWrapperType(Class clazz) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return WRAPPER_TYPES.contains(clazz);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("static String incrementIdentifier(Object obj) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("String rslt;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (!Identified.class.isAssignableFrom(obj.getClass())) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("rslt = new UUID(obj).incrementUUID();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("rslt = ((Identified) obj).getUUID().incrementUUID();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return rslt;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("static UUID getIdentifier(Object obj) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("UUID rtn = null;");
    _builder.newLine();
    _builder.append("//    \t\tif(obj instanceof Identified){");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (Identified.class.isAssignableFrom(obj.getClass())) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if (((Identified) obj).getUUID() == null)");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("((Identified) obj).setUUID(new UUID(obj));");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("rtn = ((Identified) obj).getUUID();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("rtn = new UUID(obj);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return rtn;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("////    \t\tSystem.out.println(rtn.getCompleteUUID());");
    _builder.newLine();
    _builder.append("//    \t\tlong swTime= sw.elapsedTime();");
    _builder.newLine();
    _builder.append("//    \t\tSystem.out.println(\"[Parallel] \"+ swTime);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//    \t\tUUID rtn = null;");
    _builder.newLine();
    _builder.append("//    \t\tif(obj instanceof Identified){");
    _builder.newLine();
    _builder.append("//    \t\t\trtn = ((Identified)obj).getUUID();");
    _builder.newLine();
    _builder.append("//    \t\t}else{");
    _builder.newLine();
    _builder.append("//    \t\t\trtn = objectIdentifier.get(obj);");
    _builder.newLine();
    _builder.append("//    \t\t\tif (rtn == null) {");
    _builder.newLine();
    _builder.append("//    \t\t\t\trtn = new UUID(obj);");
    _builder.newLine();
    _builder.append("//    \t\t\t\tobjectIdentifier.put(obj, rtn);");
    _builder.newLine();
    _builder.append("//    \t\t\t}");
    _builder.newLine();
    _builder.append("//    \t\t}");
    _builder.newLine();
    _builder.append("//    \t\t");
    _builder.newLine();
    _builder.append("//    \t\treturn rtn;");
    _builder.newLine();
    _builder.append("//    \t}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("static synchronized public String randomUUID() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return UUID.randomUUID();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("static public UUID newUUID(Object obj) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("UUID uuid = new UUID(obj);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return uuid;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static class StateManager {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("synchronized static void newState(Object obj, String state) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (Identified.class.isAssignableFrom(obj.getClass())) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("((Identified) obj).setStateSM(state);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("synchronized static String getState(Object obj) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (obj instanceof Identified) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return ((Identified) obj).getStateSM();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} else");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return \"noState\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// send the eventes");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static EventHelper<BGMEventListener> bgmm = new EventHelper<>(BGMEventListener.class);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// identificador de la ejecucion (del binding)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final String EXECUTION_ID = IdentifiersManager.randomUUID();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// represents the deeper level of the last method executed");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static Integer level = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// it is a boolean which allows us to know if the level has ended");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// realmente no se como llamarlo, es algo parecido a un semaforo que me dice");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// si el nivel ha finalizado o no.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static Boolean previousMethod = false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static long timeNestedMethods = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// por cada nivel");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// <nombreClase>.<nombreMetodo>@<idMessage>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// <replyMessageID>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static ArrayList<List<SimpleEntry<String, String>>> returnsArray;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// por cada nivel");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// <nombreClase>.<nombreMetodo>@<idMessage>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// time");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static ArrayList<List<SimpleEntry<String, Long>>> returnsArrayTimes;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// por cada nivel");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// <nombreClase>.<nombreMetodo>@<idMessage>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// <starter>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static ArrayList<List<SimpleEntry<String, String>>> startersArray;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// identificadores de los objetos, por nivel");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static ArrayList<String> objIdArray = new ArrayList<String>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// variable que guarda en memoria el fichero de propiedades");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static HashMap<String, String> propertiesMemory;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static HashMap<String, List<String>> propertiesMemoryAttributes;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�FOR element : interfImp�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("bgmm.addListener(new �element�());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�ENDFOR� ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("returnsArray = new ArrayList<List<SimpleEntry<String, String>>>();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("startersArray = new ArrayList<List<SimpleEntry<String, String>>>();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("returnsArrayTimes = new ArrayList<List<SimpleEntry<String, Long>>>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//\t\t\tProperties properties = new Properties();");
    _builder.newLine();
    _builder.append("//\t\t\tproperties.load(new FileInputStream(\"src/aspects/pp.properties\"));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("propertiesMemory = new HashMap<String, String>();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("propertiesMemoryAttributes = new HashMap<String, List<String>>();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("LoadProperties.loadProperties(propertiesMemory, propertiesMemoryAttributes);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("//\t\t\tfor (Object key : properties.keySet()) {");
    _builder.newLine();
    _builder.append("//\t\t\t\tif (((String) key).contains(\".attributes\")) {");
    _builder.newLine();
    _builder.append("//\t\t\t\t\tpropertiesMemoryAttributes.put((String) key,Arrays.asList(properties.getProperty((String) key).split(\"\\\\|\")));");
    _builder.newLine();
    _builder.append("//\t\t\t\t} else {");
    _builder.newLine();
    _builder.append("//\t\t\t\t\tpropertiesMemory.put((String) key, properties.getProperty((String) key));");
    _builder.newLine();
    _builder.append("//\t\t\t\t}");
    _builder.newLine();
    _builder.append("//\t\t\t}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//\t\t} catch (IOException e) {");
    _builder.newLine();
    _builder.append("//\t\t\te.printStackTrace();");
    _builder.newLine();
    _builder.append("//\t\t}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// identificador del mensaje (operacion)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String id_msg_new = \"\";");
    _builder.newLine();
    return _builder;
  }
}
