package es.unirioja.uml2prov.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class AspectConstructor {
	
	

	public static void copiar(InputStream is, OutputStream os) throws IOException {
		byte buff[] = new byte[1024];
		int leidos = is.read(buff);
		while (leidos != -1) {
			os.write(buff, 0, leidos);
			leidos = is.read(buff);
		}
		os.flush();
	}

	private static void copiar(Reader is, Writer os) throws IOException {
		char[] buf = new char[1024];
		int len;
		while ((len = is.read(buf)) > 0) {
			os.write(buf, 0, len);
		}
	}

	public static String example() {
		return "some evaluation";
	}

	public static String stringFromFile(String file) throws IOException {
		String text = "Some error occurrs";
		InputStream is = AspectConstructor.class.getResourceAsStream(file);
		BufferedReader fis = new BufferedReader(new InputStreamReader(is));
		StringWriter sw = new StringWriter();
		copiar(fis, sw);
		text = sw.toString();
		return text;
	}
	
	public static InputStream getJarDependency() throws IOException{
		return 	AspectConstructor.class.getResourceAsStream("/codeBlocks/org.aspectj.runtime_1.9.2.201811011643.jar");
	}
	
	public static InputStream getProfileUML2PROV() throws IOException{
		return 	AspectConstructor.class.getResourceAsStream("/codeBlocks/model.profile.uml");
	}

	public static String generateStateManager() throws IOException {
//		String text = "Some error occurrs";
//		InputStream is = AspectConstructor.class.getResourceAsStream("/codeBlocks/StateManager.java.txt");
//		BufferedReader fis = new BufferedReader(new InputStreamReader(is));
//		StringWriter sw = new StringWriter();
//		copiar(fis, sw);
//		text = sw.toString();
		return stringFromFile("/codeBlocks/StateManager.java.txt");
	}

	public static void main(String[] args) {
		try {
			System.out.println(generateStateManager());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String generateUML2PROVTreeMap() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/UML2PROVTreeMap.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/UML2PROVTreeMap.java.txt");

	}

	public static String generateUUID() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/UUID.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/UUID.java.txt");

	}

	public static String generateBGMEvent() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/BGMEvent.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/BGMEvent.java.txt");

	}

	public static String generateEventHelper() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/EventHelper.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/EventHelper.java.txt");

	}

	public static String generateBGMEventListener() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/BGMListener.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
				
		return stringFromFile("/codeBlocks/BGMEventListener.java.txt");

	}

	public static String generateListenerPROVN() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/ListenerPROVN.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/ListenerPROVN.java.txt");
	}

	public static String codeVariablesDeclarationAJ() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/variablesDeclaration.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/variablesDeclaration.txt");

	}

	public static String codeMethodsDeclarationAJ() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/methodsDeclaration.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;

		return stringFromFile("/codeBlocks/methodsDeclaration.txt");

	}

	public static String codeInsideBefore() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/codeInsideBefore.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;

		return stringFromFile("/codeBlocks/codeInsideBefore.txt");
	}

	public static String codeInsideAfter() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/codeInsideAfter.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/codeInsideAfter.txt");

	}

	public static String codeInsideAround() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/codeBlocks/codeInsideAround.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/codeBlocks/codeInsideAround.txt");
	}

}