/**
 * 
 */
package com.training.decorator;

/**
 * @author hgarg1
 *
 */
public abstract class FeatureDecorator extends BankAccount {

  /* (non-Javadoc)
   * @see com.training.decorator.BankAccount#balanceToMaintain()
   */
  private BankAccount acc;
  
  
  /**
   * @param acc
   */
  public FeatureDecorator(BankAccount acc) {
  super();
  this.acc = acc;
  }
  
  

  /**
   * @return the acc
   */
  public BankAccount getAcc() {
  return acc;
  }



  @Override
  public abstract double balanceToMaintain();
  
}
