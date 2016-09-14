/**
 * 
 */
package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.training.domain.TaxiUser;
import com.training.utils.MySQLConnection;

/**
 * @author hgarg1
 *
 */
public class ValidateUser {

  private Connection con = null;
  private static final Logger log = Logger.getRootLogger();
  
  public ValidateUser() {
  super();
  con = MySQLConnection.getMyOracleConnection();
  
  log.debug(con);
  }
  
  public ValidateUser(Connection con) {
  super();
  this.con = con;
  }
  
public TaxiUser find(String email, String password, String city) {
  
  log.debug("db" + email);
  log.debug("db" + password);
  log.debug("db" + city);
  TaxiUser userObj = new TaxiUser();
  //boolean result = false;
  try{
    
    log.debug("in try");
    String sql = "select * from TAXIUSER where email = ? and password = ? and city = ?";
    
    PreparedStatement pstmt  = con.prepareStatement(sql);
    
    pstmt.setString(1, email);
    pstmt.setString(2, password);
    pstmt.setString(3, city);
    
    ResultSet resultSet = pstmt.executeQuery();
    
   
    
    if(resultSet.next())
    {
      
      long telephone = resultSet.getLong("telephone");
      log.debug("tele" + telephone);
      String name = resultSet.getString("name");
      userObj.setTelephone(telephone); 
      userObj.setName(name);    
      log.debug("in-if-db" + userObj);
    }
    
   
  }
  catch(Exception e){
    e.printStackTrace();
  }
 
  return userObj;
  

}

  public int add(TaxiUser user) {
    int rowAdded = 0;
  
    try{
    
      String sql = "insert into TAXIUSER values(?,?,?,?,?)";
    
      PreparedStatement pstmt = con.prepareStatement(sql);
    
      pstmt.setString(1,  user.getEmail());
      pstmt.setString(2,  user.getPassword());
      pstmt.setLong(3,  user.getTelephone());
      pstmt.setString(4,  user.getCity());
      pstmt.setString(5,  user.getName());
    
      rowAdded = pstmt.executeUpdate();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return rowAdded;
  }

/*Unit Test Cases
 * 
 * 
 */

  public void validateUser(){
  
    TaxiUser result = find("user1@example.com", "hello", "Chicago");
  
    if(result != null){
    
      log.debug("Test Case Passed");
    }

  }

  public void inValidateUser(){

  TaxiUser result = find("test@example.com", "test", "testCity");
  if(result.getName() == null){
    log.debug("Test Case Passed");
    }
  }
  
  public void addUser(){
  
    int result = add(new TaxiUser("user2@example.com", "hello1", 87654, "Delhi", "user2"));

    if(result == 1){
  
      log.debug("Test Case Passed");
    }
  
    else{
      log.debug("Test Case Failed");
    }
  }


  
  public static void main(String[] args) {
  
  ValidateUser obj = new ValidateUser();
     obj.validateUser();
     obj.inValidateUser();
     obj.addUser();
     
  }
}
