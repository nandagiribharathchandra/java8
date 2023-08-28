package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sortallvalues {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        List<Integer> sortedNumbers = sortList(numbers);

        System.out.println("Sorted numbers: " + sortedNumbers);
    }

    public static List<Integer> sortList(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
