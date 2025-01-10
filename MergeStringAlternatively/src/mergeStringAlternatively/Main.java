package mergeStringAlternatively;

public class Main {
	
	
	public static void main(String args[])
	{
		String word1="abcdef";
		String word2="pq";
		mergeAlternately(word1, word2);
	}
	
	
	public static void mergeAlternately(String word1, String word2) {
		int len1=word1.length(); System.out.println("len1 "+len1);
		int len2 =word2.length();System.out.println("len2 "+len2);
		StringBuilder str = new StringBuilder();
		int index=0; 
		while(len2!=0)
		{           System.out.println(" initial index "+index);
		if(len1>0) {
			str.append((word1.charAt(index))); System.out.println(str);
			str.append(word2.charAt(index));	System.out.println(str);
			index+=1; System.out.println("index "+index);
			len1-=1; System.out.println("len1 "+len1);
			len2-=1;System.out.println("len2 "+len2);
		}
		else if(len1<1)
		{
			str.append(word2.substring(index));
			len2=0;
		}
		else {}
		}
		if(len1!=0)
		{
			str.append(word1.substring(index));
		}
		System.out.println("Index  "+index);
		System.out.println(str);
		
	}

}
