/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class Customer {
  
  private int customerId;
  private String customerName;
  private String customerAddress;
  /**
   * 
   */
  public Customer() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param customerId
   * @param customerName
   */
  public Customer(int customerId, String customerName, String customerAddress) {
  super();
  this.customerId = customerId;
  this.customerName = customerName;
  this.customerAddress = customerAddress;
  }
  /**
   * @return the customerId
   */
  public int getCustomerId() {
  return customerId;
  }
  /**
   * @param customerId the customerId to set
   */
  public void setCustomerId(int customerId) {
  this.customerId = customerId;
  }
  /**
   * @return the customerName
   */
  public String getCustomerName() {
  return customerName;
  }
  /**
   * @param customerName the customerName to set
   */
  public void setCustomerName(String customerName) {
  this.customerName = customerName;
  }
  public String getCustomerAddress() {
  return customerAddress;
  }
  public void setCustomerAddress(String customerAddress) {
  this.customerAddress = customerAddress;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
      + customerAddress + "]";
  }
 
  
  
}
