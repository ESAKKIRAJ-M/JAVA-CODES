//7. Use both if and switch case statement  as two ways to find the grade of a student.
//Percent>=85 && Percent<=100 Grade ‘A’
//Percent>=70 Grade ‘B’
//Percent>=50 Grade ‘C’
//otherwise print ”Fail”


import java.util.Scanner;

public class Day2Q7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Persentage: ");

        int percentage = scan.nextInt();

        if(percentage>=85 && percentage<=100 ){
            System.out.println("Your Grade is : " + 'A');
        }
        else if(percentage >= 70 ){
            System.out.println("Your Grade is : " + 'B');
        }
        else if(percentage>=50){
            System.out.println("Your Grade is : " + 'C');
        }
        else{
            System.out.println("Your Grade is :" +"Fail !");
        }

        switch (percentage / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
            case 5:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Fail");
        }

    }
}