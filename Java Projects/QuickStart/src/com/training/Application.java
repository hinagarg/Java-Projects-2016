package com.training;
/** 
 * Some Javadoc.
 * @author hgarg1
 *
 */

public class Application {
  /** 
  * Some Javadoc.
  * @author hgarg1
  */

  public static void main(String[] args) {

    Greeting greet = new Greeting();

    System.out.println(greet.getMessage());

    Class clsLoader = greet.getClass().getClassLoader().getClass();
    
    System.out.println("My Class Loader" + clsLoader);
    
    String s = new String("Hello");
   
    Class clsLoader2 = s.getClass().getClassLoader().getClass();
    
    System.out.println("My Class Loader" + clsLoader2);
  }
}
