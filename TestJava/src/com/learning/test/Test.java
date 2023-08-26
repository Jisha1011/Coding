package com.learning.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public String removeDup(String str)
	{
		
		char [] arr =str.toCharArray();
		ArrayList<Character> arrList=new ArrayList<>(); 
		for (char c: arr)
		{
			arrList.add(c);
		}
		ArrayList<Character> arrListNew= new ArrayList<>(); 
		for (char a: arrList)
		{
			if(!arrListNew.contains(a))
			{
				arrListNew.add(a);
			}
		}
		System.out.println(arrListNew);
		String value = arrListNew.toString();
		System.out.println(value);
		return value;	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		Scanner scan = new Scanner(System.in);
		String input =scan.nextLine();
		String result=test.removeDup(input);
		System.out.println(input);
		String value =result.replaceAll("o", "q");
		System.out.println(value);

	}

}
