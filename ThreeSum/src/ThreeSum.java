import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	
	 public static List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> ls = new ArrayList<List<Integer>>();
		
		 for(int i=0;i<nums.length-2;i++)
		 { List<Integer> l = new ArrayList<Integer>();
			 if(nums[i]+nums[i+1]+nums[i+2]==0)
			 {
				
				 l.add(nums[i]);
				 l.add(nums[i+1]);
				 l.add(nums[i+2]);
				 ls.add(l);
			 }
			 
		 }
		 System.out.println(ls.toString());
		 
		 return ls;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,0,1,2,-1,-4};
		threeSum(arr);
	}

}