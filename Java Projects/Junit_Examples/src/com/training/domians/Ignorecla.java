package com.training.domians;

import java.util.ArrayList;
import java.util.HashSet;

public class Ignorecla {

	private ArrayList<String> items = new ArrayList<String>();
	private HashSet<String> names = new HashSet<String>();
	public void OrderList()
	{
	items=new ArrayList<String>();
	names=new HashSet<String>();
	}
	public ArrayList<String> addOrder(String string) {
	 items.add(string);
	return  items;          }
	public ArrayList<String> closeOrder(String string) {
	 items.remove(string);
	return items;
	}
	public HashSet<String> addNames(String name)  {
	names.add(name);
	System.out.println(names); 
	return names;//names;
	}
	public HashSet<String> getNames()  {
		return names;
		}
	
}
