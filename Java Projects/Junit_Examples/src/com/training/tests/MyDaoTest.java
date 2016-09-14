/**
 * 
 */
package com.training.tests;
import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.training.domains.MyDaoImpl;
/**
 * @author hgarg1
 *
 */
public class MyDaoTest {
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testConstructorThrowsException(){
		
		Connection con = null;
		
		MyDaoImpl dao = new MyDaoImpl(con);
	}

}
