package com.training.domians;

public class PrintMaximum {

	public int findMaximum(int[] args)
	{
		int max = args[0];
		
		for(int i = 0; i < args.length; i++)
		{
			if(max < args[i]){
				max = args[i];
			}
		}
		return max;
	}
}
