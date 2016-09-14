/**
 * 
 */
package com.training.utils;


import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * @author hgarg1
 *
 */
public class HiberUtils {
  
  private static SessionFactory factory;
  
  public static SessionFactory getSessionFactory(){
  
    if(factory == null)
    {
      factory = new Configuration().configure().buildSessionFactory();
    }
    return factory;
  }
  
  public static void closeFcatory(){
  
    factory.close();
  }
}
