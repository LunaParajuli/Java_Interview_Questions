package day2;

//Count the Occurrences of Each Character

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountEachChar {

    public static void countCharacters(String str) {
        // Convert string to char array
        char[] chars = str.toCharArray();
        boolean[] counted = new boolean[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (counted[i]) {
                continue; // Skip already counted characters
            }

            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    counted[j] = true; // Mark as counted
                }
            }

            System.out.println(chars[i] + ": " + count);
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string: ");
            String input = br.readLine();

            countCharacters(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }


