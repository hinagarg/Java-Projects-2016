package com.training.domains;
import com.training.ifaces.IAutomobile;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowRoom showRoom = new NewShowRoom();
		
		System.out.println("Enter Your Choice 1-4");
		
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		
		IAutomobile polyAuto = showRoom.getProduct(ch);
		if(polyAuto != null)
		{
		  showRoom.printQuote(polyAuto);
		}
		else{
			System.out.println("Invalid Option Try Again");
		}
		  sc.close();
	}

}
