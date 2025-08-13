package DSADSADSA;

import java.util.Arrays;

public class Continuous_subArray_45
{
        // Method to find continuous subarray with given sum
        public static int[] findSubarrayWithSum(int[] arr, int target)
        {
            int n = arr.length;
            int start = 0;
            int currentSum = 0;

            // Use sliding window technique
            for (int end = 0; end < n; end++) {
                // Add current element to current sum
                currentSum += arr[end];

                // If current sum exceeds target, remove elements from start
                while (currentSum > target && start <= end)
                {
                    currentSum -= arr[start];
                    start++;
                }

                // If current sum equals target, return the subarray indices
                if (currentSum == target)
                {
                    return new int[]{start, end}; // Return start to end indices
                }
            }
            // Return {-1, -1} if no subarray found
            return new int[]{-1, -1};
        }

        // Method to print the subarray
        public static void printSubarray(int[] arr, int start, int end) {
            if (start == -1 || end == -1) {
                System.out.println("No subarray found with the given sum.");
                return;
            }

            System.out.print("Subarray found: [");
            for (int i = start; i <= end; i++)
            {
                System.out.print(arr[i]);
               if (i < end) System.out.print(", ");
            }
            System.out.println("]");
            System.out.println("Indices: " + start + " to " + end);
        }

        public static void main(String[] args)
        {
             int[] arr = {12, 5, 31, 9, 21, 8};
             //int arr[] = {-1,0,1,2,-1,-4};
            int target = 45;

            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Target sum: " + target);

            int[] result = findSubarrayWithSum(arr, target);
                printSubarray(arr, result[0], result[1]);
        }
}
