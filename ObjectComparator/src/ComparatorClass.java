import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

//Class compares the employee object on values
public class ComparatorClass {
	
	public static void Compare(List<Employee> emp)
	{
		System.out.println(emp.toString());
		
		//Sort based on id
		List < Employee > employeesSortedList1 = emp.stream()
	            .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
	        System.out.println(employeesSortedList1);
	        
	        List<Employee>employeesSortedList2 = emp.stream()
	        		.sorted((o1,o2)-> (int)(o2.getSalary()-o1.getSalary() ))
	        		.collect(Collectors.toList());
	        System.out.println(employeesSortedList2);
	        
	        
	        List<Employee>employeesSortedList3 = emp.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
	        		.collect(Collectors.toList());
	        System.out.println(employeesSortedList3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employee emp1 = new Employee();
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 30, (long) 400000));
        employees.add(new Employee(20, "John", 29, (long) 350000));
        employees.add(new Employee(30, "Tom", 30, (long) 450000));
        employees.add(new Employee(40, "Pramod", 29, (long) 500000));

        Compare(employees);
}
	
}
