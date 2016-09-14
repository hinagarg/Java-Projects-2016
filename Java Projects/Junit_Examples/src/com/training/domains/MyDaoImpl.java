package com.training.domains;

import java.sql.Connection;

public class MyDaoImpl {

	
	Connection con;
	
	public MyDaoImpl(Connection con){
		
		super();
		
		if(con == null)
			
		{
			throw new NullPointerException("Connection Objects seems to be null");
		}
		else
		{
			
			this.con = con;
		}
	}
	
	public MyDaoImpl(){
		
		super();
	}
}

