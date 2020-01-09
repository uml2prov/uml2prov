package es.unirioja.uml2prov.xtend

import java.io.PrintStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import es.unirioja.uml2prov.xtend.properties.PropertiesPackage
import es.unirioja.uml2prov.xtend.properties.Property


class PropertiesGenerator {

	def static inicio()'''
		package aspects;
		
		import java.util.Arrays;
		import java.util.HashMap;
		import java.util.List;
		
		public class LoadProperties {
		
			public static void loadProperties(HashMap<String, String> propertiesMemory,
					HashMap<String, List<String>> propertiesMemoryAttributes) {

	'''
	
	def static fin()'''
		}
	}
	'''
	
	
	def static putMemory(String name,String value) '''
		propertiesMemory.put("«name»", "«value»");
	'''
	
	def static putAttribyteMemory(String name,String value) '''
		propertiesMemoryAttributes.put("«name»",Arrays.asList("«value»".split("\\|")));
	'''

	def static void generateProperties(String propertiesFile, String outputDirectory) {

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
		val resourceSet = new ResourceSetImpl
		resourceSet.getPackageRegistry().put("http://www.w3.org/ns/properties", PropertiesPackage.eINSTANCE);
		val resource = resourceSet.getResource(URI.createURI(propertiesFile), true)

		var propertiesPS = new PrintStream(outputDirectory+"/aspects/LoadProperties.java");
		
		propertiesPS.println(inicio);
		for (documents : resource.contents) {
			// nuevo fichero
			for (property : documents.eContents) {
				
				if (property instanceof Property) {
					
					if (property.name.contains(".attributes")) {
						propertiesPS.println(putAttribyteMemory(property.name, property.value))
					} else {
						propertiesPS.println(putMemory(property.name, property.value))
					}			
				}
			}
		}
		propertiesPS.println(fin);
		

		propertiesPS.close();

	}

}
