package strings;

import java.util.Scanner;

public class CompressedString_serviceNow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String input = sc.nextLine();
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return "empty string"; // Return an empty string for null or empty input
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (currentChar == str.charAt(i)) {
                count++;
            } else {
                // Append the character and its count to the compressed string
                compressed.append(count).append(currentChar);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(count).append(currentChar);

        return compressed.toString();
    }
}