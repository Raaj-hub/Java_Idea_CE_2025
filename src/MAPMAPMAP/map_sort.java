package MAPMAPMAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class map_sort {
        public static void main(String[] args) {
            Map<String, String> unsortedMap = new HashMap<>();
            unsortedMap.put("banana", "yellow");
            unsortedMap.put("mango", "red");
            unsortedMap.put("grape", "purple");

            Map<String, String> sortedMap = unsortedMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue
                           // (oldValue, newValue) -> oldValue, // Merge function for duplicate keys (not relevant here)
                            //LinkedHashMap::new // Use LinkedHashMap to preserve insertion order
                    ));
           // System.out.println("Sorted using Stream: " + sortedMap); // {apple=red, banana=yellow, grape=purple}
            sortedMap.forEach((key, value) -> out.println(key + ": " + value));

            sortedMap.values().forEach(System.out::println);//no effect on this method bcz comapringByKey()
            sortedMap.keySet().forEach(System.out::println);


        }

}
