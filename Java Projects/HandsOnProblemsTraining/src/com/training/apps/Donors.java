package com.training.apps;

public class Donors {

	public String donorName;
	public String donorEmailId;
	public int donorAmountDonated;
	public int donorProductId;
	
	public Donors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donors(String donorName, String donorEmailId, int donorAmountDonated, int donorProductId) {
		super();
		this.donorName = donorName;
		this.donorEmailId = donorEmailId;
		this.donorAmountDonated = donorAmountDonated;
		this.donorProductId = donorProductId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getDonorEmailId() {
		return donorEmailId;
	}

	public void setDonorEmailId(String donorEmailId) {
		this.donorEmailId = donorEmailId;
	}

	public int getDonorAmountDonated() {
		return donorAmountDonated;
	}

	public void setDonorAmountDonated(int donorAmountDonated) {
		this.donorAmountDonated = donorAmountDonated;
	}

	public int getDonorProductId() {
		return donorProductId;
	}

	public void setDonorProductId(int donorProductId) {
		this.donorProductId = donorProductId;
	}	
	
}
