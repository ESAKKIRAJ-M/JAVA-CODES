import java.util.Scanner;
public class PatternR{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a Number of Row x Column : "); 
    int num = scan.nextInt();
    int mid = (num/2);
    for(int i=0;i<num;i++){
       
       for(int j=0;j<num;j++){
           if(i==0){
                System.out.print("R ");
           }
           else if(j==0){
                System.out.print("R ");
           }
           else if(i==mid){
                System.out.print("R ");
           }
           else if(mid>i && j==num-1){
                System.out.print("R ");
           }
           else if(mid<i && i==j){
                System.out.print("R ");
           }
           else{
                System.out.print("  ");
           }
       }
        System.out.println();
    }
  }
}
  
  
  
  
