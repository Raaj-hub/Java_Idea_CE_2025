package practiceHere;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 1};
        Scanner sc = new Scanner(System.in);
        int terget = sc.nextInt();
       int[] result =twoSums(arr, terget);
       if(result != null)
        System.out.println(Arrays.toString(result));
       else
           System.out.println("No pair found ..!!");

    }

    private static int[] twoSums(int[] arr, int target) {
       Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length ; i++){
           int mid = target - arr[i];
           if(map.containsKey(mid))
           {
               return new int[] { map.get(mid),i};
           }
           else
           {
               map.put(arr[i],i);
           }
       }
        return null;
    }
}
