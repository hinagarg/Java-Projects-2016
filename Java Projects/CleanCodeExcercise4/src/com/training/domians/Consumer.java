/**
 * 
 */
package com.training.domians;

import com.training.iFaces.MessagingService;

/**
 * @author hgarg1
 *
 */
public class Consumer {
  
  MessagingService messagingService;
  
  public void setMessagingService(MessagingService ms){
    messagingService = ms;
  }
  
  public void manageMessagingService() {
    messagingService.getMessage();
    messagingService.getReciever();
  }

  /**
   * 
   */
  public Consumer() {
  super();
  // TODO Auto-generated constructor stub
  }

  /**
   * @param messagingService
   */
  public Consumer(MessagingService messagingService) {
  super();
  this.messagingService = messagingService;
  }

  /**
   * @return the messagingService
   */
  public MessagingService getMessagingService() {
  return messagingService;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Consumer [messagingService=" + messagingService + "]";
  }
  
  
}
