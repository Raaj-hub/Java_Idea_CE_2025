package practiceHere;

import java.util.*;

public class find_dup_elements {
    public static void main(String[] args) {
        int[] n={2,6,4,2,4,9,0,};
        char c[] = {'A', 'B', 'B', 'A', 'E'};
        String str[] = {"raj", "amz", "raj", "pfc","amz"};

        Integer[] a = new Integer[n.length];
                Arrays.setAll(a, i->n[i]);
        System.out.println(Arrays.toString(a));

       // DupIntegers(a);
       // DupeChars(c);
        DupStrings(str);


    }

    private static void DupStrings(String[] str) {
        Set<String> set = new HashSet<>(Arrays.asList(str));
        System.out.println(set);


    }

    private static void DupeChars(char[] c) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (Character ch : c) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }

            System.out.println(map);
        }
        System.out.print("Repeated: ");
        for(Character ch : c){
            if (map.get(ch) > 1) {

                System.out.print(ch+"\t");
                break;
            }
        }
    }

    private static void DupIntegers(Integer[] a)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : a)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i, 1 );
            }
        }
        for(Integer i : a)
        {
            if(map.get(i) ==1 )
            {
                System.out.println("Only NON repeated values : "+i);

            }
            if(map.get(i) > 1)
            {
                System.out.println("Repeated values : "+i);
            }
        }

    }

}
