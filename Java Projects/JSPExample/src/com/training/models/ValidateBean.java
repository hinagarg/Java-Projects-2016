/**
 * 
 */
package com.training.models;

//import java.util.HashMap;
import com.training.daos.ValidateLoginDAO;
//import com.training.entity.Validate;

/**
 * @author hgarg1
 *
 */
public class ValidateBean {
  
  //private HashMap<String, String> loginCredentials;
  //private Validate loginCredentials;
  ValidateLoginDAO dao = new ValidateLoginDAO();

  /**
   * 
   */
  public ValidateBean() {
  super();
   //new  Validate(1, "Admin", "admin");
    //loginCredentials = new Validate(1, "Admin", "admin");
  }
  
  /*private void init(){
  
    loginCredentials.put("admin", "admin");
    loginCredentials.put("jerry", "india");
    loginCredentials.put("blake", "chicago");
    loginCredentials.put("rita", "cali");
  
  }
  
  private void init_data(){
  
   
    
    
    int rowAdded = dao.add(loginCredentials);
    System.out.println("Rows[s] Added :=" + rowAdded);
  

  }*/
  
  private String select_data(String uname){
    
    
    System.out.println(uname);
    String passWord = dao.find(uname);
    System.out.println(passWord);
    return passWord;


  }
  
  public Boolean getValidateLogin(String uname, String pwd){
  
    //init_data();
    
  
    if(select_data(uname).equals(pwd)) {
    
      return true;
    }
  
    else{
    
      return false;
    }
    }

  } 
