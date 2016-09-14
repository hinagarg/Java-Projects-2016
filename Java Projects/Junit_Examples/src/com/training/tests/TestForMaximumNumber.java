/**
 * 
 */
package com.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.training.domians.PrintMaximum;

/**
 * @author hgarg1
 *
 */
public class TestForMaximumNumber {
	
	PrintMaximum max;
	
	@Before
	public void init(){
		max = new PrintMaximum();
	}
	
	@Test
	public void testFindMaximumWithPositiveValues(){
		
		int[] numbers = {12,23,45,9};
		int actual = max.findMaximum(numbers);
		assertEquals(45, actual);
	}
	
	@Test
	public void testFindMaximumWithNegativeValues(){
		
		int[] numbers = {-12,-23,-45,-9};
		int actual = max.findMaximum(numbers);
		assertEquals(-9, actual);
	}
}
