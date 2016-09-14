/**
 * 
 */
package com.training.models;

import org.apache.log4j.Logger;

import com.training.daos.ValidateUser;
import com.training.domain.TaxiUser;


/**
 * @author hgarg1
 *
 */
public class ValidateUserBean {

  /**
   * 
   */
  private static final Logger log = Logger.getRootLogger();
  ValidateUser dao = new ValidateUser();
 
  
  public ValidateUserBean() {
  super();
  // TODO Auto-generated constructor stub
  }

  public TaxiUser validate(String email, String password, String city){
    

    log.debug("validate" + email);
    TaxiUser result = dao.find(email.trim(), password.trim(), city.trim());
    return result;
    
    
  }
  
}