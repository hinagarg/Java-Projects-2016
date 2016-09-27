/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class Address {

  private String street;
  private String city;
  private String zipCode;
  /**
   * 
   */
  public Address() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param street
   * @param city
   * @param zipCode
   */
  public Address(String street, String city, String zipCode) {
  super();
  this.street = street;
  this.city = city;
  this.zipCode = zipCode;
  }
  /**
   * @return the street
   */
  public String getStreet() {
  return street;
  }
  /**
   * @param street the street to set
   */
  public void setStreet(String street) {
  this.street = street;
  }
  /**
   * @return the city
   */
  public String getCity() {
  return city;
  }
  /**
   * @param city the city to set
   */
  public void setCity(String city) {
  this.city = city;
  }
  /**
   * @return the zipCode
   */
  public String getZipCode() {
  return zipCode;
  }
  /**
   * @param zipCode the zipCode to set
   */
  public void setZipCode(String zipCode) {
  this.zipCode = zipCode;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + "]";
  }
  
  

}
