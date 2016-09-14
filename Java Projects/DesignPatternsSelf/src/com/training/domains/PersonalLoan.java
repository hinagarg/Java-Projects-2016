package com.training.domains;

public class PersonalLoan extends LoanAccount {
  
  private double processingFees;
  
  protected PersonalLoan(double rateOfInterest) {
  super(rateOfInterest);
  this.processingFees = 2000;
  }

  @Override
  public double calculateEMI(double loanAmount, double tenure) {
  // TODO Auto-generated method stub
  return (loanAmount*getRateOfInterest()*tenure)+processingFees;
  }

}
