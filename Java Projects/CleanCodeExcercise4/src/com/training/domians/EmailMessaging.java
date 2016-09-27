/**
 * 
 */
package com.training.domians;

import com.training.iFaces.MessagingService;

/**
 * @author hgarg1
 *
 */
public class EmailMessaging implements MessagingService {

  /* (non-Javadoc)
   * @see com.training.iFaces.MessagingService#messagingService()
   */

  @Override
  public void getMessage() {
    System.out.println("This is a message from an Email Service");
  
  }

  @Override
  public void getReciever() {
    System.out.println("This is an Email Reciever");
  }

  /**
   * 
   */
  public EmailMessaging() {
  super();
  // TODO Auto-generated constructor stub
  }
  
  
}
