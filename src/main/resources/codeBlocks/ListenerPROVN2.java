package aspects.listeners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import org.openprovenance.prov.interop.InteropFramework;
import org.openprovenance.prov.interop.InteropFramework.ProvFormat;
import org.openprovenance.prov.model.Document;
import org.openprovenance.prov.model.Namespace;
import org.openprovenance.prov.model.ProvFactory;
import org.openprovenance.prov.model.QualifiedName;
import org.openprovenance.prov.model.exception.QualifiedNameException;
import org.openprovenance.prov.template.Bindings;
import org.openprovenance.prov.template.Expand;
import org.openprovenance.prov.xml.TypedValue;

import aspects.events.BGMEvent;

public class ListenerPROVN implements BGMListener {
	
	
	
	static TreeMap<String, Document> classTemplates = new TreeMap<String, Document>();
	static TreeMap<String, Document> seqTemplates = new TreeMap<String, Document>();
	static TreeMap<String, Document> stateTemplates = new TreeMap<String, Document>();
	
	public static InteropFramework intFr = new InteropFramework();
	
	public static Namespace ns = new Namespace();
	public static final String EX_NS = "http://example.org/";
	public static final String EX_PREFIX = "exe";
	public static final String VAR_PREFIX = "var";
	public static final String VAR_NS = "http://openprovenance.org/var#";
	public static final String TMPL_PREFIX = "tmpl";
	public static final String TMPL_NS = "http://openprovenance.org/tmpl#";
	public static final String XSD_PREFIX = "xsd";
	public static final String XSD_NS = "http://www.w3.org/2001/XMLSchema#";
	
	
	static {
//		try {
//			System.setErr(new PrintStream(new File("errores.log")));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
      	new Thread(new Runnable() {
			@Override
			public void run() {
				listf("C:\\Users\\casaenad\\Dropbox\\Doctorado\\proyectos\\JONATHAN\\GelJWS\\GelJ_TSE_uml2provEvents2\\src\\aspects\\templates\\class",classTemplates);
				listf("C:\\Users\\casaenad\\Dropbox\\Doctorado\\proyectos\\JONATHAN\\GelJWS\\GelJ_TSE_uml2provEvents2\\src\\aspects\\templates\\sequence",seqTemplates);
				listf("C:\\Users\\casaenad\\Dropbox\\Doctorado\\proyectos\\JONATHAN\\GelJWS\\GelJ_TSE_uml2provEvents2\\src\\aspects\\templates\\state",stateTemplates);
			}
		}).start();
      	
		ns.addKnownNamespaces();
		ns.register(EX_PREFIX, EX_NS);
		ns.register(VAR_PREFIX, VAR_NS);
		ns.register(TMPL_PREFIX, TMPL_NS);
		ns.register(XSD_PREFIX, XSD_NS);
		
	}
	
	
	TreeMap<String, Bindings> methodBinding = new TreeMap<String, Bindings>();
	TreeMap<String, String> statesMethod = new TreeMap<String, String>();
	private static final ProvFactory pf =intFr.newXMLProvFactory();
	
	
	@Override
	public void newValueBinding(BGMEvent e){
		
		List<org.openprovenance.prov.model.TypedValue> listTypedValues = new ArrayList<org.openprovenance.prov.model.TypedValue>();
		
		TypedValue tv = new TypedValue();	
		if(e.getVarName().compareTo("operationStartTime")==0 || e.getVarName().compareTo("operationEndTime")==0){
			SimpleDateFormat xsdDateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date d = new Date();
			d.setTime(Long.valueOf(e.getValue()));
			tv.setType(pf.getName().XSD_DATETIME);
			tv.setValue(xsdDateTime.format(d));
		}else{
			tv.setType(pf.getName().XSD_STRING);
			tv.setValue(e.getValue());
		}
		listTypedValues.add(tv);
		
		Bindings b = methodBinding.get(e.getExecutionIdMethod());
		b.addAttribute(var(e.getVarName()), listTypedValues);

	}
	
	@Override
	public void newBinding(BGMEvent e) {
		if(e.getVarName().compareTo("operationStartTime")==0 
				|| e.getVarName().compareTo("operationEndTime")==0
				|| e.getVarName().compareTo("sourceState")==0
				|| e.getVarName().compareTo("targetState")==0){
			newValueBinding(e);
		}else{
			Bindings b = methodBinding.get(e.getExecutionIdMethod());
			b.addVariable(var(e.getVarName()),ex(e.getValue()));
		}
		

	}

	@Override
	public void operationStart(BGMEvent e) {
		Bindings b = new Bindings(pf);			
		methodBinding.put(e.getExecutionIdMethod(), b);	
		statesMethod.put(e.getExecutionIdMethod(), e.getState());
	}

	@Override
	public void operationEnd(BGMEvent e) {
		 	String sourceState = statesMethod.get(e.getExecutionIdMethod());
		 	String targetState = e.getState();

        	new Thread(new Runnable() {
				
				@Override
				public void run() {
		 			try {
				    	 	Bindings binding = methodBinding.get(e.getExecutionIdMethod());		
				    	 	if(binding==null) System.err.println(e.getExecutionIdMethod() +" not in methodBinding, binding null");
							String nameTemplate = e.getClassName()+"_"+e.getExecutionIdMethod().split("-")[0];
							File folderExpandedDocuments = new File("bindings_"+e.getExecutionID());
							if(!folderExpandedDocuments.exists()){
								folderExpandedDocuments.mkdirs();
							}
	
							ArrayList<File> templates = new ArrayList<File>();
							// listf("/Users/darwin/Desktop/carlos/Dropbox/Doctorado/proyectos/uml2prov/workspace/ProxyProvGenerator/templateDiagrams/sequenceTemplates",sequenceTemplates);

							findAndExpand(nameTemplate, "bindings_"+e.getExecutionID()+"/"+e.getExecutionIdMethod()+"_cl.provn", binding, classTemplates);
							findAndExpand(nameTemplate, "bindings_"+e.getExecutionID()+"/"+e.getExecutionIdMethod()+"_seq.provn", binding, seqTemplates);	
							if(sourceState!= null && targetState!= null ){
									findAndExpand(nameTemplate+"_"+sourceState+"-"+targetState, "bindings_"+e.getExecutionID()+"/"+e.getExecutionIdMethod()+"_st.provn", binding, stateTemplates);	
							}
//							methodBinding.remove(e.getExecutionIdMethod());
//							statesMethod.remove(e.getExecutionIdMethod());
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}			
				}
			}).start();
	}

	
	
	public static QualifiedName ex(String param) {
		QualifiedName rtn = null;

		try {
			rtn = ns.qualifiedName(EX_PREFIX, param.replace("[]", ""), pf);
		} catch (QualifiedNameException e) {
			System.err.println("QualifiedNameException");
			System.err.println("param: "+ param);
		}
		return rtn;

	}

	public static QualifiedName var(String param) {
		return ns.qualifiedName(VAR_PREFIX, param, pf);
	}
	
	private synchronized void findAndExpand(String nameTemplate, String bindingFile, final Bindings binding, TreeMap<String, Document> classTemplates) throws FileNotFoundException{
		Document docTemplate = classTemplates.get(nameTemplate);
		if(docTemplate!=null){
			
			File templateFile = new File(bindingFile);
			
			Document expanded = expander(docTemplate, binding);
			// bindingFile
			intFr.writeDocument(templateFile.getAbsolutePath(), ProvFormat.PROVN, expanded);
//			System.out.println("[New] "+bindingFile);

			String bindingNameTemp = templateFile.getAbsolutePath(); 
			bindingNameTemp =  bindingNameTemp.split("\\.")[0];
			bindingNameTemp =  bindingNameTemp.subSequence(0, bindingNameTemp.lastIndexOf("_"))+ "_bind.provn";
			intFr.writeDocument(bindingNameTemp, ProvFormat.PROVN, binding.toDocument());
			
			
			bindingNameTemp = templateFile.getAbsolutePath(); 
			bindingNameTemp =  bindingNameTemp.split("\\.")[0]+ "_tmpl.provn";
			
			intFr.writeDocument(bindingNameTemp, ProvFormat.PROVN, docTemplate);

			
//			System.out.println("[New] "+bindingFile);
		}
	}
	
	private synchronized Document expander(Document template, final Bindings bindings){
			Document expanded = null;
			Expand e = new Expand(pf, false, true);
			expanded = e.expander(template, bindings);
			return expanded;
	}
	
	private static  void listf(String directoryName, TreeMap<String,Document> templates) {
		File directory = new File(directoryName);

		if(directory.listFiles()!=null){
			
		    // get all the files from a directory
		    File[] fList = directory.listFiles();
	
		    for (File file : fList) {
		        if (file.isFile()) {
		        	Document d = intFr.readDocumentFromFile(file.getAbsolutePath(),ProvFormat.PROVN);
		        	templates.put(file.getName().split("\\.")[0], d);
//		        	System.out.println("Adding..."+file.getAbsolutePath());
		        	
		        } else if (file.isDirectory()) {
		            listf(file.getAbsolutePath(), templates);
		        }
		    }
		}
	}	
	
}
	
	
	/*
public Document makeDocument(String bind) {
        
        System.out.println("******************");
        
        IndexedDocument iDoc=new IndexedDocument(pFactory, pFactory.newDocument(), true);

        //return makePC1FullGraph(pFactory, URL_LOCATION, URL_LOCATION);
        try {
            InputStream is=getClass().getClassLoader().getResourceAsStream("template_block.provn");
            Document doc= new Utility().readDocument(is, pFactory);
            
            int count=0;
            for (Bindings bindings : makeBindings()) {
                bindings.addVariableBindingsAsAttributeBindings();
                bindings.exportToJson(bind + count + ".json");
                count++;
                Document eDoc=expander(doc, bindings);
                iDoc.merge(eDoc);
            }
            return iDoc.toDocument();
            
        } catch (Throwable t) {
            t.printStackTrace();
            return null;
            
        }
*/


	
