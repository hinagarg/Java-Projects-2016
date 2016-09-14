/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class LoanFactory {
  
  public static LoanAccount getInstance(){
  
    return new PersonalLoan(8.0);
  }
  
  public static LoanAccount getInstance(String type){
  
  if(type == "PersonalLoan"){
    return new PersonalLoan(8.0);
  }
  else {
    
    return new HousingLoan(8.0);
  }
}

  private static  LoanAccount getLoanAccount(String type)
  {
  LoanAccount account=null;

  switch (type) {
  case  "PERSONALLOAN":
       account= new PersonalLoan(12.00);
  break;
  case "HOUSINGLOAN":
               account = new HousingLoan(13.00);
              break;
  default:
  account =null;
  }
  return account; 
        } 
   }


