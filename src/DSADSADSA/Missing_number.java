package DSADSADSA;

import java.util.Arrays;

public class Missing_number
{
    public static void main(String[] args) {
        int [] a = {6,2,4,7,1,3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int n = a.length+1;
        int sum = (n*(n+1))/2;

        for (int i=0; i<a.length;i++)
        {
            sum = sum-a[i];
        }
        System.out.println("Missing number is: "+sum);
    }
}
