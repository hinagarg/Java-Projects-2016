/**
 * 
 */
package com.training.domains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author hgarg1
 *
 */
public class TopRankers {

  public List<Student> findTopRankers(String dept)
  {
  
  List<Student> topRankers = new ArrayList<Student>();
  
    topRankers.add(new Student(101, "Jerry", 56, "ECE"));
    topRankers.add(new Student(102, "Tom", 76, "ECE"));
    topRankers.add(new Student(103, "Blake", 96, "ECE"));
    topRankers.add(new Student(104, "Slith", 66, "ECE"));
    topRankers.add(new Student(105, "Kate", 46, "ECE"));
    
    Collections.sort(topRankers);
    
   // Object[] list = topRankers.toArray().clone();
    
   // List<Object> studentList = Arrays.asList(list);
    
 
    return topRankers;
  }

}
