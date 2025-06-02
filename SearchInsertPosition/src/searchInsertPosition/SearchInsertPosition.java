package searchInsertPosition;

import java.util.Arrays;

/*
 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
  
  */

public class SearchInsertPosition {
	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		int target = 5;
		SearchInsertPosition s = new SearchInsertPosition();
		System.out.println(s.Solutions(nums, target));
		
	}
	
	public int Solutions(int[]nums,int target) {
		
		int left =0;
		int right = nums.length-1;
		
		while(left<=right)
		{
			int mid = left +(right-left)/2;
			if(target == nums[mid])
			{
				return mid;
			}
			else if(target > nums[mid])
			{
				left = mid;
			}
			else
			{
				right =mid;
			}
			
		}
		
		return left;
	}
	
	
	
	
	
	

}
