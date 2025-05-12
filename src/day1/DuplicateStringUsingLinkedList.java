package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateStringUsingLinkedList {
    static  String removeDuplicate(String name){
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : name.toCharArray()) {
            if (seen.add(ch)) { // only add if it's not already seen
                result.append(ch);   //append means remove or not included
            }
        }
        return result.toString();
    }

    public static void main(String[] args){

        try{

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter the string: ");
            String name = br.readLine();

            String ans = removeDuplicate(name);
            System.out.println("The given string "+name+" after removing duplicate is: "+ans);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
