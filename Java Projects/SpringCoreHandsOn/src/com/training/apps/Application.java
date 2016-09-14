/**
 * 
 */
package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

/**
 * @author hgarg1
 *
 */
public class Application {

  /**
   * @param args
   */
  public static void main(String[] args) {
  
  try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");) {
  
  //Invoice invoiceBean1 = (Invoice) ctx.getBean("invBean1", Invoice.class);
  Invoice invoiceBean2 = (Invoice) ctx.getBean("invBean2", Invoice.class);
  
   //System.out.println("Invoice Bean :=" + invoiceBean1);
   System.out.println("Invoice Bean :=" + invoiceBean2);
  }
  
  catch(Exception e){
    e.printStackTrace();
  } 
  }
}
