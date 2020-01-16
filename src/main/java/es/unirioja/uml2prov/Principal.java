package es.unirioja.uml2prov;

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

import es.unirioja.uml2prov.atl.C2PROV;
import es.unirioja.uml2prov.atl.C2Properties;
import es.unirioja.uml2prov.atl.SMD2PROV;
import es.unirioja.uml2prov.atl.SeqD2PROV;
import es.unirioja.uml2prov.xtend.AspectGenerator;
import es.unirioja.uml2prov.xtend.PROVNGenerator;
import es.unirioja.uml2prov.xtend.PropertiesGenerator;


public class Principal {

	
	private static final String CLASSPROVFILEPATH = "provModelClass.xmi";
	private static final String SEQPROVFILEPATH = "provModelSeq.xmi";
	private static final String SMPROVFILEPATH = "provModelSm.xmi";
	private static final String PROPFILEPATH = "provModelProperties.xmi";

	public static void main(String[] args) {
		try {
			String outputDirectory = "src-gen";
			
			Options options = new Options();
			options.addOption("m", true, "UML model addressed by UML2PROV.");
			options.addOption("i", true, "Directory containing the listener source class (java file inside its packages directories)");
			options.addOption("l", true, "Qualified name of the listener");
			options.addOption("o", true, "Output directory");

			CommandLineParser parser = new DefaultParser();
			CommandLine line = parser.parse(options, args);
			
			if(line.hasOption("o")) {
				outputDirectory = line.getOptionValue("o");
			}
			
			if (line.hasOption("m") && line.hasOption("i") && line.hasOption("l") ) {
				String model= line.getOptionValue("m");
				String directoryOfListener= line.getOptionValue("i");
				String listenerName = line.getOptionValue("l");
				File pathToListener = new File(directoryOfListener,listenerName.replace(".", "/")+".java");
				File targetPath = new File(outputDirectory,listenerName.replace(".", "/")+".java");

				if(new File(outputDirectory).exists()) FileUtils.deleteDirectory(new File(outputDirectory));

				FileUtils.copyFile(pathToListener, targetPath);
				
				AspectGenerator.generateBGM(model,listenerName, outputDirectory);
				class2prov(model, outputDirectory+"/templates/class");
				seq2prov(model, outputDirectory+"/templates/sequence");
				smd2prov(model, outputDirectory+"/templates/state");
				class2prop(model, outputDirectory);
				
				new File(CLASSPROVFILEPATH).delete();
				new File(SEQPROVFILEPATH).delete();
				new File(PROPFILEPATH).delete();
				new File(SMPROVFILEPATH).delete();		
				
			}else if(!line.hasOption("m")){
				System.out.println("Please insert a UML model using parameter -m");
			}else if(!line.hasOption("i")){
				System.out.println("Please insert a java class implementing the interface BGMEventListener -i");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	public static void class2prov(String model, String outputDirectory)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {
		try {
			C2PROV runner2 = new C2PROV();
			runner2.loadModels(model);
			runner2.doC2PROV(null);
			runner2.saveModels(CLASSPROVFILEPATH);

			new PROVNGenerator().generate(CLASSPROVFILEPATH, outputDirectory);

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

	public static void seq2prov(String model, String outputDirectory)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {
		try {
			SeqD2PROV runnerSeq = new SeqD2PROV();
			runnerSeq.loadModels(model);
			runnerSeq.doSeqD2PROV(null);
			runnerSeq.saveModels(SEQPROVFILEPATH);

			new PROVNGenerator().generate(SEQPROVFILEPATH, outputDirectory);

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

	public static void smd2prov(String model, String outputDirectory) {
		try {
			SMD2PROV runnerSM;
			runnerSM = new SMD2PROV();

			runnerSM.loadModels(model);
			runnerSM.doSMD2PROV(null);
			runnerSM.saveModels(SMPROVFILEPATH);

			new PROVNGenerator().generate(SMPROVFILEPATH, outputDirectory);

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

	public static void class2prop(String model, String outputDirectory)
			throws IOException, ParserConfigurationException, SAXException, TransformerException {
		try {
			C2Properties runnerProp = new C2Properties();
			runnerProp.loadModels(model);

			runnerProp.doC2Properties(null);
			runnerProp.saveModels(PROPFILEPATH);

			PropertiesGenerator.generateProperties(PROPFILEPATH,outputDirectory);

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
