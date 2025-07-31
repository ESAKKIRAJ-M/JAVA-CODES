import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int num = scan.nextInt();
        
        
        if (num % 2 == 0) {
            num++;  
        }
        
        int mid = num / 2;
        int count = 1;
        
        
        int i = 0;
        while (i <= mid) {
            int j = 0;
            while (j < mid - i) {
                System.out.print(" ");
                j++;
            }
            int x = 0;
            while (x <= i) {
                System.out.print(count + " ");
                count++;
                x++;
            }
            System.out.println();
            i++;
        }
        
        
        i = mid + 1;
        while (i < num) {
            int j = 0;
            while (j < i - mid) {
                System.out.print(" ");
                j++;
            }
            int x = 0;
            while (x < num - i) {
                System.out.print(count + " ");
                count++;
                x++;
            }
            System.out.println();
            i++;
        }
        
        
    }
}

