package com.training.domains;
import com.training.ifaces.IAutomobile;
public class NewShowRoom extends ShowRoom {

	@Override
	public IAutomobile getProduct(int ch) {
		// TODO Auto-generated method stub
		
		IAutomobile auto = null;
		if(ch == 4)
		{
			auto = new Bike();
		}
		else 
		{
			
			auto = super.getProduct(ch);
		}
		return auto;
	}

}
