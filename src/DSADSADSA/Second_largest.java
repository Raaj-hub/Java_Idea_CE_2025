package DSADSADSA;

import java.util.Arrays;

public class Second_largest {
    public static void main(String[] args) {
        int [] a= {20,42,6,25,30,50,90};
       // int a[]= {3,1,0,1,1};
        System.out.println(Arrays.toString(a));
        System.out.println(secongLargest(a));

    }
    private static int secongLargest(int[] a) {
        int max1 = 0, max2 = 0;
        if(a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        }
        else
        {
            max1 = a[1];
            max2 = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        return max2;
    }
    }