package com.training.tests;

import java.sql.Connection;

import org.junit.Test;

import static org.junit.Assert.*;
import com.training.utils.MySQLConnection;

public class TestMySqlConnection {

	@Test
	public void testGetMyOracleConnection(){
		
		Connection con = MySQLConnection.getMyOracleConnection();
		
		assertNotNull("Check Connection Parameters", con);
	}
}
