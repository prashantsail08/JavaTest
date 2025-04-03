package LambdaRelatedToCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
How to write a Lambda expression with respect to Collections. eg- Comparator Interface

Practical eg- Wrrite a pgm to sort the given Employee records based on the Emp Name using Lambda.

*/public class Demo {

	public static void main(String[] args) {
		List< Employee> emplist =new ArrayList<Employee>();
		emplist.add(new Employee(20, "Prashant", 60));
		emplist.add(new Employee(30, "ABC", 70));
		emplist.add(new Employee(50, "QWE", 90));
		emplist.add(new Employee(40, "XYZ", 1100));
		emplist.add(new Employee(10, "AA", 50));
		
		System.out.println("Before sorting  --> "+ emplist);
		
		Collections.sort(emplist, (e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		System.out.println("After sorting --> " + emplist);

	}

}
