
public class StringReverse {

	
	public static void printReverse(String str, int i)
	{
		if(i>=0)
		{
			System.out.print(str.charAt(i));
			printReverse(str,i-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a string";
		String []strArry =str.split(" ");
		System.out.println(strArry.toString());
		for(int i =strArry.length -1;i>=0;i--)
		{
			System.out.print(strArry[i]+ " ");
		}
		
		
		StringBuilder str1 = new StringBuilder(str);
		System.out.println("\n"+str1.reverse());
		
		System.out.println("Using the recursive funtion");
		printReverse(str, str.length()-1);
		
	}

}
