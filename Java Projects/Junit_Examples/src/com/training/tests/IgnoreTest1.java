package com.training.tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.training.domians.Ignorecla;

public class IgnoreTest1 {
	
	Ignorecla obj = new Ignorecla();
	@Test
    public void testaddOrder()
    {
		
     assertEquals(1,(obj.addOrder("TV")).size());
     
    obj.addNames("Ramesh");
    obj.addNames("Ramesh");
     
     assertEquals(1,obj.getNames().size());
     
    }
    
    @Ignore("Will be Tested Later")
    @Test
      public void testRemoveOrder()
    {
         assertEquals(0,(obj.closeOrder("TV")).size());  
  }

}
