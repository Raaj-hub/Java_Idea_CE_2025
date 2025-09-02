package interviewQ;

import java.util.*;

public class StringWordProcessor {

    public static void main(String[] args) {
        String ss = "Loveleen sharmaa haaas interview processes";
        System.out.println("Original string: " + ss);

        String result = processString(ss);
        System.out.println("Processed string: " + result);
    }

    public static String processString(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(processWord(words[i]));
        }

        return result.toString();
    }

    public static String processWord(String word) {
        System.out.println("\nProcessing word: '" + word + "'");

        // Convert to lowercase for case-insensitive processing
        String lowerWord = word.toLowerCase();

        // Count character frequencies
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : lowerWord.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character counts: " + charCount);

        // Check Rule 3 first: No repeated characters
        boolean hasRepeated = false;
        for (int count : charCount.values()) {
            if (count > 1) {
                hasRepeated = true;
                break;
            }
        }

        if (!hasRepeated) {
            System.out.println("Rule 3 applied: No repeated characters -> 10");
            return "10";
        }

        // Rule 1: Check for 3 vowels repeated 3+ times
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vowelsRepeated3Plus = 0;
        Set<Character> targetVowels = new HashSet<>();

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (vowels.contains(entry.getKey()) && entry.getValue() >= 3) {
                vowelsRepeated3Plus++;
                targetVowels.add(entry.getKey());
            }
        }

        System.out.println("Vowels repeated 3+ times: " + vowelsRepeated3Plus + " -> " + targetVowels);

        if (vowelsRepeated3Plus >= 3) {
            System.out.println("Rule 1 applied: Replacing vowels with 0");
            return replaceCharacters(word, targetVowels, '0');
        }

        // Rule 2: Check for 3 consonants repeated 3+ times
        int consonantsRepeated3Plus = 0;
        Set<Character> targetConsonants = new HashSet<>();

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (!vowels.contains(entry.getKey()) && entry.getValue() >= 3) {
                consonantsRepeated3Plus++;
                targetConsonants.add(entry.getKey());
            }
        }

        System.out.println("Consonants repeated 3+ times: " + consonantsRepeated3Plus + " -> " + targetConsonants);

        if (consonantsRepeated3Plus >= 3) {
            System.out.println("Rule 2 applied: Replacing consonants with 1");
            return replaceCharacters(word, targetConsonants, '1');
        }

        // Rule 4: None of the conditions met
        System.out.println("Rule 4 applied: No changes made");
        return word;
    }

    private static String replaceCharacters(String word, Set<Character> targetChars, char replacement) {
        StringBuilder result = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (targetChars.contains(Character.toLowerCase(c))) {
                result.append(replacement);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}