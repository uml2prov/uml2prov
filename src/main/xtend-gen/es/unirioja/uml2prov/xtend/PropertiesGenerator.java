package es.unirioja.uml2prov.xtend;

import es.unirioja.uml2prov.xtend.properties.PropertiesPackage;
import es.unirioja.uml2prov.xtend.properties.Property;
import java.io.PrintStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class PropertiesGenerator {
  public static void main(final String[] args) {
    PropertiesGenerator.generateProperties("provModelProperties.xmi");
  }
  
  public static CharSequence inicio() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package aspects;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Arrays;");
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class LoadProperties {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void loadProperties(HashMap<String, String> propertiesMemory,");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("HashMap<String, List<String>> propertiesMemoryAttributes) {");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence fin() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence putMemory(final String name, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("propertiesMemory.put(\"");
    _builder.append(name);
    _builder.append("\", \"");
    _builder.append(value);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence putAttribyteMemory(final String name, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("propertiesMemoryAttributes.put(\"");
    _builder.append(name);
    _builder.append("\",Arrays.asList(\"");
    _builder.append(value);
    _builder.append("\".split(\"\\\\|\")));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static void generateProperties(final String propertiesFile) {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      resourceSet.getPackageRegistry().put("http://www.w3.org/ns/properties", PropertiesPackage.eINSTANCE);
      final Resource resource = resourceSet.getResource(URI.createURI(propertiesFile), true);
      PrintStream propertiesPS = new PrintStream("src-gen/aspects/LoadProperties.java");
      propertiesPS.println(PropertiesGenerator.inicio());
      EList<EObject> _contents = resource.getContents();
      for (final EObject documents : _contents) {
        EList<EObject> _eContents = documents.eContents();
        for (final EObject property : _eContents) {
          if ((property instanceof Property)) {
            boolean _contains = ((Property)property).getName().contains(".attributes");
            if (_contains) {
              propertiesPS.println(PropertiesGenerator.putAttribyteMemory(((Property)property).getName(), ((Property)property).getValue()));
            } else {
              propertiesPS.println(PropertiesGenerator.putMemory(((Property)property).getName(), ((Property)property).getValue()));
            }
          }
        }
      }
      propertiesPS.println(PropertiesGenerator.fin());
      propertiesPS.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
