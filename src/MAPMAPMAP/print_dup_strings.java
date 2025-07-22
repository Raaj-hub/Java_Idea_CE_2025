package MAPMAPMAP;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;

public class print_dup_strings {
    public static void main(String[] args) {
        String str[] = {"raj", "amz", "raj", "pfc"};
        char c[] = {'A', 'B', 'B', 'A', 'E'};
        int[] n={2,6,4,2,4,9,0,};

        Set<Character> sch = new HashSet<>();
        Set<String> set = new HashSet<>();
        Set<Integer> si = new HashSet<>();


        Collections.addAll(set,str);


        System.out.println(set);
        for(String s: str)
        {
            set.add(s);
        }

        System.out.println(set);
    }


}

