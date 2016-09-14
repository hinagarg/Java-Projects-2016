/**
 * 
 */
package com.training.domains;

/**Represents the Donors to various Service Project.
 * @author hgarg1
 *
 */
public class Donor implements Comparable<Donor>{
	
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Donor obj) {
		if(this.handPhone > obj.handPhone) return 1;
		if(this.handPhone < obj.handPhone) return -1;
		return 0;
	}

	private long donorCode;
	private String donorName;
	private long handPhone;
	private String email;
	
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
	public Donor(long donorCode, String donorName, long handPhone, String email) {
		super();
		this.donorCode = donorCode;
		this.donorName = donorName;
		this.handPhone = handPhone;
		this.email = email;
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
		
		buffer.append(donorCode).append(".").append(donorName).append(".").append("handPhone").append(email);
		
		return buffer.toString();
	}

	
	
	
}
