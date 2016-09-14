/**
 * 
 */
package com.training.proxy;

/**
 * @author hgarg1
 *
 */
public class RealSubject implements Subject {

  /* (non-Javadoc)
   * @see com.training.proxy.Subject#request()
   */
  @Override
  public void request() {
    System.out.println("Hello from  the real subject");
    

  }

}
