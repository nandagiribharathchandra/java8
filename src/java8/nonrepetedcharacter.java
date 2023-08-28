package java8;
import java.util.LinkedHashMap;
import java.util.Map;

public class nonrepetedcharacter {
    public static void main(String[] args) {
        String input = "aabbcdefcgh";
        char firstnonRepeated = findFirstNonRepeatedCharacter(input);
        System.out.println("First non repeated character: " + firstnonRepeated);
    }
    
    public static char findFirstNonRepeatedCharacter(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        
        // Count character occurrences using a LinkedHashMap
        input.chars().forEach(c -> charCountMap.merge((char) c, 1, Integer::sum));
        
        // Find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '\0'; // No non-repeated character found
    }
}
