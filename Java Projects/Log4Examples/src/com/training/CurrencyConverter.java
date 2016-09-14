/**
 * 
 */
package com.training;

import org.apache.log4j.Logger;

/**
 * @author hgarg1
 *
 */
public class CurrencyConverter {
	
	//Logger log1 = Logger.getLogger("com");
	Logger log1 = Logger.getRootLogger();
	
	
	/**
	 * 
	 */
	public CurrencyConverter() {
		super();
		// TODO Auto-generated constructor stub
		log1.info("Currency Converter");
	}
	
	
	public double usdToINR(double usd){
		
		double amount = Math.abs(usd);
				
				return amount * 60;
}
public double dollarToRupees(double dlrAmt){
	
	double amt = 0.0;
	if(dlrAmt < 0){
		amt = Math.abs(dlrAmt);
		log1.warn("Converting" + dlrAmt + "in to absolute value");
	}


double inrAmt = amt * 45.0d;

log1.info("InrAmount" + inrAmt);

return inrAmt;
}
}
