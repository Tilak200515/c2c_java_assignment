package java_Assignment_1.utilities;

import java_Assignment_1.employees.Employee;

public class EmployeeUtilities {
    public static void giveRaise(Employee employee, double amount) {
        employee.setSalary(employee.getSalary() + amount);
    }

    // Method to print employee details
    public static void print(Employee employee) {
        System.out.println(employee.empprint());
        
        System.out.println("-------------------");
    }
}
//