package Practice__here;

public class stringreverse {
    public static void main(String[] args) {

        String s = "Raj";
        for (int i=1; i<=s.length(); i++)
        {
            System.out.print(s.charAt(s.length()-i)+"\t");
        }

        for (int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
