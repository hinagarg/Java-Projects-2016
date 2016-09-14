package com.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.domains.PrintGrades;

public class TestPrintGrade {

	@Test
	public void testGradeD(){
		
		PrintGrades obj = new PrintGrades();
		String actual = obj.findResult(35);
		
		assertEquals("D" , actual);
	}
	
	@Test
	public void testGradeC1(){
		
		PrintGrades obj = new PrintGrades();
		String actual = obj.findResult(45);
		
		assertEquals("C" , actual);
	}
	
	@Test
	public void testGradeD2(){
		
		PrintGrades obj = new PrintGrades();
		String actual = obj.findResult(25);
		
		assertEquals("D" , actual);
	}
	
	@Test
	public void testGradeB(){
		
		PrintGrades obj = new PrintGrades();
		String actual = obj.findResult(70);
		
		assertEquals("B" , actual);
	}
}
