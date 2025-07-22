package interviewQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternn {
    public static void main(String[] args) throws  IOException {
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);

        String s = bfr.readLine();

        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(s);

        int res=0;

        while (m.find())
        {
            res+=Integer.parseInt(m.group());
           // System.out.print(m.group());
        }
        System.out.println(res);

    }
}
