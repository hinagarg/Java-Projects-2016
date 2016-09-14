/**
 * 
 */
package com.training.domain;


/**
 * @author hgarg1
 *
 */
public class TaxiUser {

  private String email;
  private String password;
  private long telephone;
  private String city;
  private String name;
  /**
   * 
   */
  public TaxiUser() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param email
   * @param password
   * @param telephone
   * @param city
   */
  public TaxiUser(String email, String password, long telephone, String city, String name) {
  super();
  this.email = email;
  this.password = password;
  this.telephone = telephone;
  this.city = city;
  this.name = name;
  }
  /**
   * @return the email
   */
  public String getEmail() {
  return email;
  }
  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
  this.email = email;
  }
  /**
   * @return the password
   */
  public String getPassword() {
  return password;
  }
  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
  this.password = password;
  }
  /**
   * @return the telephone
   */
  public long getTelephone() {
  return telephone;
  }
  /**
   * @param telephone the telephone to set
   */
  public void setTelephone(long telephone) {
  this.telephone = telephone;
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
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
 
  public String getName() {
  return name;
  }
  public void setName(String name) {
  this.name = name;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "TaxiUser [email=" + email + ", password=" + password + ", telephone=" + telephone + ", city=" + city
      + ", name=" + name + "]";
  }
  
 

  
  
  
}
