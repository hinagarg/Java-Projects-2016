package com.training.domains;

import com.training.ifaces.IAutomobile;

public class MarutiCar implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 600000;
	}
/** Method Returns
 * 
 */
	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		return "GREEN";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Maruti";
	}
	

}
