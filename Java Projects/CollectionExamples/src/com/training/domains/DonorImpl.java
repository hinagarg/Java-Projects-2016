package com.training.domains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.IDonor;
import com.training.utils.NameComparator;

public class DonorImpl implements IDonor {

	private List<Donor> donorList;
	
	
	public DonorImpl(List<Donor> donorList) {
		super();
		this.donorList = donorList;
	}

	public DonorImpl() {
		super();
		donorList = new ArrayList<Donor>();
	}

	@Override
	public boolean addDonor(Donor obj) {
		// TODO Auto-generated method stub
		
		boolean result = false;
		
		result = donorList.add(obj);
		
		return result;
	}

	@Override
	public boolean[] addDonors(Donor... dnrList) {
		
		int size = dnrList.length;

		boolean result[] = new boolean[size];
		
		int i = 0;
		for(Donor donor : dnrList)
		{
			result[i] = donorList.add(donor);
			i++;
		}
		return result;
		
	}

	@Override
	public void printDonorList() {
		// TODO Auto-generated method stub
		for(Donor d: donorList){
			System.out.println(d);
		}

	}

	@Override
	public List<Donor> getDonorList() {
		// TODO Auto-generated method stub
		return donorList;
	}
	
	public void printbyOrder(Comparator comparator){
		
		Collections.sort(donorList, new NameComparator());
		printDonorList();
	}

}
