package com.training.problems;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class OldAgeHome extends AbstractPortal {
	
	private int projectId;
	private String projectDescription;
	private int projectCost;
	public int amountCollected;
	private int amountPending;
	
	
	public OldAgeHome() {
		super();
	}
	
	
	public OldAgeHome(int projectId, String projectDescription, int projectCost, int amountCollected,
			int amountPending) {
		super();
		this.projectId = projectId;
		this.projectDescription = projectDescription;
		this.projectCost = projectCost;
		this.amountCollected = amountCollected;
		this.amountPending = amountPending;
	}

	
	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public String getProjectDescription() {
		return projectDescription;
	}


	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}


	public int getProjectCost() {
		return projectCost;
	}


	public void setProjectCost(int projectCost) {
		this.projectCost = projectCost;
	}


	public int getAmountCollected() {
		return amountCollected;
	}


	public void setAmountCollected(int amountCollected) {
		this.amountCollected = amountCollected;
	}


	public int getAmountPending() {
		return amountPending;
	}


	public void setAmountPending(int amountPending) {
		this.amountPending = amountPending;
	}


	@Override
	public void addProjectDetails() {
		System.out.println("Enter Your username");
		Scanner sc = new Scanner(System.in); 
		BufferedImage img = null;
		if(sc.hasNextLine()) 
		{
		String input = sc.next();
			
		if(input.equals("admin") ) {
			System.out.println("Enter the product id");
			int projectId = sc.nextInt();
			setProjectId(projectId);
			System.out.println("Enter the product description");
			String projectDescription = sc.next();
			setProjectDescription(projectDescription);
			System.out.println("Enter the product cost");
			int projectCost = sc.nextInt();
			setProjectCost(projectCost);
			try {
			    img = ImageIO.read(new File("images/1.png"));
			} catch (IOException e) {
				 e.printStackTrace();
			}
		}}
	}

	

	@Override
	public void addMoneyDonated() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printProjectDetails() {
		System.out.println("Product Id is:= " + getProjectId());	
		System.out.println("Product Description is:= " + getProjectDescription());	
		System.out.println("Product Cost is:= " + getProjectCost());	
		System.out.println("Amount Collected is:= " + getAmountCollected());	
		System.out.println("Amount Pending is:= " + (getProjectCost() - getAmountCollected()));	

	}

}
