package com.removeDuplicate;

public class RemoveDuplicates {

	
	
	public static void main(String args[])
	{
		int [] ar= {1,1,1,2,2,3};
		removeDuplicates(ar);
		
	}
	
	public static int removeDuplicates(int[] nums)
	{
		
		if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        for(int a:nums)
		{
			System.out.print(a);
		}

        return index;
		
		
		
		
	}
	
}
