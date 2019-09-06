package UML2PROV.utilities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AspectConstructor {

	
    public static String example() {
        return "some evaluation";
    }
    
    public static String generateStateManager(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/StateManager.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }

    public static String generateUML2PROVTreeMap(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/UML2PROVTreeMap.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
   
    public static String generateUUID(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/UUID.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
      
    
    public static String generateBGMEvent(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/BGMEvent.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String generateEventHelper(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/EventHelper.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    
    
    
    public static String generateBGMListener(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/BGMListener.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String generateListenerPROVN(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/ListenerPROVN.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String codeVariablesDeclarationAJ(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/variablesDeclaration.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
  
    
    public static String codeMethodsDeclarationAJ(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/methodsDeclaration.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
 
    public static String codeInsideBefore(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/codeInsideBefore.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String codeInsideAfter(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/codeInsideAfter.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String codeInsideAround(){
    	String text = "Some error occurrs";
		try {
			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/codeInsideAround.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
 
    
}
