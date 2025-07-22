//5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//‌
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//‌
//Example 1:
//Input: s = "abc", t = "ahbgdc"
//Output: true
import java.util.Scanner;

public class Day2Part3Q5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a first String : ");

        String s = scan.nextLine();

        System.out.print("Enter a Second String : ");

        String t = scan.nextLine();

        int left =0;
        int right =0;

        while(left<s.length() && right<t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
            }
            else{
                right++;
            }
        }

        if(left == s.length()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}