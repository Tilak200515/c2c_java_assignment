package java_Assignment_1.app;

import java_Assignment_1.utilities.EmployeeUtilities;
import java_Assignment_1.employees.Manager;
import java_Assignment_1.employees.Developer;


public class AssignmentMain {
	

	public static void main(String[] args) {
		Manager m=new Manager("Dinesh","5821",500000,"HR");
		Developer d1=new Developer("Edwin","5821",1000,"JAVA");
		Developer d2=new Developer("Kevin","4221",100000001,"PYTHON");
		
		EmployeeUtilities.print(m);
        EmployeeUtilities.print(d1);
        EmployeeUtilities.print(d2);
        
        EmployeeUtilities.giveRaise(m, 10000);
        EmployeeUtilities.giveRaise(d1, 2000);
        EmployeeUtilities.giveRaise(d2, 200000);

        System.out.println("After Raise:");
        EmployeeUtilities.print(m);
        EmployeeUtilities.print(d1);
        EmployeeUtilities.print(d2);

	}

}