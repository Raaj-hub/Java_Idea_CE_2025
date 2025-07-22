package strings;

public class Reverse_string {
    public static void main(String[] args) {

       // String ss = "book";
        String s ="mac book";

//        for(int i=s.length()-1;i>=0; i--)
//        {
//            System.out.print(s.charAt(i));
//        }
//        System.out.println();
//
//        char[] c = s.toCharArray();
//
//        for (int i=c.length-1; i>=0; i--)
//        {
//            System.out.print(c[i]);
//        }

        String str[] = s.split(" ");
        for(int i=0; i<=str.length-1; i++)
        {
            for (int j=str[i].length()-1; j>=0; j--)
            {
                System.out.print(str[i].charAt(j));
            }
            System.out.println();

        }

        for (int i=str.length-1; i>=0; i--)
        {
            System.out.print("\n"+str[i]+" ");
        }

    }
}
