package es.unirioja.uml2prov.xtend;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PropertiesGenerator {
  public static CharSequence inicio() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package es.unirioja.uml2prov.bgm.aspect;");
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
    _builder.append("propertiesMemory.put(\"�name�\", \"�value�\");");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence putAttribyteMemory(final String name, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("propertiesMemoryAttributes.put(\"�name�\",Arrays.asList(\"�value�\".split(\"\\\\|\")));");
    _builder.newLine();
    return _builder;
  }
  
  public static void generateProperties(final String propertiesFile, final String outputDirectory) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Resource is undefined"
      + "\nXMIResourceFactoryImpl cannot be resolved."
      + "\nResourceSetImpl cannot be resolved."
      + "\nThe method or field URI is undefined"
      + "\n+ cannot be resolved."
      + "\nFactory cannot be resolved"
      + "\nRegistry cannot be resolved"
      + "\nINSTANCE cannot be resolved"
      + "\nextensionToFactoryMap cannot be resolved"
      + "\nput cannot be resolved"
      + "\ngetPackageRegistry cannot be resolved"
      + "\nput cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\ncreateURI cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\neContents cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved");
  }
}
