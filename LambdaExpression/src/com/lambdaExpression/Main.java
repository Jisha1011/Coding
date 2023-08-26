package com.lambdaExpression;

public class Main {
	
	//lambda is a shortcut of defining the functional interface
	
	public static void main(String arg[])
	{
		System.out.println("The main class");
		Sounds sound = (s)->"Meow "+s;
		printSound(sound);
	}
	public static void printSound(Sounds s)
	{
		System.out.println(s.sound("Hello"));
	}
}
