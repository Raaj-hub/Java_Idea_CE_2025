package interviewQ;

import java.util.Scanner;

public class Too_Hot_to_Hoot {
    public static void main(String[] args) {
        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str) ? "Palindrome" : "Not PALINDROME");
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (!Character.isDigit(str.charAt(i))) {
                i++;
            } else if (!Character.isDigit(str.charAt(j))) {
                j--;
            } else if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j))) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }
}
