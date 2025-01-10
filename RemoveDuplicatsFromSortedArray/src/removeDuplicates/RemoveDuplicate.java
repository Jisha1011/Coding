package removeDuplicates;

import java.util.ArrayList;

public class RemoveDuplicate {

	
	 public static int removeDuplicates(int[] nums) {
	        
		 
		// int [] expectedNums = new int[nums.length];
		 ArrayList<Integer> lst = new ArrayList<Integer>();
		 int index=0;
		 if(lst.isEmpty())
		 {
			 lst.add(nums[0]);
		 }
		
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]!=nums[i+1])
			{
				lst.add(nums[i+1]);
			}
			
		}
		int size = lst.size();
		for(int i =size;i<nums.length;i++)
		{
			lst.add(0);
		}
		 
		int k = lst.size();
		System.out.println("The size is : "+k);
		nums = null;
		nums= lst.stream().mapToInt(i->i).toArray();
		for(int i: nums)
		{
			System.out.println(i);
		}
		System.out.println(nums.toString());
		System.out.println(lst.toString());
		
		
		 return 1;
	    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1,1,2]
		int[] nums = {1,1,2};
		removeDuplicates(nums);
	}

}
