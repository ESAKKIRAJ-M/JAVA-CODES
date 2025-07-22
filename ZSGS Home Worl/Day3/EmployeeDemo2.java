//6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//Name Year of joining Address
//Robert 1994 64C- WallsStreat
//Sam 2000 68D- WallsStreat
//John 1999 26B- WallsStreat
//Can use format method to format the above said output.


public class EmployeeDemo2 {
    String name;
    int year ;
    double salary;
    String address;

    EmployeeDemo2(String name,int year,double money,String add){
        this.name = name;
        this.year = year;
        this.salary = money;
        this.address = add;

    }

    void showDetails(){

        System.out.printf("%-20s %-20d %-25f %-30s\n", name, year, salary, address);


    }
    public static void main(String[] args) {
            EmployeeDemo2 emp1 = new EmployeeDemo2("Esakki",2000,122323.23,"Kovil Street");
        EmployeeDemo2 emp2 = new EmployeeDemo2("Esakki",2000,122323.23,"Kovil Street");
        EmployeeDemo2 emp3 = new EmployeeDemo2("Esakki",2000,122323.23,"Kovil Street");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-25s %-30s\n", "Name", "Year Of Joining", "Salary", "Address");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();
    }
}