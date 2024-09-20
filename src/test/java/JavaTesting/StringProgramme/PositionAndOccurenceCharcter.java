package JavaTesting.StringProgramme;

import java.util.*;

public class PositionAndOccurenceCharcter {
    public static void main(String[] args) {
        String str = "I am samuel";
        str=str.replace(" ","");

        // Create HashMaps to store occurrences and positions
        Map<Character, Integer> occurrences = new HashMap<>();
        Map<Character, List<Integer>> positions = new HashMap<>();

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Update occurrences
            occurrences.put(ch, occurrences.getOrDefault(ch, 0) + 1);

            // Update positions
            if (!positions.containsKey(ch)) {
                positions.put(ch, new ArrayList<>());
            }
            positions.get(ch).add(i);
        }

        // Display the occurrences and positions
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            List<Integer> posList = positions.get(character);

            System.out.println("Character: '" + character + "' Occurrences: " + count + " Positions: " + posList);
        }
    }
}

//------
class HelloWorld {
    public static void main(String[] args) {
        String str = "ttrrc";  // Input string
        List<Integer> ls;      // To track the indices of occurrences of a character
        List<Character> lst = new ArrayList<>();  // To track already processed characters

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            ls = new ArrayList<>();  // Reset ls for each character
            int count = 0;

            // Inner loop to compare the character with all others
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    ls.add(j);  // Add the index where the character matches
                }
            }

            // Only print if the character hasn't already been processed
            if (!lst.contains(str.charAt(i))) {
                System.out.println(str.charAt(i) + " - " + count + " " + ls);
                lst.add(str.charAt(i));  // Mark this character as processed
            }
        }
    }
}
