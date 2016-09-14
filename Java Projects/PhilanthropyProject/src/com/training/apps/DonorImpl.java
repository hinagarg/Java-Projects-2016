/**
 * 
 */
package com.training.apps;
import java.util.List;

import com.training.daos.DonorDAO;
import com.training.entity.Donor;
import com.training.utils.*;
/**
 * @author hgarg1
 *
 */
public class DonorImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MySQLConnection.getMyOracleConnection());
		
		
		DonorDAO dao = new DonorDAO();
		int key = 3;
		switch(key){
		
		case 1:
			int rowAdded = dao.add(new Donor(1, "Jerry", 24879134, "rakesh@abc.com", 101));
			System.out.println("Rows[s] Added :=" + rowAdded);
			break;
			
		case 2:
			int rowUpdated = dao.update(989109, 1);
			System.out.println("Rows[s] Updated :=" + rowUpdated);
			break;
		
		case 3:
			Donor rowFound= dao.find(1);
			System.out.println("Rows[s] Found :=" + rowFound);
			break;
			
		case 4:
			int rowDeleted= dao.delete(2);
			System.out.println("Rows[s] Deleted :=" + rowDeleted);
			break;
			
		case 5:
			List<Donor> donorList;
			donorList = dao.findAll();
			System.out.println("Rows[s] Found :=" + donorList);
			break;
		
		case 6:
		  int tableUpdated = dao.alterTable();
      System.out.println("Column[s] Added :=" + tableUpdated);
      break;
      
			default:
				break;
		}
	}

}
