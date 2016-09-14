package com.training.domains;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Iproject<Project> {

	private List<Project> projectList;
	
	//List<Project> projectListCopy = new ArrayList<Project>(projectList.size());
	
	//Project projObj = new Project();
	
	/**
	 * 
	 */
	public ProjectManager() {
		super();
		projectList = new ArrayList<Project>();
	}
	
	
	/**
	 * @param projectList
	 */
	public ProjectManager(List<Project> projectList) {
		super();
		this.projectList = projectList;
	}


	@Override
	public boolean addProject(Project obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		result = projectList.add(obj);
		
		return result;

	}

	@Override
	public void viewProjectDetails() {
		// TODO Auto-generated method stub
		for (Project p: projectList) {
			System.out.println(p);
		}
	}

	@Override
	public boolean[] addProjects(Project... projList) {
		
		boolean result[] = new boolean[3];
		
		int i = 0;
		for (Project p: projList) {		
			
			result[i] = projectList.add(p);
			i++;	
			
		}
		
		return result;
	}

	@Override
	public List<Project> getProjectList() {
		//retur n  a copy 
		/*for (Project item: projectList) {
			
			projectListCopy.add((Project) item.clone());
		}*/
		return projectList;
	}
	
	

}
