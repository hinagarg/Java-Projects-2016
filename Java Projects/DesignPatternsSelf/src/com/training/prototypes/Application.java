/**
 * 
 */
package com.training.prototypes;

import java.util.List;

/**
 * @author hgarg1
 *
 */
public class Application {

  /**
   * @param args
   */
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
  BookList bk = new BookList();
  bk.loadData();
  
  try{
    
    List<Book> bkList = (List<Book>)bk.clone();
    
    System.out.println(bkList);
  }
  
  catch(Exception e){
    e.printStackTrace();
  }

  }

}
