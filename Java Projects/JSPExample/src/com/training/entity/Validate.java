/**
 * 
 */
package com.training.entity;


/**
 * @author hgarg1
 *
 */
public class Validate {
  
  private int uid;
  private String userName;
  private String passWord;
  /**
   * 
   */
  public Validate() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param userName
   * @param passWord
   */
  public Validate(int uid, String userName, String passWord) {
  super();
  this.uid = uid;
  this.userName = userName;
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
  public int getUid() {
  return uid;
  }
  public void setUid(int uid) {
  this.uid = uid;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  
    StringBuffer buffer = new StringBuffer();
    
    buffer.append(passWord);
    return buffer.toString();
  }
  
  
  
}
