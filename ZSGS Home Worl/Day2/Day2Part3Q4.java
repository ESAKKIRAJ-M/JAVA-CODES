

import java.util.Scanner;

public class Day2Part3Q4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a First String : ");
        String str1 = scan.nextLine();
        System.out.print("Enter a Second String : ");
        String str2 = scan.nextLine();

        int[] free = new int[27];

        for(int i=0;i<str1.length();i++){
            free[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            free[str2.charAt(i)-'a']++;
        }

        for(int i=0;i<free.length;i++){
            if(free[i] == 1){

                System.out.println((char) ('a'+i));
                return;
            }
        }


    }
}