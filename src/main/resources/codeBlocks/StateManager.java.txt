package aspects;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.ConcurrentSkipListMap;


public class StateManager {

	static  Map<Object, String> objectStates = null;
	
	static{
		objectStates =  new ConcurrentSkipListMap<Object, String>( 
				new Comparator<Object>() {
						@Override
						public int compare(Object o1, Object o2) {
							return (o1==o2)?0:1;
						}
		});		
	}


	static void newState(Object obj, String state) {
		if (state != null) {
			if (!objectStates.containsKey(obj)) {
				objectStates.put(obj, state);
			} else {
				objectStates.replace(obj, state);
			}
		}
	}

	synchronized static String getState(Object obj) {
			String rtn = objectStates.get(obj);
			if(rtn!=null) rtn= rtn.trim();
			return rtn;
	}


}



