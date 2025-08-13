package practiceHere;

import interviewQ.Patternn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern_Spl_ALPHA_CAse {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        String str = bfr.readLine();
        pattern(str);
    }

    private static void pattern(String s)
    {
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher(s);

        int res = 0;

        while(m.find())
        {
           // res+=Integer.parseInt(m.group());
            System.out.print( m.group());
        }
       // System.out.println(res);
    }
}
