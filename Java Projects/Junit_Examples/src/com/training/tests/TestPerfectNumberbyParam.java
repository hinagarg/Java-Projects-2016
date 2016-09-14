package com.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.domians.FindPerfectNumber;
@RunWith(Parameterized.class)
public class TestPerfectNumberbyParam {
	private int numbers;
	
	public TestPerfectNumberbyParam(int numbers){
		super();
		this.numbers = numbers;
	}
	
	@Test
	public void testPracticeByParam(){
		
		FindPerfectNumber obj = new FindPerfectNumber();
		
		boolean actual = obj.checkPerfectNumber(numbers);
		assertTrue(numbers+"is not Perfect Number", actual);
	}
	
	@Parameters
	public static Collection<Object> data(){
	Object[] data = new Object[]{6, 28, 33, 44};
	return Arrays.asList(data);
	}
}
