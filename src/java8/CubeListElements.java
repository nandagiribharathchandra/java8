package java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CubeListElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        
        List<Integer> cubedNumbers = numbers.stream()
            .map(number -> number * number * number)
            .collect(Collectors.toList());
            
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Cubed Numbers: " + cubedNumbers);
    }
}


