/**
 * 
 */
package com.training.utils;

import java.util.Comparator;

import com.training.domains.Donor;

/**
 * @author hgarg1
 *
 */
public class NameComparator implements Comparator<Donor> {

	@Override
	public int compare(Donor object1, Donor object2) {

		return object1.getDonorName().compareTo(object2.getDonorName());
	}

	
}
