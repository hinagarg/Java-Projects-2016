/**
 * 
 */
package com.training.apps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.training.domain.Invoice;
import com.training.utils.InvoiceIO;

/**
 * @author hgarg1
 *
 */
public class Application {

	public static void main(String[] args) throws IOException{
		
		InvoiceIO obj = new InvoiceIO();
		
		List<Invoice> invoiceList = new ArrayList<Invoice>();
		
		Invoice inv1 = new Invoice(101, "Ramesh", 4500);
		
		Invoice inv2 = new Invoice(102, "Rakesh", 5500);
		
		Invoice inv3 = new Invoice(103, "Rajesh", 3500);
		
		
		
		invoiceList.add(inv1);
		invoiceList.add(inv2);
		invoiceList.add(inv3);
		
		boolean result = obj.writeDetails(invoiceList);
		
		System.out.println("File Created" + result);
		
		System.out.println("Redaing from the file");
		System.out.println("=============");
		
		//List <Invoice> invList = (List<Invoice>)obj.readDetails();
		
		for(Invoice inv: invoiceList){
			System.out.println(inv);
		}
	}
}
