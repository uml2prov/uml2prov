package aspects.listeners;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import aspects.events.BGMEvent;

public class ListenerMongoDB implements BGMListener {
	
	
	static {

	}

	@Override
	public void newValueBinding(BGMEvent e){
		MongoClient mongo = null;
		try {
			mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("provenance");
			DBCollection col = db.getCollection("bindings");
			BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
			
			 DBObject obj = docBuilder.get();
				
			 obj.put("Execution_ID", e.getExecutionID());
			 obj.put("Identifier", e.getIdentifier());
			 obj.put("type", e.getType());
			 obj.put("VALUE", e.getValue());
			 
			 col.insert(obj);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			 if(mongo!=null) mongo.close();
		}
	}
	
	@Override
	public void newBinding(BGMEvent e) {
		System.out.println("newBinding activated!!!");
		MongoClient mongo =null;
		try {
			mongo = new MongoClient("127.0.0.1", 27017);
			DB db = mongo.getDB("provenance");
			DBCollection col = db.getCollection("bindings");
			
			 BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
			 DBObject obj = docBuilder.get();
				
			 obj.put("Execution_ID", e.getExecutionID());
			 obj.put("Class", e.getClassName());
			 obj.put("Execution_ID_METHOD", e.getExecutionIdMethod());
			 obj.put("VARIABLE", e.getVarName());
			 obj.put("VALUE", e.getValue());
//			 System.out.println(obj.toString().replace(".", "").replace("\"", "'"));
//			 cacheBindings.add(obj);
//			 Stopwatch sw = new Stopwatch();
//			 LOGGER.debug(obj.toString().replace("", "").replace("\"", "'"));
			 
			 col.insert(obj);
			 
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			if(mongo!=null) mongo.close();
		}
	}

	@Override
	public void operationStart(BGMEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operationEnd(BGMEvent e) {
		// TODO Auto-generated method stub
		
	}

}
