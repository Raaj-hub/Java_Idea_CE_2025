package practiceHere;

import java.util.Scanner;

public class TooHottoHooT {
    public static void main(String[] args) {
        String rev = "Too Hot to Hoot";
        ;
        System.out.println(sentenceREverse(rev)? "PALINDROME" : "NOT PALINDROME");
    }

    private static boolean sentenceREverse(String rev) {
        int i=0, j=rev.length()-1;

        while (i<j)
        {
            if(!Character.isLetterOrDigit(rev.charAt(i)))
            {
                i++;
            } else if (!Character.isLetterOrDigit(rev.charAt(j)))
            {
              j--;
            }
            else if (Character.toLowerCase(rev.charAt(i))== Character.toLowerCase(rev.charAt(j)))
            {
              i++;j--;
            }
            else
                return false;
        }
        return true;
    }
}
