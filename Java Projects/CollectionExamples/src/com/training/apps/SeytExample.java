/**
 * 
 */
package com.training.apps;

import java.util.*;

import com.training.domains.CreditCard;

/**
 * @author hgarg1
 *
 */
public class SeytExample {

	public static void mian(String[] args){
		
		TreeSet<CreditCard> cardList = new TreeSet<CreditCard>();
		
		cardList.add(new CreditCard(101, "Ramesh", 75000));
		cardList.add(new CreditCard(20, "Ramesh", 45000));
		cardList.add(new CreditCard(102, "Ramesh", 55000));
		
		System.out.println(cardList);
	}
}
