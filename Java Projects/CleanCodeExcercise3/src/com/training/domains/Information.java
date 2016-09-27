/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class Information {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Address invoiceAddr = new Address("Michigan", "765432", "Chicago");
    Address deliveryAddr = new Address("Roscoe", "765765", "California");
    Address contactAddr = new Address("Lassale", "876543", "Detroit");
    
    ContactAddress contactObj = new ContactAddress(contactAddr, "7654328", "test@example.com");
    
    System.out.println("Contact Address is : " + contactObj);
    
    System.out.println("Invoice Address is :  "+ invoiceAddr);
    
    System.out.println("Delivery Address is : " + deliveryAddr);
    

  }

}
