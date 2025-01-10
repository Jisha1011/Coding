package com.stock;

public class StockDay {
	
	
	 public int maxProfit(int[] prices) {
	     int profit =0;
	     int buy =prices[0];
	     
	     for(int i=0;i<prices.length;i++)
	     {
	    	 if(buy>prices[i])
	    	 {
	    		 buy=prices[i];
	    		  
	    	 }
	    	 
	    	 else if(prices[i]-buy>profit)
	    	 {
	    		 profit= prices[i]-buy;
	    	 }
	     }
		 return profit;
	    }
	 
	 public static void main(String args[])
	 {
		 StockDay s= new StockDay();
		 int[]ar = {2,4,1};
		 int val = s.maxProfit(ar);
		 System.out.println(val);
	 }

}
