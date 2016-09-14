/**
 * 
 */
package com.training;

import java.util.*;
/**
 * @author hgarg1
 *
 */
@FunctionalInterface
interface Show{
	public void display();
} 

public class QuickStart {

	public static void main(String[] args){
		
		Show obj = ()->{System.out.println("Welcome to FP in Java");};
		
		obj.display();
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Annad");
		nameList.add("Animesh");
		nameList.add("Ankit");
		nameList.add("Rakesh");
		
		nameList.forEach(System.out::println);
		
		int maxMark = 100;
		nameList.forEach((String str) -> {
			
			System.out.println("Mr." + str);
			System.out.println("Maximum Mark" + maxMark);
		});
		
	}
}
