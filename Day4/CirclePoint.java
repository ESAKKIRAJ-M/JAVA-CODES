import java.util.Scanner;

class Point{
     private int x;
     private int y;

     Point(){
        x=0;
        y=0;
     }

     public void setPoint(int x,int y){
        this.x = x;
        this.y =y;

     }

     public int getX(){
        return x;
     }

     public int getY(){
        return y;
     }

     void printPoint(){
        System.out.println( "The Circles Center Point is: " + "(" + x + " , " + y + ")");

     }

     
}


class Circle extends Point{

    private double radius;

    Circle(int x , int y,int z){
        setPoint(x, y);
        setRadius(z);

    }

   public void setRadius(int a){
        if(a>0){
            this.radius = a;
        }
        else{
            this.radius = 1;
        }
        
   }

   public double getRadius(){
    return radius;
   }

   void printRadius(){
    System.out.println("The Radius Is : "+ getRadius());

   }

   public double area(){
        return (3.1415 * (radius * radius));
   }

   public void printArea(){
    System.out.println("The Area is : " + area());
   }



}


public class CirclePoint{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The X Value: ");
        int a = scan.nextInt();

        System.out.print("Enter The Y Value: ");
        int b = scan.nextInt();

        System.out.print("Enter a Radius: ");
        int r = scan.nextInt();

        Circle c = new Circle(a, b, r);

        c.printPoint();
        c.printRadius();
        c.printArea();







    }
}