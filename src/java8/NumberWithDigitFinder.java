package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberWithDigitFinder {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(12, 23, 31, 44, 51, 60, 71, 82);
        
        List<Integer> numbersWithDigit1 = inputList.stream()
                .filter(num -> String.valueOf(num).contains("1"))
                .collect(Collectors.toList());
        
        System.out.println(numbersWithDigit1);
    }
}

