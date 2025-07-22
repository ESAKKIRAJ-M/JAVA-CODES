
//9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor 
//Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?

import java.util.Scanner;

public class Question9 {
    
    String employeeId;
    
    String employeeName;

    String department;

    double salary;


    Question9(String id, String name, String department, double salary){
        this.employeeId = id;
        this.employeeName = name;
        this.department = department;
        this.salary = salary;
    }

    void printEmployeeDtls(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Employee Name : " + employeeName);
        System.out.println(" ");
        System.out.println("Employee ID : " + employeeId);
        System.out.println(" ");
        System.out.println("Employee Department : " + department);
        System.out.println(" ");
        System.out.println("Employee Salary : " + salary);
        System.out.println(" -----------------------------------------------------------------------");

        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Employee Id ;");
        String id = scan.nextLine();
        System.out.println("Enter Employee Name ;");
        String name = scan.nextLine();
        System.out.println("Enter Employee Department ;");
        String dep = scan.nextLine();
        System.out.println("Enter Employee Salary ;");
        double salary = scan.nextDouble();

        Question9 obj = new Question9(id, name, dep, salary);
        System.out.println(" ");
        obj.printEmployeeDtls();
    }


}

