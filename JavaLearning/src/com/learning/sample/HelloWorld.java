package com.learning.sample;

import java.io.UnsupportedEncodingException;

public class HelloWorld {

	int instanceVariable=19;
	static int staticVariable = 23;
	public void local_method(int b)
	{
		int a=10 ;
		instanceVariable = b;
		System.out.println("instanceVariableMethod " + instanceVariable);
		System.out.println("NonStaticMethod " + staticVariable);
		staticMethod();
	}
	public void stringMethods() throws UnsupportedEncodingException
	{
		String s1 = "I am Manasa";
		String s2 = "I am Manasa am";
		String s3 = "I am MANASA";
		/*
		 * System.out.println(s1.charAt(3)); System.out.println(s1.concat(" Rustugi"));
		 * System.out.println(s1.contains("Ma"));
		 * System.out.println(s1.endsWith("Manasa"));
		 * System.out.println(s1.contentEquals(s2));
		 * System.out.println(s1.equalsIgnoreCase(s3));
		 * System.out.println(s1.getBytes());
		 * 
		 * byte array[] = s1.getBytes(); for(int i=0 ;i<array.length;i++) {
		 * System.out.println(array[i]); }
		 * 
		 * char [] subset = new char [8]; System.out.println(subset.length);
		 * s1.getChars(2, 7, subset, 2); for(int i=0;i<subset.length;i++) {
		 * System.out.println(subset[i]); }
		 */
		System.out.println(s2.indexOf("am"));
		System.out.println(s2.indexOf("am",3));
		String s4 = "Hello";
		String s5 = new String("Hello");
		String s6=s4.intern();
		String s7=s5.intern();
		/*
		 * System.out.println(s4 == s5);//false System.out.println(s4 == s6);//true
		 * System.out.println(s5 == s7);//false System.out.println(s4 ==s7); // true
		 */	
		System.out.println(s4.isEmpty());
		System.out.println(s4.join(":", "a","b","c"));
		System.out.println(s2.replace("am", "wooooo"));
		String s8 ="This was the most beautiful thing i saw Today.";
		/*
		 * for(String w : s8.split("e")) { System.out.println(w); //splits on every e ;
		 * excludes the e and prints a new line statement }
		 */
		/*
		 * for(String w: s8.split("e",3)) { System.out.println(w); } StringBuffer buff =
		 * new StringBuffer(); System.out.println(buff.capacity());
		 * System.out.println(buff.length());
		 */
		String a ="meow";
		String b=a+"abcd";
		String c= "meowabcd";
		System.out.println(b==c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void staticMethod()
	{
		staticVariable = 66;
		System.out.println("staticMethod " + staticVariable);
	}
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
	System.out.println("HelloWorld");
	
	HelloWorld obj1 = new HelloWorld();
	System.out.println("instanceVariableObj1 " + obj1.instanceVariable);
	obj1.local_method(10);
	
	
	HelloWorld obj2 =new HelloWorld();
	System.out.println("instanceVariableObj2 " + obj2.instanceVariable);
	
	System.out.println("staticVariableMethod " + staticVariable);
	B.staticMethodInB();
	obj1.stringMethods();
	}

}


