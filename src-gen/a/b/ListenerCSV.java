package a.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Random;
import es.unirioja.uml2prov.bgm.BGMEvent;
import es.unirioja.uml2prov.bgm.BGMEventListener;

public class ListenerCSV implements BGMEventListener {
	
	private PrintStream ps;
	
	public ListenerCSV() {
		try {
			String nameFile = Math.abs(new Random().nextInt())+"_bindings.csv";
			ps = new PrintStream(nameFile);
			ps.println("UUID app execution, UUID operation execution, class name, variable, value");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
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
			ps.println(newLine(e));
	}

	@Override
	public void newBinding(BGMEvent e) {
			ps.println(newLine(e));
	}

	@Override
	public void operationStart(BGMEvent e) {
		if(e.getState()!=null)
			System.out.println("The state before executing "+e.getExecutionIdMethod()+" is "+e.getState());
	}

	@Override
	public void operationEnd(BGMEvent e) {
		if(e.getState()!=null)
			System.out.println("The state after executing "+e.getExecutionIdMethod()+" is "+e.getState());
	}

}
