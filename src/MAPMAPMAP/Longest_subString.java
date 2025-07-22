package MAPMAPMAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class Longest_subString {
    public static void main(String[] args) {
        String str = "abcbcabcd";
        subString(str);
    }

     static void subString(String s) {
        char[] c = s.toCharArray();
        String longestSub = null;
        int lenLongSub = 0;
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!map.containsKey(c[i])) {
                map.put(c[i], i);
            } else {
                i = map.get(c[i]);
                map.clear();
            }
            if (map.size() > lenLongSub) {
                lenLongSub = map.size();
                longestSub = map.keySet().toString();

            }
        }
         System.out.println(longestSub);
         System.out.println(lenLongSub);

    }

}
