package JAVA_888;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

       // list.stream().sorted().forEach(System.out::println); // Sorts alphabetically

        Set<Object> result = list.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toSet());

        //list.sort(Comparator.reverseOrder()); // Sorts in descending order
        System.out.println(result);

    }
}
