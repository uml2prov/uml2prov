package UML2PROV;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.osgi.container.Module.StopOptions;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import UML2PROV.atl.m2m.uml2prop.C2Properties;
import UML2PROV.atl.m2m.uml2prov.C2PROV;
import UML2PROV.atl.m2m.uml2prov.SMD2PROV;
import UML2PROV.atl.m2m.uml2prov.SeqD2PROV;
import xtendCode.generatorPROVN.PROVNGenerator;

import org.eclipse.emf.mwe.core.WorkflowEngine;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;


public class Principal {

	private static final String CLASSPROVFILEPATH = "provModelClass.xmi";
	private static final String SEQPROVFILEPATH = "provModelSeq.xmi";
	private static final String SMPROVFILEPATH = "provModelSm.xmi";
	private static final String PROPFILEPATH = "provModelProperties.xmi";

	public static void class2prov(String model) throws IOException, ParserConfigurationException, SAXException, TransformerException {
		try {
			C2PROV runner2 = new C2PROV();
			runner2.loadModels(model);
			// runner2.doC2PROV(new NullProgressMonitor());
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

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(PROPFILEPATH);

			Element documentRoot = (Element) doc.getFirstChild();

			documentRoot.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			documentRoot.setAttribute("xsi:schemaLocation", "http://www.w3.org/ns/properties https://uml2prov.github.io/properties.ecore");

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(PROPFILEPATH));
			transformer.transform(source, result);
			
		} catch (ATLCoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
			
		Map<String, ?> slotMap = new HashMap<String, Object>();
		
		try {
			if (args.length < 1) {
				System.out.println("Arguments not valid : {IN_model_path}.");
			} else {
				for(int i = 0;i<=0;i++){

				Map<String, String> properties = new HashMap<String, String>();		
				

//				create pp.properties
				Stopwatch bgmSW = new Stopwatch();
				
				class2prop(args[0]);
//				properties = new HashMap<String, String>();			
//				properties.put("modelFile", PROPFILEPATH);
//				properties.put("src-gen", "src-gen/");
//				properties.put("templateName", "propertiesTemplate");
//			    new WorkflowEngine().run("src/main/resources/xpandWorkflows/generateProperties.mwe", new NullProgressMonitor(), properties, slotMap);
	    
				
//				create aspect
				properties = new HashMap<String, String>();			
				properties.put("modelFile", args[0]);
				properties.put("outModel", "outModel.txt");
				properties.put("src-gen", "src-gen/");
				properties.put("templateName", "uml2aspect");
			    new WorkflowEngine().run("src/main/resources/xpandWorkflows/generateAspect.mwe", new NullProgressMonitor(), properties, slotMap);
			    long bgmTime = bgmSW.elapsedTime();


//				System.out.println("\n\n\n ");

				
				Stopwatch classSW = new Stopwatch();
				class2prov(args[0]);	
//				properties = new HashMap<String, String>();	
//				properties.put("modelFile", CLASSPROVFILEPATH);
//				properties.put("src-gen", "src-gen/templates/class");
//				properties.put("templateName", "provnTemplate");
//			    new WorkflowEngine().run("src/main/resources/xpandWorkflows/M2T.mwe", new NullProgressMonitor(), properties, slotMap);
			    long classTime = classSW.elapsedTime();
//			    
//			    
				System.out.println("\n\n\n ");
				Stopwatch classSQ = new Stopwatch();
				seq2prov(args[0]);
//				properties = new HashMap<String, String>();	
//				properties.put("modelFile", SEQPROVFILEPATH);
//				properties.put("src-gen", "src-gen/templates/sequence");
//				properties.put("templateName", "provnTemplate");			
//			    new WorkflowEngine().run("src/main/resources/xpandWorkflows/M2T.mwe", new NullProgressMonitor(), properties, slotMap);
			    long seqTime = classSQ.elapsedTime();
			    
				System.out.println("\n\n\n ");
				Stopwatch classSM = new Stopwatch();
				smd2prov(args[0]);
//				properties = new HashMap<String, String>();	
//				properties.put("modelFile", SMPROVFILEPATH);
//				properties.put("src-gen", "src-gen/templates/state");
//				properties.put("templateName", "provnTemplate");
//			    new WorkflowEngine().run("src/main/resources/xpandWorkflows/M2T.mwe", new NullProgressMonitor(), properties, slotMap);
			    long smTime = classSM.elapsedTime();
			    
			    System.err.println("\n\n\n");
			    System.err.println("Class: "+classTime/1000000);
			    System.err.println("SMD: "+smTime/1000000);
			    System.err.println("SQ: "+seqTime/1000000);
			    
			    System.err.println("Templates total: "+ (classTime+smTime+seqTime)/1000000);
			    System.err.println("BGM: "+bgmTime/1000000);
			    System.err.println(((classTime+smTime+seqTime)/1000000)+";"+bgmTime/1000000);
			    

//				 delete previous files
				 new File(CLASSPROVFILEPATH).delete();
				 new File(SEQPROVFILEPATH).delete();
				 new File(PROPFILEPATH).delete();
				 new File(SMPROVFILEPATH).delete();
				}
			}
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (TransformerConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (TransformerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	

}
