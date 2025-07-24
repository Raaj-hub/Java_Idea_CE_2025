package ARRAYSS;

import java.util.Arrays;

public class Reverse_array
{
    public static void main(String[] args)
    {
        int[] arr = {2, 6, 4, 2, 4, 9, 0,};
        System.out.println("Given: "+Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArr(int[] n)
    {
        int i = 0;
        int j = n.length - 1;

        while (i < j)
        {
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;

            i++;
            j--;
        }
      //  System.out.println(Arrays.toString(n));
    }
}
