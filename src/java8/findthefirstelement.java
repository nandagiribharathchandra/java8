package java8;
import java.util.List;
import java.util.Arrays;

public class findthefirstelement{
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 10, 15, 20, 25);

        Integer firstElement = integerList.stream()
                .findFirst()
                .orElse(null); // Handle the case where the list is empty

        System.out.println("The first element is: " + firstElement);
   
}
}