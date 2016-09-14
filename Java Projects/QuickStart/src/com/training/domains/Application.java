package com.training.domains;
import java.util.*;

import com.training.apps.CreditCard;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String flag = "Y";
	CreditCard card1 = new CreditCard(1000200, "Ramesh", 75000,12000);
	
	 double minAmountDue = card1.calculateBillAmount();
	 
	 System.out.println("Total Purchase :=" + card1.getAmountSpent());
	 System.out.println("Minimum Amount Due :=" +minAmountDue);

		CreditCard card2 = new CreditCard(2000);
		
		double minAmountDue2 = card2.calculateBillAmount();
		
		System.out.println("Card Number :=" + card2.getCardNumber());
		System.out.println("Card Holder Name :=" + card2.getCardHolderName());
		System.out.println("Amount Spent :=" + card2.getCardNumber());
		System.out.println("MinimumAmount Due :=" + card2.getCardNumber());
		
		// Using Scanner Class Take Input

		Scanner sc = new Scanner(System.in);
		Scanner nsc = new Scanner(System.in);
		while(flag == "Y") {
	      System.out.println("Enter Amount Spent");
		  int i = sc.nextInt();	
		  if (i < 50000){
			  System.out.println("Minimum Amount Due is " + i * 0.05);
		  }
		  else  {
			  System.out.println("Minimum Amount Due is " + i * 0.07);
		  }
		  System.out.println(" ");
		  System.out.println("Press Y if you want to continue or Press any other key to terminate");
		  flag = nsc.nextLine();
		  
		}
  }
}



/*
*
* Use a while loop to terminate the input
*
* for Amount Spent less than  50000 min amount Due 5%
*
** for Amount more than 50000 min amount Due 7%
*
* 
*/
