package MAPMAPMAP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByValues_Asce_Desc
{

        public static void main(String[] args) {
            Map<String, Integer> unsortedMap = new HashMap<>();
            unsortedMap.put("apple", 3);
            unsortedMap.put("banana", 1);
            unsortedMap.put("orange", 5);
            unsortedMap.put("grape", 2);
            unsortedMap.put("mango", 4);
            System.out.println(unsortedMap);
            unsortedMap.values().forEach(System.out::print);
            System.out.println();

            // Get a list of Map.Entry objects
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

            System.out.println("List map entry list:"+entryList);
            // Sort the list by value using comparingByValue()
            Collections.sort(entryList, Map.Entry.comparingByValue());
            //Collections.sort(entryList, Map.Entry.comparingByKey());

            entryList.forEach(value -> System.out.println( ": " + value));
            entryList.forEach(System.out::println);

            System.out.println("Sorted Map by Value (Ascending):");
            for (Map.Entry<String, Integer> entry : entryList) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

            // Sort in descending order
            Collections.sort(entryList, Map.Entry.<String, Integer>comparingByValue().reversed());
            System.out.println("\nSorted Map by Value (Descending):");
            for (Map.Entry<String, Integer> entry : entryList) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
}
