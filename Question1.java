//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?


class Question{

    static int staticNum;    // its a Static Variable

    Question(int a){           // parameterized constructor
        this.staticNum= a;
        System.out.println("Static Variable: "+staticNum);  
    }

    int instanceNum = 10;         //its instance variable 

    void insAccess(){
        System.out.println("Instance Variable : "+instanceNum);
    }

    void demonstrateScope() {

       
        int localVar = 100;         // local variable only use inside the method

        System.out.println("Local variable: " + localVar);

        
        if (localVar > 50) {

            int blockVar = 200;                 // block variable only inside the block

            System.out.println("Block variable: " + blockVar);
        }

}


        final int finalValue =10; //Final Variable

}

public class Question1{
    public static void main(String[] args) {
        Question obj = new Question(10);
        obj.insAccess();
        obj.demonstrateScope();
        //obj.finalValue = 20;   donot change final variable\
        System.out.println("final Value :"+obj.finalValue);
    }
}