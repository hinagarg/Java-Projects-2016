package com.training.domains;

import com.training.ifaces.IAutomobile;

public class Bike implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 30000;
	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "Brown";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "HarleyDavidson";
	}

}
