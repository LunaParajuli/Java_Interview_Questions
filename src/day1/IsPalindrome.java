package day1;

//. Check if a String is a Palindrome

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsPalindrome {

    static String isPal(String name){

        String reverse="";

        for(int i=name.length()-1;i>=0;i--){
            reverse = reverse + name.charAt(i);

        }
        if(reverse.equals(name)){
            System.out.println("The given string "+name+" is paindrome...");

        }
        else{

            System.out.println("The given string "+name+" is not paindrome...");

        }
return reverse;
    }


    public static void main(String[] args){
        try{

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter any String:  ");
            String name = br.readLine();

            String resul = isPal(name);

            System.out.println("The reverse of "+name+" is: "+resul);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
