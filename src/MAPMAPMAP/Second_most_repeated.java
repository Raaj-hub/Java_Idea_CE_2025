package MAPMAPMAP;

import java.util.HashMap;
import java.util.Map;

public class Second_most_repeated {
    public static void main(String[] args) {
        String s = "abbbcdd";
        char cc = secondMostRepeated(s);
        System.out.println("Second moste repeated: "+cc);
    }

    private static char secondMostRepeated(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char c[] = s.toCharArray();
        for (Character ch : c)
        {
        if (!map.containsKey(ch))
        {
            map.put(ch,1);
        }
        else {
            map.put(ch,map.get(ch)+1);
        }
        }
        System.out.println(map);
        //map.forEach((key, value) -> System.out.println(key + ": " + value));

        int first = 0, second = 0;
        Character firstChar = null,secondChar = null;
        for (char ch : c)
        {
            if (map.get(ch) >first)
            {
                second = first;
                secondChar = firstChar;
                firstChar = ch;

                first = map.get(ch);
            }
            else
            if(map.get(ch) > second && map.get(ch) < first)
            {
                second = map.get(ch);
                secondChar = ch;
            }
        }


        return secondChar;
    }
}
