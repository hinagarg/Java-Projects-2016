/**
 * 
 */
package com.training.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * @author hgarg1
 *
 */
public class MySerializer {

	
	public boolean serialize(Object obj) {
		
		boolean result = false;
		
		ObjectOutputStream outStream = null;
		
		try{
			
			outStream = new ObjectOutputStream(new FileOutputStream(new File("Invoice.ser")));
			
			outStream.writeObject(obj);
			result = true;
		}
		catch(IOException e){
			
			System.err.println(e.getMessage());
			
		}
		finally{
			
			try{
				
				outStream.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return result;
	}
	


public Object deSeralize(){
	
	Object obj = null;
	
	try(ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(new File("Invoice.ser"))))
	{
			
		obj = inStream.readObject();
     }

    catch(IOException | ClassNotFoundException e) 

{
	
	e.printStackTrace();
}

return obj;

}

}