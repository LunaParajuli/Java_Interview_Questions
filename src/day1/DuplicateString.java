package day1;

//Remove Duplicates from a String

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DuplicateString {

    static  String duplicateString(String name){
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            boolean isDuplicate = false;

            // Check if currentChar already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to result
            if (!isDuplicate) {
                result += currentChar;
            }
        }

        return result;

    }


    public static void main(String[] args){

        try{

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter the string: ");
            String name = br.readLine();

            String ans = duplicateString(name);
            System.out.println("The given string "+name+" after removing duplicate is: "+ans);


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}
