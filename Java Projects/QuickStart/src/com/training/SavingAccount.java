package com.training;

public class SavingAccount extends BankAccount {

	private String nomineeName;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SavingAccount(int accountNumber, String accountHolderName,String nomineeName) {
		super(accountNumber, accountHolderName);
		// TODO Auto-generated constructor stub
		this.nomineeName = nomineeName;
	}
	
	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	
	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		if((getBalance() - amount) > 1000){
			
			setBalance(getBalance() - amount);
		}
		else
		{
			
			System.out.println("Withdraw Limit Exceeds");
		}
		return getBalance();
	}
		
}
