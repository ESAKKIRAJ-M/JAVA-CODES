//1. Given two binary strings a and b, return their sum as a binary string.
//Input: a = "11", b = "1"
//Output: "100"
//‌
//Input: a = "1010", b = "1011"
//Output: "10101"



import java.util.Scanner;
public class Day2Part3Q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number :");
        int columnNumber = scan.nextInt();
        String str = "";
        while(columnNumber>0){
            columnNumber--;
            int temp = columnNumber % 26;

            char ch = (char)('A'+temp);

            columnNumber = columnNumber/26;

            str = ch + str;

        }
        System.out.println(str);
    }
}