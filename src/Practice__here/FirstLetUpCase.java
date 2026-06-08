package Practice__here;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLetUpCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter the string: "+input);
        FirstLetterUpCase(input);
    }

    private static void FirstLetterUpCase(String input) {
        String words[] = input.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i=0; i<words.length; i++)
        {
            String str = words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            System.out.println(str);
        }
        System.out.println();
    }
}
