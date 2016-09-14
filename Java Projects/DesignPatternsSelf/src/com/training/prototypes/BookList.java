/**
 * 
 */
package com.training.prototypes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hgarg1
 *
 */
public class BookList {

  private List<Book> bkList = new ArrayList<Book>();
  /**
   * @param bkList
   */
  public BookList(List<Book> bkList) {
  super();
  this.bkList = bkList;
  }

  public BookList() {
  // TODO Auto-generated constructor stub
  }

  public void loadData(){
  
  bkList.add(new Book(101, "java"));
  bkList.add(new Book(102, "jee"));
  }
  
  /**
   * @return the bkList
   */
  public List<Book> getBkList() {
  return bkList;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#clone()
   */
  @Override
  protected Object clone() throws CloneNotSupportedException {
  // TODO Auto-generated method stub
  List<Book> temp = new ArrayList<Book>();
  for(Book b : this.getBkList()){
    temp.add((Book) b.clone());
  }
  return temp;
  }
  
  
}
