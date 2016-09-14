package com.training;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  SavingAccount saObj = new SavingAccount();
	  
	  saObj.setBalance(12000);
	  System.out.println("Balance " + saObj.getBalance());
	  
	  saObj.setAccountHolderName("Jenny");
	  System.out.println("Account Holder Name " + saObj.getAccountHolderName());
	  
	  saObj.setAccountNumber(2345);
	  System.out.println("Account Number " + saObj.getAccountNumber());
	  
	  
	  System.out.println("Balance " + saObj.withdraw(500));
	}

}
