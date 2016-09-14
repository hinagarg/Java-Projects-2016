/**
 * 
 */
package com.training.entity;

/**
 * @author hgarg1
 *
 */
public class Project {

	 private int projectCode;
	 private String projectName;
	 private String projectDescription;
	 private int projectCost;	
	 private double moneyCollected;
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
	 */
	public Project(int projectCode, String projectName, String projectDescription, int projectCost) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectCost = projectCost;
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
	
	public String getProjectName() {
  return projectName;
  }
  public void setProjectName(String projectName) {
  this.projectName = projectName;
  }
  
	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(projectCode).append(" ").append(projectName).append(" ").append(projectDescription).append(" ").append(projectCost);
		
		return buffer.toString();
	}
	public double getMoneyCollected() {
		return moneyCollected;
	}
	public void setMoneyCollected(double moneyCollected) {
		this.moneyCollected = moneyCollected;
	}
	 
	public double donateMoney(int projectCode, double amount){
		if(projectCode == 101){
			moneyCollected = amount;
		}
		if(projectCode == 102){
			moneyCollected = amount;
		}
		if(projectCode == 103){
			moneyCollected = amount;
		}
			return moneyCollected;
	}
  
	
	//public static void 
	
}
