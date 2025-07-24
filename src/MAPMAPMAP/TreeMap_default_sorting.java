package MAPMAPMAP;

import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMap_default_sorting {
    public static void main(String[] args) {
        // Natural order (ascending)
        TreeMap<String, String> sortedMapAsc = new TreeMap<>();
        sortedMapAsc.put("banana", "yellow");
        sortedMapAsc.put("apple", "red");
        sortedMapAsc.put("grape", "purple");
        System.out.println("Ascending order: " + sortedMapAsc); // {apple=red, banana=yellow, grape=purple}

        // Custom order (descending)
        TreeMap<String, String> sortedMapDesc = new TreeMap<>(Comparator.reverseOrder());
        sortedMapDesc.put("banana", "yellow");
        sortedMapDesc.put("apple", "red");
        sortedMapDesc.put("grape", "purple");
        System.out.println("Descending order: " + sortedMapDesc); // {grape=purple, banana=yellow, apple=red}


    }
}
