package com.integerToRoman;

public class Solution {

	public static void main(String []args) {
		
		integerToRoman(1994);
	}
	//Soultion 1
	public static void integerToRoman(int n) {
		// Create the string array
		String [] I= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String [] X= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String [] C= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String [] M= {"","M","MM","MMM"};
		
		String Roman="";
		Roman=M[n/1000]+C[(n%1000)/100]+X[(n%100)/10]+I[n%10];
		System.out.println(Roman);
	}
	
	//Solution2
	public static void integerToRoman2(int num) {
		final String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    final int[] value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	   
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < value.length; i++) {
	            while (num >= value[i]) {
	                sb.append(roman[i]);
	                num -= value[i];
	            }
	        }
	        
	        
	
	    
}
}
