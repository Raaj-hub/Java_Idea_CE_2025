package MAPMAPMAP;

import java.util.*;
import java.util.stream.Collectors;

public class Sort_by_values {
    public static void main(String[] args) {


        Map<String, Double> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 10.0);
        unsortedMap.put("Orange", 5.2);
        unsortedMap.put("Banana", 7.5);

        LinkedHashMap<String, Double> sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}