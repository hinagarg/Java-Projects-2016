/**
 * 
 */
package com.training.proxy;

/**
 * @author hgarg1
 *
 */
public class TestProxy {

  /**
   * @param args
   */
  public void callProxy(Subject sub)
  {
    sub.request();
  }
  
  public static void main(String[] args) {
    
    ProxySubject pxySub = new ProxySubject();
  
    TestProxy tpxy = new TestProxy();
  
    tpxy.callProxy(pxySub);

  }

}
