/**
 * 
 */
package com.training.domains;

import java.util.List;

/**
 * @author hgarg1
 *
 */
public class Project {

	 public int projectCode;
	 private String projectDescription;
	 private int projectCost;	
	 private double moneyCollected;
	
	 
	 
	 List<String> projectImgList;
	/**
	 * 
	 */
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param projectCode
	 * @param projectDescription
	 * @param projectCost
	 * @param projectImgArray
	 */
	public Project(int projectCode, String projectDescription, int projectCost,
			List<String> projectImgList) {
		super();
		this.projectCode = projectCode;
		this.projectDescription = projectDescription;
		this.projectCost = projectCost;
		this.projectImgList = projectImgList;
	}
	/**
	 * @return the projectCode
	 */
	public int getProjectCode() {
		return projectCode;
	}
	/**
	 * @param projectCode the projectCode to set
	 */
	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}
	/**
	 * @return the projectDescription
	 */
	public String getProjectDescription() {
		return projectDescription;
	}
	/**
	 * @param projectDescription the projectDescription to set
	 */
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	/**
	 * @return the projectCost
	 */
	public int getProjectCost() {
		return projectCost;
	}
	/**
	 * @param projectCost the projectCost to set
	 */
	public void setProjectCost(int projectCost) {
		this.projectCost = projectCost;
	}
	
	/**
	 * @return the projectImgArray
	 */
	public List<String> getProjectImgList() {
		return projectImgList;
	}
	/**
	 * @param projectImgArray the projectImgArray to set
	 */
	public void setProjectImgList(List<String> projectImgArray) {
		this.projectImgList = projectImgArray;
	}
	 
	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(projectCode).append(" ").append(projectDescription).append(" ").append(projectCost).append(" ").append(projectImgList);
		
		return buffer.toString();
	}
	public double getMoneyCollected() {
		return moneyCollected;
	}
	public void setMoneyCollected(double moneyCollected) {
		this.moneyCollected = moneyCollected;
	}
	 
	public double donateMoney(long donorCode, int donorProjectCode, double amount){
		if(donorProjectCode == 101){
			moneyCollected = amount;
		}
		if(donorProjectCode == 102){
			moneyCollected = amount;
		}
		if(donorProjectCode == 103){
			moneyCollected = amount;
		}
			return moneyCollected;
	}
	
	public void printDonorProjectList(){
		
		
	}
}
