package com.jumpGame;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,1,1,1};
		System.out.println(canJump(nums));
	}
	
	public static boolean canJump(int[] nums) {
		
		int maxReach=0;
		int i=0;
		int jump=0;
		if(nums.length==1) {jump=0;}
		else {
		
		for(i=0;i<nums.length-1;i++) {
			
			if(i>maxReach) {jump=i;}
			else{
			maxReach = Math.max(maxReach, i+nums[i]);
			jump=jump+1;
			if(maxReach>=nums.length-1) { i=nums.length;}
			}
		}
		
		}
		System.out.println(jump);
		
		return true;
		
	}

}
