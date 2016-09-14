/**
 * 
 */
package com.training.facade;

/**
 * @author hgarg1
 *
 */
public class TestFacade {

  /**
   * @param args
   */
  public static void main(String[] args) {
  
    StoresFacade sf = new StoresFacade();
    
    System.out.println(sf.getElectronics().getGoods());
    System.out.println(sf.getFurnitures().getGoods());

  }

}
