package MAPMAPMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Find_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        duplicteChars(s);
    }

    private static void duplicteChars(String s) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c = s.toCharArray();

        for (int i = 0; i <= c.length - 1; i++) {
            if (!map.containsKey(c[i])) {
                map.put(c[i], 1);
            } else {
                map.put(c[i], map.get(c[i]) + 1);
            }
        }
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            // System.out.println(entry.getKey()+" "+entry.getValue());
//            if (entry.getValue() > 1) {
//                System.out.println("All duplicate chars in a string:" + (entry.getKey() + " " + entry.getValue()));
//            }
//        }

        for (char ch : c) {
            if (map.get(ch) > 1) {
                System.out.println("first repeated char:" + ch);
                break;
            }
        }

        for (char ch : c) {
            if (map.get(ch) == 1) {
                System.out.println("first non repeated  char:" + ch);
                break;
            }
        }
    }
}