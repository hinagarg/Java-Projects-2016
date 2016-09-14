/**
 * 
 */
package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author hgarg1
 *
 */


@Component("insuranceBean")
public class LifeInsurance {
  
  @Autowired 
  @Qualifier("cust1")
  private Customer cust;

  @Value("109655424")
  private long policyNumber;
  
  @Value("100.98")
  private double policyAmount;
  
  
  /**
   * @return the policyNumber
   */
  
  public long getPolicyNumber() {
  return policyNumber;
  }


  /**
   * @param policyNumber the policyNumber to set
   */
  
  public void setPolicyNumber(long policyNumber) {
  this.policyNumber = policyNumber;
  }


  /**
   * @return the policyAmount
   */
  public double getPolicyAmount() {
  return policyAmount;
  }


  /**
   * @param policyAmount the policyAmount to set
   */
  
  public void setPolicyAmount(double policyAmount) {
  this.policyAmount = policyAmount;
  }


  public double findFirstPremium(){
  
    double firstPremium = 0.0;
   
    
    double premium = (policyAmount * .01);
    
    if(premium > 1500.00)
    {
      
      firstPremium = premium -500;
      
    }
    
    else{
      
      firstPremium = premium;
    }
    
    return firstPremium;
  }


  /**
   * 
   */
  public LifeInsurance() {
  super();
  // TODO Auto-generated constructor stub
  }


  public Customer getCust() {
  return cust;
  }


  public void setCust(Customer cust) {
  this.cust = cust;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "LifeInsurance [cust=" + cust + ", policyNumber=" + policyNumber + ", policyAmount=" + policyAmount + "]";
  }
  
  @PostConstruct
  public void init(){
  
    System.out.println("Resources Created");
  }
  
  @PreDestroy
  public void cleanUp(){
  
  System.out.println("Resources Closed");
  }
}
