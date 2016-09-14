package com.training.checkstyle.pmd.copy;

import java.util.Arrays;

/**
 * @author hgarg1.
 *
 */

public class College {

  /**
  * This is collegeCode.
  *
  */

  private int collegeCode;
  /**
  * @serialField.
  */
  private String collegeName;
  /**
  * @serialField.
  */
  private Department[] depts;
  /**
  * This constructor is invoked on an instance creation.
  */
  
  public College() {
    super();
  }


  /**
  * This method is used to get college code.
  */
  public int getCollegeCode() {
    return collegeCode;
  }

  /**
  * <p>
  * This method is used to set college code.
  * </p>
  */
  public void setCollegeCode(int collegeCode) {
    this.collegeCode = collegeCode;
  }

  /**
  *<p>
  * This method is used to get college name.
  * </p>
  */
  public String getCollegeName() {
    return collegeName;
  }

  /**
  *<p>
  * This method is used to set college name.
  * </p>
  */

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }
  /**
  *<p>
  * This method is used to get department.
  * </p>
  */
  
  public Department[] getDepts() {
    return depts;
  }
  /**
  *<p>
  * This method is used to set department.
  * </p>
  */
  
  public void setDepts(Department[] depts) {
    this.depts = depts;
  }
  
  @Override
  public String toString() {
    return  Arrays.toString(depts) ;
  }

  /**
  * 
  * @param.
  */

  public void printDepartments() {

    for (Department dept : depts) {
      dept.printStudentList(); 
      
    }

  }


}
