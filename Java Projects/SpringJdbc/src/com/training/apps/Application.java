/**
 * 
 */
package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.CustomerDao;
import com.training.entity.Customer;
import com.training.ifaces.MyDao;

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
    
    MyDao<Customer> dao = ctx.getBean(CustomerDao.class);
    
    Customer cust = (Customer) ctx.getBean("cust");
    
    cust.setCustomerName("Jerry1");
    cust.setCustomerNumber(2011);
    cust.setEmail("cust2@example.com");
    cust.setPhoneNumber(56478334);
    
    //int rowInserted = dao.add(cust);
    
   // System.out.println(rowInserted + "row is inserted");
    
    System.out.println(dao.find(2010));
    
    System.out.println(dao.findAll());
  }
  
  
  catch(Exception e){
    
    e.printStackTrace();
  }

  }
  
}
