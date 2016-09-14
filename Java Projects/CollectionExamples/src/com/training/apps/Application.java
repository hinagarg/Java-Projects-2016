package com.training.apps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.domains.Donor;
import com.training.domains.DonorImpl;
import com.training.utils.DonorCodeComparator;
import com.training.utils.NameComparator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Create a Instance Donor Impl
		 * 
		 * Add One Donor
		 * Print the List
		 * 
		 * Add More than one Donor using overloaded method
		 * 
		 * Add One More Donor
		 * invoke the method which returns list
		 * Iterate through the list and print
		 */
		
		DonorImpl objImpl = new DonorImpl();
		Donor objDonor = new Donor(101, "Angel", 987654234 , "angel@example.com");
	
		objImpl.addDonor(objDonor);
		objImpl.printDonorList();

		Donor donor1 = new Donor(102, "Rebecca", 987654276 , "rebecca@example.com");
		Donor donor2 = new Donor(103, "Jerry", 987654894 , "jerry@example.com");
		
		objImpl.addDonors(donor1, donor2);
	
		
		Donor donor3 = new Donor(103, "Rony", 987654766 , "ronny@example.com");
		objImpl.addDonor(donor3);
		
		
		List<Donor> donorList = objImpl.getDonorList();
		
		for(Donor obj: donorList){
			System.out.println(obj);
		}
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add(new String("Zahir"));
		nameList.add(new String("Abhi"));
		nameList.add(new String("Yasif"));
		nameList.add(new String("Babu"));
		
		
		Collections.sort(nameList);
		
		System.out.println(nameList);
		Collections.sort(donorList);
		objImpl.printDonorList();
		
		System.out.println("Sort By Name");
		objImpl.printbyOrder(new NameComparator());
		
		System.out.println("Sort By Donor Code");
		
		objImpl.printbyOrder(new DonorCodeComparator());
		
	
		
	}

}
