package ArrayLists;

import java.util.*;
import java.util.stream.Collectors;

public class FindRepeated {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 1, 3);
        
        Set<Integer> seen = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();



        for (Integer num : numbers)
        {
            if (seen.contains(num))
            {  // add() returns false if element already exists
                repeated.add(num);
            }
            else
            {
                seen.add(num);
            }
        }
        System.out.println("Unique:"+seen);
        System.out.println("Repeated numbers: " + repeated);
    }
}