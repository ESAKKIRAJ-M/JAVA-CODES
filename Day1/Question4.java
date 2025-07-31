//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a whether 1");
        int num1 = scan.nextInt();
        System.out.println("Enter a whether 2");
        int num2 = scan.nextInt();

        switch(num1 ^ num2){
            case 0 :
                System.out.println("is Equal");
                break;
            default:
                System.out.println("is not Equal");
                
        }
    }
}
