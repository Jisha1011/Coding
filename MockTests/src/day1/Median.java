package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {
	
	
	public static void Median(List<Integer>arr)
	{
		Collections.sort(arr);
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
		System.out.println("Median : "+ arr.get((arr.size())/2));
	}
	
	public static void main(String [] args)
	{
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(4);
		arr.add(6);
		arr.add(1);
		arr.add(3);
		arr.add(8);
		
		Median(arr);
	}

}
