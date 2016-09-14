package com.training;


 class A{
	 int add(int i, int j){
	 return i+j;
	 }
	}

public class Example_One extends A{

		 public static void main(String argv[]){
		
			 /*
			  *  Fix the following lines of code
			  */
			 short s = 927;
		 
		       byte b = 5;
		 
		      int sb = s+ b;
		  
		 // fix the Bug in the Line Below
		      Example_One obj = new Example_One();
		      System.out.println(obj.add(s,6));
		      System.out.println(s);
		 }
		}


