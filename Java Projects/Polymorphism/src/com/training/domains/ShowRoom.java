package com.training.domains;
import com.training.ifaces.IAutomobile;

public class ShowRoom {

	
	public IAutomobile getProduct(int ch)
	{
		IAutomobile auto = null;
		
		switch(ch){
		case 1:
			
			auto = new MarutiCar();
			break;
		case 2:
			auto = new ToyotaCar();
			break;
		case 3:
			auto = new HyundaiCar();
			break;
		}
		
		return auto;
	}

   /** This Method shows The Working of Dynamic Dispatch
   *  also Called as Run Time polymorphism
   *  It print The Details of the Referenced Object
   * @param polyAuto
   */
public void printQuote(IAutomobile polyAuto)
{
System.out.println(IAutomobile.SHOWROOMNAME);
System.out.println("Model :=" + polyAuto.getModel());
System.out.println("Color :=" + polyAuto.getColour());
System.out.println("Price :=" + polyAuto.getPrice());

}
}
