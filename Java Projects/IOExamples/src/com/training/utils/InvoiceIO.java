package com.training.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;


import com.training.domain.Invoice;

public class InvoiceIO {

	public boolean writeDetails(Collection<Invoice> invList) throws IOException{
		
		boolean result = false;
		try(PrintWriter out = new PrintWriter(new FileWriter("Invoice.txt"), true)){
		for(Invoice inv : invList)
		{
			out.print(inv);
		}
			return true;
			//out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}		return result;
	}
	
	public Collection<Invoice> readDetails(){
		
		ArrayList<Invoice> details = new ArrayList<Invoice>();
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader("Invoice.txt"))){
			
			String line =  null;
			
			
			while((line = reader.readLine())!= null)
			{
				String[] values = line.split(",");
				
				int invoiceNumber = Integer.parseInt(values[0]);
				double amount =  Double.parseDouble(values[2]);
				
				Invoice inv = new Invoice(invoiceNumber,values[1], amount);
				
				details.add(inv);
			}
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return details;
	}
}
