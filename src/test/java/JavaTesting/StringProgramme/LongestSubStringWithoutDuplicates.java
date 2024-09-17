package JavaTesting.StringProgramme;

import java.util.HashSet;

public class LongestSubStringWithoutDuplicates {
    public static void main(String[] args) {
        String s = "aabcca";
        String longestSubstring = "";

        // Iterate over all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubstring = s.substring(i, j);
                HashSet<Character> charSet = new HashSet<>();

                // Check for duplicates in the current substring
                for (int k = 0; k < currentSubstring.length(); k++) {
                    charSet.add(currentSubstring.charAt(k));
                }

                // If all characters are unique, check if it's the longest so far
                if (charSet.size() == currentSubstring.length()) {
                    if (currentSubstring.length() > longestSubstring.length()) {
                        longestSubstring = currentSubstring;
                    }
                }
            }
        }

        System.out.println("Longest substring without duplicates: " + longestSubstring);
    }
}
