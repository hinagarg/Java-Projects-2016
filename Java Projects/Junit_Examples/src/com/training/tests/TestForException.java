package com.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.domains.CheckFrException;

public class TestForException {
	
	CheckFrException exp = new CheckFrException();
	@Test(expected =java.lang.IndexOutOfBoundsException.class)
	public void exceptionTestType1()   {
	exp.getItems();       }

	@Test
	public void exceptionTestType2()   {
	try {

	String val=exp.getItems();
	fail("Failed Test -  Exception should be thrown");

	} catch (IndexOutOfBoundsException  e) {
	 assertEquals(e.getMessage(),  "Index: 1, Size: 0");
	  //e.printStackTrace();
	}

	
	}}
