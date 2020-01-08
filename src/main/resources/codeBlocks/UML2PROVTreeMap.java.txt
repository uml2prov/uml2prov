package aspects;

import java.util.Comparator;
import java.util.TreeMap;

public class UML2PROVTreeMap extends TreeMap<Object, UUID>{
	public UML2PROVTreeMap() {		
		super(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1==o2){return 0;}
				else {return o1.hashCode()-o2.hashCode();}
			}
		});
	}
}

