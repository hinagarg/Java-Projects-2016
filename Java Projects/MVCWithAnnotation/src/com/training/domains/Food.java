/**
 * 
 */
package com.training.domains;

//import org.springframework.format.annotation.NumberFormat;
//import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Component;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
/**
 * @author hgarg1
 *
 */
@Component
public class Food {
  
  //@NotNull
  @Min(value = 1)
  @Max(value = 100)
  //@NumberFormat(style = Style.NUMBER)
  //@Pattern(regexp="[0-9]{3}")
  private Long foodCode;
  
  @NotEmpty(message = "description must not be blank.")
  private String description;
  private double unitPrice;
  
  private String cuisine;
  
  /**
   * 
   */
  public Food() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param foodCode
   * @param description
   * @param unitPrice
   */
  public Food(long foodCode, String description, double unitPrice) {
  super();
  this.foodCode = foodCode;
  this.description = description;
  this.unitPrice = unitPrice;
  }
  /**
   * @return the foodCode
   */
  public long getFoodCode() {
  return foodCode;
  }
  /**
   * @param foodCode the foodCode to set
   */
  public void setFoodCode(long foodCode) {
  this.foodCode = foodCode;
  }
  /**
   * @return the description
   */
  public String getDescription() {
  return description;
  }
  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
  this.description = description;
  }
  /**
   * @return the unitPrice
   */
  public double getUnitPrice() {
  return unitPrice;
  }
  /**
   * @param unitPrice the unitPrice to set
   */
  public void setUnitPrice(double unitPrice) {
  this.unitPrice = unitPrice;
  }
 
  public String getCuisine() {
  return cuisine;
  }
  public void setCuisine(String cuisine) {
  this.cuisine = cuisine;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Food [foodCode=" + foodCode + ", description=" + description + ", unitPrice=" + unitPrice + ", cuisine="
      + cuisine + "]";
  }
  
  
}
