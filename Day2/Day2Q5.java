import java.util.Scanner;

public class Day2Q5{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Range of sum :");

        int num = scan.nextInt();
        int sum =0;
        for(int i=0;i<num;i++){
            if(i%2 !=0) continue;

            sum += i;
        }
        System.out.println("The Total Sum is  : "+sum);
    }
}