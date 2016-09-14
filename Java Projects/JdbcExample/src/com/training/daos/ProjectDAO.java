/**

 * 
 */

package com.training.daos;

import com.training.entity.Project;
import com.training.ifaces.Iproject;
import com.training.utils.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hgarg1.
 *
 *
 */

public class ProjectDAO implements Iproject<Project> {
  
  private Connection con = null;

  /**
  * 
	*/
  public ProjectDAO() {
    super();
    con = MySQLConnection.getMyOracleConnection();
  }

	/**
	 * @param con.
	 */
  
	public ProjectDAO(Connection con) {
		super();
		this.con = con;
	}

	//Add projects into the project table
	@Override
	public int addProject(Project projObject) {
		
		int rowAdded = 0;
		
		try{
			
			String sql = "insert into PROJECT values(?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setLong(1,  projObject.getProjectCode());
			pstmt.setString(2,  projObject.getProjectName());
			pstmt.setString(3,  projObject.getProjectDescription());
			pstmt.setLong(4,  projObject.getProjectCost());
			
	
	      
			rowAdded = pstmt.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return rowAdded;
	}
	
	//Update project details into the project table
	@Override
  public int updateProjectDetails(String newProjectName, String newProjectDescription, int newProjectCost, int projectCode) {
    try{
      
      
      Statement stmt =(Statement)con.createStatement();
      
      stmt.executeUpdate("update Project set " + "cost='"+newProjectCost 
          + "' where code='" +projectCode+"'");

      }
    catch(Exception e){
      e.printStackTrace();
      }
    return 1;
  }

	
	//View available project and its details
	@Override
	public Project viewProjectDetails(int projectCode) {
  Project projectObj =  new Project();
  try{
          
    Statement stmt  = con.createStatement();
    
    ResultSet rs = stmt.executeQuery("select name, description, cost from Project where code = '"+projectCode+"'");
    
    while(rs.next()){
      //Retrieve by column code
      projectObj.setProjectCode(projectCode);
      projectObj.setProjectName(rs.getString("name"));
      projectObj.setProjectDescription(rs.getString("description"));
      projectObj.setProjectCost(rs.getInt("cost"));

                   
    }
  
  }
  catch(Exception e){
    e.printStackTrace();
  }
  return projectObj;
		
	}
	
	// View list of available projects and their details
	@Override
	public List<Project> getProjectList() {
	
	ArrayList<Project> plist = new ArrayList<Project>();
  
	try{
  Statement stmt =con.createStatement();
   
  ResultSet  rs=stmt.executeQuery ("select * from Project");
               
  while(rs.next())
  {

    int code     = rs.getInt("code");
    String name   = rs.getString("name");
    int  cost   = rs.getInt("cost"); 
    String description  = rs.getString("description"); 
   
    Project projectObj = new Project(code,name,description,cost);
    plist.add(projectObj);

   }
  }
  
	catch(Exception e){
     e.printStackTrace();
   }
  return plist;
}
	


@Override
public String getProjectDonorList() {

String result = null;
try{
Statement stmt =con.createStatement();
String query = "select Donor.code, Donor.name, Donor.phone, Donor.email , Project.name, Project.description, Project.cost from Donor, Project" + 
     " where Donor.pcode = Project.code"; 
ResultSet  rs=stmt.executeQuery (query);
             
while(rs.next())
{
  
  int donorCode   = rs.getInt(1);
  String donorName     = rs.getString(2);
  Long donorPhone   = rs.getLong(3);
  String donorEmail   = rs.getString(4); 
  String projectName   = rs.getString(5);
  String projectDescription   = rs.getString(6);
  int projectCost = rs.getInt(7);
 
  result = donorCode + " " + donorName + " " + donorPhone + " " + donorEmail + " "+ projectName + " "+ projectDescription + " " + projectCost;

 }
}

catch(Exception e){
   e.printStackTrace();
 }
return result;
}
}

