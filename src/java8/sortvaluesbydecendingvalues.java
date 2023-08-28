package java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sortvaluesbydecendingvalues {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        List<Integer> sortedDescendingNumbers = sortListDescending(numbers);

        System.out.println("Sorted numbers in descending order: " + sortedDescendingNumbers);
    }

    public static List<Integer> sortListDescending(List<Integer> numbers) {
        return numbers.stream()
                .sorted((a, b) -> b.compareTo(a)) // Compare in reverse order
                .collect(Collectors.toList());
    }
}


