/**
 * 
 */
package com.training.apps;

import com.training.domians.Consumer;
import com.training.domians.EmailMessaging;
import com.training.domians.SMSMessaging;

/**
 * @author hgarg1
 *
 */
public class Application {

  /**
   * @param args
   */
  public static void main(String[] args) {
  
    EmailMessaging emailObj = new EmailMessaging();
    SMSMessaging smsObj = new SMSMessaging();
    Consumer consumerObj = new Consumer();
    System.out.println("----- Email Service ------");
    consumerObj.setMessagingService(emailObj);
    consumerObj.manageMessagingService();
    System.out.println("----- SMS Service ------");
    consumerObj.setMessagingService(smsObj);
    consumerObj.manageMessagingService();

  }

}
