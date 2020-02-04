package a.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Random;
import es.unirioja.uml2prov.bgm.BGMEvent;
import es.unirioja.uml2prov.bgm.BGMEventListener;


public class ListenerCSV2 implements BGMEventListener {
	HashMap<String, PrintStream> bindingsFiles;
		
	public ListenerCSV2() {
			new File("bindings").mkdirs();
			bindingsFiles = new HashMap<String, PrintStream>();
	}

	private String newLine(BGMEvent e) {
		StringBuffer s = new StringBuffer();
		s.append(e.getExecutionID()).append(",");
		s.append(e.getExecutionIdMethod()).append(",");
		s.append(e.getClassName()).append(",");
		s.append(e.getVarName()).append(",");
		s.append(e.getValue());
		return s.toString();
	}

	@Override
	public void newValueBinding(BGMEvent e) {
		bindingsFiles.get(e.getExecutionIdMethod()).println(newLine(e));
	}

	@Override
	public void newBinding(BGMEvent e) {
		bindingsFiles.get(e.getExecutionIdMethod()).println(newLine(e));
	}

	@Override
	public void operationStart(BGMEvent e) {
		PrintStream ps;
		try {
			ps = new PrintStream("bindings/"+e.getExecutionIdMethod()+".csv");
			ps.println("UUID app execution, UUID operation execution, class name, variable, value");
			bindingsFiles.put(e.getExecutionIdMethod(), ps);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void operationEnd(BGMEvent e) {
		bindingsFiles.get(e.getExecutionIdMethod()).close();
		bindingsFiles.remove(e.getExecutionIdMethod());
	}

}
