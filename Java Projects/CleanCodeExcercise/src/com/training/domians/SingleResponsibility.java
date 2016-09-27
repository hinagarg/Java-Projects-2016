/**
 * 
 */
package com.training.domians;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hgarg1
 *
 */
public class SingleResponsibility {

  List<Integer> factors = new ArrayList<Integer>();
  
  protected boolean isValidInput(int number) {
    if(number >= 6){
      return true;
    }
    else {
      return false;
    }  
  }

  protected void findFactors(int number) {
    int factorNum = 1;
  
    while(factorNum < number){
      if((number % factorNum) == 0){
        factors.add(factorNum);
      }
      factorNum ++;
    }
  
  }

  protected int sumFactors(int number) {
    int sumFactors = 0;
    findFactors(number);
    for(int i = 0; i < factors.size();i++){
      
      sumFactors = sumFactors + factors.get(i);
    }
    return sumFactors;
  }

  public boolean isPerfect(int number) {
    if(sumFactors(number) == number){
      return true;
    } 
    else {
      return false;
    }
  }

}
