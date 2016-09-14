package com.training.entity;

import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {

  private long customerNumber;
  private String customerName;
  private String email;
  private long phoneNumber;
  /**
   * 
   */
  public Customer() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param customerNumber
   * @param customerName
   * @param email
   * @param phoneumber
   */
  public Customer(long customerNumber, String customerName, String email, long phoneNumber) {
  super();
  this.customerNumber = customerNumber;
  this.customerName = customerName;
  this.email = email;
  this.phoneNumber = phoneNumber;
  }
  /**
   * @return the customerNumber
   */
  public long getCustomerNumber() {
  return customerNumber;
  }
  /**
   * @param customerNumber the customerNumber to set
   */
  public void setCustomerNumber(long customerNumber) {
  this.customerNumber = customerNumber;
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
  /**
   * @return the email
   */
  public String getEmail() {
  return email;
  }
  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
  this.email = email;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", email=" + email
      + ", phoneNumber=" + phoneNumber + "]";
  }
  public long getPhoneNumber() {
  return phoneNumber;
  }
  public void setPhoneNumber(long phoneNumber) {
  this.phoneNumber = phoneNumber;
  }
  
  
}
