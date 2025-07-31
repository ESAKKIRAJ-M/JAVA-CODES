//6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//‌
//You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
//‌
//Example 1:
//Input: num1 = "11", num2 = "123"
//Output: "134"
//‌
//Example 2:
//Input: num1 = "456", num2 = "77"
//Output: "533"


import java.util.Scanner;

public class Day2Part3Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a First Number In String : ");
        String str1 = scan.nextLine();
        System.out.print("Enter a First Second In String : ");
        String str2 = scan.nextLine();

        int num1 =0;
        int num2 =0;

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            num1 = (num1 *10) +(ch - '0');

        }
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            num2 = (num2 *10) +(ch - '0');

        }

        int sum = num1+num2;
        System.out.println(""+sum);
    }
}