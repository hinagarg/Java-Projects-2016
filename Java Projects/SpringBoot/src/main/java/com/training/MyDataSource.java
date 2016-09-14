/**
 * 
 */
package com.training;

import org.springframework.stereotype.Component;

/**
 * @author hgarg1
 *
 */
//@Component
public class MyDataSource {

  private String driverClass;
  private String jdbcURL;
  /**
   * 
   */
  public MyDataSource() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param driverClass
   * @param jdbcURL
   */
  public MyDataSource(String driverClass, String jdbcURL) {
  super();
  this.driverClass = driverClass;
  this.jdbcURL = jdbcURL;
  }
  /**
   * @return the driverClass
   */
  public String getDriverClass() {
  return driverClass;
  }
  /**
   * @param driverClass the driverClass to set
   */
  public void setDriverClass(String driverClass) {
  this.driverClass = driverClass;
  }
  /**
   * @return the jdbcURL
   */
  public String getJdbcURL() {
  return jdbcURL;
  }
  /**
   * @param jdbcURL the jdbcURL to set
   */
  public void setJdbcURL(String jdbcURL) {
  this.jdbcURL = jdbcURL;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "MyDataSource [driverClass=" + driverClass + ", jdbcURL=" + jdbcURL + "]";
  }
  
  
}
