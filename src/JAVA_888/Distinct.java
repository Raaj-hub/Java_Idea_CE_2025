package JAVA_888;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(list);

        List<Object> result = list.stream().distinct().collect(Collectors.toList());

        System.out.println(result);
    }
}
