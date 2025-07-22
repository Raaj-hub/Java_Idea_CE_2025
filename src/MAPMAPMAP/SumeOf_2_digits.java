package MAPMAPMAP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumeOf_2_digits {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.print("The elements are:");
        for (int i = 0; i <= size - 1; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(num) + "\n");
        System.out.print("Enter the target num:");
        int target = sc.nextInt();
        int[] elements = sum_Of_digits(num, target);
        System.out.println(Arrays.toString(elements));
    }

    static int[] sum_Of_digits(int[] elm, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= elm.length - 1; i++) {
            int mid = target - elm[i];
            if (map.containsKey(mid)) {
                // return new int[]{map.get(mid), i};
                return new int[]{mid, elm[i]};
            } else {
                map.put(elm[i], i);
            }
        }
        return null;
    }
}

