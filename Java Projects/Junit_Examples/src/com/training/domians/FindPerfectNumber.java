/**
 * 
 */
package com.training.domians;

/**
 * @author hgarg1
 *
 */
public class FindPerfectNumber {
	
	public boolean checkPerfectNumber(int number){
		int temp = 0;
        for(int i=1;i<=number/2;i++){
            if(number%i == 0){
                temp += i;
            }   
        }
        if(temp == number){
            System.out.println("It is a perfect number");
            return true;
        } else {
            System.out.println("It is not a perfect number");
            return false;
        }
		
	
		
	}
}
