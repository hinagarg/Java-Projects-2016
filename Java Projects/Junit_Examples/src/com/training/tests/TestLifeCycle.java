package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLifeCycle {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Called Once Before Class");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Called After All Tests are Completed");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("Called Before Each Test Method");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("Called After Each Test Method");
	}
	@Test
	public void test1() {
		System.out.println("1");
		fail("Not yet implemented");
	}
	@Test
	public void test2() {
		System.out.println("2");
		fail("Not yet implemented");
	}  }


