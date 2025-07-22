//4. Write a program to do the following patterns using do...while loop?
//a) Pascal Triangle
//b) ZOHO
//CORP
//ORAT
//IONS
import java.util.Scanner;

public class Day2Q4b{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter A String : ");

        String str = scan.nextLine();

        System.out.println("Enter A No of Row : ");

        int num = scan.nextInt();

        int length = str.length();


        int idx =0;

        do {
                int i =0;
            do{
                if(idx<length){
                    System.out.print(str.charAt(idx));
                    idx++;
                }
                i++;
            }while (i<num);
            System.out.println();

        }while(idx<length);
    }
}


