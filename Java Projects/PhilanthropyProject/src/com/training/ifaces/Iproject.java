/**
 * 
 */
package com.training.ifaces;

import java.util.List;

import com.training.entity.Project;

/**
 * @author hgarg1
 *
 */
public interface Iproject<T> {

	public int addProject(Project projObject);
	public Project viewProjectDetails(int projectCode);
	public List<T> getProjectList();
  public int updateProjectDetails(String newProjectName, String newProjectDescription, int newProjectCost, int projectCode);
  public String getProjectDonorList();
  
 
	
}
