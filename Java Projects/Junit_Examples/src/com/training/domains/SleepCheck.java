package com.training.domains;

public class SleepCheck {
	
	public double getBalance(){


	try {
		Thread.sleep(100);
		} catch (InterruptedException e) {

		   e.printStackTrace();
		}

		return 1000.00;
}
}