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

            // Get a list of Map.Entry objects
            List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());

            // Sort the list by value using comparingByValue()
            Collections.sort(entryList, Map.Entry.comparingByValue());
            //Collections.sort(entryList, Map.Entry.comparingByKey());

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
