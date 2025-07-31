import java.util.Arrays;
import java.util.Scanner;
public class MyStrings{

    char[] strs;
    
    
    MyStrings(String str){
    
    this.strs = str.toCharArray();
    
    }
    
    public int Length(){
        int count =0;
        for(char a: this.strs){
        count++;
        }
        return count;
    }
    
    public char CharAt(int idx){
        return this.strs[idx];
    
    }
    
    public boolean equals(MyStrings other){
        
        int len = other.Length();
        if(len!=this.strs.length) return false;
        for(int i=0;i<len;i++){
            if(strs[i] != other.CharAt(i)) return false;
        }
        return true;

    }
    

    public MyStrings toUpperCase(){
        
        char[] ch = new char[this.strs.length];
        for(int i=0;i<this.strs.length;i++){
              
            if(this.strs[i]>='a' && this.strs[i]<='z') ch[i] =(char) (this.strs[i]-32);
            else ch[i] = this.strs[i];                
        }
        String str = "";
        for(int i=0;i<ch.length;i++){
            str += ch[i];

        }
        
        return new MyStrings(str);

    }

    public MyStrings toLowerCase(){
        
        char[] ch = new char[this.strs.length];
        for(int i=0;i<this.strs.length;i++){
              
            if(this.strs[i]>='A' && this.strs[i]<='Z') ch[i] =(char) (this.strs[i]+32);
            else ch[i] = this.strs[i];                
        }
        String str = "";
        for(int i=0;i<ch.length;i++){
            str += ch[i];

        }
        
        return new MyStrings(str);

    }

    public MyStrings substring(int start, int end){
        if(start<0){
            return new MyStrings("Index out of Bound Exception");
        }
        
        String s = "";
        for(int i=start;i<end;i++){
            s += this.strs[i];
        }
        
        return new MyStrings(s);
    }

    public MyStrings concat(MyStrings other){

        String s ="";
        for(int i=0;i<this.strs.length;i++){
            
            s += this.strs[i];
            
        }
        for(int i=0;i<other.strs.length;i++){
              s += other.strs[i]; 
            
        }

        return new MyStrings(s);


    }

    public boolean contains(MyStrings obj){
        int len1 = this.strs.length;
        int len2 = obj.Length();

        for(int i=0;i<=len1-len2;i++){
            MyStrings str = this.substring(i,i+len2);
            System.out.println(str);
            if(obj.equals(str)){

                return true;
            }
        }

        return false;
    }
    
    public int IndexOf(char ch){

        for(int i=0;i<this.strs.length;i++){
            if(ch == this.strs[i]){
                return i;
            }
        }
        return -1;
    }
    
   public MyStrings replace(char oldChar, char newChar) {

        for(int i=0;i<this.strs.length;i++){
            if(oldChar == this.strs[i]){
                this.strs[i] = newChar;
            }
        }

        return new MyStrings(this.toString());
   }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String s = "";

       for(int i=0;i<this.strs.length;i++){
            s += this.strs[i];
        }
        return s;
   }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("****** Enter a 1st Object******");
         
        
        
        MyStrings obj = new MyStrings(scan.nextLine());

         System.out.println("****** Enter a 2nd Object******");


        MyStrings obj2 = new MyStrings(scan.nextLine());

        System.out.println("Length() : "+obj.Length());
        
        System.out.println("IndexOf() : " + obj.IndexOf('e'));


        System.out.println("substring() : "+obj.substring(1, 3));

        System.out.println("concat() : "+obj.concat(obj2));

        System.out.println("equals() : "+obj.equals(obj2));

        System.out.println("CharAt() : "+obj.CharAt(0));

        System.out.println("toLowerCase() : "+obj.toLowerCase());

        System.out.println("toUpperCase() : "+obj.toUpperCase());
        
        System.out.println("contains() : "+obj.contains(obj2));

         System.out.println("replace() : " + obj.replace('k','S'));



        
        
        
    }
    
}
          
    

