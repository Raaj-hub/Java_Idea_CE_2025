package xxxtrraaaaa;

import java.util.Arrays;

public class Wrapper {
    public static void main(String[] args) {

        int a = 5;
        Integer b = a;
        System.out.println(b);

        Integer c = 6;
        int d =c;
        System.out.println(d);

        int[] arr = {1,2,3,4,};
        Integer ar[] = new Integer[arr.length];
        Arrays.setAll(ar,i->arr[i]);

        System.out.println(Arrays.toString(ar));

    }
}
