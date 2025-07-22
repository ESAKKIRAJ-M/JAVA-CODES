//2. Write a program to take in 10 values and print only those numbers which are prime.

import java.util.Scanner;
import java.util.Arrays;

public class Day2Part2Q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Range : ");
        int len = scan.nextInt();

        int[] arr = new int[len];
        int sum =0;
        for(int i=0;i<len;i++){
            System.out.println("Enter a Number " +(i+1) );
            arr[i] = scan.nextInt();
        }
        int count =0;
        for (int i = 0; i < len; i++) {
            int temp = arr[i];

            boolean isPrime = true;

            if (temp <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= temp / 2; j++) {
                    if (temp % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("The Prime Number is the : "+temp);
                count++;
            }

        }
        if(count==0){
            System.out.println("There is no Prime Number in the Array !!!!");
        }
        System.out.println(Arrays.toString(arr));

    }
}