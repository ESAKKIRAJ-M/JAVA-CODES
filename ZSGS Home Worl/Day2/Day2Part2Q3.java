//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it

import java.util.Scanner;
import java.util.Arrays;
public class Day2Part2Q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Range of Fibonacci : ");
        int num = scan.nextInt();

        int[] fib = new int[num];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < 30; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("First 30 Fibonacci numbers:");
        System.out.println(Arrays.toString(fib));
    }
}
