package com.training.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {

  private long custId;
  
  private String name;

  /**
   * 
   */
  public Customer() {
  super();
  // TODO Auto-generated constructor stub
  }

  /**
   * @param custId
   * @param policyAamount
   */
  @Autowired
  public Customer(@Value("12345678")long custId, @Value("Blake")String name) {
  super();
  this.custId = custId;
  this.name = name;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  
  
  @Override
  public String toString() {
  return "Customer [custId=" + custId + ", name=" + name + "]";
  }

  /**
   * @return the custId
   */
  public long getCustId() {
  return custId;
  }

  /**
   * @param custId the custId to set
   */
  public void setCustId(long custId) {
  this.custId = custId;
  }

  /**
   * @return the name
   */
  public String getName() {
  return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
  this.name = name;
  }
  
  
  
}
