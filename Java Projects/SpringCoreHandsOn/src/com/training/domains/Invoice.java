/**
 * 
 */
package com.training.domains;

import java.util.List;

/**
 * @author hgarg1
 *
 */
/**
 * Create a Spring Core Application using XML Based Configueartion.
 * The domians class is Invoice.
 * Use setter/constructor/p nameSpace/c-nameSpace
 * ref attribute and collection injection and lifecycle init and destro methods.
 */
public class Invoice {

  private long inoiveNumber;
  
  private Customer cust;
  
  private double amount;
  
  private List<Item> itemList;

  /**
   * 
   */
  public Invoice() {
  super();
  // TODO Auto-generated constructor stub
  }

  /**
   * @return the inoiveNumber
   */
  public long getInoiveNumber() {
  return inoiveNumber;
  }

  /**
   * @param inoiveNumber the inoiveNumber to set
   */
  public void setInoiveNumber(long inoiveNumber) {
  this.inoiveNumber = inoiveNumber;
  }

  /**
   * @return the cust
   */
  public Customer getCust() {
  return cust;
  }

  /**
   * @param cust the cust to set
   */
  public void setCust(Customer cust) {
  this.cust = cust;
  }

  /**
   * @return the amount
   */
  public double getAmount() {
  return amount;
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(double amount) {
  this.amount = amount;
  }

  /**
   * @return the itemList
   */
  public List<Item> getItemList() {
  return itemList;
  }

  /**
   * @param itemList the itemList to set
   */
  public void setItemList(List<Item> itemList) {
  this.itemList = itemList;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Invoice [inoiveNumber=" + inoiveNumber + ", cust=" + cust + ", amount=" + amount + ", itemList=" + itemList
      + "]";
  }
  
  
}
