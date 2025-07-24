package DSADSADSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Three_SUM {
    public static void main(String[] args) {
       int nums[] = {-1,0,1,2,-1,-4};
        //int nums[] = {12, 5, 31, 9, 21, 8};

        System.out.println(threeSums(nums));
    }

    public static List<List<Integer>> threeSums(int[] num)
    {
        List<List<Integer>> li = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        Arrays.sort(num);
        for (int i=0 ;i< num.length; i++)
        {
            int a,b;
            a= i+1;
            b= num.length-1;

            while (a<b)
            {
                if (num[i] + num[a] + num[b] == 0)
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(num[i]);
                    temp.add(num[a]);
                    temp.add(num[b]);

                    hs.add(temp);
                    b--;
                }
                else if (num[i] + num[a] + num[b] > 0) {
                    b--;
                }
                else {
                    a++;
                }
            }
        }
        for (List<Integer> t : hs)
        {
            li.add(t);
        }
        return li;
    }
}
