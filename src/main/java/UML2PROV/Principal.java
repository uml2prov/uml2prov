package UML2PROV;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.io.FileUtils;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.xml.sax.SAXException;
import UML2PROV.atl.m2m.uml2prop.C2Properties;
import UML2PROV.atl.m2m.uml2prov.C2PROV;
import UML2PROV.atl.m2m.uml2prov.SMD2PROV;
import UML2PROV.atl.m2m.uml2prov.SeqD2PROV;
import xtendCode.generatorAspect.AspectGenerator;
import xtendCode.generatorPROVN.PROVNGenerator;
import xtendCode.generatorProperties.PropertiesGenerator;

public class Principal {

	
	private static final String CLASSPROVFILEPATH = "provModelClass.xmi";
	private static final String SEQPROVFILEPATH = "provModelSeq.xmi";
	private static final String SMPROVFILEPATH = "provModelSm.xmi";
	private static final String PROPFILEPATH = "provModelProperties.xmi";

	public static void main(String[] args) {
		try {

			Options options = new Options();
			options.addOption("m", true, "UML model addressed by UML2PROV.");
			options.addOption("i", true, "Java class implementing BGMListener. This class sets the configuration for managing and storing bindings.");

			CommandLineParser parser = new DefaultParser();
			CommandLine line = parser.parse(options, args);
			
			if (line.hasOption("m") && line.hasOption("i")) {
				String model= line.getOptionValue("m");
				String interfaceImplemented= line.getOptionValue("i");
				String nameInterface = new File(interfaceImplemented).getName();

				AspectGenerator.generateBGM(model,nameInterface);
				class2prov(model);
				seq2prov(model);
				smd2prov(model);
				class2prop(model);
				
				FileUtils.copyFile(new File(interfaceImplemented), new File("src-gen/aspects/listeners/"+interfaceImplemented));


				new File(CLASSPROVFILEPATH).delete();
				new File(SEQPROVFILEPATH).delete();
				new File(PROPFILEPATH).delete();
				new File(SMPROVFILEPATH).delete();		
				
			}else if(!line.hasOption("m")){
				System.out.println("Please insert a UML model using parameter -m");
			}else if(!line.hasOption("i")){
				System.out.println("Please insert a java class implementing the interface BGMListenerInterface -i");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	public static void class2prov(String model)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {
		try {
			C2PROV runner2 = new C2PROV();
			runner2.loadModels(model);
			runner2.doC2PROV(null);
			runner2.saveModels(CLASSPROVFILEPATH);

			new PROVNGenerator().generate(CLASSPROVFILEPATH, "templates/class");

//			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//			Document doc = docBuilder.parse(CLASSPROVFILEPATH);
//
//			Element documentRoot = (Element) doc.getFirstChild();
//
//			documentRoot.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
//			documentRoot.setAttribute("xsi:schemaLocation", "http://www.w3.org/ns/prov https://uml2prov.github.io/prov.ecore");
////			"http://www.w3.org/ns/prov file:C:/Users/casaenad/Dropbox/Doctorado/proyectos/ATL/workspace/ExecuteXPand/src/metamodels/prov.ecore");
//
//					
//			TransformerFactory transformerFactory = TransformerFactory.newInstance();
//			Transformer transformer = transformerFactory.newTransformer();
//			DOMSource source = new DOMSource(doc);
//			StreamResult result = new StreamResult(new File(CLASSPROVFILEPATH));
//			transformer.transform(source, result);

		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void seq2prov(String model)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {
		try {
			SeqD2PROV runnerSeq = new SeqD2PROV();
			runnerSeq.loadModels(model);
			runnerSeq.doSeqD2PROV(null);
			runnerSeq.saveModels(SEQPROVFILEPATH);

			new PROVNGenerator().generate(SEQPROVFILEPATH, "templates/sequence");

//			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//			Document doc = docBuilder.parse(SEQPROVFILEPATH);
//
//			Element documentRoot = (Element) doc.getFirstChild();
//
//			documentRoot.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
//			documentRoot.setAttribute("xsi:schemaLocation",	"http://www.w3.org/ns/prov https://uml2prov.github.io/prov.ecore");
//
//			TransformerFactory transformerFactory = TransformerFactory.newInstance();
//			Transformer transformer = transformerFactory.newTransformer();
//			DOMSource source = new DOMSource(doc);
//			StreamResult result = new StreamResult(new File(SEQPROVFILEPATH));
//			transformer.transform(source, result);
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void smd2prov(String model) {
		try {
			SMD2PROV runnerSM;
			runnerSM = new SMD2PROV();

			runnerSM.loadModels(model);
			runnerSM.doSMD2PROV(null);
			runnerSM.saveModels(SMPROVFILEPATH);

			new PROVNGenerator().generate(SMPROVFILEPATH, "templates/state");

//			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//			Document doc = docBuilder.parse(SMPROVFILEPATH);
//
//			Element documentRoot = (Element) doc.getFirstChild();
//
//			documentRoot.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
//			documentRoot.setAttribute("xsi:schemaLocation",
//					"http://www.w3.org/ns/prov https://uml2prov.github.io/prov.ecore");
//
//			TransformerFactory transformerFactory = TransformerFactory.newInstance();
//			Transformer transformer = transformerFactory.newTransformer();
//			DOMSource source = new DOMSource(doc);
//			StreamResult result = new StreamResult(new File(SMPROVFILEPATH));
//			transformer.transform(source, result);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void class2prop(String model)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {
		try {
			C2Properties runnerProp = new C2Properties();
			runnerProp.loadModels(model);

			runnerProp.doC2Properties(null);
			runnerProp.saveModels(PROPFILEPATH);

			PropertiesGenerator.generateProperties(PROPFILEPATH);

//			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//			Document doc = docBuilder.parse(PROPFILEPATH);
//
//			Element documentRoot = (Element) doc.getFirstChild();
//
//			documentRoot.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
//			documentRoot.setAttribute("xsi:schemaLocation", "http://www.w3.org/ns/properties https://uml2prov.github.io/properties.ecore");
//
//			TransformerFactory transformerFactory = TransformerFactory.newInstance();
//			Transformer transformer = transformerFactory.newTransformer();
//			DOMSource source = new DOMSource(doc);
//			StreamResult result = new StreamResult(new File(PROPFILEPATH));
//			transformer.transform(source, result);

		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	


}
