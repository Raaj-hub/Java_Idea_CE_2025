package DSADSADSA;

public class Second_highest_MINVALUE
{
    public static void main(String[] args) {
       // int[] arr = {12, 35, 1, 10, 34, 1};
        int arr[]= {3,1,0,1,1};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        System.out.println(first + " " + second);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second highest element.");
        } else {
            System.out.println("The second highest element is: " + second);
        }
    }
}
