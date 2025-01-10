package com.stock2;


public class Stock2Day {
	
	public static void main(String args[])
	 {
		
		 int[]ar = {3,2,6,5,0,3};
		 int val = maxProfit(ar);
		 System.out.println(val);
	 }

	 public static int maxProfit(int[] prices) {// {3,2,6,5,0,3};
		 
		 int profit =0;
		 
		 for(int i=1;i<prices.length;i++) {
			 
			 if(prices[i]>prices[i-1])
			 {
				 profit+=prices[1]-prices[i-1];
			 }
		 }
		 return profit;
	 }
}
