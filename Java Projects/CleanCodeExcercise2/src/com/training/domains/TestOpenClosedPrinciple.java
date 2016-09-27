/**
 * 
 */
package com.training.domains;

//import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * @author hgarg1
 *
 */
public class TestOpenClosedPrinciple {

GeometricShape testObj;
  
  
  @Test
  public void isCircle(){   
    double calulatedValue = new Circle(6).calculateArea();
    if ((double)(calulatedValue % (3.14 * 6 * 6)) == 0){
      System.out.println("Test Case Passed, The given shape is a Circle");
    }
  }
  
  @Test
  public void isRectangle(){   
    double calulatedValue = new Rectangle(6, 7).calculateArea();
    if ((double)(calulatedValue % (6 * 7)) == 0){
      System.out.println("Test Case Passed, The given shape is a rectangle");
    }
  }
  
  @Test
  public void isSquare(){   
    double calulatedValue = new Square(5).calculateArea();
    if ((double)(calulatedValue % (5 * 5)) == 0){
      System.out.println("Test Case Passed, The given shape is square");
    }
  }
  
}
