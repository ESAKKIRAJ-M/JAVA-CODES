//5. Write a program that illustrate the execution order of static block and initializer block?

public class Question5 {

    static                                                      // static block
    {
        System.out.println("Hii Iam a Static Block");
    }

    {
        System.out.println("Hii iam Initializer Block");           // instance block
    }

    Question5(String a)                                             // constructor
    {
        System.out.println("name is :" + a);
    }
    public static void main(String[] args) {
        
       Question5 obj1 = new Question5("EsakkiRaj");
       Question5 obj2 = new Question5("Esakki");

       

    }
}
