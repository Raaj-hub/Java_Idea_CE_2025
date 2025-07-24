package practiceHere;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class longest_sub {
    public static void main(String[] args) {
        String s = "aabcabcd";
        subStr(s);

    }

    private static void subStr(String s) {
        int len = 0;
        String sub = null;

        Map<Character,Integer> map ;
        map = new LinkedHashMap<>();
        char [] c = s.toCharArray();

        for (int i=0 ;i<c.length; i++)
        {
            if (!map.containsKey(c[i]))
            {
                map.put(c[i],i);
            }
            else {
                i = map.get(c[i]);
                map.clear();
            }
                if (map.size() > len)
                {
                    len = map.size();
                    sub = map.keySet().toString();
                }
        }
        System.out.println("LEN: "+len+"\t"+"SUB: "+sub);
    }
}
