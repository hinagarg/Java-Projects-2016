/**
 * 
 */
package com.training;

import org.springframework.stereotype.Component;

/**
 * @author hgarg1
 *
 */
@Component
public class Book {

  
  private String bookName;
  private Long bookNumber;
  /**
   * 
   */
  public Book() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param bookName
   * @param bookNumber
   */
  public Book(String bookName, Long bookNumber) {
  super();
  this.bookName = bookName;
  this.bookNumber = bookNumber;
  }
  /**
   * @return the bookName
   */
  public String getBookName() {
  return bookName;
  }
  /**
   * @param bookName the bookName to set
   */
  public void setBookName(String bookName) {
  this.bookName = bookName;
  }
  /**
   * @return the bookNumber
   */
  public Long getBookNumber() {
  return bookNumber;
  }
  /**
   * @param bookNumber the bookNumber to set
   */
  public void setBookNumber(Long bookNumber) {
  this.bookNumber = bookNumber;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Book [bookName=" + bookName + ", bookNumber=" + bookNumber + "]";
  }
  
  
}
