/**

 * 
 */

package com.training.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

import com.training.entity.Validate;
import com.training.utils.MySQLConnection;

/**
 * @author hgarg1.
 *
 *
 */

public class ValidateLoginDAO {
  
  private Connection con = null;

  /**
  * 
	*/
  public ValidateLoginDAO() {
    super();
    con = MySQLConnection.getMyOracleConnection();
    
    System.out.println(con);
  }

	/**
	 * @param con.
	 */
  
	public ValidateLoginDAO(Connection con) {
		super();
		this.con = con;
	}
	

  public int add(Validate userObj) {
    int rowAdded = 0;
    
    try{
      
      String sql = "insert into user_login values(?,?,?)";
      
      PreparedStatement pstmt = con.prepareStatement(sql);
      
      pstmt.setInt(1,  userObj.getUid());
      pstmt.setString(2,  userObj.getUserName());
      pstmt.setString(3,  userObj.getPassWord());
      
      rowAdded = pstmt.executeUpdate();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return rowAdded;
  }
  
  public String find(String userName) {
  
  Validate userObj = new Validate();
  try{
      
       Statement stmt  = con.createStatement();
       ResultSet rs = stmt.executeQuery("select password from user_login where username = '"+userName+"'");
       while(rs.next()){
         userObj.setPassWord(rs.getString("password"));                   
       }
  }
  catch(Exception e){
    e.printStackTrace();
  }
  return userObj.getPassWord();
  

}
}

