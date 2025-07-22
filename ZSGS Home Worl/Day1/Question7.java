//7. Write a program to check if a number is a power of 2?

import java.util.Scanner;

public class Question7{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number ; ");

        int num = scan.nextInt();

        //solution no 1;

        System.out.println(num>0 && (num & (num-1)) ==0 );


        // Alternate Solution 


        if(num<=0){
            System.out.println(false);
            return;
        }
        while(num%2 ==0){
            num = num/2;

        }

        System.out.println(num ==1);
    }
}