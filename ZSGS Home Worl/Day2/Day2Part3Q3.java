//3. Given a string s, reverse only all the vowels in the string and return it.
//‌
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//‌
//Example 1:
//Input: s = "hello"
//Output: "holle"


import java.util.Scanner;
public class Day2Part3Q3{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String : ");

        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        int left =0;
        int right = str.length()-1;

        while(left<=right){
            if(checkVowels(ch[left]) && checkVowels(ch[right])){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            else if(checkVowels(ch[left]) == false && checkVowels(ch[right])==true){
                left++;
            }
            else{
                right--;
            }
        }
        String res = "";
        int len = ch.length;
        for(int i =0;i<len;i++){
            res +=ch[i];
        }
        System.out.println(res);

    }
    public static boolean checkVowels(char s) {
        if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
            if ((s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') ||
                    (s == 'A' || s == 'I' || s == 'O' || s == 'U' || s == 'E')) {
                return true;
            }
        }
        return false;
    }
}