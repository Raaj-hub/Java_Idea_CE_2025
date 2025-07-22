package MAPMAPMAP;

import java.util.*;
import java.util.stream.Collectors;

public class Dup_elements {
    public static void main(String[] args) {
        int[] n={2,6,4,2,4,9,0,};
        char c[] = {'A', 'B', 'B', 'A', 'E'};
        String str[] = {"raj", "amz", "raj", "pfc"};

        List<Integer> list = Arrays.stream(n).boxed().collect(Collectors.toList());
        System.out.println(list);

        Set<Integer> set = Arrays.stream(n).boxed().collect(Collectors.toSet());
        System.out.println(set);

        Set<Integer> s= new HashSet<>();
        for(int i=0 ;i<n.length; i++)
        {
            s.add(n[i]);
        }
        System.out.println(s);
        //s.forEach(k-> System.out.print("ext for loop:"+k+" "));

        duplicteChars(n);
        dupStrings(str);

        //remove dupes
        Set<Character> sc = new HashSet<>();
        for(char ch : c)
        {
            sc.add(ch);
        }
        System.out.println(sc);
    }

    private static void dupStrings(String[] str) {
        Map<String, Integer> map ;
        map = new HashMap<>();
       for(String s : str)
       {
           if(!map.containsKey(s))
           {
               map.put(s,1);
           }
           else
           {
               map.put(s,map.get(s)+1);
           }
       }
    }

    private static void duplicteChars(int[] n) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i <= n.length - 1; i++) {
            if (!map.containsKey(n[i])) {
                map.put(n[i], 1);
            } else {
                map.put(n[i], map.get(n[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // System.out.println(entry.getKey()+" "+entry.getValue());
            if (entry.getValue() > 1) {
                System.out.println("All duplicate chars in a string:" + (entry.getKey() + " " + entry.getValue()));
            }

        }

        for (int ch : n) {
            if (map.get(ch) > 1) {
                System.out.println("first repeated char:" + ch);
                break;
            }
        }

        for (int ch : n) {
            if (map.get(ch) == 1) {
                System.out.println("first non repeated  char:" + ch);
                break;
            }
        }
    }}
