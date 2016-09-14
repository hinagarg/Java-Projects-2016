package com.training.domains;

public abstract class LoanAccount {

  private double rateOfInterest;
  
  protected LoanAccount(double rateOfInterest)
  {
    this.rateOfInterest = rateOfInterest;
  }
  
  public abstract double calculateEMI(double loanAmount, double tenure);
  
  public double getRateOfInterest(){
    return rateOfInterest;
  }
}
