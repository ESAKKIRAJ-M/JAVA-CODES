
//6. Define a method to convert the decimal number to a binary number?
import java.util.Scanner;
public class Day2Q6{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Decimal Number : ");
        int num = scan.nextInt();
        System.out.println(Day2Q6.binary(num));

    }
    static StringBuffer str =new StringBuffer("");

    static StringBuffer binary(int n){
        if(n !=0){
            int temp = n & 1;
            str.append(temp);

        }
        else{

            return str.reverse();

        }
        return binary(n>>1);
    }
}