import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minMaxSum {
	
	
	public static void minmaxSum(List<Integer>arr)
	{
	Collections.sort(arr);
	System.out.println(arr);
	List<Integer> arrSmall = arr.subList(0, 4);
	System.out.println("SubList small "+arrSmall);
	long arrSmallValue=0;
	long arrLargeValue=0;
	List<Integer>arrLarg = arr.subList(1,5);
	System.out.println("SubLIst large "+arrLarg);
	for (Integer i: arrSmall)
	{
		arrSmallValue=arrSmallValue+i;
	}
	System.out.println(arrSmallValue);
	
	for(Integer i:arrLarg)
	{
		arrLargeValue=arrLargeValue+i;
	}
	System.out.println(arrLargeValue);
	}
	
	public static void main(String args[])
	{
		List<Integer> arr = new ArrayList<>();
		arr.add(256741038);
		arr.add(623958417);
		arr.add(467905213);
		arr.add(714532089);
		arr.add(938071625);
		minmaxSum(arr);
		//256741038 623958417 467905213 714532089 938071625
	}

}
