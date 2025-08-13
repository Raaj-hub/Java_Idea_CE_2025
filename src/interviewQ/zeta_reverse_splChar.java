package interviewQ;

import java.util.Arrays;
import java.util.Scanner;

public class zeta_reverse_splChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = reverseSpl_char(s);
        System.out.println("After reversal :"+ss);

    }
    private static String reverseSpl_char(String str)
    {
        int i=0 , j= str.length()-1;
        char[] c =str.toCharArray();
        while(i<j)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;

            }
            i++;j--;
        }
        System.out.println(Arrays.toString(c));
        return String.valueOf(c);
    }
}
