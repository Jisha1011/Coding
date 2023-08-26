package com.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class UnderstandingStreams {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> str = Stream.empty();
		Collection<String> collectionStream = Arrays.asList("as","the","deer","god");
		Stream<String> collectionStram = collectionStream.stream();
		Stream <String> s = Stream.of("as","god","wishes");
		String arr[] = new String[] {"stay","with","us","lord"};
		Stream<String> a = Arrays.stream(arr);
		Stream<String>b = Arrays.stream(arr,0,4);
		b.forEach(n ->System.out.println(n));
		
		
		String e= "God please stay with us";
		//Collection<String> 
		//System.out.println(d.toString());
		Stream<String> st = Pattern.compile(" ").splitAsStream(e).parallel();
	//	st.parallel();
		String op =st.max(Comparator.comparingInt(String::length)).get();
		//st.close();
		
		System.out.println("the op value  "+op);
		String longest = st.max(Comparator.comparing((o1,o2)->(o2-o1))).get();
		
		
	}

}
