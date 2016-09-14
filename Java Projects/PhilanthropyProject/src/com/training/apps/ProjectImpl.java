/**
 * 
 */
package com.training.apps;

import java.util.List;


import com.training.daos.ProjectDAO;
import com.training.entity.Project;
import com.training.utils.*;
/**
 * @author hgarg1
 *
 */
public class ProjectImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MySQLConnection.getMyOracleConnection());
		
		
		ProjectDAO pao = new ProjectDAO();
		int key = 5;
		switch(key){
		
		case 1:
		  int rowAdded = pao.addProject(new Project(103 , "Old Age Home", "This is Old Age Home", 40000));
      System.out.println("Rows[s] Added :=" + rowAdded);
			break;
		
		case 2:
      int rowUpdated = pao.updateProjectDetails("Primary Education ","This is a Primary Education  Project",80000,102);
      System.out.println("Rows[s] Updated :=" + rowUpdated);
      break;
      
		case 3:
      Project rowFound= pao.viewProjectDetails(101);
      System.out.println("Row[s] Found :=" + rowFound);
      break;
      
    case 4:
      List<Project> projectList ;
      projectList = pao.getProjectList();
      System.out.println("Rows[s] Found:=" + projectList);
      break;
      
    case 5:
      String projectDonorList = pao.getProjectDonorList();
      System.out.println("Rows[s] Found:=" + projectDonorList);
      break;
      
			default:
				break;
		}
	}

}
