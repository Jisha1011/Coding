package com.Optional;

import java.util.Optional;

public class Main {
	
	
	
	
	
	
	public static void main(String args [])
	{
		
		Optional<Cat> optionalCat = findCatByName("fred");
		/*if(optionalCat.isPresent())
		{
			System.out.println(optionalCat.get().getAge());
		}
		else
		{
			System.out.println(7);
		}*/
		
		System.out.println(optionalCat.orElse(new Cat(9,"Lilly")).getAge());
		optionalCat.map(Cat::getAge).orElse(0);
		
		System.out.println(optionalCat.map(Cat::getAge).orElse(0));
		//System.out.println(cat.get().getAge());
	}
	
	
	
	public static Optional< Cat> findCatByName(String name)
	{
		Cat myCat = new Cat(3,name);
		return Optional.ofNullable(null);
				
	}

}
