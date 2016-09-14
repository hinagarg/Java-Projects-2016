package com.training.idonors;

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
