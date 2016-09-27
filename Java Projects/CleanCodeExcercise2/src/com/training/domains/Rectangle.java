/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class Rectangle extends GeometricShape{
  
  private double length;
  private double width;

  
  @Override
  public double calculateArea() {
    return length*width;
  
  }


  /**
   * 
   */
  public Rectangle() {
  super();
  // TODO Auto-generated constructor stub
  }


  /**
   * @param length
   * @param width
   */
  public Rectangle(double length, double width) {
  super();
  this.length = length;
  this.width = width;
  }


  /**
   * @return the length
   */
  public double getLength() {
  return length;
  }


  /**
   * @param length the length to set
   */
  public void setLength(double length) {
  this.length = length;
  }


  /**
   * @return the width
   */
  public double getWidth() {
  return width;
  }


  /**
   * @param width the width to set
   */
  public void setWidth(double width) {
  this.width = width;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Rectangle [length=" + length + ", width=" + width + "]";
  }
  
  
  
}
