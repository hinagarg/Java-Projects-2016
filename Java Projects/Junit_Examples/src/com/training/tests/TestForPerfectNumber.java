/**
 * 
 */
package com.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.training.domians.FindPerfectNumber;

/**
 * @author hgarg1
 *
 */
public class TestForPerfectNumber {
	
	FindPerfectNumber pObj;
	
	@Before
	public void init(){
		pObj = new FindPerfectNumber ();
	}
	
	
	@Test
	public void testFindPerfectNumber(){
		
		boolean actual = pObj.checkPerfectNumber(6);
		assertEquals(true, actual);
	}
	
	@Test
	public void testFindNegativePerfectNumber(){
		
		boolean actual = pObj.checkPerfectNumber(-6);
		assertEquals(false, actual);
	}
	
	@Test
	public void testFindNonPerfectNumber(){
		
		boolean actual = pObj.checkPerfectNumber(29);
		assertEquals(false, actual);
	}
}
