/**
 * 
 */
package com.training.domains;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hgarg1
 *
 */
public class Application {

  /**
   * @param args
   */
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")){
    
    //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml") (If not in try we need to call ctx.close()
    LifeInsurance insurance = (LifeInsurance)ctx.getBean("insuranceBean");
    
    System.out.println("Customer is := "  + insurance.getCust());
    System.out.println("Policy NUmber :=" + insurance.getPolicyNumber());
    System.out.println("Policy Amount :=" + insurance.getPolicyAmount());
    System.out.println("First Premium :=" + insurance.findFirstPremium());
    
    //ctx.close();
  }
  
  catch(Exception e){
    
    e.printStackTrace();
  }
  }

}
