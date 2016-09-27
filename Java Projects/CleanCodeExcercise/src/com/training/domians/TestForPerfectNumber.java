/**
 * 
 */
package com.training.domians;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * @author hgarg1
 *
 */
public class TestForPerfectNumber {
  
  SingleResponsibility testObj;
  
  @Before
  public void init(){
    testObj = new SingleResponsibility();
  }
  
  
  @Test
  public void testIsValidInput(){   
    boolean result = testObj.isValidInput(6);
    assertEquals(true, result);
  }
  
  @Test
  public void testIsNotValidInput(){   
    boolean result = testObj.isValidInput(-6);
    assertEquals(false, result);
  }
  @Test
  public void testIsPerfect(){   
    boolean actual = testObj.isPerfect(6);
    assertEquals(true, actual);
  }
  
  @Test
  public void testIsNotPerfect(){   
    boolean actual = testObj.isPerfect(7);
    assertEquals(false, actual);
  }

}
