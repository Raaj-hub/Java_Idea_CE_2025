package interviewQ;

import java.util.Arrays;

public class highLevel_abcccd
{
    public static void main(String[] args)
    {
        String s = "ab&c-cd"; //ab&c-cd
        char a[] = s.toCharArray();

        char c[] =new char[s.length()];

        int i=0,j=s.length()-1;

        while (i<j)
        {
            if(Character.isLetter(a[i]))
            {

                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                    i++;
                    j--;
               System.out.println(Arrays.toString(a));

            }
        }
    }
}
