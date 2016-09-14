/**
 * 
 */
package com.training.facade;

/**
 * @author hgarg1
 *
 */
public class StoresFacade {

  public ElectronicStore getElectronics()
  {
  
    ElectronicStore eStore = new ElectronicStore();
    
    return eStore;
  }
  
  public FurnitureStore getFurnitures()
  {
  
    FurnitureStore fStore = new FurnitureStore();
    
    return fStore;
  }
}
