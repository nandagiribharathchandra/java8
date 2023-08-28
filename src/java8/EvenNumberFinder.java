package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFinder {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,10,12,16);
        
        List<Integer> evenNumbers = inputList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        
        System.out.println(evenNumbers);
    }
}


