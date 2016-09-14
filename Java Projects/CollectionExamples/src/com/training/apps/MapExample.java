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
public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, CreditCard> list = new Hashtable<String, CreditCard>();
		
		list.put("A101", new CreditCard(101, "Ramesh", 75000));
		Object Obj = list.put("A101", new CreditCard(103, "Rakesh", 75000));
		System.out.println(Obj);
		
		list.put("A102", new CreditCard(102, "John", 175000));
		
		list.put("A103", new CreditCard(103, "Jeyesh", 875000));
		
		System.out.println(list.get("A101"));
		System.out.println(list.get("A102"));
		
		Set<Map.Entry<String, CreditCard>> myList  = list.entrySet();
		
		for(Map.Entry<String, CreditCard> element: myList)
		{
			System.out.println(element.getKey());
			System.out.println(element.getValue());
		}
	}

}
