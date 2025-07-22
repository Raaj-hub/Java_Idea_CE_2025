package ARRAYSS;

import java.util.Arrays;

public class zero_ones {
    public static void main(String[] args) {

        int [] zo = {1,1,0,1,0,0,0,1,0,1};

        int zero = 0, one=0;
        for (int i=0; i<zo.length;i++) {
            if (zo[i] == 0)
            {
                zero++;
            }
            else {
                one++;
            }
        }
        System.out.println(zero+" "+one);
            for (int j = 0; j < zero; j++) {
                zo[j] = 1;
            }
            for (int j = zero; j < zo.length; j++) {
                zo[j] = 0;
            }

        System.out.println(Arrays.toString(zo));

    }
}
