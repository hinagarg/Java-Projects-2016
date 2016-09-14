package com.training.utils;
import java.sql.*;
import java.util.Properties;
import java.io.*;

public class MySQLConnection {

	public static Connection getMyOracleConnection(){
		
		Connection con = null;
		
		try {
			Properties props = new Properties();
			
			//FileInputStream inStream = new FileInputStream(new File("DbConnection.properties"));
			
			InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("DbConnection.properties");
			
			System.out.println("instream "+ inStream);
			props.load(inStream);
			
			Class.forName(props.getProperty("db.driverClass"));
			
			con = DriverManager.getConnection(props.
					getProperty("db.driverURL"),
					props.getProperty("db.userName"),
					props.getProperty("db.passWord"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
}
