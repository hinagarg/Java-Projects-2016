package com.training.apps;
import java.util.Scanner;

import com.training.problems.AbstractPortal;
import com.training.problems.CancerCure;
import com.training.problems.OldAgeHome;
import com.training.problems.PrimaryEducation;

/**
 * 
 * @author hgarg1.
 *
 */

public class Application {
  /**
   * 
   * @param portal2.
   */
  public static void printDetails(AbstractPortal[] portal2) {
    if (portal2 instanceof CancerCure[]) {
      System.out.println("You are printing the product details of Cancer Cure Project");
      CancerCure[] obj = (CancerCure[])portal2;
      for (int i = 0; i < obj.length; i++) {
        System.out.println("Product Detail For Product number " + (i + 1));
        obj[i].printProjectDetails();
      }
    }

    if (portal2 instanceof OldAgeHome[]) {
      System.out.println("You are printing the product details of Old Age Home Project");
      OldAgeHome[] obj = (OldAgeHome[])portal2;
      for (int i = 0; i < obj.length; i++) {
        System.out.println("Product Detail For Product number " + (i + 1));
        obj[i].printProjectDetails();
      }
    }

    if (portal2 instanceof PrimaryEducation[]) {
      System.out.println("You are printing the product details of Primary Education Care Project");
      PrimaryEducation[] obj = (PrimaryEducation[])portal2;
      for (int i = 0; i < obj.length; i++) {
        System.out.println("Product Detail For Product number " + (i + 1));
        obj[i].printProjectDetails();
      }
    }
  }
  
  /**
   * 
   * @param portal1.
   */
  
  public static void addDetails(AbstractPortal[] portal1) {
    if (portal1 instanceof CancerCure[]) {
      System.out.println("You are adding the product details in Cancer Cure Project");
      CancerCure[] obj = (CancerCure[])portal1;
      for (int i = 0; i < obj.length; i++) {
        CancerCure singleItem = new CancerCure();
        System.out.println("Add Product Detail For Product number " + (i + 1));
        singleItem.addProjectDetails();
        obj[i] = singleItem;
      }
    }
    if (portal1 instanceof OldAgeHome[]) {
      System.out.println("You are adding the product details in Old Age Home Project");
      OldAgeHome[] obj = (OldAgeHome[])portal1;
      for (int i = 0; i < obj.length; i++) {
        OldAgeHome singleItem = new OldAgeHome();
        System.out.println("Add Product Detail For Product number " + (i + 1));
        singleItem.addProjectDetails();
        obj[i] = singleItem;
      }
    }
    if (portal1 instanceof PrimaryEducation[]) {
      System.out.println("You are adding the product details in Primary Education Project");
      PrimaryEducation[] obj = (PrimaryEducation[])portal1;
      for (int i = 0; i < obj.length; i++) {
        PrimaryEducation singleItem = new PrimaryEducation();
        System.out.println("Add Product Detail For Product number " + (i + 1));
        singleItem.addProjectDetails();
        obj[i] = singleItem;
      }
    }
  }
  
  /**
   * 
   * @param portal3.
   * @param projectId.
   * @param donorAmountDonated.
   */
  
  public static void donateAmount(AbstractPortal[] portal3, int projectId, int donorAmountDonated) {
    if (portal3 instanceof CancerCure[]) {
      System.out.println("You are donating money in Cancer Cure Project");
      CancerCure[] obj = (CancerCure[])portal3;
      for (int i = 0; i < obj.length; i++) {
        if ((i + 1) == projectId) {
          obj[i].amountCollected = obj[i].amountCollected + donorAmountDonated;
          System.out.println("Amount collected for product " + projectId + " in this project is" + obj[i].amountCollected);
        }
      }
    }
    if (portal3 instanceof OldAgeHome[]) {
      System.out.println("You are donating money in Old Age Home Project");
      OldAgeHome[] obj = (OldAgeHome[])portal3;
      for (int i = 0; i < obj.length; i++) {
        if ((i + 1) == projectId) {
          obj[i].amountCollected = obj[i].amountCollected + donorAmountDonated;
          System.out.println("Amount collected for product " + projectId + " in this project is" + obj[i].amountCollected);
          System.out.println("Amount pending for product " + projectId + " in this project is" + (obj[i].getProjectCost() - obj[i].getAmountCollected()));
        }
      }
    }
    if (portal3 instanceof PrimaryEducation[]) {
      System.out.println("You are donating money in Primary Education Project");
      PrimaryEducation[] obj = (PrimaryEducation[])portal3;
      for (int i = 0; i < obj.length; i++) {
        if ((i + 1) == projectId) {
          obj[i].amountCollected = obj[i].amountCollected +  donorAmountDonated;
          System.out.println("Amount collected for product " + projectId + " in this project is" + obj[i].amountCollected);
          System.out.println("Amount pending for product " + projectId + " in this project is" + (obj[i].getProjectCost() - obj[i].getAmountCollected()));
        }
      }
    }
  }
  
  /**
   * 
   * @param portal4.
   * @param donor.
   */

  public static void listProjectDonors(AbstractPortal[] portal4, Donors[] donor) {
    if (portal4 instanceof CancerCure[]) {
      System.out.println("You are printing the list of Donors for Project 1");
      CancerCure[] obj = (CancerCure[])portal4;
      for (int i = 0; i < donor.length; i++) {
        if (donor[i].getDonorProductId() == obj[i].getProjectId()) {
          System.out.println("Donor's name is: " + donor[i].getDonorName());
          System.out.println("Donor's email address is: " + donor[i].getDonorEmailId());
          System.out.println("Amount donated by this donor is: " + donor[i].getDonorAmountDonated());
        }
      }
    }
    if (portal4 instanceof OldAgeHome[]) {
      System.out.println("You are printing the list of Donors for Project 2");
      OldAgeHome[] obj = (OldAgeHome[])portal4;
      for (int i = 0; i < donor.length; i++) {
        if (donor[i].getDonorProductId() == obj[i].getProjectId()) {
          System.out.println("Donor's name is: " + donor[i].getDonorName());
          System.out.println("Donor's email address is: " + donor[i].getDonorEmailId());
          System.out.println("Amount donated by this donor is: " + donor[i].getDonorAmountDonated());
        }
      }
    }
    if (portal4 instanceof PrimaryEducation[]) {
      System.out.println("You are printing the list of Donors for Project 3");
      PrimaryEducation[] obj = (PrimaryEducation[])portal4;
      for (int i = 0; i < obj.length; i++) {
        if (donor[i].getDonorProductId() == obj[i].getProjectId()) {
          System.out.println("Donor's name is: " + donor[i].getDonorName());
          System.out.println("Donor's email address is: " + donor[i].getDonorEmailId());
          System.out.println("Amount donated by this donor is: " + donor[i].getDonorAmountDonated());
        }
      }
    }
  }
  
  /**
   * 
   * @param args.
   */

  public static void main(String[] args) {
    CancerCure[] project1 = new CancerCure[3];
    OldAgeHome[] project2 = new OldAgeHome[3];
    PrimaryEducation[] project3 = new PrimaryEducation[3];
    Donors donor1 = new Donors();
    Donors donor2 = new Donors();
    Donors donor3 = new Donors();
    Donors[] donor = {donor1, donor2, donor3};
    String flag = "y";
    int projectNumber;

    Scanner sc1 = new Scanner(System.in);
    while (flag.equals("y")) {
      System.out.println("Welcome Portal Admin! Add Product to Project 1, 2 or 3");
      projectNumber = sc1.nextInt();
      switch (projectNumber) {
        case 1:
          addDetails(project1);
          break;
        case 2:
          addDetails(project2);
          break;
        case 3:
          addDetails(project3);
          break;
        default:
          break;
      }
      System.out.println("If you wanna continue press y else press any other key");
      flag = sc1.next();
    }

    Scanner sc2 = new Scanner(System.in);

    for (int i = 0; i < donor.length; i++) {
      System.out.println("Welcome Donor " + (i + 1) + "! " + "Enter your name");
      donor[i].donorName = sc2.next();
      System.out.println("Enter your email address");
      donor[i].donorEmailId = sc2.next();
      flag = "y";
      while (flag.equals("y")) {
        System.out.println("Choose the project you wish to see among Project 1, 2 aand 3");
        projectNumber = sc2.nextInt();
        switch (projectNumber) {
          case 1:
            printDetails(project1);
            break;
          case 2:
            printDetails(project2);
            break;
          case 3:
            printDetails(project3);
            break;
          default:
            break;
        }
        System.out.println("If you wanna continue press y else press any other key");
        flag = sc2.next();
        System.out.println(flag);
      }
    }

    Scanner sc3 = new Scanner(System.in);
    for (int i = 0; i < donor.length; i++) {
      flag = "y";
      while (flag.equals("y")) {
        System.out.println("Welcome Donor" + i + "Donate the amount in project 1 ,2 or 3");
        projectNumber = sc3.nextInt();
        switch (projectNumber) {
          case 1:
            System.out.println("You are in Project 1. Enter the Product Id");
            donor[i].donorProductId = sc3.nextInt();
            System.out.println("You are in Project 1. Enter the amount you wish to donate");
            donor[i].donorAmountDonated = sc3.nextInt();
            donateAmount(project1, donor[i].donorProductId, donor[i].donorAmountDonated);
                
          case 2:
            System.out.println("You are in Project 2. Enter the Product Id");
            donor[i].donorProductId = sc3.nextInt();
            System.out.println("You are in Project 2. Enter the amount you wish to donate");
            donor[i].donorAmountDonated = sc3.nextInt();
            donateAmount(project1, donor[i].donorProductId, donor[i].donorAmountDonated);
            break;
          
          case 3:
            	  System.out.println("You are in Project 3. Enter the Product Id");
            	  donor[i].donorProductId = sc3.nextInt();
            	  System.out.println("You are in Project 3. Enter the amount you wish to donate");
            	  donor[i].donorAmountDonated = sc3.nextInt();
            	  donateAmount(project1, donor[i].donorProductId, donor[i].donorAmountDonated);
            	  break;
            }
            System.out.println("If you wanna continue press y else press any other key");
            flag = sc3.next();		
            }
      }

      Scanner sc4 = new Scanner(System.in); 
			flag = "y";
			while(flag.equals("y")){
				System.out.println("View Donor's list for the project 1 ,2 or 3");		
				projectNumber = sc4.nextInt();
				switch(projectNumber)
				{
				case 1:	
				listProjectDonors(project1, donor);
				break;
				
				case 2:
				listProjectDonors(project2, donor);
				break;
				
				case 3:
				listProjectDonors(project3, donor);
				break;
				}
				System.out.println("If you wanna continue press y else press any other key");
				flag = sc1.next();
			}
			sc1.close();
			sc2.close();
			sc3.close();
			sc4.close();
			return;
	}
	

}
