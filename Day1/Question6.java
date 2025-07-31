
//6. Write a program that illustrate the Explicit type casting?

public class Question6 {
    
    public static void main(String[] args) {
        byte ByteValue = 123;
        
        short ShortValue = ByteValue;            // byte to sort

        byte ShortToByte = (byte)ShortValue;     // short to Byte

        int IntValue = ShortValue;               //Short to integer

        byte IntToByte = (byte) IntValue;       // integer to byte

        long LongValue = 12345678765432l;       

        int Interger1 = (int)LongValue;         //long to Integer

        double DoubleValue = 2345.2342112;      

        float doubleTofloat = (float) DoubleValue;      // double to float

        int num = 98;

        char IntToChar = (char) num;                // integer to character

        int charToInt = (int) IntToChar;               // character to integer





            System.out.println("Byte to Short : "+ ShortValue + "\n" +"Short to Byte : "+ ShortToByte+ "\n" +
            " Short to integer: "+ IntValue + "\n" + "int to Byte : "+ IntToByte +"\n"+"Long to Int : "+ Interger1+ "\n"+ "Double to Float : "+ doubleTofloat +"\n"+
            "Integer to Character : "+ IntToChar +"\n"+"Char to int : "+ charToInt );
        

        
    }
}
