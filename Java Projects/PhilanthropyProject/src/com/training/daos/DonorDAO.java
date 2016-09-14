/**
 * 
 */
package com.training.daos;

import com.training.entity.Donor;
import com.training.ifaces.MyDAO;
import com.training.utils.MySQLConnection;

import java.util.*;
import java.sql.*;

/**
 * @author hgarg1
 *
 */
public class DonorDAO implements MyDAO<Donor> {
	
	private Connection con = null;
	
	/**
	 * 
	 */
	
	
	public DonorDAO() {
		super();
		con = MySQLConnection.getMyOracleConnection();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param con
	 */
	public DonorDAO(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(Donor object) {
		int rowAdded = 0;
		
		try{
			
			String sql = "insert into Donor values(?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setLong(1,  object.getDonorCode());
			pstmt.setString(2,  object.getDonorName());
			pstmt.setLong(3,  object.getHandPhone());
			pstmt.setString(4,  object.getEmail());
			pstmt.setInt(5,  object.getProjectCode());
			
			rowAdded = pstmt.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return rowAdded;
	}

	@Override
	public int update(long newPhoneNumber, long donorCode) {
		try{
			
			
			Statement stmt =(Statement)con.createStatement();
			
			stmt.executeUpdate("update Donor set " +
					"phone='"+newPhoneNumber + "' where code='" +donorCode+"'");

			}
		catch(Exception e){
			e.printStackTrace();
			}
		return 1;
	}
	
	
	@Override
  public int alterTable() {
    try{
           
      Statement stmt =(Statement)con.createStatement();
      
      stmt.executeUpdate("alter table donor add pcode Number(10)");

      }
    catch(Exception e){
      e.printStackTrace();
      }
    return 1;
  }

	
	@Override
	public Donor find(long donorCode) {
		
		Donor donor =  new Donor();
		try{
						
			Statement stmt  = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select name, phone, email from Donor where code = '"+donorCode+"'");
			
			while(rs.next()){
		         //Retrieve by column name
				donor.setHandPhone(rs.getInt("phone"));
		        donor.setDonorName(rs.getString("name"));
		        donor.setEmail(rs.getString("email"));
		                 
			}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return donor;
		
	
	}

	@Override
	public int delete(long donorCode) {
		try
		{
		PreparedStatement ps =con.prepareStatement("Delete from Donor where code=?");

		ps.setLong(1,donorCode);

		ps.executeUpdate();

		con.close();
		} 
		catch ( SQLException e) {
		  e.printStackTrace();
		}

		return 1;
	}

	@Override
	public List<Donor> findAll() {
		 ArrayList<Donor> alist = new ArrayList<Donor>();
		 try{
		 Statement stmt =con.createStatement();
		  
		 ResultSet  rs=stmt.executeQuery ("select * from Donor");
		              
		 while(rs.next())
		 {

		   long code     = rs.getLong("code");
		   String name   = rs.getString("name");
		   long  phone   = rs.getLong("phone"); 
		   String email  = rs.getString("email"); 
		   int projectCode  = rs.getInt("pcode");
		   Donor donor = new Donor(code,name,phone,email, projectCode);
		   alist.add(donor);

		  }
		 }
		 catch(Exception e){
				e.printStackTrace();
			}
		 return alist;
	}
}
