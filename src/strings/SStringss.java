package strings;

public class SStringss {
    public int i;

    public static void main(String[] args) {
        String s = "raj";
        String r = "raj";

        String s1 = new String("raj");
        String s2 = new String("raj");

        System.out.println(s==r);
        System.out.println(s1==s2);

        System.out.println(s==s1);

        System.out.println(s.concat("qqq"));
        System.out.println(s);
        System.out.println(s1.concat("qqq"));
        System.out.println(s1);
        s = s.concat("www");
        System.out.println(s);

        s1= s1.concat("zzz");
        System.out.println(s1);

    }
}
