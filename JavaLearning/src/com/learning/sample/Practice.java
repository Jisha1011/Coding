package com.learning.sample;

public class Practice {
	
	
	//reverse a String
	public String reverse(String str)
	{
		
		StringBuilder revStr= new StringBuilder(str);
		return revStr.reverse().toString();
	}
	//capitalize string
	public String capitalize(String str)
	{
		String strArr[] = str.split("\\s");
		String capitalized = "";
		for(String w:strArr)
		{
			String first = w.substring(0,1);
			String afterFirst=w.substring(1);
			capitalized+=first+afterFirst.toUpperCase()+" ";
		}
		return capitalized.trim();
		
	}
	
	//reverse each word in a string
	public String reverseWord(String str)
	{
		String array[]=str.split("\\s");
		String reversedString="";
		for(String w: array)
		{
			StringBuilder sb = new StringBuilder(w);
			reversedString+=sb.reverse()+" ";
			
		}
		return reversedString.trim();
	}

	public static void main(String[] args) {
	
		Practice p = new Practice();
		String input ="my name is khan";
		String revString =p.reverse(input);
		
		System.out.println(input.equalsIgnoreCase(revString));
		System.out.println(revString.toUpperCase());
		System.out.println(p.capitalize("hello welcome to ooty"));
		System.out.println(p.reverseWord("I am SUperHero"));
	}

}
	