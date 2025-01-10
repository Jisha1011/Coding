import java.util.ArrayList;
import java.util.Collections;

public class CompareClassTest {
	
	
	
	
	public static void main(String args[])
	{
		ArrayList<Student> arraylist
        = new ArrayList<Student>();

    // Adding elements to ArrayList
    arraylist.add(new Student(101, "Zues", 26));
    arraylist.add(new Student(505, "Abey", 24));
    arraylist.add(new Student(809, "Vignesh", 32));

    // Sorting based on Student Name
    System.out.println("Student Name Sorting:");
    Collections.sort(arraylist,Student.StuNameCompare);
    for(Student s : arraylist)
    {
    	System.out.println(s);
    }
    
    //Sorting based on the Student ages
    
    System.out.println("Student age Sorting");
    Collections.sort(arraylist,Student.StuAgeCompare);
    for(Student s : arraylist)
    {
    	System.out.println(s);
    }
    
	}

}
