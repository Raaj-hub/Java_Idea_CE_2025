package interviewQ;

import java.util.Scanner;

public class Zeta_one_pattern_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rightAngleTriangle(n);

    }

    private static void rightAngleTriangle(int num) {
        for(int i=1 ;i<num ; i++)
        {
           // System.out.print(i);
            for (int j=1 ;j<=i ; j++)
            {
                if(j % 2 == 1)

                {
                    System.out.print(i);
                }
                if(j % 2 == 0)
                {
                    System.out.print(i*i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
