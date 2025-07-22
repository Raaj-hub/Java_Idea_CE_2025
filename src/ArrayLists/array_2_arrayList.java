package ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class array_2_arrayList {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 4, 1, 2, 5};

        System.out.println(Arrays.toString(arr));

        String str[] = {"raj", "amz", "raj", "pfc"};

        System.out.println(Arrays.toString(str));

        List<String> li = Arrays.asList(str);
        // li.add("rajesh");  // java.lang.UnsupportedOperationException

        System.out.println(li);

        Set<String> set = new HashSet<String>();

        for (String s : li) {
            set.add(s);
        }
        System.out.println(set);

        List<int[]> list = Arrays.asList(arr);

        for (int[] i : list) {
            System.out.println(Arrays.toString(i));
        }

        Set<Integer> sett = new HashSet<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            sett.add(arr[i]);
        }
        System.out.println("set removal :" + sett);

        List<int[]> a2al = new ArrayList<int[]>();
        Collections.addAll(a2al, arr);

        for (int[] j : a2al) {
            System.out.println(Arrays.toString(j));
        }

    }
}
