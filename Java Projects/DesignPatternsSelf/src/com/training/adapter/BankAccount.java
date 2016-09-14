/**
 * 
 */
package com.training.adapter;

/**
 * @author hgarg1
 *
 */
public class BankAccount {

  public double calculate(double principle){
  
    System.out.println("Calculate Interest");
    
    return principle * 0.10d;
  }
}
