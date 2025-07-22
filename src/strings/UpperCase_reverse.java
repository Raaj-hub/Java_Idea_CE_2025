package strings;

public class UpperCase_reverse {
    public static void main(String[] args) {
        String s = "RaJeSH";
        int up = 0, low = 0;

        StringBuffer sbf = new StringBuffer();
        char c[] = s.toCharArray();

        for (int i = 0; i < c.length; i++)
        {
            if (Character.isLowerCase(c[i]))
            {
                low++;
            }
            else
            {
                    up++;
                    String sub = s.substring(i - low, i + 1);
                System.out.println(sub);
                    for (int k = sub.length()-1; k >= 0; k--)
                    {
                        sbf.append(sub.charAt(k));
                    }
                    low = 0;
                    up = 0;
            }
        }

        System.out.println(sbf);
    }
}