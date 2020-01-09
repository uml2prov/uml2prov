package xtendCode.generatorAspect;

import UML2PROV.utilities.AspectConstructor;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class AspectGenerator {
  public static void main(final String[] args) {
    AspectGenerator.generateBGM("Stack.uml", "ListenerPROVN.java");
  }
  
  public static void generateBGM(final String propertiesFile, final String interfaceImpl) {
    try {
      ResourceSetImpl set = new ResourceSetImpl();
      set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
      set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, 
        UMLResource.Factory.INSTANCE);
      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, 
        UMLResource.Factory.INSTANCE);
      Resource res = set.getResource(URI.createFileURI(propertiesFile), true);
      boolean _exists = new File("src-gen/aspect").exists();
      if (_exists) {
        File _file = new File("src-gen/aspects");
        FileUtils.deleteDirectory(_file);
      }
      new File("src-gen/aspects/events").mkdirs();
      new File("src-gen/aspects/listeners").mkdirs();
      new File("src-gen/dependencies").mkdirs();
      File _file_1 = new File("src-gen/aspects/BGMEventInstrumenter.aj");
      PrintStream provenanceExtractorAJ = new PrintStream(_file_1);
      provenanceExtractorAJ.println(AspectGenerator.parents(interfaceImpl));
      Iterable<Model> _filter = Iterables.<Model>filter(res.getContents(), Model.class);
      for (final Model element : _filter) {
        {
          provenanceExtractorAJ.println(AspectGenerator.parents(element, true));
          provenanceExtractorAJ.println(AspectGenerator.news(element, true));
          provenanceExtractorAJ.println(AspectGenerator.operations(element, true));
          provenanceExtractorAJ.println();
          provenanceExtractorAJ.println(AspectGenerator.beforeBlock(element));
          provenanceExtractorAJ.println();
          provenanceExtractorAJ.println(AspectGenerator.afterBlock(element));
          provenanceExtractorAJ.println();
          provenanceExtractorAJ.println(AspectGenerator.aroundBlock(element));
        }
      }
      provenanceExtractorAJ.println(AspectConstructor.codeMethodsDeclarationAJ());
      provenanceExtractorAJ.close();
      File _file_2 = new File("src-gen/aspects/UML2PROVTreeMap.java");
      PrintStream _printStream = new PrintStream(_file_2);
      provenanceExtractorAJ = _printStream;
      provenanceExtractorAJ.println(AspectConstructor.generateUML2PROVTreeMap());
      provenanceExtractorAJ.close();
      File _file_3 = new File("src-gen/aspects/UUID.java");
      PrintStream _printStream_1 = new PrintStream(_file_3);
      provenanceExtractorAJ = _printStream_1;
      provenanceExtractorAJ.println(AspectConstructor.generateUUID());
      provenanceExtractorAJ.close();
      File _file_4 = new File("src-gen/aspects/events/BGMEvent.java");
      PrintStream _printStream_2 = new PrintStream(_file_4);
      provenanceExtractorAJ = _printStream_2;
      provenanceExtractorAJ.println(AspectConstructor.generateBGMEvent());
      provenanceExtractorAJ.close();
      File _file_5 = new File("src-gen/aspects/events/EventHelper.java");
      PrintStream _printStream_3 = new PrintStream(_file_5);
      provenanceExtractorAJ = _printStream_3;
      provenanceExtractorAJ.println(AspectConstructor.generateEventHelper());
      provenanceExtractorAJ.close();
      File _file_6 = new File("src-gen/aspects/listeners/BGMEventListener.java");
      PrintStream _printStream_4 = new PrintStream(_file_6);
      provenanceExtractorAJ = _printStream_4;
      provenanceExtractorAJ.println(AspectConstructor.generateBGMEventListener());
      provenanceExtractorAJ.close();
      File _file_7 = new File("src-gen/dependencies/org.aspectj.runtime_1.9.2.201811011643.jar");
      FileOutputStream target = new FileOutputStream(_file_7);
      AspectConstructor.copiar(AspectConstructor.getJarDependency(), target);
      target.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static StringBuffer operations(final EObject root, final boolean searchForNestedNodes) {
    int i = 0;
    int j = 0;
    StringBuffer result = new StringBuffer();
    TreeIterator<EObject> iter = root.eAllContents();
    while (iter.hasNext()) {
      {
        EObject obj = iter.next();
        if ((obj instanceof org.eclipse.uml2.uml.Class)) {
          int _compareTo = ((org.eclipse.uml2.uml.Class)obj).getClass().getCanonicalName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl");
          boolean _equals = (_compareTo == 0);
          if (_equals) {
            boolean _isEmpty = ((org.eclipse.uml2.uml.Class)obj).getOperations().isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              String _name = ((org.eclipse.uml2.uml.Class)obj).getName();
              String _plus = ("pointcut captureOperations" + _name);
              String _plus_1 = (_plus + "(): ");
              result.append(_plus_1);
              EList<Operation> _operations = ((org.eclipse.uml2.uml.Class)obj).getOperations();
              for (final Operation operation : _operations) {
                {
                  CharSequence _Namespaces = AspectGenerator.Namespaces(((Namespace)obj));
                  String _plus_2 = ("\tcall(* " + _Namespaces);
                  String _plus_3 = (_plus_2 + ".");
                  String _name_1 = operation.getName();
                  String _plus_4 = (_plus_3 + _name_1);
                  String _plus_5 = (_plus_4 + "(..))");
                  result.append(_plus_5);
                  boolean _equals_1 = IterableExtensions.<Operation>last(((org.eclipse.uml2.uml.Class)obj).getOperations()).equals(operation);
                  boolean _not_1 = (!_equals_1);
                  if (_not_1) {
                    result.append(" || ");
                  } else {
                    result.append(";\n");
                  }
                }
              }
              iter.prune();
            }
          }
        }
      }
    }
    result.append(" ;");
    return result;
  }
  
  public static StringBuffer aroundBlock(final EObject root) {
    try {
      StringBuffer result = new StringBuffer();
      result.append("Object around(Identified targetIdentified): target(targetIdentified) &&  !execution(* *.getUUID()) && !execution(* *.setUUID()) && (");
      result.append(AspectGenerator.pointCutsOperations(root, true));
      result.append("){\n");
      result.append(AspectConstructor.codeInsideAround());
      result.append("}");
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static StringBuffer pointCutsOperations(final EObject root, final boolean searchForNestedNodes) {
    int i = 0;
    int j = 0;
    StringBuffer result = new StringBuffer();
    final Function1<EObject, Boolean> _function = (EObject e) -> {
      int _compareTo = e.getClass().getName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl");
      return Boolean.valueOf((_compareTo == 0));
    };
    Iterator<EObject> iter = IteratorExtensions.<EObject>filter(root.eAllContents(), _function);
    while (iter.hasNext()) {
      {
        EObject obj = iter.next();
        if ((obj instanceof org.eclipse.uml2.uml.Class)) {
          int _compareTo = ((org.eclipse.uml2.uml.Class)obj).getClass().getCanonicalName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl");
          boolean _equals = (_compareTo == 0);
          if (_equals) {
            String _name = ((org.eclipse.uml2.uml.Class)obj).getName();
            String _plus = ("captureOperations" + _name);
            String _plus_1 = (_plus + "()");
            result.append(_plus_1);
            boolean _hasNext = iter.hasNext();
            if (_hasNext) {
              result.append(" || \n");
            }
          }
        }
      }
    }
    return result;
  }
  
  public static StringBuffer beforeBlock(final EObject root) {
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
  
  public static StringBuffer afterBlock(final EObject root) {
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
  
  public static StringBuffer news(final EObject root, final boolean searchForNestedNodes) {
    int i = 0;
    int j = 0;
    StringBuffer result = new StringBuffer();
    final Function1<EObject, Boolean> _function = (EObject e) -> {
      int _compareTo = e.getClass().getName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl");
      return Boolean.valueOf((_compareTo == 0));
    };
    Iterator<EObject> iter = IteratorExtensions.<EObject>filter(root.eAllContents(), _function);
    result.append((("pointcut captureNews" + Integer.valueOf(j)) + "(): "));
    while (iter.hasNext()) {
      {
        EObject obj = iter.next();
        if ((obj instanceof org.eclipse.uml2.uml.Class)) {
          CharSequence _Namespaces = AspectGenerator.Namespaces(((Namespace)obj));
          String _plus = ("initialization(" + _Namespaces);
          String _plus_1 = (_plus + ".new(..))");
          result.append(_plus_1);
          boolean _hasNext = iter.hasNext();
          if (_hasNext) {
            result.append(" || \n");
          }
        }
      }
    }
    result.append(" ;\n");
    return result;
  }
  
  public static StringBuffer parents(final EObject root, final boolean searchForNestedNodes) {
    StringBuffer result = new StringBuffer();
    TreeIterator<EObject> iter = root.eAllContents();
    while (iter.hasNext()) {
      {
        EObject obj = iter.next();
        if ((obj instanceof org.eclipse.uml2.uml.Class)) {
          int _compareTo = ((org.eclipse.uml2.uml.Class)obj).getClass().getCanonicalName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl");
          boolean _equals = (_compareTo == 0);
          if (_equals) {
            CharSequence _Namespaces = AspectGenerator.Namespaces(((Namespace)obj));
            String _plus = ("declare parents : " + _Namespaces);
            String _plus_1 = (_plus + " implements Identified;\n");
            result.append(_plus_1);
            iter.prune();
          }
        }
      }
    }
    return result;
  }
  
  public static Object getFirstNamespace(final Namespace cl) {
    Object _xifexpression = null;
    Namespace _namespace = cl.getNamespace();
    boolean _equals = Objects.equal(_namespace, null);
    if (_equals) {
      return cl.getName();
    } else {
      _xifexpression = AspectGenerator.getFirstNamespace(cl.getNamespace());
    }
    return _xifexpression;
  }
  
  public static CharSequence Namespaces(final Namespace cl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Namespace _namespace = cl.getNamespace();
      boolean _equals = Objects.equal(_namespace, null);
      if (_equals) {
      }
    }
    {
      Namespace _namespace_1 = cl.getNamespace();
      boolean _notEquals = (!Objects.equal(_namespace_1, null));
      if (_notEquals) {
        Object _Namespaces = AspectGenerator.Namespaces(cl.getNamespace());
        _builder.append(_Namespaces);
        {
          Namespace _namespace_2 = cl.getNamespace().getNamespace();
          boolean _notEquals_1 = (!Objects.equal(_namespace_2, null));
          if (_notEquals_1) {
            _builder.append(".");
          }
        }
        String _name = cl.getName();
        _builder.append(_name);
      }
    }
    return _builder;
  }
  
  public static CharSequence parents(final String interfImp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package aspects;");
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
    _builder.append("import aspects.events.BGMEvent;");
    _builder.newLine();
    _builder.append("import aspects.events.EventHelper;");
    _builder.newLine();
    _builder.append("import aspects.listeners.BGMEventListener;");
    _builder.newLine();
    _builder.append("import aspects.listeners.");
    String _get = interfImp.split("\\.")[0];
    _builder.append(_get);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
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
    _builder.append("\t\t\t");
    _builder.append("bgmm.addListener(new ");
    String _get_1 = interfImp.split("\\.")[0];
    _builder.append(_get_1, "\t\t\t");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
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
