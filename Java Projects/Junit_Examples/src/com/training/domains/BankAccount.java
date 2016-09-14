/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class BankAccount {
	

	private double balance;
	
	/**
	 * 
	 */
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param currentAmount
	 * @param balance
	 */
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}



	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}


	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Double depositMoney(double depositAmount) throws Exception{
			
		 balance= getBalance() + depositAmount;
		 if(balance > 0.0){
			 	return balance;
			}
			else{
				
				throw new Exception("Balance is not double and negative");
			}
		 
		 
	}
	
	public double withdrawMoney(double withdrawAmount) throws Exception{
			
		if(getBalance() > 0){			
			balance = getBalance() - withdrawAmount;
			return withdrawAmount;
		}
		else{
			
			throw new Exception("Balance is insufficient");
		}
		
	}

}
