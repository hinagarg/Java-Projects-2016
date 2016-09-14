/**
 * 
 */
package com.training.domain;

/**
 * @author hgarg1
 *
 */
public class Cab {
  
  private long cabNumber;
  private String cabType;
  private String driverName;
  private String location;
  /**
   * 
   */
  public Cab() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param cabNumber
   * @param cabType
   * @param driverName
   * @param location
   */
  public Cab(long cabNumber, String cabType, String driverName, String location) {
  super();
  this.cabNumber = cabNumber;
  this.cabType = cabType;
  this.driverName = driverName;
  this.location = location;
  }
  /**
   * @return the cabNumber
   */
  public long getCabNumber() {
  return cabNumber;
  }
  /**
   * @param cabNumber the cabNumber to set
   */
  public void setCabNumber(long cabNumber) {
  this.cabNumber = cabNumber;
  }
  /**
   * @return the cabType
   */
  public String getCabType() {
  return cabType;
  }
  /**
   * @param cabType the cabType to set
   */
  public void setCabType(String cabType) {
  this.cabType = cabType;
  }
  /**
   * @return the driverName
   */
  public String getDriverName() {
  return driverName;
  }
  /**
   * @param driverName the driverName to set
   */
  public void setDriverName(String driverName) {
  this.driverName = driverName;
  }
  /**
   * @return the location
   */
  public String getLocation() {
  return location;
  }
  /**
   * @param location the location to set
   */
  public void setLocation(String location) {
  this.location = location;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Cab [cabNumber=" + cabNumber + ", cabType=" + cabType + ", driverName=" + driverName + ", location="
      + location + "]";
  }
  
  
}
