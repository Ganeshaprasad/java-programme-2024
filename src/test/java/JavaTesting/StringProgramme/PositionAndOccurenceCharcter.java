package JavaTesting.StringProgramme;

import java.util.*;

public class PositionAndOccurenceCharcter {
    public static void main(String[] args) {
        String str = "I am samuel";

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