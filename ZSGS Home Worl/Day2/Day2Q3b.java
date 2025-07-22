////3. Write a program to do the following patterns using while loop?
////a)
////  W
////  W W
////  W W W 
////  W W
////  W
import java.util.Scanner;

public class Day2Q3b{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number Of Row : ");
        int n=scan.nextInt();

        int no = (n+1)/2;

        for(int i =1;i<=n;i++){
            int count;

            if(i<=no){
                count=i;

            }
            else {
                count = n-i+1;

            }

            for(int j=1;j<=count;j++){
                System.out.print("W" + " ");

            }
            System.out.println();
        }




    }
}