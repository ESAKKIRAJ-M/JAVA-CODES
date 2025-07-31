import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String empName;
    private String empId;
    private String empType;
    double salary;

    Employee() {}

    Employee(String name, String id, String type) {
        this.empName = name;
        this.empId = id;
        this.empType = type;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpType() {
        return empType;
    }

    public double getSalary() {
        return salary;
    }

    public void calculateSalary() {
        salary = 0;
    }
}

class FullTimeEmployee extends Employee {
    ArrayList<FullTimeEmployee> emp = new ArrayList<>();

    int days;
    String roll;
    Scanner scan = new Scanner(System.in);

    FullTimeEmployee() {}

    FullTimeEmployee(String name, String id, String type, int days, String roll) {
        super(name, id, type);
        this.days = days;
        this.roll = roll;
    }

    public String getEmpRole() {
        return roll;
    }

    public int getWorkingDays() {
        return days;
    }

    @Override
    public void calculateSalary() {
        salary = days * 1000;
    }

    void addFullEmployee() {
        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Your Employee ID: ");
        String id = scan.nextLine();
        System.out.print("Enter Working Type: ");
        String type = scan.nextLine();
        System.out.print("Enter Your Role: ");
        String roll = scan.nextLine();
        System.out.print("Enter Working Days: ");
        int days = scan.nextInt();
        scan.nextLine(); // consume newline

        FullTimeEmployee full = new FullTimeEmployee(name, id, type, days, roll);
        full.calculateSalary();
        emp.add(full);
        System.out.println(" Full-Time Employee Added Successfully!\n");
    }

    void displayFull() {
        if (emp != null && !emp.isEmpty()) {
            System.out.println("====== Full Time Employee Details ======");
            for (Employee e : emp) {
                FullTimeEmployee f = (FullTimeEmployee) e; 
                System.out.println("Employee Name  : " + e.getEmpName());
                System.out.println("Employee ID    : " + e.getEmpId());
                System.out.println("Employee Type  : " + e.getEmpType());
                System.out.println("Employee Role  : " + f.getEmpRole());
                System.out.println("Working Days   : " + f.getWorkingDays());
                System.out.println("Employee Salary: ₹" + e.getSalary());
                System.out.println("--------------------------------------");
            }
        } else {
            System.out.println(" No Employee Data Available");
        }
    }
}

class PartTimeEmployee extends Employee {
    ArrayList<PartTimeEmployee> emp = new ArrayList<>();

    float hours;
    String roll;
    Scanner scan = new Scanner(System.in);

    PartTimeEmployee() {}

    PartTimeEmployee(String name, String id, String type, float hours, String roll) {
        super(name, id, type);
        this.hours = hours;
        this.roll = roll;
    }

    public String getEmpRole() {
        return roll;
    }

    public float getWorkingDays() {
        return hours;
    }

    @Override
    public void calculateSalary() {
        salary = hours * 300;
    }

    void addPartEmployee() {
        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Your Employee ID: ");
        String id = scan.nextLine();
        System.out.print("Enter Working Type: ");
        String type = scan.nextLine();
        System.out.print("Enter Your Role: ");
        String roll = scan.nextLine();
        System.out.print("Enter Working Hours: ");
        float hour = scan.nextFloat();
        scan.nextLine(); 

        PartTimeEmployee part = new PartTimeEmployee(name, id, type, hour, roll);
        part.calculateSalary();
        emp.add(part);
        System.out.println(" Part - Time Employee Details Added Successfully!\n");
    }

    void displayPart() {
        if (emp != null && !emp.isEmpty()) {
            System.out.println("====== Part Time Employee Details ======");
            for (Employee e : emp) {
                PartTimeEmployee f = (PartTimeEmployee) e; 
                System.out.println("Employee Name  : " + e.getEmpName());
                System.out.println("Employee ID    : " + e.getEmpId());
                System.out.println("Employee Type  : " + e.getEmpType());
                System.out.println("Employee Role  : " + f.getEmpRole());
                System.out.println("Working Days   : " + f.getWorkingDays());
                System.out.println("Employee Salary: ₹" + e.getSalary());
                System.out.println("--------------------------------------");
            }
        } else {
            System.out.println(" No Employee Data Available");
        }
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FullTimeEmployee full = new FullTimeEmployee();
        PartTimeEmployee part = new PartTimeEmployee();
        int type;

        do {
            System.out.println("\n***** Employee Menu *****");
            System.out.println("1. Add Full-Time Employee Details");
            System.out.println("2. Print Full-Time Employee Details");
            System.out.println("3. Add Part-Time Employee Details ");
            System.out.println("4. Print Part-Time Employee Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            type = scan.nextInt();
            scan.nextLine(); 

            switch (type) {
                case 1:
                    full.addFullEmployee();
                    break;
                case 2:
                    full.displayFull();
                    break;
                case 3:
                    part.addPartEmployee();
                    break;
                case 4:
                    part.displayPart();
                    break;
                case 5 :
                    System.out.println(" Exiting... Thank you!");
                    break;
                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        } while (type != 5);
    }
}
