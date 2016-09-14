package com.training;

public class Example_Six {

	public void printNames(String[] nameList)
	{
	     for(String name1 :nameList)
         {
        	 System.out.println(name1);
         }
	}
	public void  updateNames(String[] nameList)
	{
			//int i =0;
		for(String name : nameList)
		{
		   name ="Dr."+name;
			
		   System.out.println(name);
			
		}
		
		//printNames(nameList);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Example_Six obj =new Example_Six();
		   
		   String[] nameList = {"Ramesh","Ganesh","Magesh"};
		   
            obj.updateNames(nameList);
		 
            /*
             * Should print Name without Prefix but prints with Prefix - Need to fix the bug
             */
            obj.printNames(nameList);
        
	}

}
