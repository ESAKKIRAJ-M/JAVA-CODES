//1. Given two binary strings a and b, return their sum as a binary string.
//Input: a = "11", b = "1"
//Output: "100"
import java.util.Scanner;
public class Day2Part3Q1{
    public static void main(String[] args) {
        String a ="11";
        String b ="1";
        int left = a.length()-1;
        int right = b.length()-1;
        int carry =0;
        StringBuilder output = new StringBuilder("");
        while(left>=0 || right>=0 || carry ==1){
            int temp1 = left>=0 ? a.charAt(left--)-'0':0;
            int temp2 = right>=0 ? b.charAt(right--)-'0':0;

            int sum = temp1 ^ temp2 ^ carry;
            carry = (temp1 & temp2) | (temp1 & carry) | (temp2 & carry);
            output.append(sum);

        }
        System.out.println(output.reverse().toString());
    }
}