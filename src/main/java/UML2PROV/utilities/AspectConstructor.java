package UML2PROV.utilities;

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
		return 	AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/org.aspectj.runtime_1.9.2.201811011643.jar");
	}

	public static String generateStateManager() throws IOException {
//		String text = "Some error occurrs";
//		InputStream is = AspectConstructor.class.getResourceAsStream("/resources/codeBlocks/StateManager.java.txt");
//		BufferedReader fis = new BufferedReader(new InputStreamReader(is));
//		StringWriter sw = new StringWriter();
//		copiar(fis, sw);
//		text = sw.toString();
		return stringFromFile("/resources/codeBlocks/StateManager.java.txt");
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
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/UML2PROVTreeMap.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/UML2PROVTreeMap.java.txt");

	}

	public static String generateUUID() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/UUID.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/UUID.java.txt");

	}

	public static String generateBGMEvent() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/BGMEvent.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/BGMEvent.java.txt");

	}

	public static String generateEventHelper() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/EventHelper.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/EventHelper.java.txt");

	}

	public static String generateBGMEventListener() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/BGMListener.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
				
		return stringFromFile("/resources/codeBlocks/BGMEventListener.java.txt");

	}

	public static String generateListenerPROVN() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/ListenerPROVN.java")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/ListenerPROVN.java.txt");
	}

	public static String codeVariablesDeclarationAJ() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/variablesDeclaration.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/variablesDeclaration.txt");

	}

	public static String codeMethodsDeclarationAJ() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/methodsDeclaration.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;

		return stringFromFile("/resources/codeBlocks/methodsDeclaration.txt");

	}

	public static String codeInsideBefore() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/codeInsideBefore.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;

		return stringFromFile("/resources/codeBlocks/codeInsideBefore.txt");
	}

	public static String codeInsideAfter() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/codeInsideAfter.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/codeInsideAfter.txt");

	}

	public static String codeInsideAround() throws IOException {
//		String text = "Some error occurrs";
//		try {
//			text = new String(Files.readAllBytes(Paths.get("src/main/resources/codeBlocks/codeInsideAround.txt")),
//					StandardCharsets.UTF_8);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return text;
		return stringFromFile("/resources/codeBlocks/codeInsideAround.txt");
	}

}
