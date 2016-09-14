package com.training.apps;

public class CreditCard {


  private long cardNumber;
  private String cardHolderName;
  private double creditLimit;
  private double amountSpent;
  
  public CreditCard() {
	super();
	// TODO Auto-generated constructor stub
  }
  
  
  /*public CreditCard(long cardNumber) {
	super();
	this.cardNumber = cardNumber;
  }*/

  public CreditCard(long cardNumber) {
		this(cardNumber, "Guest", 7500, 7500);
	//this.cardNumber = cardNumber;	
	  }

  public CreditCard(long cardNumber, String cardHolderName, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
		
	  }
  

  public CreditCard(long cardNumber, String cardHolderName, double creditLimit, double amountSpent) {
	super();
	this.cardNumber = cardNumber;
	this.cardHolderName = cardHolderName;
	this.creditLimit = creditLimit;
	this.amountSpent = amountSpent;
  }

  public long getCardNumber() {
	return cardNumber;
  }
  
  public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
  }
  
  public String getCardHolderName() {
	return cardHolderName;
  }
  
  public void setCardHolderName(String cardHolderName) {
	this.cardHolderName = cardHolderName;
  }
  
  public double getCreditLimit() {
	return creditLimit;
  }
  
  public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
  }
  
  public double calculateBillAmount(){
	  
    double billAmount = 0.0;
	  
	billAmount = amountSpent * .05;
	    
	return billAmount;
  }
  
  public double getAmountSpent() {
		return amountSpent;
  }
  
  @Override
  public String toString() {
	// TODO Auto-generated method stub
	return this.cardNumber + ":" + this.cardHolderName + ":" + this.creditLimit + super.toString();
  }
  
}
