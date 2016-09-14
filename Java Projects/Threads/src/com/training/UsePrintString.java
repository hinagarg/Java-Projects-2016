/**
 * 
 */
package com.training;

/**
 * @author hgarg1
 *
 */
public class UsePrintString implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	private String str1;
	private String str2;
	
	public UsePrintString(String str1, String str2){
		
		super();
		this.str1 = str1;
		this.str2 = str2;
		Thread t = new Thread(this);
		
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintStrings.print(str1, str2);
	}

}
