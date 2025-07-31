
//1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

//1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

public class StudentDemo1 {


    String name = "EsakkiRaj";
    int roll_no = 1234567;

    public static void main(String[] args) {
        StudentDemo1 obj = new StudentDemo1();
        System.out.println("The Student Name is : "+obj.name);
        System.out.println("The Student RollNo is :"+obj.roll_no);
    }
}