//8. Write a program to find the first set bit of a number?
import java.util.Scanner;

public class QuestionNo8{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number ;");
        int num =scan.nextInt();
        int count =1;
        while((num & 1) ==0){
            num = num>>1;
            count++;
        }
        System.out.println(count);

    }
}