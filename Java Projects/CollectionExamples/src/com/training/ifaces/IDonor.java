package com.training.ifaces;
import com.training.domains.*;
import java.util.List;

/**
 * 
 * @author hgarg1
 *
 */
public interface IDonor {

	
	public boolean addDonor(Donor obj);
	public boolean[] addDonors(Donor ... dnrList);
	public void printDonorList();
	public List<Donor> getDonorList();
}
