/**
 * 
 */
package com.training.domains;

//import java.util.List;

/**
 * @author hgarg1
 *
 */
public class Student implements Comparable<Student>{

  private long id;
  private String name;
  private double mark;
  private String department;
  /* (non-Javadoc)
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  
  
  
  

  /**
   * 
   */
  public Student() {
  super();
  // TODO Auto-generated constructor stub
  }



  /**
   * @param id
   * @param name
   * @param mark
   * @param department
   */
  public Student(long id, String name, double mark, String department) {
  super();
  this.id = id;
  this.name = name;
  this.mark = mark;
  this.department = department;
  }



  /**
   * @param id the id to set
   */
  public void setId(long id) {
  this.id = id;
  }



  /**
   * @param name the name to set
   */
  public void setName(String name) {
  this.name = name;
  }



  /**
   * @param mark the mark to set
   */
  public void setMark(double mark) {
  this.mark = mark;
  }



  /**
   * @param department the department to set
   */
  public void setDepartment(String department) {
  this.department = department;
  }

  

  /**
   * @return the id
   */
  public long getId() {
  return id;
  }



  /**
   * @return the name
   */
  public String getName() {
  return name;
  }



  /**
   * @return the mark
   */
  public double getMark() {
  return mark;
  }



  /**
   * @return the department
   */
  public String getDepartment() {
  return department;
  }



  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
  return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", department=" + department + "]";
  }


  @Override
  public int compareTo(Student otherObj) {
    if(this.mark > otherObj.mark){
      return 1;    
    }
    
    else if (this.mark < otherObj.mark){
      
      return -1;
    }
    
    else {
      
      return 0;
    }
  }

  
}
