//1. Write a program that creates an integer array of 10 elements, accepts values of
// arrays and Find the sum of all odd numbers.

import java.util.Scanner;
import java.util.Arrays;

public class Day2Part2Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Range : ");
        int len = scan.nextInt();

        int[] arr = new int[len];
        int sum =0;
        for(int i=0;i<len;i++){
            System.out.println("Enter a Number " +(i+1) );
            arr[i] = scan.nextInt();

            if(arr[i]%2 !=0){
                sum+=arr[i];
            }
        }





        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}