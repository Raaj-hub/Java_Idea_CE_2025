package strings;

public class preserve_space_Reverse {
    public static void main(String[] args) {
        String s = "abc_de_fg";
        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        System.out.println(a);
        for (int i=0; i<=a.length-1; i++)
        {
            if(a[i] == '_')
            {
                b[i] = '_';
            }
        }
        System.out.println(b);

        int k =b.length-1;
        for (int i=0; i<=a.length-1; i++)
        {
            if(a[i] != '_')
            {
                if(b[k] == '_')
                {
                    k--;
                }
                b[k] = a[i];
                k--;
            }
        }
        System.out.println(b);
    }
}
