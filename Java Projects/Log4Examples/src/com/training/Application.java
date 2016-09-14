package com.training;

import org.apache.log4j.BasicConfigurator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CurrencyConverter conv = new CurrencyConverter();
		
		conv.dollarToRupees(200);
		
		conv.dollarToRupees(-100);
	}

}
