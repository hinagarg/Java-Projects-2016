/**
 * 
 */
package com.training.entity;

/**Represents the Donors to various Service Project.
 * @author hgarg1
 *
 */
public class Donor{
	
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */

	private long donorCode;
	private String donorName;
	private long handPhone;
	private String email;
	private int projectCode;
	
	/**
	 * 
	 */
	
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param donorCode
	 * @param donorName
	 * @param handPhone
	 * @param email
	 */
	public Donor(long donorCode, String donorName, long handPhone,  String email, int projectCode) {
		super();
		this.donorCode = donorCode;
		this.donorName = donorName;
		this.handPhone = handPhone;
		this.email = email;
		this.projectCode = projectCode;
	}

	/**
	 * @return the donorCode
	 */
	public long getDonorCode() {
		return donorCode;
	}

	/**
	 * @param donorCode the donorCode to set
	 */
	public void setDonorCode(long donorCode) {
		this.donorCode = donorCode;
	}

	/**
	 * @return the donorName
	 */
	public String getDonorName() {
		return donorName;
	}

	/**
	 * @param donorName the donorName to set
	 */
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	/**
	 * @return the handPhone
	 */
	public long getHandPhone() {
		return handPhone;
	}

	/**
	 * @param handPhone the handPhone to set
	 */
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(donorCode).append(" ").append(donorName).append(" ").append("handPhone").append(" ").append(email);
		
		return buffer.toString();
	}

  public int getProjectCode() {
  return projectCode;
  }

  public void setProjectCode(int projectCode) {
  this.projectCode = projectCode;
  }

	
	
	
}