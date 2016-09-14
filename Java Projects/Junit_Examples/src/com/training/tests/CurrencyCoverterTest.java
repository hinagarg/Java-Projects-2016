/**
 * 
 */
package com.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.domians.CurrencyConverter;
import com.training.domians.PrintMaximum;

/**
 * @author hgarg1
 *
 */



public class CurrencyCoverterTest {
	
	CurrencyConverter conv;

	@Before
	public void init(){
		
		conv = new CurrencyConverter();
	}

	@Test
	public void testUsdToINR() {
		CurrencyConverter conv = new CurrencyConverter();
		
		double actual = conv.usdToINR(100);
		
		assertEquals(6000.00, actual,0);
	}
	
	@Test
	public void testForNegativeValues()
	{
		
		CurrencyConverter conv = new CurrencyConverter();
		
		double actual = conv.usdToINR(-100);
		
		assertEquals(6000.00, actual,0);
	}
	
	


}
