package practiceHere;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("The elements :");
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements are : "+Arrays.toString(arr));
        System.out.print("Enter the target:");
        int target = sc.nextInt();
        int[] nums = sumOfTwo(arr, target);
        System.out.println("--->"+Arrays.toString(nums));
    }

    private static int[] sumOfTwo(int[] arr, int target) {

        Map<Integer,Integer> map;
        map = new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            int mid = target-arr[i];
            if (map.containsKey(mid))
            {
                //return new int[] {mid,arr[i]};
                return new int[] {map.get(mid), i};
            }
            else
            {
                map.put(arr[i],i);
            }

        }
        System.out.println("MAP:"+map);


        return null;
    }


}

