package com.training.prototypes;

public class Book implements Cloneable{

  private int bookNumber;
  private String bookName;
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  
  
  @Override
  public String toString() {
  return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + "]";
  }
  /**
   * 
   */
  public Book() {
  super();
  // TODO Auto-generated constructor stub
  }
  /**
   * @param bookNumber
   * @param bookName
   */
  public Book(int bookNumber, String bookName) {
  super();
  this.bookNumber = bookNumber;
  this.bookName = bookName;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#clone()
   */
  @Override
  protected Object clone() throws CloneNotSupportedException {
  // TODO Auto-generated method stub
  return super.clone();
  }
  
  
}
