package aspects.listeners;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.HashMap;

import org.eclipse.core.internal.resources.File;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import aspects.events.BGMEvent;

public class ListenerCSV implements BGMListener {
	
	HashMap<String, OutputStream> operationsExecuted = new HashMap<String, OutputStream>();

	@Override
	public void newValueBinding(BGMEvent e){
		PrintStream fos = new PrintStream(operationsExecuted.get(e.getExecutionIdMethod));
		fos.println(newLine(e));
	}
	
	@Override
	public void newBinding(BGMEvent e) {
		PrintStream fos = new PrintStream(operationsExecuted.get(e.getExecutionIdMethod));
		fos.println(newLine(e));
	}

	
	@Override
	public void operationStart(BGMEvent e) {
		operationsExecuted.put(e.getExecutionIdMethod, new FileOutputStream(e.getExecutionIdMethod+"_bind.csv"))
	}

	@Override
	public void operationEnd(BGMEvent e) {
		operationsExecuted.get(e.getExecutionIdMethod).close();
	}
	
	private String newLine(BGMEvent e) {
		StringBuffer s = new StringBuffer();
		s.append(e.getExecutionID()).append(",");
		s.append(e.getExecutionIdMethod()).append(",");
		s.append(e.getClassName()).append(",");
		s.append(e.getVarName()).append(",");
		s.append(e.getValue()).append(",");
		s.append(e.getState());
		return s.toString();
	}

}
