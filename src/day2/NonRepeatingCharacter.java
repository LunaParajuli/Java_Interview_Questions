package day2;

//Find the First Non-Repeating Character

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NonRepeatingCharacter {

    static char nonRepeat(String str){

        String result="";

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
           boolean isRepeat = true;

           for(int j=0;j<str.length();j++){

               if(i!=j && currChar==str.charAt(j)){
                   isRepeat = false;
                   break;
               }

           }
           if(isRepeat){
               System.out.println("First non-repeating character: " + currChar);
break;
           }

        }

return '\0';
    }

    public static void main(String[] args){

        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter the string: ");
            String str = br.readLine();

            char ans = nonRepeat(str);

            System.out.println(ans);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
