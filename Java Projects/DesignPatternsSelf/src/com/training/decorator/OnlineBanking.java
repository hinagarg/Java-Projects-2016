/**
 * 
 */
package com.training.decorator;

/**
 * @author hgarg1
 *
 */
public class OnlineBanking extends FeatureDecorator {

  public BankAccount bkObj;
  
  public OnlineBanking(BankAccount bkObj) {
    super(bkObj);
    this.bkObj = bkObj;
  }

  /* (non-Javadoc)
   * @see com.training.decorator.FeatureDecorator#balanceToMaintain()
   */
  @Override
  public double balanceToMaintain() {
    
    return bkObj.balanceToMaintain() + 6000;
  }
  
  public String getDescription(){
  
    return ((OnlineBanking) bkObj).getDescription() + "Has Online Banking";
  }

}
