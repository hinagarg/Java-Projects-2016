/**
 * 
 */
package com.training.domains;


import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import com.training.idonors.Donor;
import com.training.idonors.DonorImpl;

/**
 * @author hgarg1
 *
 */
public class ProjectImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> projectImg = Arrays.asList("img_1", "img_2", "img_3");
		
		Project cancerCure = new Project(101, "CancerCure", 60000 , projectImg);
		Project oldageHome = new Project(102, "OldageHome", 90000 , projectImg);
		Project primaryEducation = new Project(103, "PrimaryEducation", 80000 , projectImg);
		
		ProjectManager obj = new ProjectManager();
				
		obj.addProjects(cancerCure, oldageHome, primaryEducation);
		obj.viewProjectDetails();
		
		
		Donor donor1 = new Donor(1, "Jerry", 9876546 , "jerry@example.com");
		Donor donor2 = new Donor(2, "Erika", 9876589 , "erika@example.com");
		Donor donor3 = new Donor(3, "Blake", 9876565 , "blake@example.com");
		
		DonorImpl obj2 = new DonorImpl();
		
		obj2.addDonors(donor1, donor2, donor3);
		obj2.printDonorList();
		
		
		Project obj3 = new Project();
		System.out.println(obj3.donateMoney(donor1.getDonorCode(), cancerCure.getProjectCode(), 1000.0));
		System.out.println(obj3.donateMoney(donor1.getDonorCode(), cancerCure.getProjectCode(), 2000.0));
		System.out.println(obj3.donateMoney(donor1.getDonorCode(), cancerCure.getProjectCode(), 3000.0));
		obj3.getMoneyCollected();
		
		
	}

}
