/**
 * 
 */
package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;


import com.training.domain.Trip;
import com.training.utils.MySQLConnection;

/**
 * @author hgarg1
 *
 */
public class TripsDao {
  
  private Connection con = null;

  /**
   * 
   */
  public TripsDao() {
    super();
    con = MySQLConnection.getMyOracleConnection();
  }

  /**
   * @param con
   */
  public TripsDao(Connection con) {
  super();
  this.con = con;
  }
  
  public int addTrip(Trip trip) {
  int rowAdded = 0;

  try{
  
      String sql = "insert into TRIPS values(?,?,?,?,?,?,?,?)";
  
      PreparedStatement pstmt = con.prepareStatement(sql);
  
      pstmt.setLong(1,  trip.getTripId());
      pstmt.setString(2,  trip.getStartLocation());
      pstmt.setString(3,    trip.getEndLocation());
      pstmt.setString(4,  trip.getVehicleName());
      pstmt.setLong(5,  5000);
      pstmt.setString(5,  "New Trip");
      pstmt.setString(5,  trip.getCustomerName());
  
      rowAdded = pstmt.executeUpdate();
    }
    catch(Exception e){
    e.printStackTrace();
  }
  return rowAdded;
}

}
