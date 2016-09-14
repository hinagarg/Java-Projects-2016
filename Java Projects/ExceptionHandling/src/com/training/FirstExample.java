package com.training;

public class FirstExample {

	public String underStandFinally(){
		String number = "Four";
		
		try{
			int val = Integer.parseInt(number);
			System.out.println("Value" + val);
		}
		catch (NumberFormatException e){
			
			System.out.println(e.getMessage());
			
			return "caught";
		}
		
		finally{
			System.out.println("**** Inside Finally Block****");
		}
		System.out.println("Method End");
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstExample obj = new FirstExample();
		String message = obj.underStandFinally();
		System.out.println(message);
		
		String s = "Hello"; //use null to get null pointer exception
		
		try{
			System.out.println("String Length" + s.length());
			
		}
		catch(NullPointerException e){
			
			System.err.println("Generic Exceptioon");
			
		}
		
		catch(Exception e){
			
			System.err.println("String value is Nul - Check");
			
			System.err.println(e.getMessage());
			//return (1);
		}
		
		
		finally{
			System.out.println("Inside Finally...");
		}
		
			System.out.println("Bye...");
		
	}

}
