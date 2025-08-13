package interviewQ;

public class CouchBase
{
    public static void main(String[] args) {
        //Given a binary array arr[] consisting of only 0s and 1s, find the length of the longest contiguous sequence of either 1s or 0s in the array.
        //
        //Examples :
        //
        //Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
        //
        //Output: 4
        //
        //Explanation: The maximum number of consecutive 1’s in the array is 4 from index 3-6.
        //
        //Input: arr[] = [0, 0, 1, 0, 1, 0]
        //
        //Output: 2
        //
        //Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.
        //
        //Input: arr[] = [0, 0, 0, 0]
        //
        //Output: 4
        //
        //Explanation: The maximum number of consecutive 0’s in the array is 4.


       int[] arr = {0, 0, 0, 1, 1, 0, 1}; //1101
        subArry(arr);

    }

    private static void subArry(int[] arr) {
        int start = arr[0];
        int count =1; int max=0;
        for (int end =1; end < arr.length; end++)
        {

            if(arr[end]== arr[end-1])
            {
                count ++;
            }

              else {
                max = Math.max(max, count);
                count = 1; // reset count to 1

            }

        }
        System.out.println(Math.max(max, count));
    }
}
