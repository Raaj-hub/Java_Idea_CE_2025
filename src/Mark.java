import java.util.HashMap;
import java.util.Map;

public class Mark {
    public static void main(String[] args) {
        String s = "hhello world";

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        char[] ch = s.toCharArray();
        for(char c : ch)
        {
            if (!map.containsKey(c))
            {
                map.put(c, 1);
            }
            else
            {
                map.put(c, map.get(c) + 1);
            }


//            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//                System.out.println(entry.getKey() + "--" + entry.getValue());
//            }
        }
        for (char c : ch)
        {
            if (map.get(c) ==1)
            {
                System.out.println(c);
                break;
            }
        }


    }
}
