package com.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.domains.SleepCheck;

public class TestSleepCeck {

	SleepCheck obj1 = new SleepCheck();
	
	@Before
	public void setUp() throws Exception {
	 //obj=new MethodDuration();
	}

	@Test(timeout=200)
	public void testGetBalance() {

	double val = obj1.getBalance();

	assertEquals("Method worked within Time",900, 1000, 200);
	}

}
