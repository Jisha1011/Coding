import java.util.Comparator;

public class Student  {

	 // Class data members
    private String studentname;
    private int rollno;
    private int studentage;
 
    // Constructor of Student class
    public Student(int rollno, String studentname,
                   int studentage) {
 
        // this keyword refers to current instance itself
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
 
 
    // Getter and Setter methods
 
    public String getStudentname() { return studentname; }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
 
    public int getRollno() { return rollno; }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
 
    public int getStudentage() { return studentage; }
    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }
 
 
   
   
    @Override public String toString() {
        return "[ rollno=" + rollno + ", name="
               + studentname + ", age=" + studentage + "]";
    }
    
    public static Comparator<Student> StuNameCompare = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			String st1 = o1.getStudentname();
			String st2 = o2.getStudentname();
			
			
			return st1.compareTo(st2);
		}
	
    };
    
    public static Comparator<Student> StuAgeCompare = new Comparator<Student>() {
		
		@Override
		public int compare(Student o1, Student o2) {
			int st1 = o1.getStudentage();
			int st2 = o2.getStudentage();
			
			return st1-st2;
		}
	};
	
}
