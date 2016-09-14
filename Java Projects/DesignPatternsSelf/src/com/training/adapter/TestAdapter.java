/**
 * 
 */
package com.training.adapter;

/**
 * @author hgarg1
 *
 */
public class TestAdapter {

  /**
   * @param args
   */
  public static void main(String[] args) {
  LifeInsurance life = new LifeInsurance();
  
  AdapterClass adapter = new AdapterClass(life);
  
  System.out.println(adapter.calculate(6000));

  }

}
