package day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countEachCharUsingColl {

    public static void countCharacters(String str) {
    Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
        if (charCount.containsKey(c)) {
            charCount.put(c, charCount.get(c) + 1);
        } else {
            charCount.put(c, 1);
        }
    }

    // Print character counts
        for (
    Map.Entry<Character, Integer> entry : charCount.entrySet())
        {
        System.out.println(entry.getKey() + ": " + entry.getValue());
        }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    countCharacters(input);

    scanner.close();
}

}
