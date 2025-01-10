package com.sums;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {

	
	public static int [] Sums(int[] nums, int target)
	{
		
		//Arrays.sort(nums);
		int[] arr = {0,0};
		int zero=0,one = 0;
		for(int i =0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{ zero =i;
				 one =j;
				 
					
				}
				
			}
			
		}
		int[] arr1 = new int[] {zero,one};
		return arr1;
	}
	
	public static void main(String args[])
	{
		int [] ar = {3,3};
		int target = 6;
		System.out.println(Sums(ar,target).toString());
	int arr[] = Sums(ar,target);
	for(int a : arr)
	System.out.println(a);
		
	}
	
	
}
