/**
 * 
 */
package com.training.entity;

/**
 * @author hgarg1
 *
 */
public class Image {

  private int pCode;
  private String imagePath1;
  private String imagePath2;
  private String imagePath3;
  /**
   * 
   */
  public Image() {
  super();
  // TODO Auto-generated constructor stub
  }
  
  /**
   * @param pCode
   * @param imagePath1
   * @param imagePath2
   * @param imagePath3
   */
  public Image(int pCode, String imagePath1, String imagePath2, String imagePath3) {
  super();
  this.pCode = pCode;
  this.imagePath1 = imagePath1;
  this.imagePath2 = imagePath2;
  this.imagePath3 = imagePath3;
  }

  /**
   * @return the pCode
   */
  public int getpCode() {
  return pCode;
  }
  /**
   * @param pCode the pCode to set
   */
  public void setpCode(int pCode) {
  this.pCode = pCode;
  }

  public String getImagePath1() {
  return imagePath1;
  }
  public void setImagePath1(String imagePath1) {
  this.imagePath1 = imagePath1;
  }
  public String getImagePath2() {
  return imagePath2;
  }
  public void setImagePath2(String imagePath2) {
  this.imagePath2 = imagePath2;
  }
  public String getImagePath3() {
  return imagePath3;
  }
  public void setImagePath3(String imagePath3) {
  this.imagePath3 = imagePath3;
  }
  
  @Override
  public String toString() {
    
    StringBuffer buffer = new StringBuffer();
    
    buffer.append(pCode).append(" ").append(imagePath1).append(" ").append(imagePath2).append(" ").append(imagePath3);
    
    return buffer.toString();
  }
  
}
