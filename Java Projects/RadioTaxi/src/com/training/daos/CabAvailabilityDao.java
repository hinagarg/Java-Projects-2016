/**
 * 
 */
package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.training.domain.Cab;
import com.training.utils.MySQLConnection;

/**
 * @author hgarg1
 *
 */
public class CabAvailabilityDao {
  private Connection con = null;
  private static final Logger log = Logger.getRootLogger();

  /**
   * 
   */
  public CabAvailabilityDao() {
    super();
  
    con = MySQLConnection.getMyOracleConnection();
  
    log.debug(con);
  }

  /**
   * @param con
   */
  public CabAvailabilityDao(Connection con) {
  super();
  this.con = con;
  }
  
  public List<Cab> find(String pickUpLocation, String dropLocation) {
    
    //Cab cab = new Cab();
    ArrayList<Cab> cab = new ArrayList<Cab>();
    try{
      
      String sql = "select * from CAB where picklocation = ? and droplocation = ?";
      
      PreparedStatement pstmt  = con.prepareStatement(sql);
      
      pstmt.setString(1, pickUpLocation);
      pstmt.setString(2, dropLocation);
   
      
      ResultSet resultSet = pstmt.executeQuery();
      
     
      
      while(resultSet.next())
      {
        
        long cabNumber = resultSet.getLong("cabnumber");
        String cabType = resultSet.getString("type");
        String driverName = resultSet.getString("drivername");
        String location = resultSet.getString("location");
        Cab user = new Cab(cabNumber,cabType,driverName,location);
        log.debug(user);
        cab.add(user);
      }
      
     
    }
    catch(Exception e){
      e.printStackTrace();
    }
    
    log.debug("out-db" + cab);
    return cab;
    

  }
  
  public void validateFind(){
  
  ArrayList<Cab> result = new ArrayList<Cab>();
      
  result = (ArrayList<Cab>) find("Sector-24", "Sector-20");

  if(result != null){
      log.debug(result);
      log.debug("Test Case Passed");
    }

  }
  
  public static void main(String[] args) {
  
     CabAvailabilityDao obj = new CabAvailabilityDao();
     obj.validateFind();
     
    }

}
