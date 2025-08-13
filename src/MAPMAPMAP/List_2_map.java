package MAPMAPMAP;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class List_2_map {
    public static void main(String[] args) {


    List cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa");
System.out.println("list: " + cards);

        Map<String,Integer> cards2Length = (Map<String, Integer>) cards.stream()
            .collect(Collectors.toMap(Function.identity(),
                    String::length,
                    (e1, e2) -> e1,
                    LinkedHashMap::new));
System.out.println("map: " + cards2Length);


//Method 1: Using Collectors.groupingBy with counting()
        List<String> list = Arrays.asList("apple","banana","apple",
                "Mango","apple","banana","Drakshi");
        System.out.println(list);

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        //LinkedHashMap::new,
                        Collectors.counting()));
        System.out.println(map);


        //Method 2: Modifying your existing toMap approach
//        List<String> lists = Arrays.asList("apple","banana","apple",
//                "Mango","apple","banana","Drakshi");
//        System.out.println(lists);
//
//        Map<String, Integer> maps = list.stream()
//                .collect(Collectors.toMap(Function.identity(),
//                        s -> 1,  // Start with count of 1
//                        Integer::sum,  // Add counts for duplicates
//                        LinkedHashMap::new));
//
//        System.out.println(maps);

        //Method 3: Using frequency method (simpler approach)
//        List<String> list = Arrays.asList("apple","banana","apple",
//                "Mango","apple","banana","Drakshi");
//        System.out.println(list);
//
        Map<String, Integer> mapp = new LinkedHashMap<>();
        for (String item : list.stream().distinct().collect(Collectors.toList())) {
            mapp.put(item, Collections.frequency(list, item));
        }

        System.out.println(mapp);
}}

