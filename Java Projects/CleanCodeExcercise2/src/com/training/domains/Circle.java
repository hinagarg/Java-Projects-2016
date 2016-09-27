/**
 * 
 */
package com.training.domains;

/**
 * @author hgarg1
 *
 */
public class Circle extends GeometricShape{
  
  private double radius;
  
  @Override
  public double calculateArea() {

    return (3.14 * radius * radius);
  
  }

  /**
   * 
   */
  public Circle() {
  super();
  // TODO Auto-generated constructor stub
  }

  /**
   * @param radius
   */
  public Circle(double radius) {
  super();
  this.radius = radius;
  }

  /**
   * @return the radius
   */
  public double getRadius() {
  return radius;
  }

  /**
   * @param radius the radius to set
   */
  public void setRadius(double radius) {
  this.radius = radius;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Circle [radius=" + radius + "]";
  }

  
}
