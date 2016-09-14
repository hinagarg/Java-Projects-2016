/**
 * 
 */
package com.training.proxy;

/**
 * @author hgarg1
 *
 */
public class ProxySubject implements Subject {

  /* (non-Javadoc)
   * @see com.training.proxy.Subject#request()
   */
  Subject sub;
  @Override
  public void request() {
    sub = new RealSubject();
    sub.request();

  }

}
