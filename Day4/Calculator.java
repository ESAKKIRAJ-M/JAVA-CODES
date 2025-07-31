 class BasicCalculator{

    public int add(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public double divide(int a,int b){
        return a/b;
    }

    public int multiply(int a,int b){
        return a*b;
    }

}

class AdvancedCalculator extends BasicCalculator{
    public double power(double base,double ex){
        double sum =1;

        for(int i=1;i<=ex;i++){
            sum *= base;

        }
        return sum;
    }

    public int modulus(int a,int b){
        return a % b;
    }

    public double squareRoot(double number){
        double start =0;
        double end = number;
        double mid =0;

        double ep = 0.000001;

        while ((end-start)>ep) {
            mid = (start+end)/2;

            double square = mid*mid;

            if(square<number){
                start = mid;
            }
            else{
                end = mid;
            }
        }

        return (start + end)/2;
    }
}


class ScientificCalculator extends AdvancedCalculator{

    public double radian(double degree){
        double temp = degree * (Math.PI / 180);
        return temp;
    }

    public double fact(int a){
        double sum =1;
        
        for(int i=1;i<=a;i++){
            sum*= i;

        }
        return sum;
    }

    public double Mysin(double angle){
        double x = radian(angle);
        double sum = 0;
        
      
        for(int i=0;i<5;i++){
            
        int pow = 2 * i + 1;  
        double term = power(x, pow) / fact(pow);

            if(i%2 ==0){
                sum += term;
            }
            else{
                sum -= term;
            }
        }

        return sum;
    }

    public double Mycos(double angle){
        double x = radian(angle);
        double sum = 0;
        
      
        for(int i=0;i<5;i++){
            
        int pow = 2 * i ;  
        double term = power(x, pow) / fact(pow);

            if(i%2 ==0){
                sum += term;
            }
            else{
                sum -= term;
            }
        }

        return sum;
    }

    public double MyLog(double b    )
}


public class Calculator{
    public static void main(String[] args) {
        ScientificCalculator obj = new ScientificCalculator();


        
       
    }
}