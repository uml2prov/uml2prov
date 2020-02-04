package es.unirioja.uml2prov.bgm.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LoadProperties {

	public static void loadProperties(HashMap<String, String> propertiesMemory,
			HashMap<String, List<String>> propertiesMemoryAttributes) {


propertiesMemory.put("Stack.push.seqD", "true");

propertiesMemory.put("StackEl.setPrecedingEl.seqD", "true");

propertiesMemory.put("Stack.setTop.seqD", "true");

propertiesMemory.put("Stack.pop.seqD", "true");

propertiesMemory.put("StackEl.getContent.seqD", "true");

propertiesMemory.put("StackEl.getPrecedingEl.seqD", "true");

propertiesMemory.put("StackEl.StackEl.seqD", "true");

propertiesMemory.put("StackEl.StackEl.stD", "true");

propertiesMemory.put("StackEl.setPrecedingEl.stD", "true");

propertiesMemoryAttributes.put("Interaction1.attributes",Arrays.asList("||".split("\\|")));

propertiesMemoryAttributes.put("StateMachine2.attributes",Arrays.asList("".split("\\|")));

propertiesMemoryAttributes.put("Interaction10.attributes",Arrays.asList("|".split("\\|")));

propertiesMemoryAttributes.put("Stack.attributes",Arrays.asList("top|size|".split("\\|")));

propertiesMemoryAttributes.put("StackEl.attributes",Arrays.asList("content|precedingEl|".split("\\|")));

propertiesMemory.put("StackEl.sourceState", "unlinked");

propertiesMemory.put("StackEl.setPrecedingEl.unlinked", "linked");

propertiesMemoryAttributes.put("Person.attributes",Arrays.asList("name|".split("\\|")));

propertiesMemory.put("Stack.getSize.classD", "true");

propertiesMemory.put("Stack.push.classD", "true");

propertiesMemory.put("Stack.pop.classD", "true");

propertiesMemory.put("Stack.isEmpty.classD", "true");

propertiesMemory.put("Stack.setTop.classD", "true");

propertiesMemory.put("Stack.Stack.classD", "true");

propertiesMemory.put("StackEl.getPrecedingEl.classD", "true");

propertiesMemory.put("StackEl.getContent.classD", "true");

propertiesMemory.put("StackEl.setPrecedingEl.classD", "true");

propertiesMemory.put("StackEl.StackEl.classD", "true");

propertiesMemory.put("Person.getName.classD", "true");

propertiesMemory.put("Person.Person.classD", "true");

propertiesMemory.put("StackEl.StackEl.changeState", "true");

propertiesMemory.put("StackEl.setPrecedingEl.changeState", "true");

	}
}

