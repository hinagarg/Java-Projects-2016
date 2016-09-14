/**
 * 
 */
package com.training.entity;

import java.util.Date;

/**
 * @author hgarg1
 *
 */
public class PaymentStatus {

  private long transactionId;
  private Date transactionDate;
  private String description; 
  private double amount;
  /**
   * 
   */
  public PaymentStatus() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param transactionId
   * @param timestamp
   * @param description
   * @param amount
   */
  public PaymentStatus(long transactionId, Date timestamp, String description, double amount) {
  super();
  this.transactionId = transactionId;
  this.transactionDate = timestamp;
  this.description = description;
  this.amount = amount;
  }
  /**
   * @param transactionId the transactionId to set
   */
  public void setTransactionId(long transactionId) {
  this.transactionId = transactionId;
  }
  /**
   * @param transactionDate the transactionDate to set
   */
  public void setTransactionDate(Date transactionDate) {
  this.transactionDate = transactionDate;
  }
  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
  this.description = description;
  }
  /**
   * @param amount the amount to set
   */
  public void setAmount(double amount) {
  this.amount = amount;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  
  
  @Override
  public String toString() {
  return transactionId + ":"+ transactionDate + ":" + description + ":" + amount;
  }
  /**
   * @return the transactionId
   */
  public long getTransactionId() {
  return transactionId;
  }
  /**
   * @return the transactionDate
   */
  public Date getTransactionDate() {
  return transactionDate;
  }
  /**
   * @return the description
   */
  public String getDescription() {
  return description;
  }
  /**
   * @return the amount
   */
  public double getAmount() {
  return amount;
  }
  
  
}
