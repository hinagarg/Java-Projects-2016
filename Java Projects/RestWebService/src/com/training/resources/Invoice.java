/**

 * 
 */
package com.training.resources;
import java.io.Serializable;

/**
 * @author hgarg1
 *
 */
public class Invoice implements Serializable{
	
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return Amount;
	}
	private static final long serailVersionUD = 18;
	private int InvoiceNumber;
	private String CustomerNme;
	private transient double Amount;
	/**
	 * 
	 */
	
	private String email;
	
	/**
	 * @param invoiceNumber
	 * @param customerNme
	 * @param amount
	 * @param email
	 */
	public Invoice(int invoiceNumber, String customerNme, double amount) {
		super();
		InvoiceNumber = invoiceNumber;
		CustomerNme = customerNme;
		Amount = amount;
		
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		Amount = amount;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param invoiceNumber
	 * @param customerNme
	 * @param amount
	 */
	public Invoice(int invoiceNumber, String customerNme, int amount) {
		super();
		InvoiceNumber = invoiceNumber;
		CustomerNme = customerNme;
		Amount = amount;
	}
	/**
	 * @return the invoiceNumber
	 */
	public int getInvoiceNumber() {
		return InvoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(int invoiceNumber) {
		InvoiceNumber = invoiceNumber;
	}
	/**
	 * @return the customerNme
	 */
	public String getCustomerNme() {
		return CustomerNme;
	}
	/**
	 * @param customerNme the customerNme to set
	 */
	public void setCustomerNme(String customerNme) {
		CustomerNme = customerNme;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return InvoiceNumber + ","+ CustomerNme  + ", " + Amount + "," ;
	}
	
	
	
	
	

}
