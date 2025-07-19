//Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.

public class Question2{

    

    public static void main(String[] args) {
    int intValue = 10;            // integer memory size(4 byte)  example ;  -2^31 to 2^31-1
    double doubleValue = 20.01212;   // double memory size(8 byte) example 15 decimal point more accurate
    float floatValue = 21.123f;        //float memory size(4 byte)  example 6 to 7 decimal point 
    long longValue = 12345678912345l;   // long memory size(8 byte)  example  	-2^63 to 2^63-1
    char character = 'a';               // char memory size(2 byte)  example   Unicode characters (0 to 65,535)
    byte byteValue = 123;               // byte memory size(1 byte)  example -128 to 127
    boolean check = true;           //     boolean memory size(1 bit internaly 1byte)

    System.out.println("Int Value : "+intValue +"\n" + "Double Value : "+ doubleValue + "\n"+"Float Value : "+floatValue +"\n" + "Long Value : "+longValue+ "\n" + 
    "Charecter : "+character +"\n" + "Byte Value : "+byteValue+ "\n" + "Boolean Value : "+check);
    

    }

}



