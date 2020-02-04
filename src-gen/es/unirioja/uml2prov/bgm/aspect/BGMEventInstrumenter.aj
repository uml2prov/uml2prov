package es.unirioja.uml2prov.bgm.aspect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.aspectj.lang.reflect.MethodSignature;

import es.unirioja.uml2prov.bgm.BGMEvent;
import es.unirioja.uml2prov.bgm.EventHelper;
import es.unirioja.uml2prov.bgm.BGMEventListener;
//import [Ljava.lang.String;@9f116cc;

public aspect BGMEventInstrumenter {

	ExecutorService exec = Executors.newFixedThreadPool(16, new ThreadFactory() {
		public Thread newThread(Runnable r) {
			Thread t = Executors.defaultThreadFactory().newThread(r);
			t.setDaemon(true);
			return t;
		}
	});

//ExecutorService exec = MoreExecutors.getExitingExecutorService(
//      (ThreadPoolExecutor) Executors.newFixedThreadPool(8), 
//      100_000, TimeUnit.DAYS//period after which executor will be automatically closed
//                           //I assume that 100_000 days is enough to simulate infinity
//);

	private static Integer n = 0;
	private static Long sum = new Long(0);

	public interface Identified {
	};

	private UUID Identified.uuid;
	public String Identified.stateSM = new String();

	public void Identified.setUUID(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID Identified.getUUID() {
		return uuid;
	}

	public void Identified.setStateSM(String state) {
		this.stateSM = state;
	}

	public String Identified.getStateSM() {
		return stateSM;
	}

	public static class IdentifiersManager {
		private static Set<Class> WRAPPER_TYPES = new HashSet(
				Arrays.asList(String.class, Boolean.class, Character.class, Byte.class, Short.class, Integer.class,
						Long.class, Float.class, Double.class, Void.class));

		// static Map<Object, UUID> objectIdentifier = new WeakHashMap<Object, UUID>();

		private static boolean isWrapperType(Class clazz) {
			return WRAPPER_TYPES.contains(clazz);
		}

		static String incrementIdentifier(Object obj) {
			String rslt;
			if (!Identified.class.isAssignableFrom(obj.getClass())) {
				rslt = new UUID(obj).incrementUUID();
			} else {
				rslt = ((Identified) obj).getUUID().incrementUUID();
			}
			return rslt;
		}

		static UUID getIdentifier(Object obj) {
			UUID rtn = null;
//    		if(obj instanceof Identified){

			if (Identified.class.isAssignableFrom(obj.getClass())) {
				if (((Identified) obj).getUUID() == null)
					((Identified) obj).setUUID(new UUID(obj));
				rtn = ((Identified) obj).getUUID();
			} else {
				rtn = new UUID(obj);
			}
			return rtn;
		}

////    		System.out.println(rtn.getCompleteUUID());
//    		long swTime= sw.elapsedTime();
//    		System.out.println("[Parallel] "+ swTime);

//    		UUID rtn = null;
//    		if(obj instanceof Identified){
//    			rtn = ((Identified)obj).getUUID();
//    		}else{
//    			rtn = objectIdentifier.get(obj);
//    			if (rtn == null) {
//    				rtn = new UUID(obj);
//    				objectIdentifier.put(obj, rtn);
//    			}
//    		}
//    		
//    		return rtn;
//    	}
		static synchronized public String randomUUID() {
			return UUID.randomUUID();
		}

		static public UUID newUUID(Object obj) {
			UUID uuid = new UUID(obj);
			return uuid;
		}

	}

	public static class StateManager {

		synchronized static void newState(Object obj, String state) {
			if (Identified.class.isAssignableFrom(obj.getClass())) {
				((Identified) obj).setStateSM(state);
			}
		}

		synchronized static String getState(Object obj) {
			if (obj instanceof Identified) {
				return ((Identified) obj).getStateSM();
			} else
				return "noState";
		}

	}

	// send the eventes
	private static EventHelper<BGMEventListener> bgmm = new EventHelper<>(BGMEventListener.class);

	// identificador de la ejecucion (del binding)
	private static final String EXECUTION_ID = IdentifiersManager.randomUUID();

	// represents the deeper level of the last method executed
	static Integer level = 0;

	// it is a boolean which allows us to know if the level has ended
	// realmente no se como llamarlo, es algo parecido a un semaforo que me dice
	// si el nivel ha finalizado o no.
	static Boolean previousMethod = false;
	static long timeNestedMethods = 0;

	// por cada nivel

	// <nombreClase>.<nombreMetodo>@<idMessage>
	// <replyMessageID>
	private static ArrayList<List<SimpleEntry<String, String>>> returnsArray;

	// por cada nivel
	// <nombreClase>.<nombreMetodo>@<idMessage>
	// time
	private static ArrayList<List<SimpleEntry<String, Long>>> returnsArrayTimes;

	// por cada nivel
	// <nombreClase>.<nombreMetodo>@<idMessage>
	// <starter>
	private static ArrayList<List<SimpleEntry<String, String>>> startersArray;

	// identificadores de los objetos, por nivel
	private static ArrayList<String> objIdArray = new ArrayList<String>();

	// variable que guarda en memoria el fichero de propiedades
	private static HashMap<String, String> propertiesMemory;
	private static HashMap<String, List<String>> propertiesMemoryAttributes;

	static {
		bgmm.addListener(new a.b.ListenerCSV());
		
			returnsArray = new ArrayList<List<SimpleEntry<String, String>>>();
			startersArray = new ArrayList<List<SimpleEntry<String, String>>>();
			returnsArrayTimes = new ArrayList<List<SimpleEntry<String, Long>>>();

//			Properties properties = new Properties();
//			properties.load(new FileInputStream("src/aspects/pp.properties"));
			propertiesMemory = new HashMap<String, String>();
			propertiesMemoryAttributes = new HashMap<String, List<String>>();
			LoadProperties.loadProperties(propertiesMemory, propertiesMemoryAttributes);
			
//			for (Object key : properties.keySet()) {
//				if (((String) key).contains(".attributes")) {
//					propertiesMemoryAttributes.put((String) key,Arrays.asList(properties.getProperty((String) key).split("\\|")));
//				} else {
//					propertiesMemory.put((String) key, properties.getProperty((String) key));
//				}
//			}

//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	// identificador del mensaje (operacion)
	private String id_msg_new = "";



private void getStarterVariable(Identified target, String ID_MSG, String starter) {
	provenance(EXECUTION_ID, target, ID_MSG, "starter", starter);	
}

  			
private void getInputVariableNews(Identified target, Object[] args, String ID_MSG ){
	for (Object arg : args) {
		if (arg != null) {
			if (arg instanceof AbstractCollection) {
				((AbstractCollection<Object>) arg).stream().forEach(element -> {
					if(element!=null){
						String completeID = IdentifiersManager.getIdentifier(element).getCompleteUUID();
						provenance(EXECUTION_ID, target, ID_MSG, "input",	completeID);
						provenanceValueType(target, "inputValue", EXECUTION_ID,ID_MSG,completeID, "value",element.toString());
						provenanceValueType(target, "inputType",EXECUTION_ID,ID_MSG,completeID, "type",element.getClass().getTypeName());
					}
				});
			} else {
				String completeID = IdentifiersManager.getIdentifier(arg).getCompleteUUID();
				provenance(EXECUTION_ID, target, ID_MSG, "input",IdentifiersManager.getIdentifier(arg).getCompleteUUID());
				provenanceValueType(target, "inputValue", EXECUTION_ID, ID_MSG,completeID,"value", arg.toString());
				provenanceValueType(target, "inputType", EXECUTION_ID,ID_MSG, completeID,"type", arg.getClass().getTypeName());
			}
		}
	}
}
	
private void getnewRequestNews(Identified target, String ID_MSG){
	///associated with sequence (operaciones a las que ha llamado)
	if (!previousMethod) {
		List<SimpleEntry<String, String>> starterLevel = startersArray.get(level);
		// ------------------ newRequest variable
		for (int i = 0; i < starterLevel.size(); i++) {
			provenance(EXECUTION_ID, target, ID_MSG, "newRequest", starterLevel.get(i).getValue());
		}
		// ------------------ newRequest variable
	}
	///end sequence
}
	
	private void getAttributesNews(Identified target, String ID_MSG) {
			Arrays.asList(target.getClass().getDeclaredFields()).stream()
				.filter(field -> {
					if(field==null || propertiesMemoryAttributes.get(target.getClass().getSimpleName()+".attributes")==null){
						return false;
					}else{
						return propertiesMemoryAttributes.get(target.getClass().getSimpleName()+".attributes").contains(field.getName());
					}		
				}) //only those fields included in the diagram
				.forEach(field -> {
					try{
						field.setAccessible(true);
						if (field.get(target) != null) {
							String fieldUUID;
							fieldUUID = IdentifiersManager.getIdentifier(field.get(target)).getCompleteUUID();
	
							String fieldValue = (field.get(target) != null) ? field.get(target).toString() : "Null";
							String fieldType = (field.get(target) != null) ? field.getType().getSimpleName() : "Null";
	
							provenance(EXECUTION_ID, target, ID_MSG, "attribute", fieldUUID);
							provenanceValueType(target, "attValue", EXECUTION_ID, ID_MSG, fieldUUID, "value", fieldValue);
							provenanceValueType(target, "attType", EXECUTION_ID, ID_MSG, fieldUUID, "type", fieldType);
							provenanceValueType(target, "attName", EXECUTION_ID, ID_MSG, fieldUUID, "attName", field.getName());
						}
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
	}
	
	
	private void getTargetStateNews(Identified target, BGMEvent initMethod){
		//target state (el valor)
		String targetState = getInitialState(target);
		//target state (el valor)
		if(!targetState.isEmpty()){
			provenance(EXECUTION_ID,target, id_msg_new, "targetState", targetState);
		}	
		initMethod.setState(targetState);
	}
	
	
	private void getSourceVariable(Identified target, String ID_MSG){
		provenance(EXECUTION_ID, target, ID_MSG, "source",	IdentifiersManager.getIdentifier(target).getCompleteUUID());
	}


	
	private void getOperationVariable(Identified target, String ID_MSG){
		provenance(EXECUTION_ID, target, ID_MSG, "operation", ID_MSG);
	}
	
	private void getCollElementsVariables(Identified target, Method method, String ID_MSG) {
		try {
			String fieldAdd = getAddAttribute(target, method);
			if (fieldAdd.compareTo("") != 0) {
				Object collectionAttribute;

				collectionAttribute = target.getClass().getField(fieldAdd).get(target);
				if (collectionAttribute instanceof AbstractCollection
						&& !((AbstractCollection) collectionAttribute).isEmpty()) {
					((AbstractCollection) collectionAttribute).stream().forEach(object -> {
						provenance(EXECUTION_ID, target, ID_MSG, "collElements",
								IdentifiersManager.getIdentifier(object).getCompleteUUID());
					});
				}
			}
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void getInputVariables( Object[] args, Identified target, String ID_MSG){
		for (Object arg : args) {
			if (arg != null) {
				if (arg instanceof AbstractCollection) {
					((AbstractCollection) arg).stream().forEach(element -> {
						String completeID = IdentifiersManager.getIdentifier(element).getCompleteUUID();
						provenance(EXECUTION_ID, target,ID_MSG, "input",IdentifiersManager.getIdentifier(element).getCompleteUUID());
						provenanceValueType(target, "inputValue", EXECUTION_ID,ID_MSG,completeID, "value",element.toString());
						provenanceValueType(target, "inputType", EXECUTION_ID,ID_MSG,completeID, "type",element.getClass().getTypeName());
					});
				} else {
					String completeID = IdentifiersManager.getIdentifier(arg).getCompleteUUID();
					provenance(EXECUTION_ID, target, ID_MSG, "input",IdentifiersManager.getIdentifier(arg).getCompleteUUID());
					provenanceValueType(target, "inputValue", EXECUTION_ID, ID_MSG, completeID, "value",arg.toString());
					provenanceValueType(target,"inputType",  EXECUTION_ID,ID_MSG,completeID, "type",arg.getClass().getTypeName());
				}
			}
		}
	}
	
	
	@SuppressWarnings("unchecked")
	private void provenanceBeforeExecution(Identified target, Method method, Object[] args, String ID_MSG, String starter, Boolean inSequence, Boolean inClass, Boolean inState) {
					if(inSequence) getStarterVariable(target, ID_MSG, starter);
					if(inClass) getCollElementsVariables(target, method, ID_MSG);
	}

	private void provenanceAfterExecution(Identified target, Method method, Object []args, String ID_MSG, Object rtn, String sourceID, Boolean  inSequence, Boolean  inClass,Boolean   inState) {
		
		BGMEvent endMethod = new BGMEvent(target, EXECUTION_ID, target.getClass().getSimpleName(), ID_MSG);
		UUID targetID = IdentifiersManager.getIdentifier(target);
		
		if(inClass) getAttributesVariable(target, method, ID_MSG);
		
		if (inSequence && !previousMethod) {			
			this.getNewRequestVariable(target, ID_MSG, startersArray.get(level));
			this.getReplyMessageVariable(target, ID_MSG, method, returnsArray.get(level));
		}
		
		
		exec.execute(() ->{
			getSourceVariable(target, ID_MSG);
			getOperationVariable(target, ID_MSG);
			if(!(!inSequence && !inClass && inState)) getInputVariables(args, target, ID_MSG);
			if(inState || inClass) this.getTargetVariables( target,  method,  targetID,  sourceID, ID_MSG, endMethod);
			if(inSequence) getLifelineVariable(target, ID_MSG);
			if(inState) getObjectVariables(target, targetID, ID_MSG);
			
			// ------------------ output variable
			if (rtn != null){
				getMessageReplyVariable(target, ID_MSG);
				getOutputVariable(target,rtn,ID_MSG);
			}


			try {bgmm.fireEvent("operationEnd",endMethod);} catch (InvocationTargetException e) {e.printStackTrace();}
		});
	}
	

	private void getTargetVariables(Identified target, Method method, UUID targetID, String sourceID, String ID_MSG, BGMEvent endMethod){
		
		// ------------------ target variable
		if(changeState(target, method) && targetID.getCompleteUUID().compareTo(sourceID)==0){
			
			provenance(EXECUTION_ID, target, ID_MSG, "target", IdentifiersManager.incrementIdentifier(target));				
			String newState = getTargetState(target, method);
			
			if(!newState.isEmpty()){
				provenance(EXECUTION_ID, target, ID_MSG, "sourceState", getCurrentState(target));
				provenance(EXECUTION_ID, target, ID_MSG, "targetState", newState);
				StateManager.newState(target, newState);
				endMethod.setState(newState);
			}
		}else{
			provenance(EXECUTION_ID, target, ID_MSG, "target", targetID.getCompleteUUID());
		}
		// ------------------ target variable
	}

	private void getNewRequestVariable(Identified target, String ID_MSG,  List<SimpleEntry<String, String>> starterLevel){
		// ------------------ newRequest variable
		for (int i = 0; i < starterLevel.size(); i++) {
			provenance(EXECUTION_ID, target, ID_MSG, "newRequest", starterLevel.get(i).getValue());
		}
		// ------------------ newRequest variable
	}

	private void getReplyMessageVariable(Identified target, String ID_MSG, Method method,  List<SimpleEntry<String, String>> returnLevel){
		// ------------------ replyMessage variable
		
		for (int i = 0; i < returnLevel.size(); i++) {
			if(isInformedWithOutput(target, method, returnLevel.get(i).getKey().split("|")[0]) || isInformedWithNoOutput(target,method, returnLevel.get(i).getKey().split("|")[0])){
				provenance(EXECUTION_ID, target, ID_MSG, "replyMessage", returnLevel.get(i).getValue());
			}
		}
		// ------------------ replyMessage variable
	}
	
	private void getLifelineVariable(Identified target, String ID_MSG){
		// ------------------ lifeline variable
		final String lifelevelId = (level-1 > 0 && objIdArray.size()> level-1 ) ? objIdArray.get(level-1) : "TheBigBang";
		provenance(EXECUTION_ID, target, ID_MSG, "lifeline", lifelevelId);
		// ------------------ lifeline variable
	}
	
	
	private void getObjectVariables(Identified target, UUID targetID, String ID_MSG){
		// ------------------ object variable
		provenance(EXECUTION_ID, target, ID_MSG, "object", targetID.getUUID());
		provenance(EXECUTION_ID, target, ID_MSG, "objectSMD", targetID.getUUID()+"_0");
		// ------------------ object variable
	}
	
	
	private void getMessageReplyVariable(Identified target, String ID_MSG){
		// ------------------ MessageReply variable
		provenance(EXECUTION_ID, target, ID_MSG, "messageReply", IdentifiersManager.randomUUID());
		// ------------------ MessageReply variable
		
	}
	
	private void getAttributesVariable(Identified target,Method method, String ID_MSG){
		try {	
			//gestion de atributos tras la ejecucion del metodo
			Arrays.asList(target.getClass().getDeclaredFields()).stream()
					.filter(field -> propertiesMemoryAttributes.get(target.getClass().getSimpleName()+".attributes").contains(field.getName())) //only those fields included in the diagram
					.forEach(field -> {
						field.setAccessible(true);
						String fieldStereotype = "none";
						String fieldUUID;
						try {
							Object fieldTarget = field.get(target);
									
							fieldUUID = (fieldTarget!=null)?IdentifiersManager.getIdentifier(fieldTarget).getCompleteUUID():IdentifiersManager.randomUUID();
							String fieldValue = (fieldTarget != null) ? field.get(target).toString() : "Null";
							String fieldType = (fieldTarget != null) ? field.getType().getName() : "Null";
							


							if (getPropertyAttribute(target, method).compareTo("") != 0 && getPropertyAttribute(target, method).compareTo(field.getName()) == 0) {
								fieldStereotype = "property";
								provenance(EXECUTION_ID, target, ID_MSG, "targetAttribute", fieldUUID);
							}
							
							// new and old column /also attributes
							else if (getAddAttribute(target, method).compareTo("") != 0 && getAddAttribute(target, method).compareTo(field.getName()) == 0) {
								fieldStereotype = "add";
								provenance(EXECUTION_ID, target, ID_MSG, "coll_new",IdentifiersManager.newUUID(fieldTarget).getCompleteUUID());
							}
							
							// modify attribute
							else if (getModifyAttribute(target, method).compareTo("") != 0 && getModifyAttribute(target, method).compareTo(field.getName()) == 0) {
								fieldStereotype = "modify";
								provenance(EXECUTION_ID, target, ID_MSG, "oldAttr",fieldUUID);
								
								String fieldUUID2= IdentifiersManager.incrementIdentifier(field.get(target));
								fieldValue = (fieldTarget != null) ? field.get(target).toString() : "Null";
								fieldType = (fieldTarget != null) ? field.getType().getName() : "Null";
					
								provenance(EXECUTION_ID, target, ID_MSG, "newAttr",fieldUUID2);
								provenanceValueType(target, "newAttrValue", EXECUTION_ID,ID_MSG, fieldUUID2, "value", fieldValue);
								provenanceValueType(target, "newAttrType",EXECUTION_ID, ID_MSG,fieldUUID2, "type", fieldType);
								provenanceValueType(target, "newAttrName",EXECUTION_ID, ID_MSG,fieldUUID2, "attName",field.getName());
							}
							
							// remove elements from a collection
							else if (getRemoveAttribute(target, method).compareTo("") != 0 && getRemoveAttribute(target, method).compareTo(field.getName()) == 0) {
								fieldStereotype = "remove";
								provenance(EXECUTION_ID, target, ID_MSG, "coll_new",IdentifiersManager.newUUID(fieldTarget).getCompleteUUID());
								Object collectionAttribute = target.getClass().getField(getRemoveAttribute(target, method)).get(target);
								if (collectionAttribute instanceof AbstractCollection) {
									((AbstractCollection) collectionAttribute).stream().forEach(s -> {
										provenance(EXECUTION_ID, target, ID_MSG, "collElements", fieldUUID);
									});
								}
							}
							// get identifier withoutmodifications
							else {
								if (changeState(target, method)) {
									provenance(EXECUTION_ID, target, ID_MSG, "attribute", fieldUUID);
									provenanceValueType(target, "attValue", EXECUTION_ID,ID_MSG, fieldUUID, "value", fieldValue);
									provenanceValueType(target, "attType",EXECUTION_ID,ID_MSG, fieldUUID, "type", fieldType);
									provenanceValueType(target, "attName",EXECUTION_ID,ID_MSG, fieldUUID, "attName",field.getName());
								}
							}									
						} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					});

		} catch (IllegalArgumentException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getOutputVariable(Identified target,Object rtn, String ID_MSG) {
		if(rtn instanceof AbstractCollection){
			if (((AbstractCollection<Object>) rtn).isEmpty()){

				String rtnUUID = IdentifiersManager.getIdentifier(rtn).getCompleteUUID();
				provenance(EXECUTION_ID, target, ID_MSG, "output",rtnUUID);
				provenanceValueType(target, "outputValue", EXECUTION_ID, ID_MSG,rtnUUID, "value", "Empty");
				provenanceValueType(target, "outputType",EXECUTION_ID, ID_MSG,rtnUUID, "type", rtn.getClass().getTypeName());
			}else{
				((AbstractCollection<Object>) rtn).stream().forEach(object -> {
					String rtnUUID = IdentifiersManager.getIdentifier(object).getCompleteUUID();
					provenance(EXECUTION_ID, target, ID_MSG, "output",rtnUUID);
					provenanceValueType(target, "outputValue", EXECUTION_ID, ID_MSG,rtnUUID, "value", object.toString());
					provenanceValueType(target,"outputType", EXECUTION_ID, ID_MSG,rtnUUID, "type", object.getClass().getTypeName());
				});
			}
		}else{
			String rtnUUID = IdentifiersManager.getIdentifier(rtn).getCompleteUUID();
			provenance(EXECUTION_ID, target, ID_MSG, "output",IdentifiersManager.getIdentifier(rtn).getCompleteUUID());
			provenanceValueType(target, "outputValue",EXECUTION_ID, ID_MSG,rtnUUID, "value", rtn.toString());
			provenanceValueType(target, "outputType",EXECUTION_ID, ID_MSG,rtnUUID, "type", rtn.getClass().getTypeName());
		}
		
	}
	
	private String beforeManagement(Identified target, String method_name, String id_msg){
		
		if (previousMethod) {
			level++;
		}
		previousMethod = true;

		if (returnsArray.size() <= level) {
			returnsArrayTimes.add(level, new ArrayList<SimpleEntry<String, Long>>());
			returnsArray.add(level, new ArrayList<SimpleEntry<String, String>>());
			startersArray.add(level, new ArrayList<SimpleEntry<String, String>>());
			if(objIdArray.size()>level && level>0)objIdArray.add(level,  IdentifiersManager.getIdentifier(target).getUUID());
		}
		
		// ID of the entity which triggers this execution
		String starter = IdentifiersManager.randomUUID();
		
		// Store this identifier in methodStarter
		SimpleEntry<String, String> methodStarter = new SimpleEntry<String, String>(target.getClass().getSimpleName() + "." + method_name + "@" + id_msg, starter);
		startersArray.get(level).add(methodStarter);
		
		//System.out.println("before ["+method_name+"] level "+level);
		return starter;
	}

	private void afterManagement(Identified target, String method_name, String id_msg, String replyMessageID){
		//System.out.println("after ["+method_name+"] level "+level);

		/** Starting the end-block of managing hierarchical methods */
		if(!previousMethod){
			returnsArrayTimes.get(level).clear();
			returnsArray.get(level).clear();
			startersArray.get(level).clear();
			objIdArray.clear();
			if(level!=0) level--;
//			returnsArrayTimes.add(level,null);
//			returnsArray.add(level,null);
//			startersArray.add(level,null);
//			objIdArray.clear();
//			if(level!=0) level--;
		}
		previousMethod = false;

		// keeping track of the return objects
		SimpleEntry<String, String> methodReturn = new SimpleEntry<String, String>(	target.getClass().getSimpleName() + "." + method_name + "@" + id_msg, replyMessageID);	
		returnsArray.get(level).add(methodReturn);
		/** Ending of the end-block of managing hierarchical methods */
	}
	
	private void provenance(String ID_EXECUTION, final Identified target, String ID_EXECUTION_METHOD, String variableName,String value){
		try {
			BGMEvent e = new BGMEvent(target, ID_EXECUTION, target.getClass().getSimpleName(), ID_EXECUTION_METHOD, variableName, value);
			bgmm.fireEvent("newBinding", e);
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
	}
	
	private void provenanceValueType(final Identified target, String variableName, String ID_EXECUTION, String ID_EXECUTION_METHOD, String identifier, String type, String value) {
		try {
			
			//BGMEvent e = new BGMEvent(target, ID_EXECUTION, value, identifier, type);
			
			BGMEvent e = new BGMEvent(target, ID_EXECUTION, target.getClass().getSimpleName(), ID_EXECUTION_METHOD, variableName, value);
			bgmm.fireEvent("newValueBinding", e);
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private String getCurrentState(Object o){
		String currentState= StateManager.getState(o);
		return (currentState==null)?"":currentState.trim();
	}
	
	private String getInitialState(Identified target) {
		String change = propertiesMemory.get(target.getClass().getSimpleName()+".sourceState");
		StateManager.newState(target, change);
		return (change==null)?"":change.trim();
	}
	
	private String getTargetState(Identified target, Method m) {
		String currentState= StateManager.getState(target);
		String property = target.getClass().getSimpleName()+ "." + m.getName() + "."+currentState;
		String change = propertiesMemory.get(property.trim());
		return (change==null)?"":change.trim();
	}
	
	private void setCurrentState(Object o, String state){
		StateManager.newState(o, state);
	}
	
	
	private Boolean isRelevant(Identified target, Method m) {
		String change = propertiesMemory.get(target.getClass().getSimpleName() + "." +m.getName() + ".relevant");
		return (change != null && change.trim().compareTo("true") == 0) ? true : false; 
	}
	
	private Boolean changeState(Identified target, Method m) {
		String change = propertiesMemory.get(target.getClass().getSimpleName() + "." + m.getName() + ".changeState");
		Boolean response = (change != null && change.trim().compareTo("true") == 0);
		return response;
	}
	
	//return the name of the attribute collection used
	private String getGetCollectionAttribute(Identified target,Method m) {
			String change = propertiesMemory.get(target.getClass().getSimpleName()+ "." + m.getName() + ".search");
			return (change==null)?"":change.trim();
	}
	
	
	private String getPropertyAttribute(Identified target,Method m) {
		String change = propertiesMemory.get(target.getClass().getSimpleName()+ "." + m.getName() + ".property");
		return (change==null)?"":change.trim();
	}

	private String getSetAttribute(Identified target,Method m) {
//		try {
			String change = propertiesMemory.get(target.getClass().getSimpleName()+ "." + m.getName() + ".set");
			return (change==null)?"":change.trim();
	}

	private String getCommandAttribute(Identified target,Method m) {
		String change = propertiesMemory.get(target.getClass().getSimpleName()+ "." + m.getName() + ".command");
		return (change==null)?"":change.trim();
	}
	
	private String getGetAttribute(Identified target,Method m) {
		String change = propertiesMemory.get(target.getClass().getSimpleName()+ "." + m.getName() + ".get");
		return (change==null)?"":change.trim();
	}
	
	
	private String getAddAttribute(Identified target,Method m) {
		String change = propertiesMemory.get(target.getClass().getSimpleName() + "." + m.getName() + ".add");
		return (change==null)?"":change.trim();
	}
	
	private String getModifyAttribute(Identified target,Method m) {
//		try {
			String change = propertiesMemory.get(target.getClass().getSimpleName()+ "." + m.getName() + ".modify");
			return (change==null)?"":change.trim();
	}

	
	public String getRemoveAttribute(Identified target, Method m) {
		String change = propertiesMemory.get(target.getClass().getSimpleName() + "." + m.getName() + ".remove");
		return (change==null)?"":change.trim();
	}

	private boolean isInformedWithNoOutput(Identified target, Method m, String key) {
		String informedMethods = propertiesMemory.get(target.getClass().getSimpleName() + "." + m.getName() + ".informedBy");
		if(informedMethods!=null)
			return informedMethods.contains(key);
		else
			return false;
	}

	private boolean isInformedWithOutput(Identified target, Method m, String key) {
		String informedMethods = propertiesMemory.get(target.getClass().getSimpleName() + "." + m.getName() + ".informedByWithOutput");
		if(informedMethods!=null){
			return informedMethods.contains(key);
		}else{
			return false;
		}
	}	
}
