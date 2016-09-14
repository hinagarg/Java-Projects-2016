/**
 * 
 */
package com.training.domains;

import java.util.List;

/**
 * @author hgarg1
 *
 */
public interface Iproject<T> {

	public boolean addProject(T t);
	public boolean[] addProjects(Project... projList);
	public void viewProjectDetails();
	public List<Project> getProjectList();
}
