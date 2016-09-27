/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class Square extends GeometricShape{
  
  private double side;
  
  @Override
  public double calculateArea() {
    return (side * side);
  
  }

  /**
   * 
   */
  public Square() {
  super();
  // TODO Auto-generated constructor stub
  }

  /**
   * @param side
   */
  public Square(double side) {
  super();
  this.side = side;
  }

  /**
   * @return the side
   */
  public double getSide() {
  return side;
  }

  /**
   * @param side the side to set
   */
  public void setSide(double side) {
  this.side = side;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Square [side=" + side + "]";
  }
  
   
}
