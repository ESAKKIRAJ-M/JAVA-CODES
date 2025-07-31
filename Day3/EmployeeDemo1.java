//3. Write a Java program where you define a class named Employee. Inside the class, define fields to
// hold an employee’s name, employee ID, designation, and salary.
//a. First, create a no-argument constructor that prints a message saying the object has been created,
// and sets default values for all the fields.
//b. Write a parametrized constructor that allows you to set values for all the fields when an
// object is created.
//c. Add another constructor — a copy constructor — that takes an existing
// employee object and creates a new one with the same values.
//In the main method, create:
//a. One object using the no-argument constructor,
//b. One object using the parametrized constructor,
//c. And a third object using the copy constructor.
//Finally, display the details of all three employees.

public class EmployeeDemo1 {

    String name;
    int employeeId;
    String designation;
    double salary;

    EmployeeDemo1() {
        System.out.println("No-argument constructor called. Employee object created.");
        name = "Default Name";
        employeeId = 0;
        designation = "Unassigned";
        salary = 0.0;
    }

    EmployeeDemo1(String name,int id,String des,double salary) {
        System.out.println("Parameterized constructor called.");
        this.name = name;
        this.employeeId = id;
        this.designation = des;
        this.salary = salary;
    }

    EmployeeDemo1(EmployeeDemo1 e){
        System.out.println("Copy constructor called.");
        this.name = e.name;
        this.employeeId = e.employeeId;
        this.designation = e.designation;
        this.salary = e.salary;

    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        EmployeeDemo1 emp1 = new EmployeeDemo1();
        emp1.displayDetails();

        EmployeeDemo1 emp2 = new EmployeeDemo1("esakkiraj",1234567,"Developer",122344512.32);
        emp2.displayDetails();

        EmployeeDemo1 emp3 = new EmployeeDemo1(emp2);
        emp3.displayDetails();



    }
}




