package strings;

import java.util.Arrays;

public class First_letter_upperCase {
    public static void main(String[] args) {

        String s = "hi how are you";
        String str[] = s.split(" ");

        for (int i=0; i<= str.length-1;i++)
        {
            str[i] = str[i].substring(0,1).toUpperCase()+
                    str[i].substring(1,str[i].length());
        }
        System.out.println(Arrays.toString(str));
    }
}
