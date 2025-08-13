package interviewQ;

import java.util.Arrays;

class Main_zeta1 {
        public static void main(String[] args) {
            System.out.println("Try programiz.pro");

            String s = "RA%JESH"; //HS%EJAR
            int i=0; int j=s.length()-1;
            char[] ch = s.toCharArray();

            while(i<j)
            {
                if(Character.isLetter(s.charAt(i)))
                {
                    char temp = ch[i];
                    ch[i]= ch[j];
                   ch[j] =temp;
                }
                i++;j--;
            }

            System.out.println(Arrays.toString(ch));
        }
    }
