//2. Write a program to do the following patterns using for loop?
//a)
//  1 1 R R R R
//  1 1 R R
//  1 R R R R
//  1 1 R R
//  1 1 R R


import java.util.Scanner;

public class Day2Q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number of Rows :");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            int ones = 0;
            int rs = 0;

            if(i ==1){
                ones = 2;
                rs = 4;
            }
            else if(i == 3){
                ones =1;
                rs = 4;
            }
            else // if(i==2 || i==4||i==5)
                {
                ones = 2;
                rs = 2;
            }

            for(int j = 0;j<ones;j++){
                System.out.print("1 ");
            }

            for(int k=0;k<rs;k++){
                System.out.print("R ");
            }

            System.out.println();
        }
    }
}