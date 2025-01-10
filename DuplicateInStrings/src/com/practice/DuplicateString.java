package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void DuplicateChar(String str)
	{
		///Counting the duplicate
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		char[]chr = str.toLowerCase().toCharArray();
		
		for(char c : chr ) 
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() +" : "+entry.getValue());
			}
		}
		
	}
	
	
	public static void DuplicateString(String str)
	{
		Map<String ,Integer> map = new HashMap<String,Integer>();
		
		String [] s =str.split(" ");
		//for(String st :s)
		//System.out.println(st);
		
		for(String st :s)
		{
			if (map.containsKey(st))
			{
				map.put(st, map.get(st)+1);
			}
			else
			{
				map.put(st, 1);
			}
		}
		System.out.println(map.toString());
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateChar("jAva");
		DuplicateString("Java is a good technology for a a a  good development development");
	}

}
