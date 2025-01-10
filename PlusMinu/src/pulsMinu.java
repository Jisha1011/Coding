import java.util.ArrayList;
import java.util.List;

public class pulsMinu {
	
	
	
	public static void plusMinu(List<Integer>arr)
	{
		
		int size = arr.size();
		double countPositive=0;
		double countNegavtie=0;
		double countZero=0;
		for (Integer i : arr) {
			
			if(i==0)
			{
				countZero = countZero +1;
						
			}
			
			else if(i>0)
			{
				countPositive= countPositive +1;
			}
			
			else
			{
				countNegavtie = countNegavtie+1;
			}
		}
		System.out.println(String.format("%.6f", countPositive/size));
		System.out.println(String.format("%.6f", countNegavtie/size));
		System.out.println(String.format("%.6f", countZero/size));
		
	}
	
	
	public static void main(String args[])
	{
		
		List<Integer> arr = new ArrayList<>();
		arr.add(-1);
		arr.add(-1);
		arr.add(0);
		arr.add(1);
		arr.add(3);
		
		plusMinu(arr);
		
	}

}
