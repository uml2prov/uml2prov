 

		package aspects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.WeakHashMap;

import org.aspectj.lang.reflect.MethodSignature;

import com.google.common.util.concurrent.MoreExecutors;

import aspects.listeners.BGMListener;
import aspects.listeners.ListenerMongoDB;
import aspects.listeners.ListenerMongoDB2;
import aspects.listeners.ListenerPROVN;
import aspects.provenanceExtractor.Identified;
import aspects.provenanceExtractor.IdentifiersManager;
import weka.gui.SysErrLog;

public aspect provenanceExtractor{
	
	private static Integer n =0;
	private static Long sum=new Long(0);
	

	ExecutorService exec = MoreExecutors.getExitingExecutorService(
	        (ThreadPoolExecutor) Executors.newFixedThreadPool(8), 
	        100_000, TimeUnit.DAYS//period after which executor will be automatically closed
	                             //I assume that 100_000 days is enough to simulate infinity
	);

	
	
    public interface Identified {};
    private UUID Identified.uuid;
    public String Identified.stateSM = new String();
    public void Identified.setUUID(UUID uuid) { this.uuid = uuid;  }
    public UUID Identified.getUUID() {     return uuid;    }
    public void Identified.setStateSM(String state) { this.stateSM = state;  }
    public String Identified.getStateSM() {     return stateSM;    }
      
    public static class IdentifiersManager {
    	private static Set<Class> WRAPPER_TYPES = new HashSet(Arrays.asList(String.class, Boolean.class, Character.class, Byte.class,Short.class, Integer.class, Long.class, Float.class, Double.class,Void.class));

    	//static  Map<Object, UUID> objectIdentifier = new WeakHashMap<Object, UUID>();	
    	

    	private static boolean isWrapperType(Class clazz) {
    		return WRAPPER_TYPES.contains(clazz);
    	}

    	static String incrementIdentifier(Object obj) {
    		String rslt;
    		if (!Identified.class.isAssignableFrom(obj.getClass())) {
    			rslt = new UUID(obj).incrementUUID();
    		} else {
    			rslt= ((Identified) obj).getUUID().incrementUUID();
    		}
    		return rslt;
    	}

    	
    	static UUID getIdentifier(Object obj) {
    		UUID rtn = null;
//    		if(obj instanceof Identified){
    		
    		if(Identified.class.isAssignableFrom(obj.getClass())){
    			if(((Identified)obj).getUUID()==null) 	((Identified)obj).setUUID(new UUID(obj));
    			rtn = ((Identified)obj).getUUID();
    		}else{
    			rtn = new UUID(obj);
    		}
    		return rtn;
    	}
    	
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
    		if(Identified.class.isAssignableFrom(obj.getClass())){
    			((Identified)obj).setStateSM(state);
    		}
    	}

    	synchronized static String getState(Object obj) {
    		if(obj instanceof Identified){
    			return ((Identified)obj).getStateSM();
    		}
    		else return "noState";
    	}
    }

    
    
	//send the eventes
	private static EventHelper<BGMListener> bgmm = new EventHelper<>(BGMListener.class);
	
	//identificador de la ejecucion (del binding)
	private static final String EXECUTION_ID = IdentifiersManager.randomUUID();
	
	// represents the deeper level of the last method executed
	static Integer level = 0;
	
	// it is a boolean which allows us to know if the level has ended
	// realmente no se como llamarlo, es algo parecido a un semaforo que me dice
	// si el nivel ha finalizado o no.
	static Boolean previousMethod = false;
	static long timeNestedMethods = 0;
	
	//por cada nivel
	
	//		<nombreClase>.<nombreMetodo>@<idMessage>
	//		<replyMessageID>
	private static ArrayList<List<SimpleEntry<String, String>>> returnsArray;	
	
	//por cada nivel
	//		<nombreClase>.<nombreMetodo>@<idMessage>
	//		time
	private static ArrayList<List<SimpleEntry<String, Long>>> returnsArrayTimes;	
	
	//por cada nivel
	//		<nombreClase>.<nombreMetodo>@<idMessage>
	//		<starter>
	private static ArrayList<List<SimpleEntry<String, String>>> startersArray;
	
	//identificadores de los objetos, por nivel
	private static ArrayList<String> objIdArray = new ArrayList<String>();

	//variable que guarda en memoria el fichero de propiedades
	private static HashMap<String, String> propertiesMemory;
	private static HashMap<String, List<String>> propertiesMemoryAttributes;
	
	
	static{
		 try {
	    		try {
					System.setOut(new PrintStream(new File("data.txt")));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
			 
			bgmm.addListener(new ListenerMongoDB2());
			//bgmm.addListener(new ListenerPROVN());
			 
			returnsArray = new ArrayList<List<SimpleEntry<String,String>>>();	
			startersArray = new ArrayList<List<SimpleEntry<String, String>>>();
			returnsArrayTimes = new ArrayList<List<SimpleEntry<String,Long>>>();

			Properties properties = new Properties();	
			properties.load(new FileInputStream("src/aspects/pp.properties"));
			propertiesMemory = new HashMap<String, String>();
			propertiesMemoryAttributes = new HashMap<String, List<String>>();
			for (Object key : properties.keySet()) {
				if(((String) key).contains(".attributes")){
					propertiesMemoryAttributes.put((String) key, 
													Arrays.asList(properties.getProperty((String) key).split("\\|")));
				}
				else{
					propertiesMemory.put((String) key, properties.getProperty((String) key));
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//identificador del mensaje (operacion)
	private String id_msg_new = "";
	

	Stopwatch swAroundNew;
	Stopwatch swProceedNew;
		
		
		
		  

		  

		  

		  
		  	  	  
	declare parents : GelJ_TSE.ij.workspace.GelJ.Menu implements Identified;;
		  

		  
		  	  	  
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_3 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Image_Assistant implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_2 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_3 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_1 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_1 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_3 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_1 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_3 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_1 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_2 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_2 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_2 implements Identified;
	declare parents : GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4 implements Identified;;
		  

		  

		  
		  	  	  
	declare parents : GelJ_TSE.db.Classes.Experiment implements Identified;;
		  

		  
		  	  	  
	declare parents : GelJ_TSE.db.Interface.Main implements Identified;;
		  

		  

		  

		  
		  	  	  
	declare parents : importedTypes.javax.swing.JFrame implements Identified;
	declare parents : importedTypes.javax.swing.ButtonGroup implements Identified;
	declare parents : importedTypes.javax.swing.JButton implements Identified;
	declare parents : importedTypes.javax.swing.JCheckBox implements Identified;
	declare parents : importedTypes.javax.swing.JComboBox implements Identified;
	declare parents : importedTypes.javax.swing.JLabel implements Identified;
	declare parents : importedTypes.javax.swing.JPanel implements Identified;
	declare parents : importedTypes.javax.swing.JScrollPane implements Identified;
	declare parents : importedTypes.javax.swing.JTextArea implements Identified;
	declare parents : importedTypes.javax.swing.JToolBar implements Identified;
	declare parents : importedTypes.javax.swing.JTextField implements Identified;
	declare parents : importedTypes.javax.swing.JRadioButton implements Identified;
	declare parents : importedTypes.javax.swing.JSlider implements Identified;
	declare parents : importedTypes.javax.swing.JDialog implements Identified;
	declare parents : importedTypes.javax.swing.JSeparator implements Identified;
	declare parents : importedTypes.javax.swing.JTable implements Identified;
	declare parents : importedTypes.javax.swing.JList implements Identified;
	declare parents : importedTypes.javax.swing.JMenuItem implements Identified;
	declare parents : importedTypes.javax.swing.JMenu implements Identified;
	declare parents : importedTypes.javax.swing.JMenuBar implements Identified;
	declare parents : importedTypes.javax.swing.JSplitPane implements Identified;
	declare parents : importedTypes.javax.swing.JTree implements Identified;
	declare parents : importedTypes.javax.swing.JTabbedPane implements Identified;
	declare parents : importedTypes.javax.swing.DefaultListModel implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.javax.swing.event.ChangeEvent implements Identified;
	declare parents : importedTypes.javax.swing.event.TableModelEvent implements Identified;
	declare parents : importedTypes.javax.swing.event.ListSelectionEvent implements Identified;
	declare parents : importedTypes.javax.swing.event.TreeSelectionEvent implements Identified;
	declare parents : importedTypes.javax.swing.event.TreeModelEvent implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.javax.swing.JToolBar.Separator implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.javax.swing.tree.DefaultMutableTreeNode implements Identified;
	declare parents : importedTypes.javax.swing.tree.DefaultTreeModel implements Identified;
	declare parents : importedTypes.javax.swing.tree.DefaultTreeCellRenderer implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.javax.swing.JPopupMenu.Separator implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.ij.ImagePlus implements Identified;
	declare parents : importedTypes.ij.ImageJ implements Identified;;
		  

		  

		  
		  	  	  
	declare parents : importedTypes.ij.workspace.GelJ.BandManager implements Identified;
	declare parents : importedTypes.ij.workspace.GelJ.LaneManager implements Identified;
	declare parents : importedTypes.ij.workspace.GelJ.NormaliseManager implements Identified;
	declare parents : importedTypes.ij.workspace.GelJ.Menu implements Identified;
	declare parents : importedTypes.ij.workspace.GelJ.LaneInfo implements Identified;
	declare parents : importedTypes.ij.workspace.GelJ.Lane implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.ij.workspace.GelJ.Assistant.Assistant implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.ij.workspace.GelJ.Assistant2.PleaseWait implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.ij.gui.Roi implements Identified;
	declare parents : importedTypes.ij.gui.Line implements Identified;
	declare parents : importedTypes.ij.gui.Overlay implements Identified;
	declare parents : importedTypes.ij.gui.GenericDialog implements Identified;;
		  

		  

		  
		  	  	  
	declare parents : importedTypes.ij.plugin.filter.RankFilters implements Identified;
	declare parents : importedTypes.ij.plugin.filter.PlugInFilterRunner implements Identified;
	declare parents : importedTypes.ij.plugin.filter.BackgroundSubtracter implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.ij.plugin.frame.PlugInFrame implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.ij.process.ImageProcessor implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.ij.measure.ResultsTable implements Identified;
	declare parents : importedTypes.ij.measure.CurveFitter implements Identified;
	declare parents : importedTypes.ij.measure.Calibration implements Identified;;
		  

		  

		  
		  	  	  
	declare parents : importedTypes.db.Interface.Main implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.db.Classes.Experiment implements Identified;
	declare parents : importedTypes.db.Classes.Lab implements Identified;
	declare parents : importedTypes.db.Classes.User implements Identified;
	declare parents : importedTypes.db.Classes.LaneDB implements Identified;
	declare parents : importedTypes.db.Classes.LaneDBwithsimilarity implements Identified;
	declare parents : importedTypes.db.Classes.Study implements Identified;
	declare parents : importedTypes.db.Classes.Comparison implements Identified;;
		  

		  
		  	  	  
	declare parents : importedTypes.db.NewComparisonWizard.NewComparison implements Identified;;
		  

		  

		  

		  
		  	  	  
	declare parents : importedTypes.org.jdesktop.swingx.JXDatePicker implements Identified;
	declare parents : importedTypes.org.jdesktop.swingx.JXImageView implements Identified;
	declare parents : importedTypes.org.jdesktop.swingx.JXSearchField implements Identified;;
		  

		  

		  

		  
		  	  	  
	declare parents : java.java.awt.Color implements Identified;
	declare parents : java.java.awt.Frame implements Identified;
	declare parents : java.java.awt.Dialog implements Identified;
	declare parents : java.java.awt.Component implements Identified;
	declare parents : java.java.awt.AWTEvent implements Identified;
	declare parents : java.java.awt.Panel implements Identified;
	declare parents : java.java.awt.PopupMenu implements Identified;
	declare parents : java.java.awt.Button implements Identified;
	declare parents : java.java.awt.Checkbox implements Identified;
	declare parents : java.java.awt.List implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.awt.event.WindowEvent implements Identified;
	declare parents : java.java.awt.event.ActionEvent implements Identified;
	declare parents : java.java.awt.event.ItemEvent implements Identified;
	declare parents : java.java.awt.event.KeyEvent implements Identified;
	declare parents : java.java.awt.event.MouseEvent implements Identified;
	declare parents : java.java.awt.event.MouseWheelEvent implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.awt.image.ColorModel implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.lang.String implements Identified;
	declare parents : java.java.lang.Object implements Identified;
	declare parents : java.java.lang.Exception implements Identified;
	declare parents : java.java.lang.Class implements Identified;
	declare parents : java.java.lang.Thread implements Identified;
	declare parents : java.java.lang.Throwable implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.io.IOException implements Identified;
	declare parents : java.java.io.FileNotFoundException implements Identified;
	declare parents : java.java.io.UnsupportedEncodingException implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.util.Hashtable implements Identified;
	declare parents : java.java.util.ArrayList implements Identified;
	declare parents : java.java.util.Properties implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.rmi.RemoteException implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.applet.Applet implements Identified;;
		  

		  
		  	  	  
	declare parents : java.java.sql.Date implements Identified;;
		  

		

		
  		
		  

		  

		  

		  
		  	  	  pointcut captureNewsGelJ(): 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Menu.new(..));
		  

		  
		  	  	  pointcut captureNewsAssistant4(): 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_3.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Image_Assistant.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_2.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_3.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_1.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_1.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_3.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_1.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_3.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_1.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_2.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_2.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_2.new(..)) || 	
						initialization(GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.new(..));
		  

		  

		  
		  	  	  pointcut captureNewsClasses(): 	
						initialization(GelJ_TSE.db.Classes.Experiment.new(..));
		  

		  
		  	  	  pointcut captureNewsInterface(): 	
						initialization(GelJ_TSE.db.Interface.Main.new(..));
		  

		  

		  

		  
		  	  	  pointcut captureNewsswing(): 	
						initialization(importedTypes.javax.swing.JFrame.new(..)) || 	
						initialization(importedTypes.javax.swing.ButtonGroup.new(..)) || 	
						initialization(importedTypes.javax.swing.JButton.new(..)) || 	
						initialization(importedTypes.javax.swing.JCheckBox.new(..)) || 	
						initialization(importedTypes.javax.swing.JComboBox.new(..)) || 	
						initialization(importedTypes.javax.swing.JLabel.new(..)) || 	
						initialization(importedTypes.javax.swing.JPanel.new(..)) || 	
						initialization(importedTypes.javax.swing.JScrollPane.new(..)) || 	
						initialization(importedTypes.javax.swing.JTextArea.new(..)) || 	
						initialization(importedTypes.javax.swing.JToolBar.new(..)) || 	
						initialization(importedTypes.javax.swing.JTextField.new(..)) || 	
						initialization(importedTypes.javax.swing.JRadioButton.new(..)) || 	
						initialization(importedTypes.javax.swing.JSlider.new(..)) || 	
						initialization(importedTypes.javax.swing.JDialog.new(..)) || 	
						initialization(importedTypes.javax.swing.JSeparator.new(..)) || 	
						initialization(importedTypes.javax.swing.JTable.new(..)) || 	
						initialization(importedTypes.javax.swing.JList.new(..)) || 	
						initialization(importedTypes.javax.swing.JMenuItem.new(..)) || 	
						initialization(importedTypes.javax.swing.JMenu.new(..)) || 	
						initialization(importedTypes.javax.swing.JMenuBar.new(..)) || 	
						initialization(importedTypes.javax.swing.JSplitPane.new(..)) || 	
						initialization(importedTypes.javax.swing.JTree.new(..)) || 	
						initialization(importedTypes.javax.swing.JTabbedPane.new(..)) || 	
						initialization(importedTypes.javax.swing.DefaultListModel.new(..));
		  

		  
		  	  	  pointcut captureNewsevent(): 	
						initialization(importedTypes.javax.swing.event.ChangeEvent.new(..)) || 	
						initialization(importedTypes.javax.swing.event.TableModelEvent.new(..)) || 	
						initialization(importedTypes.javax.swing.event.ListSelectionEvent.new(..)) || 	
						initialization(importedTypes.javax.swing.event.TreeSelectionEvent.new(..)) || 	
						initialization(importedTypes.javax.swing.event.TreeModelEvent.new(..));
		  

		  
		  	  	  pointcut captureNewsJToolBar(): 	
						initialization(importedTypes.javax.swing.JToolBar.Separator.new(..));
		  

		  
		  	  	  pointcut captureNewstree(): 	
						initialization(importedTypes.javax.swing.tree.DefaultMutableTreeNode.new(..)) || 	
						initialization(importedTypes.javax.swing.tree.DefaultTreeModel.new(..)) || 	
						initialization(importedTypes.javax.swing.tree.DefaultTreeCellRenderer.new(..));
		  

		  
		  	  	  pointcut captureNewsJPopupMenu(): 	
						initialization(importedTypes.javax.swing.JPopupMenu.Separator.new(..));
		  

		  
		  	  	  pointcut captureNewsij(): 	
						initialization(importedTypes.ij.ImagePlus.new(..)) || 	
						initialization(importedTypes.ij.ImageJ.new(..));
		  

		  

		  
		  	  	  pointcut captureNewsGelJ(): 	
						initialization(importedTypes.ij.workspace.GelJ.BandManager.new(..)) || 	
						initialization(importedTypes.ij.workspace.GelJ.LaneManager.new(..)) || 	
						initialization(importedTypes.ij.workspace.GelJ.NormaliseManager.new(..)) || 	
						initialization(importedTypes.ij.workspace.GelJ.Menu.new(..)) || 	
						initialization(importedTypes.ij.workspace.GelJ.LaneInfo.new(..)) || 	
						initialization(importedTypes.ij.workspace.GelJ.Lane.new(..));
		  

		  
		  	  	  pointcut captureNewsAssistant(): 	
						initialization(importedTypes.ij.workspace.GelJ.Assistant.Assistant.new(..));
		  

		  
		  	  	  pointcut captureNewsAssistant2(): 	
						initialization(importedTypes.ij.workspace.GelJ.Assistant2.PleaseWait.new(..));
		  

		  
		  	  	  pointcut captureNewsgui(): 	
						initialization(importedTypes.ij.gui.Roi.new(..)) || 	
						initialization(importedTypes.ij.gui.Line.new(..)) || 	
						initialization(importedTypes.ij.gui.Overlay.new(..)) || 	
						initialization(importedTypes.ij.gui.GenericDialog.new(..));
		  

		  

		  
		  	  	  pointcut captureNewsfilter(): 	
						initialization(importedTypes.ij.plugin.filter.RankFilters.new(..)) || 	
						initialization(importedTypes.ij.plugin.filter.PlugInFilterRunner.new(..)) || 	
						initialization(importedTypes.ij.plugin.filter.BackgroundSubtracter.new(..));
		  

		  
		  	  	  pointcut captureNewsframe(): 	
						initialization(importedTypes.ij.plugin.frame.PlugInFrame.new(..));
		  

		  
		  	  	  pointcut captureNewsprocess(): 	
						initialization(importedTypes.ij.process.ImageProcessor.new(..));
		  

		  
		  	  	  pointcut captureNewsmeasure(): 	
						initialization(importedTypes.ij.measure.ResultsTable.new(..)) || 	
						initialization(importedTypes.ij.measure.CurveFitter.new(..)) || 	
						initialization(importedTypes.ij.measure.Calibration.new(..));
		  

		  

		  
		  	  	  pointcut captureNewsInterface(): 	
						initialization(importedTypes.db.Interface.Main.new(..));
		  

		  
		  	  	  pointcut captureNewsClasses(): 	
						initialization(importedTypes.db.Classes.Experiment.new(..)) || 	
						initialization(importedTypes.db.Classes.Lab.new(..)) || 	
						initialization(importedTypes.db.Classes.User.new(..)) || 	
						initialization(importedTypes.db.Classes.LaneDB.new(..)) || 	
						initialization(importedTypes.db.Classes.LaneDBwithsimilarity.new(..)) || 	
						initialization(importedTypes.db.Classes.Study.new(..)) || 	
						initialization(importedTypes.db.Classes.Comparison.new(..));
		  

		  
		  	  	  pointcut captureNewsNewComparisonWizard(): 	
						initialization(importedTypes.db.NewComparisonWizard.NewComparison.new(..));
		  

		  

		  

		  
		  	  	  pointcut captureNewsswingx(): 	
						initialization(importedTypes.org.jdesktop.swingx.JXDatePicker.new(..)) || 	
						initialization(importedTypes.org.jdesktop.swingx.JXImageView.new(..)) || 	
						initialization(importedTypes.org.jdesktop.swingx.JXSearchField.new(..));
		  

		  

		  

		  
		  	  	  pointcut captureNewsawt(): 	
						initialization(java.java.awt.Color.new(..)) || 	
						initialization(java.java.awt.Frame.new(..)) || 	
						initialization(java.java.awt.Dialog.new(..)) || 	
						initialization(java.java.awt.Component.new(..)) || 	
						initialization(java.java.awt.AWTEvent.new(..)) || 	
						initialization(java.java.awt.Panel.new(..)) || 	
						initialization(java.java.awt.PopupMenu.new(..)) || 	
						initialization(java.java.awt.Button.new(..)) || 	
						initialization(java.java.awt.Checkbox.new(..)) || 	
						initialization(java.java.awt.List.new(..));
		  

		  
		  	  	  pointcut captureNewsevent(): 	
						initialization(java.java.awt.event.WindowEvent.new(..)) || 	
						initialization(java.java.awt.event.ActionEvent.new(..)) || 	
						initialization(java.java.awt.event.ItemEvent.new(..)) || 	
						initialization(java.java.awt.event.KeyEvent.new(..)) || 	
						initialization(java.java.awt.event.MouseEvent.new(..)) || 	
						initialization(java.java.awt.event.MouseWheelEvent.new(..));
		  

		  
		  	  	  pointcut captureNewsimage(): 	
						initialization(java.java.awt.image.ColorModel.new(..));
		  

		  
		  	  	  pointcut captureNewslang(): 	
						initialization(java.java.lang.String.new(..)) || 	
						initialization(java.java.lang.Object.new(..)) || 	
						initialization(java.java.lang.Exception.new(..)) || 	
						initialization(java.java.lang.Class.new(..)) || 	
						initialization(java.java.lang.Thread.new(..)) || 	
						initialization(java.java.lang.Throwable.new(..));
		  

		  
		  	  	  pointcut captureNewsio(): 	
						initialization(java.java.io.IOException.new(..)) || 	
						initialization(java.java.io.FileNotFoundException.new(..)) || 	
						initialization(java.java.io.UnsupportedEncodingException.new(..));
		  

		  
		  	  	  pointcut captureNewsutil(): 	
						initialization(java.java.util.Hashtable.new(..)) || 	
						initialization(java.java.util.ArrayList.new(..)) || 	
						initialization(java.java.util.Properties.new(..));
		  

		  
		  	  	  pointcut captureNewsrmi(): 	
						initialization(java.java.rmi.RemoteException.new(..));
		  

		  
		  	  	  pointcut captureNewsapplet(): 	
						initialization(java.java.applet.Applet.new(..));
		  

		  
		  	  	  pointcut captureNewssql(): 	
						initialization(java.java.sql.Date.new(..));
		  

  		
  		
  		



		          pointcut captureOperationsGelJ(): 
; 
		          pointcut captureOperationsAssistant4(): 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_3.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_3.jButton2ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_3.jButton1ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_3.jButton3ActionPerformed(..)) || 

call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Image_Assistant.runAssistant(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_2.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_2.jButton2ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_2.jButton3ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_2.jButton1ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_3.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_3.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_1.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_1.jButton2ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_1.jSlider1StateChanged(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_1.jbCropActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_1.jBUndoActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_1.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_3.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_3.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_1.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step2_1.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_3.jbInvertActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_3.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_3.jButton2ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_3.jButton1ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_1.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_1.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_2.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step4_2.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_2.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step3_2.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_2.jbInvertActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_2.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.step1_2.jButton2ActionPerformed(..)) || 


call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jbInvertActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jbBackActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton2ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton1ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton3ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton4ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton5ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton7ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton8ActionPerformed(..)) || 
call(* GelJ_TSE.ij.workspace.GelJ.Assistant4.Step1_4.jButton9ActionPerformed(..)); 

		          pointcut captureOperationsClasses(): 

call(* GelJ_TSE.db.Classes.Experiment.setName(..)); 
		          pointcut captureOperationsInterface(): 
call(* GelJ_TSE.db.Interface.Main.jbNewExpActionPerformed(..)) || 
call(* GelJ_TSE.db.Interface.Main.newexperiment(..)) || 
call(* GelJ_TSE.db.Interface.Main.jbDuplicateExpActionPerformed(..)) || 
call(* GelJ_TSE.db.Interface.Main.jbimportexpfileActionPerformed(..)) || 
; 


		          pointcut captureOperationsswing(): ; 
		          pointcut captureOperationsevent(): ; 
		          pointcut captureOperationsJToolBar(): ; 
		          pointcut captureOperationstree(): ; 
		          pointcut captureOperationsJPopupMenu(): ; 
		          pointcut captureOperationsij(): ; 

		          pointcut captureOperationsGelJ(): ; 
		          pointcut captureOperationsAssistant(): ; 
		          pointcut captureOperationsAssistant2(): ; 
		          pointcut captureOperationsgui(): ; 

		          pointcut captureOperationsfilter(): ; 
		          pointcut captureOperationsframe(): ; 
		          pointcut captureOperationsprocess(): ; 
		          pointcut captureOperationsmeasure(): ; 

		          pointcut captureOperationsInterface(): ; 
		          pointcut captureOperationsClasses(): ; 
		          pointcut captureOperationsNewComparisonWizard(): ; 


		          pointcut captureOperationsswingx(): ; 


		          pointcut captureOperationsawt(): ; 
		          pointcut captureOperationsevent(): ; 
		          pointcut captureOperationsimage(): ; 
		          pointcut captureOperationslang(): ; 
		          pointcut captureOperationsio(): ; 
		          pointcut captureOperationsutil(): ; 
		          pointcut captureOperationsrmi(): ; 
		          pointcut captureOperationsapplet(): ; 
		          pointcut captureOperationssql(): ; 
  		
  		
		before(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (|| captureNewsGelJ() || captureNewsAssistant4() || captureNewsClasses() || captureNewsInterface() || captureNewsswing() || captureNewsevent() || captureNewsJToolBar() || captureNewstree() || captureNewsJPopupMenu() || captureNewsij() || captureNewsGelJ() || captureNewsAssistant() || captureNewsAssistant2() || captureNewsgui() || captureNewsfilter() || captureNewsframe() || captureNewsprocess() || captureNewsmeasure() || captureNewsInterface() || captureNewsClasses() || captureNewsNewComparisonWizard() || captureNewsswingx() || captureNewsawt() || captureNewsevent() || captureNewsimage() || captureNewslang() || captureNewsio() || captureNewsutil() || captureNewsrmi() || captureNewsapplet() || captureNewssql() ){
  				

	UUID id = new UUID(thisJoinPoint.getTarget());

	((Identified)thisJoinPoint.getTarget()).setUUID(id);

	String className = thisJoinPoint.getTarget().getClass().getSimpleName();
	Boolean inSequence = (propertiesMemory.get(className+"."+className+".seqD")!=null)?true:false;
	Boolean inClass =  (propertiesMemory.get(className+"."+className+".classD")!=null)?true:false;
	Boolean inState=  (propertiesMemory.get(className+"."+className+".stD")!=null)?true:false;
	
	
	swAroundNew = new Stopwatch();
	

	//identificador del mensaje (operacion)
	id_msg_new = id.getClss()+"-new-"+id.getUUID();	
	
	
	BGMEvent initMethod = new BGMEvent(thisJoinPoint.getTarget(), EXECUTION_ID, thisJoinPoint.getTarget().getClass().getSimpleName(), id_msg_new);
	try {
		initMethod.setState("init");
		bgmm.fireEvent("operationStart",initMethod);
	} catch (InvocationTargetException e) {e.printStackTrace();}
	
	//devuelve variable reflejando el starter de la operacion
	if(inSequence){
		String starter = this.beforeManagement((Identified)thisJoinPoint.getTarget(),thisJoinPoint.getTarget().getClass().getSimpleName(), id_msg_new);
		getStarterVariable((Identified)thisJoinPoint.getTarget(), id_msg_new, starter);
	}

//	
	//inicio operacion
	provenance(EXECUTION_ID, (Identified)thisJoinPoint.getTarget(), id_msg_new, "operationStartTime" ,String.valueOf(new Date().getTime()));
	swProceedNew = new Stopwatch();
  		}
		after(Identified targetIdentified) : this(targetIdentified) &&  !execution(* *.setUUID()) && !execution(* *.getUUID()) && (|| captureNewsGelJ() || captureNewsAssistant4() || captureNewsClasses() || captureNewsInterface() || captureNewsswing() || captureNewsevent() || captureNewsJToolBar() || captureNewstree() || captureNewsJPopupMenu() || captureNewsij() || captureNewsGelJ() || captureNewsAssistant() || captureNewsAssistant2() || captureNewsgui() || captureNewsfilter() || captureNewsframe() || captureNewsprocess() || captureNewsmeasure() || captureNewsInterface() || captureNewsClasses() || captureNewsNewComparisonWizard() || captureNewsswingx() || captureNewsawt() || captureNewsevent() || captureNewsimage() || captureNewslang() || captureNewsio() || captureNewsutil() || captureNewsrmi() || captureNewsapplet() || captureNewssql() ){
  					UUID id = IdentifiersManager.getIdentifier(thisJoinPoint.getTarget());
	final String ID_MSG = id.getClss()+"-new-"+id.getUUID();
	

	String className = thisJoinPoint.getTarget().getClass().getSimpleName();
	Boolean inSequence = (propertiesMemory.get(className+"."+className+".seqD")!=null)?true:false;
	Boolean inClass =  (propertiesMemory.get(className+"."+className+".classD")!=null)?true:false;
	Boolean inState=  (propertiesMemory.get(className+"."+className+".stD")!=null)?true:false;
	
	BGMEvent initMethod = new BGMEvent(thisJoinPoint.getTarget(), EXECUTION_ID, thisJoinPoint.getTarget().getClass().getSimpleName(), ID_MSG);

	long timeProceedNew = swProceedNew.elapsedTime();
	
	final Identified targetIdentifierAux = (Identified)thisJoinPoint.getTarget();
	
	if (targetIdentifierAux != null) {

		//cuando finaliza la operacion
		provenance(EXECUTION_ID, targetIdentifierAux, ID_MSG, "operationEndTime", String.valueOf(new Date().getTime()));
		provenance(EXECUTION_ID, targetIdentifierAux, ID_MSG, "operation", ID_MSG);

		getInputVariableNews(targetIdentifierAux, thisJoinPoint.getArgs(), ID_MSG);
		if(inSequence) getnewRequestNews(targetIdentifierAux, ID_MSG);
		if(inClass) getAttributesNews(targetIdentifierAux, ID_MSG);
		if(inState) getTargetStateNews(targetIdentifierAux, initMethod);
		
//		// ------------------ target variable
		
		provenance(EXECUTION_ID, (Identified)thisJoinPoint.getTarget(), 
				ID_MSG, 
				"target", 
				IdentifiersManager.getIdentifier(thisJoinPoint.getTarget()).getCompleteUUID());
//		// ------------------ target variable

		if(inSequence) this.afterManagement(targetIdentifierAux, thisJoinPoint.getTarget().getClass().getSimpleName() , ID_MSG, IdentifiersManager.randomUUID());

		try {
			bgmm.fireEvent("operationEnd",initMethod);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long timeAroundNew = swAroundNew.elapsedTime();
		
		n++;
			System.out.println(targetIdentifierAux.getClass().getSimpleName()+";"+(timeProceedNew)+";"+(timeAroundNew)+";"+(timeAroundNew-timeProceedNew));
	}
  		}
  		
  		
  		Object around(Identified targetIdentified): target(targetIdentified) &&  !execution(* *.getUUID()) && !execution(* *.setUUID()) && (|| captureOperationsGelJ()|| captureOperationsAssistant4()|| captureOperationsClasses()|| captureOperationsInterface()|| captureOperationsswing()|| captureOperationsevent()|| captureOperationsJToolBar()|| captureOperationstree()|| captureOperationsJPopupMenu()|| captureOperationsij()|| captureOperationsGelJ()|| captureOperationsAssistant()|| captureOperationsAssistant2()|| captureOperationsgui()|| captureOperationsfilter()|| captureOperationsframe()|| captureOperationsprocess()|| captureOperationsmeasure()|| captureOperationsInterface()|| captureOperationsClasses()|| captureOperationsNewComparisonWizard()|| captureOperationsswingx()|| captureOperationsawt()|| captureOperationsevent()|| captureOperationsimage()|| captureOperationslang()|| captureOperationsio()|| captureOperationsutil()|| captureOperationsrmi()|| captureOperationsapplet()|| captureOperationssql()){
  						Stopwatch swAll = new Stopwatch();

	final Method method = ((MethodSignature) thisJoinPoint.getSignature()).getMethod();
	final Identified target = targetIdentified;
	String methodName = method.getName();
	String className = target.getClass().getSimpleName();

	final String ID_MSG = className+"-"+methodName+ "-" + IdentifiersManager.randomUUID();
			

//	
	Boolean inSequence = (propertiesMemory.get(className+"."+methodName+".seqD")!=null)?true:false;
	Boolean inClass =  (propertiesMemory.get(className+"."+methodName+".classD")!=null)?true:false;
	Boolean inState=  (propertiesMemory.get(className+"."+methodName+".stD")!=null)?true:false;

	if (target != null) {
		
		BGMEvent initMethod = new BGMEvent(targetIdentified, EXECUTION_ID, targetIdentified.getClass().getSimpleName(), ID_MSG);
		initMethod.setState(getCurrentState(targetIdentified));
		try{bgmm.fireEvent("operationStart",initMethod);} catch (InvocationTargetException e) {e.printStackTrace();}
		
		final String sourceID = IdentifiersManager.getIdentifier(target).getCompleteUUID();
		//provenance before execution
		String starter="";
		if(inSequence) starter =this.beforeManagement(target, method.getName(), ID_MSG);
		
		provenanceBeforeExecution(target, method, thisJoinPoint.getArgs(), ID_MSG, starter, inSequence, inClass, inState);
		provenance(EXECUTION_ID, targetIdentified, ID_MSG, "operationStartTime" ,String.valueOf(new Date().getTime()));
		Stopwatch swProceed = new Stopwatch();
		final Object rtn = proceed(targetIdentified);
		long timeProceed = swProceed.elapsedTime();
		
		
	
		provenance(EXECUTION_ID, targetIdentified, ID_MSG, "operationEndTime", String.valueOf(new Date().getTime()));	
		//provenance after execution
		provenanceAfterExecution(target, method, thisJoinPoint.getArgs(), ID_MSG, rtn, sourceID, inSequence, inClass, inState);
	
		
		if(inSequence) afterManagement(target, method.getName(), ID_MSG, IdentifiersManager.randomUUID());
		
		long timeAround = swAll.elapsedTime();

//		System.err.print("-");
		n++;
//		sum = sum + (timeAround-timeProceed);
//		System.err.println("Mean: "+sum/n);
		System.out.println(target.getClass().getSimpleName()+"."+method.getName()+";"+(timeProceed)+";"+(timeAround)+";"+(timeAround-timeProceed));

//		StringBuffer sb = new StringBuffer();
//		sb.append("-------------------------------------------------------");
//		sb.append("\nreturnsArray: "+returnsArray.size());
//		sb.append("\nreturnsArrayTimes: "+returnsArrayTimes.size());
//		sb.append("\nstartersArray: "+startersArray.size());
//		sb.append("\nobjIdArray: "+objIdArray.size());
//		sb.append("\n-------------------------------------------------------");
//		System.out.println(sb);
		
		return rtn;
		
	} else {
		Object rtn = proceed(targetIdentified);
		return rtn;
	}
  		}
  		
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
					.filter(field -> {
						if(getPropertyAttribute(target, method).compareTo("") != 0 || 
								getAddAttribute(target, method).compareTo("") != 0 ||
								getModifyAttribute(target, method).compareTo("") != 0 ||
								getRemoveAttribute(target, method).compareTo("") != 0 ){
							return true;
						}else{
							return false;
						}		
					}) //only those fields included in the diagram
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
									provenanceValueType(target, "newAttrValue", EXECUTION_ID,ID_MSG, fieldUUID, "value", fieldValue);
									provenanceValueType(target, "newAttrType",EXECUTION_ID,ID_MSG, fieldUUID, "type", fieldType);
									provenanceValueType(target, "newAttrName",EXECUTION_ID,ID_MSG, fieldUUID, "attName",field.getName());
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
		String change = propertiesMemory.get(target.getClass().getSimpleName()+ "." + m.getName() + "."+currentState);
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
 	