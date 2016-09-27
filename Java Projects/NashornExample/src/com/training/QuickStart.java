/**
 * 
 */
package com.training;

import java.io.File;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * @author hgarg1
 *
 */
public class QuickStart {

  /**
   * @param args
   */
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  ScriptEngineManager mgr = new ScriptEngineManager();
  
  ScriptEngine engine = mgr.getEngineByName("JavaScript");
  
  try{
    
    System.out.println(engine.toString());
    engine.eval("print('Hello From Nashom')");
    
   engine.eval(new FileReader(new File("Simple.js")));
    
    
    Invocable invocable = (Invocable) engine;
    
    Object result = invocable.invokeFunction("greet", "Ramesh");
    
    System.out.println(result);
  }
  
  catch(Exception e){
    
    e.printStackTrace();
  }
  
  
  }

}
