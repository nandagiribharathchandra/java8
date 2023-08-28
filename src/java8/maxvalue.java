package java8;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class maxvalue {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 10, 15, 20, 25);

        Integer maxValue = integerList.stream()
                .max(Comparator.naturalOrder())
                .orElse(null); // Handle the case where the list is empty

        System.out.println("The maximum value is: " + maxValue);
    }
}


