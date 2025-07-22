//3. Write a program to do the following patterns using while loop?
//a)
//  1
//  2 3
//  4 5 6
//  7 8
//  9

import java.util.Scanner;

public class Day2Q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number Of Row : ");
        int n=scan.nextInt();

        int no = (n+1)/2;

        int num =1;
        for(int i =1;i<=n;i++){
            int count;

            if(i<=no){
                count=i;

            }
            else {
                count = n-i+1;

            }

            for(int j=1;j<=count;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }




    }
}