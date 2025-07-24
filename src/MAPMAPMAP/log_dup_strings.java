package MAPMAPMAP;

import java.util.HashSet;
import java.util.Set;

public class log_dup_strings {
    public static void main(String[] args) {
        String str[] = {"raj", "amz", "raj", "pfc", "amz"};
        int[] n = {2, 6, 4, 2, 4, 9, 0,};
        char c[] = {'A', 'B', 'B', 'A', 'E'};

        stringDup(str);
        numberDup(n);
        charDup(c);
    }

    private static void charDup(char[] c) {
        Set<Character> hs = new HashSet<>();
        for (char ch : c)
        {
            if (hs.add(ch)==false)
            {
                System.out.println("Dup num are: "+'\''+ch+'\'');
            }
            else
                hs.add(ch);
        }
        System.out.println(hs);
    }

    private static void numberDup(int[] n) {
        Set<Integer> hs = new HashSet<>();
        for (int num : n)
        {
            if (hs.add(num)==false)
            {
                System.out.println("Dup num are: "+'\''+num+'\'');
            }
            else
               hs.add(num);
        }
        System.out.println(hs);
    }

    private static void stringDup(String[] str)
    {
    HashSet<String> hs = new HashSet<>();
        for (String s : str)
        {
            if (hs.add(s)==false)
            {
                System.out.println("\""+s+"\"");
                //System.out.print('\'' + "hi" + '\'');
            }
            else
                hs.add(s);
        }
        System.out.println(hs);
    }

}
