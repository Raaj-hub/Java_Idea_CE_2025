package JAVA_888;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        int[] numbers = {3,5,9,2,10,18,1};
        String[] str;
        str = new String[]{"raj", "amz", "raj", "pfc"};
        char c[] = {'A', 'B', 'B', 'A', 'E'};

        Integer[] nums = new Integer[numbers.length];
        Arrays.setAll(nums, i-> numbers[i]);
        System.out.println(Arrays.toString(nums));

        Character[] chars = new Character[c.length];
        Arrays.setAll(chars, i-> c[i]);

        List<Integer> ListOf = List.of(nums);
        List<String> ListOfStr = List.of(str);

        List<Integer> AsList = Arrays.asList(nums);
        List<Character> AsListChar = Arrays.asList(chars);

            System.out.println(AsList.set(0,99));
       // System.out.println(ListOf.set(0,99));



        List<Integer> result = AsList.stream().filter(m->m>5)
                .collect(Collectors.toList());
        System.out.println("Filtered numbers greter than 5: "+result);


    }

}
