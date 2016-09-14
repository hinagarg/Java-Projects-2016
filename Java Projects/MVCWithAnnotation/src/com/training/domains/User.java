/**
 * 
 */
package com.training.domains;

import org.springframework.stereotype.Component;

/**
 * @author hgarg1
 *
 */
@Component
public class User {

  private String userName;
  private long phoneNumber;
  private String passWord;
  /**
   * 
   */
  public User() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param userName
   * @param phoneNumber
   * @param passWord
   */
  public User(String userName, long phoneNumber, String passWord) {
  super();
  this.userName = userName;
  this.phoneNumber = phoneNumber;
  this.passWord = passWord;
  }
  /**
   * @return the userName
   */
  public String getUserName() {
  return userName;
  }
  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
  this.userName = userName;
  }
  /**
   * @return the phoneNumber
   */
  public long getPhoneNumber() {
  return phoneNumber;
  }
  /**
   * @param phoneNumber the phoneNumber to set
   */
  public void setPhoneNumber(long phoneNumber) {
  this.phoneNumber = phoneNumber;
  }
  /**
   * @return the passWord
   */
  public String getPassWord() {
  return passWord;
  }
  /**
   * @param passWord the passWord to set
   */
  public void setPassWord(String passWord) {
  this.passWord = passWord;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "User [userName=" + userName + ", phoneNumber=" + phoneNumber + ", passWord=" + passWord + "]";
  }
  
  
  
}
