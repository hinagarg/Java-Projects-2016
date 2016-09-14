/**
 * 
 */
package com.training.domains;

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
  
  LoanAccount account = LoanFactory.getInstance();
  
  System.out.println("personal Loan EMI"+ account.calculateEMI(200000.00,2));
  System.out.println("Rate Interest"+account.getRateOfInterest());
  
  LoanAccount account2 =LoanFactory.getInstance("HOUSINGLOAN");

  System.out.println("Housing  Loan EMI"+ account2.calculateEMI(50000.00,2));
     System.out.println("Rate Interest"+account2.getRateOfInterest());

  }

}
