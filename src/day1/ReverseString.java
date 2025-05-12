package day1;

//Reverse a String

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {

    static String revString(String name){

        String reversed="";
        for( int i= name.length()-1;i>=0;i--){
            reversed = reversed + name.charAt(i);
        }
return reversed;
    }

    public static void main(String[] args){
        try{

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter any String:  ");
            String name = br.readLine();

            String result = revString(name);

            System.out.println("The reverse of "+name+" is: "+result);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
