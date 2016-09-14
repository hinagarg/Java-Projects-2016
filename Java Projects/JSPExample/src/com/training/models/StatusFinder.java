/**
 * 
 */
package com.training.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.training.entity.PaymentStatus;

/**
 * @author hgarg1
 *
 */
public class StatusFinder {
  
  private HashMap<Long, List<PaymentStatus>> paymentHistory;

  /**
   * 
   */
  public StatusFinder() {
  super();
  // TODO Auto-generated constructor stub
  paymentHistory = new HashMap<Long, List<PaymentStatus>>();
  }
  
  private void init(){
  
  List<PaymentStatus> list1 = new ArrayList<PaymentStatus>();
  
  PaymentStatus pmt1 = new PaymentStatus(1000, new Date(), "pizzahut", 450.00);
  PaymentStatus pmt2 = new PaymentStatus(1002, new Date(), "noodleahut", 350.00);
  list1.add(pmt1);
  list1.add(pmt2);
  
  paymentHistory.put(944335627L, list1);
  paymentHistory.put(97654356L, list1);
  paymentHistory.put(93424365L, list1);
  paymentHistory.put(95678943L, list1);
  
  }
  
  public List<PaymentStatus> getPaymentHistory(Long key){
  
    init();
    return paymentHistory.get(key);
  }

}
