/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class HousingLoan extends LoanAccount {

  protected HousingLoan(double rateOfInterest) {
  super(rateOfInterest);
  // TODO Auto-generated constructor stub
  }

  /* (non-Javadoc)
   * @see com.training.domains.LoanAccount#calculateEMI(double, double)
   */
  @Override
  public double calculateEMI(double loanAmount, double tenure) {
  // TODO Auto-generated method stub
  return (loanAmount * getRateOfInterest()* tenure);
  }

}
