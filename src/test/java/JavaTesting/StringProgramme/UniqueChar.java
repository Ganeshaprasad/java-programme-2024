package JavaTesting.StringProgramme;

import java.util.*;

public class UniqueChar {
    public static void main(String[] args) {
        String str="ttrrc";//out-->ab
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1 );
        }
        System.out.println(charCountMap +"****");
        // Print characters that appear only once
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                System.out.print(c);
            }
        }
    }
}
