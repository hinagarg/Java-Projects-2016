/**
 * 
 */
package com.training.decorator;

/**
 * @author hgarg1
 *
 */
public class TestDecorators {

  /**
   * @param args
   */
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  BankAccount bkObj = new SavingsAccount();
  
  System.out.println("Both Multicity and Online Facility");
  
  BankAccount bkObj2 = new OnlineBanking(new Multicity(bkObj));
  
  System.out.println(bkObj2.balanceToMaintain());

  }

}
