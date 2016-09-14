/**
 * 
 */
package com.training.domains;

import java.util.HashMap;

/**
 * @author hgarg1
 *
 */
public class DueCalculator {
  
  private HashMap<Long, Double> dueDetails;

  /** Represents Business Service.
   * 
   */
  public DueCalculator() {
  super();
  // TODO Auto-generated constructor stub
  dueDetails = new HashMap<Long, Double>();
  
  
  }
  
  private void init()
  {
  
    dueDetails.put(9887654567L, 500.00D);
    dueDetails.put(9037654567L, 400.00D);
    dueDetails.put(96757654567L, 600.00D);
    dueDetails.put(9234654567L, 700.00D);
  }
  
  public Double findDue(Long phoneNumber)
  {
    init();
    Double result = dueDetails.get(phoneNumber);
    return result;
  
  
  }

}
