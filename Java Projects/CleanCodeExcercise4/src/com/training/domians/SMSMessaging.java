/**
 * 
 */
package com.training.domians;

import com.training.iFaces.MessagingService;

/**
 * @author hgarg1
 *
 */
public class SMSMessaging implements MessagingService{

  @Override
  public void getMessage() {
    System.out.println("This is a message from an SMS Service");
  }

  @Override
  public void getReciever() {
    System.out.println("This is a SMS reciever");
  }

  /**
   * 
   */
  public SMSMessaging() {
  super();
  // TODO Auto-generated constructor stub
  }
  
  
}
