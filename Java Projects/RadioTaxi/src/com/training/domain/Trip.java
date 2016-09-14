/**
 * 
 */
package com.training.domain;

/**
 * @author hgarg1
 *
 */
public class Trip {

  private long tripId;
  private String startLocation;
  private String EndLocation;
  private String vehicleName;
  private long customerId;
  private long farePaid;
  private String status;
  private String customerName;
  /**
   * 
   */
  public Trip() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param tripId
   * @param startLocation
   * @param endLocation
   * @param vehicleName
   * @param customerId
   * @param farePaid
   * @param status
   * @param customerName
   */
  public Trip(long tripId, String startLocation, String endLocation, String vehicleName, long customerId, long farePaid,
      String status, String customerName) {
  super();
  this.tripId = tripId;
  this.startLocation = startLocation;
  EndLocation = endLocation;
  this.vehicleName = vehicleName;
  this.customerId = customerId;
  this.farePaid = farePaid;
  this.status = status;
  this.customerName = customerName;
  }
  /**
   * @return the tripId
   */
  public long getTripId() {
  return tripId;
  }
  /**
   * @param tripId the tripId to set
   */
  public void setTripId(long tripId) {
  this.tripId = tripId;
  }
  /**
   * @return the startLocation
   */
  public String getStartLocation() {
  return startLocation;
  }
  /**
   * @param startLocation the startLocation to set
   */
  public void setStartLocation(String startLocation) {
  this.startLocation = startLocation;
  }
  /**
   * @return the endLocation
   */
  public String getEndLocation() {
  return EndLocation;
  }
  /**
   * @param endLocation the endLocation to set
   */
  public void setEndLocation(String endLocation) {
  EndLocation = endLocation;
  }
  /**
   * @return the vehicleName
   */
  public String getVehicleName() {
  return vehicleName;
  }
  /**
   * @param vehicleName the vehicleName to set
   */
  public void setVehicleName(String vehicleName) {
  this.vehicleName = vehicleName;
  }
  /**
   * @return the customerId
   */
  public long getCustomerId() {
  return customerId;
  }
  /**
   * @param customerId the customerId to set
   */
  public void setCustomerId(long customerId) {
  this.customerId = customerId;
  }
  /**
   * @return the farePaid
   */
  public long getFarePaid() {
  return farePaid;
  }
  /**
   * @param farePaid the farePaid to set
   */
  public void setFarePaid(long farePaid) {
  this.farePaid = farePaid;
  }
  /**
   * @return the status
   */
  public String getStatus() {
  return status;
  }
  /**
   * @param status the status to set
   */
  public void setStatus(String status) {
  this.status = status;
  }
  /**
   * @return the customerName
   */
  public String getCustomerName() {
  return customerName;
  }
  /**
   * @param customerName the customerName to set
   */
  public void setCustomerName(String customerName) {
  this.customerName = customerName;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Trip [tripId=" + tripId + ", startLocation=" + startLocation + ", EndLocation=" + EndLocation
      + ", vehicleName=" + vehicleName + ", customerId=" + customerId + ", farePaid=" + farePaid + ", status=" + status
      + ", customerName=" + customerName + "]";
  }
  
  
}
