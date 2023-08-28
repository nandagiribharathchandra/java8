package java8;

import java.util.HashSet;
import java.util.Set;

public class firstrepetedcharacte {
    public static void main(String[] args) {
        String input = "abcdefcgh";
        char firstRepeated = findFirstRepeatedCharacter(input);
        if (firstRepeated != '\0') {
            System.out.println("First repeated character: " + firstRepeated);
        } else {
            System.out.println("No repeated character found.");
        }
    }
    
    public static char findFirstRepeatedCharacter(String input) {
        Set<Character> charSet = new HashSet<>();
        
        // Use a stream to iterate over the characters in the input string
        // and find the first repeated character
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !charSet.add(c)) // Adds to set and returns false if already present
                .findFirst()
                .orElse('\0'); // Return '\0' if no repeated character found
    }
}
