package com.training.decorator;

public class Multicity extends FeatureDecorator {
  
  BankAccount bkaccObj;
  
  public Multicity(BankAccount bkaccObj) {
  super(bkaccObj);
  this.bkaccObj = bkaccObj;
  }

  @Override
  public double balanceToMaintain() {
  // TODO Auto-generated method stub
  return 0;
  }


}
