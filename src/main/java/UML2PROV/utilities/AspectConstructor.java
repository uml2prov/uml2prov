package UML2PROV.utilities;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.IOUtils;

import UML2PROV.Principal;

public class AspectConstructor {

	
    public static String example() {
        return "some evaluation";
    }
    
    public static String generateStateManager(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("./resources/codeBlocks/StateManager.java"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
//	        text= input.readUTF();
	        input.close();
			
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/StateManager.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }

    public static String generateUML2PROVTreeMap(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/UML2PROVTreeMap.java"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();			
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/UML2PROVTreeMap.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
   
    public static String generateUUID(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/UUID.java"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();				
			
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/UUID.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
      
    
    public static String generateBGMEvent(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/BGMEvent.java"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();				
						
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/BGMEvent.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String generateEventHelper(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/EventHelper.java"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/EventHelper.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    
    
    
    public static String generateBGMListener(){
    	String text = "Some error occurrs";
		try {
			
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/BGMListener.java"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();
			
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/BGMListener.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String generateListenerPROVN(){
    	String text = "Some error occurrs";
		try {
			
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/ListenerPROVN.java"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();				
									
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/ListenerPROVN.java")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String codeVariablesDeclarationAJ(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/variablesDeclaration.txt"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();					
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/variablesDeclaration.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
  
    
    public static String codeMethodsDeclarationAJ(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/methodsDeclaration.txt"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();					
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/methodsDeclaration.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
 
    public static String codeInsideBefore(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/codeInsideBefore.txt"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();			
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/codeInsideBefore.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String codeInsideAfter(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/codeInsideAfter.txt"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();					
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/codeInsideAfter.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
    public static String codeInsideAround(){
    	String text = "Some error occurrs";
		try {
	        DataInputStream input = new DataInputStream(AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/codeInsideAround.txt"));
	        text = IOUtils.toString(input, StandardCharsets.UTF_8.name()); 
	        input.close();				
//			text = new String(Files.readAllBytes(Paths.get("./resources/codeBlocks/codeInsideAround.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return text;
    }
    
 
    
}
