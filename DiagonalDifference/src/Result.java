import java.util.ArrayList;
import java.util.List;

public class Result {
	
	public static int difference(List<List<Integer>> arr)
	{
		//loop through the arrayList
		//get the size
		//System.out.println( arr.size()); 
		
		//Sum of same pair
		int sumL=0;
		int sumR=0;
		for(int i =0;i<arr.size();i++)
		{
			sumL=sumL+arr.get(i).get(i);
			System.out.println(arr.get(i).get(i));
		}
		System.out.println("Sum of the left diagonal "+sumL);
		
		
		//Sum of opposite pair
		
		for(int i=0;i<arr.size();i++)
		{	//System.out.println(arr.get(i));
			sumR = sumR+(arr.get(i).get((arr.size()-1)-i));
			System.out.println(arr.get(i).get((arr.size()-1)-i));
		}
		System.out.println(sumR);
		int val = Math.abs(sumR-sumL);
		return val;
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> intar = new ArrayList<>();
		List<Integer> intar1 = new ArrayList<>();
		List<Integer> intar2 = new ArrayList<>();
		
		intar.add(1);
		intar.add(2);
		intar.add(3);
		intar1.add(4);
		intar1.add(5);
		intar1.add(6);
		intar2.add(9);
		intar2.add(8);
		intar2.add(9);
		arr.add(intar);
		arr.add(intar1);
		arr.add(intar2);
		
		int result=difference(arr);
		System.out.println("The result "+result);
	}
	

}
