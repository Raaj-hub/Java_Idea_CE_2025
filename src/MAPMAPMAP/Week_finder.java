package MAPMAPMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week_finder {
    public static void main(String[] args) {
        Map<String,Integer> map;
        map = new HashMap<>();
        map.put("sun",1);
        map.put("mon",2);
        map.put("tue",3);
        map.put("wed",4);
        map.put("thu",5);
        map.put("fri",6);
        map.put("sat",7);

        System.out.println(map.values()+"-"+map.keySet());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        String day = sc.nextLine();
        int d = map.get(day);
        System.out.println(d);

        System.out.println("Enter next day number:");
        int next = sc.nextInt();

        int find = d + next; //3+2
        //int find = d+next-1; // 3+2-1
        if (find<7)
        {
           for (Map.Entry<String,Integer> entry : map.entrySet())
            {
                if(entry.getValue()==find)
                {
                    System.out.println(entry.getKey());
                }
            }
        }
        else if (find>7)
        {
            find = find - 7;
            for (Map.Entry<String,Integer> entry : map.entrySet())
            {
                if(entry.getValue()==find){
                    System.out.println(entry.getKey());
                }
            }
        } else  {
            System.out.println("sat");

        }

    }
}
