/**
 * 
 */
package com.training.domain;

/**
 * @author hgarg1
 *
 */
public class Application {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySerializer serializer = new MySerializer();
		
		Invoice inv = new Invoice(101, "Ramesh", 4500);
		
		boolean result = serializer.serialize(inv);
		
		System.out.println("Is Object Seralized :="+ result);

	
	
	Invoice inv1 = (Invoice)serializer.deSeralize();
	
	System.out.println(inv1);
	System.out.println(inv1.getAmount());

}
}