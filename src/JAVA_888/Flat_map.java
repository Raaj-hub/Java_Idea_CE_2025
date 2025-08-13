package JAVA_888;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Flat_map {
    public static void main(String[] args) {
        List<String> fruits = asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        List<Integer> numbers = asList(5, 10, 15, 20, 25);


        List<? extends List<? extends Serializable>> result = asList(asList("Apple", "Banana", "Cherry", "Date", "Elderberry"),
                asList(5, 10, 15, 20, 25));

        List<? extends Serializable> res = result.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
