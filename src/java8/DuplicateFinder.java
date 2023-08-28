package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 6, 1);
        
        Map<Integer, Long> frequencyMap = inputList.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        
        List<Integer> duplicates = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        
        System.out.println(duplicates);
    }
}



