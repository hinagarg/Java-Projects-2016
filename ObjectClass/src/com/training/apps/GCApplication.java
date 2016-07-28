package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

public class GCApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book bk;
		try {
		bk = new Book(101, "A", "B", 20.00);
		
		System.out.println(bk.hashCode());
		
		bk = new Book(102, "P", "Q", 450.00);
				
		//bk = null;
		//System.out.println(bk);
		
		System.gc();
		
		System.out.println(bk);
		
		System.out.println(bk.hashCode());
		System.out.println("Look At the Console For a Special Message");
		
		System.out.println("Bye...");
		
		//System.out.println(bk);

	}
	catch(RangeCheckException e){
		
		System.out.println(e.getMessage());
	}
	}

}
