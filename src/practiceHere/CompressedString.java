package practiceHere;

import java.util.Scanner;

public class CompressedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(compressedString(input));
    }
    private static String compressedString(String input)
    {
        if(input.isEmpty() || input ==null)
        {
            return "Empty string";
        }

        StringBuilder comp = new StringBuilder();
        char currChar = input.charAt(0);
        int count =1;

        for(int i=1;i <=input.length()-1; i++)
        {
            if(currChar == input.charAt(i))
            {
                count++;
            }
            else{
                comp.append(count).append(currChar);
                currChar = input.charAt(i);
                count =1;
            }
        }
        comp.append(count).append(currChar);

        return comp.toString();
    }
}
