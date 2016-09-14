package com.training.domains;

import com.training.ifaces.IAutomobile;

public class ToyotaCar implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 897777;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyota";
	}

}
