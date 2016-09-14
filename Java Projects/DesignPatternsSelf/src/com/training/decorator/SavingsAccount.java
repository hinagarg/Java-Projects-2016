/**
 * 
 */
package com.training.decorator;


/**
 * @author hgarg1
 *
 */
public class SavingsAccount extends BankAccount {

  @Override
  public double balanceToMaintain() {
  
  System.out.println("Inside the Concrete Component");
  
  return 1000.00;
  }

 
}
