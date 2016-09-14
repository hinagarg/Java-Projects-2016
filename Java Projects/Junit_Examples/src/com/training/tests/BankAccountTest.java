/**
 * 
 */
package com.training.tests;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;

import com.training.domains.BankAccount;
import com.training.domains.MyDaoImpl;
import com.training.domians.CurrencyConverter;

/**
 * @author hgarg1
 *
 */
public class BankAccountTest {
	
	BankAccount acc;
	@Before
	public void init(){
		
		acc = new BankAccount(1000.0);
	}

	@Test
	public void testdepositMoney() throws Exception{
		
		assertEquals(acc.depositMoney(500.0).getClass(), Double.class);
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testwithdrawMoney() throws Exception{
		
		double balance = acc.withdrawMoney(600.0);
		assertEquals(false, (balance < 0));
		
	}

}
