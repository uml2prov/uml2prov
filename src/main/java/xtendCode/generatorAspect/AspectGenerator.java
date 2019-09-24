package xtendCode.generatorAspect;

import UML2PROV.utilities.AspectConstructor;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
  private static List packagesUsed = new ArrayList<Object>();
  
  private static List pointCutNews = new ArrayList<Object>();
  
  private static List pointCutOperations = new ArrayList<Object>();
  
  public static void generateBGM(String model) {
    try {
      AspectGenerator.packagesUsed.add("RootElement");
      ResourceSetImpl set = new ResourceSetImpl();
      set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
      set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, 
        UMLResource.Factory.INSTANCE);
      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, 
        UMLResource.Factory.INSTANCE);
      Resource res = set.getResource(URI.createFileURI(model), true);
      boolean _exists = new File("src-gen/aspect").exists();
      if (_exists) {
        File _file = new File("src-gen/aspect");
        FileUtils.deleteDirectory(_file);
      }
      new File("src-gen/aspect/events").mkdirs();
      new File("src-gen/aspect/listeners").mkdirs();
      File _file_1 = new File("src-gen/aspect/provenanceExtractor.aj");
      PrintStream provenanceExtractorAJ = new PrintStream(_file_1);
      provenanceExtractorAJ.println(AspectConstructor.codeVariablesDeclarationAJ());
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
      File _file_2 = new File("src-gen/aspect/StateManager.java");
      PrintStream _printStream = new PrintStream(_file_2);
      provenanceExtractorAJ = _printStream;
      provenanceExtractorAJ.println(AspectConstructor.generateStateManager());
      provenanceExtractorAJ.close();
      File _file_3 = new File("src-gen/aspect/UML2PROVTreeMap.java");
      PrintStream _printStream_1 = new PrintStream(_file_3);
      provenanceExtractorAJ = _printStream_1;
      provenanceExtractorAJ.println(AspectConstructor.generateUML2PROVTreeMap());
      provenanceExtractorAJ.close();
      File _file_4 = new File("src-gen/aspect/UUID.java");
      PrintStream _printStream_2 = new PrintStream(_file_4);
      provenanceExtractorAJ = _printStream_2;
      provenanceExtractorAJ.println(AspectConstructor.generateUUID());
      provenanceExtractorAJ.close();
      File _file_5 = new File("src-gen/aspect/events/BGMEvent.java");
      PrintStream _printStream_3 = new PrintStream(_file_5);
      provenanceExtractorAJ = _printStream_3;
      provenanceExtractorAJ.println(AspectConstructor.generateBGMEvent());
      provenanceExtractorAJ.close();
      File _file_6 = new File("src-gen/aspect/events/EventHelper.java");
      PrintStream _printStream_4 = new PrintStream(_file_6);
      provenanceExtractorAJ = _printStream_4;
      provenanceExtractorAJ.println(AspectConstructor.generateEventHelper());
      provenanceExtractorAJ.close();
      File _file_7 = new File("src-gen/aspect/listeners/BGMListener.java");
      PrintStream _printStream_5 = new PrintStream(_file_7);
      provenanceExtractorAJ = _printStream_5;
      provenanceExtractorAJ.println(AspectConstructor.generateBGMListener());
      provenanceExtractorAJ.close();
      File _file_8 = new File("src-gen/aspect/listeners/ListenerPROVN.java");
      PrintStream _printStream_6 = new PrintStream(_file_8);
      provenanceExtractorAJ = _printStream_6;
      provenanceExtractorAJ.println(AspectConstructor.generateListenerPROVN());
      provenanceExtractorAJ.close();
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
          if (((((org.eclipse.uml2.uml.Class)obj).getClass().getCanonicalName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0) && 
            AspectGenerator.packagesUsed.contains(AspectGenerator.getFirstNamespace(((Namespace)obj))))) {
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
                  String _plus_5 = (_plus_4 + "(..)");
                  result.append(_plus_5);
                  boolean _equals = IterableExtensions.<Operation>last(((org.eclipse.uml2.uml.Class)obj).getOperations()).equals(operation);
                  boolean _not_1 = (!_equals);
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
    StringBuffer result = new StringBuffer();
    result.append("Object around(Identified targetIdentified): target(targetIdentified) &&  !execution(* *.getUUID()) && !execution(* *.setUUID()) && (");
    result.append(AspectGenerator.pointCutsOperations(root, true));
    result.append("){\n");
    result.append(AspectConstructor.codeInsideBefore());
    result.append("}");
    return result;
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
          if (((((org.eclipse.uml2.uml.Class)obj).getClass().getCanonicalName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0) && 
            AspectGenerator.packagesUsed.contains(AspectGenerator.getFirstNamespace(((Namespace)obj))))) {
            String _name = ((org.eclipse.uml2.uml.Class)obj).getName();
            String _plus = ("captureOperations" + _name);
            String _plus_1 = (_plus + "()");
            result.append(_plus_1);
            boolean _hasNext = iter.hasNext();
            if (_hasNext) {
              result.append(" && \n");
            }
          }
        }
      }
    }
    return result;
  }
  
  public static StringBuffer beforeBlock(final EObject root) {
    StringBuffer result = new StringBuffer();
    result.append(
      "before(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (");
    result.append("captureNews0()");
    result.append("){\n");
    result.append(AspectConstructor.codeInsideBefore());
    result.append("}");
    return result;
  }
  
  public static StringBuffer afterBlock(final EObject root) {
    StringBuffer result = new StringBuffer();
    result.append(
      "after(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (");
    result.append("captureNews0()");
    result.append("){\n");
    result.append(AspectConstructor.codeInsideAfter());
    result.append("}");
    return result;
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
          boolean _contains = AspectGenerator.packagesUsed.contains(AspectGenerator.getFirstNamespace(((Namespace)obj)));
          if (_contains) {
            CharSequence _Namespaces = AspectGenerator.Namespaces(((Namespace)obj));
            String _plus = ("initialization(" + _Namespaces);
            String _plus_1 = (_plus + ".new(..)");
            result.append(_plus_1);
            boolean _hasNext = iter.hasNext();
            if (_hasNext) {
              result.append(" || \n");
            }
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
          if (((((org.eclipse.uml2.uml.Class)obj).getClass().getCanonicalName().compareTo("org.eclipse.uml2.uml.internal.impl.ClassImpl") == 0) && 
            AspectGenerator.packagesUsed.contains(AspectGenerator.getFirstNamespace(((Namespace)obj))))) {
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
        String _name = cl.getName();
        _builder.append(_name);
      }
    }
    {
      Namespace _namespace_1 = cl.getNamespace();
      boolean _notEquals = (!Objects.equal(_namespace_1, null));
      if (_notEquals) {
        Object _Namespaces = AspectGenerator.Namespaces(cl.getNamespace());
        _builder.append(_Namespaces);
        _builder.append(".");
        String _name_1 = cl.getName();
        _builder.append(_name_1);
      }
    }
    return _builder;
  }
  
  public CharSequence DeclareParents(final Class cl) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence packageName(final org.eclipse.uml2.uml.Package p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence NewsPointCuts() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence OperationsPointCuts() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
