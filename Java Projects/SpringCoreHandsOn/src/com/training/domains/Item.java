/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class Item {

  private int itemNumber;
  private String itemName;
  /**
   * 
   */
  public Item() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param itemNumber
   * @param itemName
   */
  public Item(int itemNumber, String itemName) {
  super();
  this.itemNumber = itemNumber;
  this.itemName = itemName;
  }
  /**
   * @return the itemNumber
   */
  public int getItemNumber() {
  return itemNumber;
  }
  /**
   * @param itemNumber the itemNumber to set
   */
  public void setItemNumber(int itemNumber) {
  this.itemNumber = itemNumber;
  }
  /**
   * @return the itemName
   */
  public String getItemName() {
  return itemName;
  }
  /**
   * @param itemName the itemName to set
   */
  public void setItemName(String itemName) {
  this.itemName = itemName;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Item [itemNumber=" + itemNumber + ", itemName=" + itemName + "]";
  }
  
  
}
