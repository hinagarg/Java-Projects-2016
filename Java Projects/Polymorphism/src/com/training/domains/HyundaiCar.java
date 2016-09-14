package com.training.domains;

import com.training.ifaces.IAutomobile;

public class HyundaiCar implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Hyundai";
	}
	
	
}
