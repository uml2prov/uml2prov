package a.b;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Random;
import es.unirioja.uml2prov.bgm.BGMEvent;
import es.unirioja.uml2prov.bgm.BGMEventListener;

public class ListenerJSON implements BGMEventListener {

  private PrintStream ps;

  public ListenerJSON() {
    try {
      String nameFile = Math.abs(new Random().nextInt()) + "_bindings.json";
      ps = new PrintStream(nameFile);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  private String newLine(BGMEvent e) {
    return new Gson().toJson(e);
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
    if (e.getState() != null) {
      System.out.println("The state before executing " + e.getExecutionIdMethod() + " is " + e.getState());
    }
  }

  @Override
  public void operationEnd(BGMEvent e) {
    if (e.getState() != null) {
      System.out.println("The state after executing " + e.getExecutionIdMethod() + " is " + e.getState());
    }
  }

}
