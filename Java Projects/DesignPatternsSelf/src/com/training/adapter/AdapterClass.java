/**
 * 
 */
package com.training.adapter;

/**
 * @author hgarg1
 *
 */
public class AdapterClass extends BankAccount {
  LifeInsurance life;
  
  public AdapterClass(LifeInsurance life){
    this.life = life;
  }
  
  public double calculate(double principle){
  
  return life.calculatePremium(principle);
  }
}
