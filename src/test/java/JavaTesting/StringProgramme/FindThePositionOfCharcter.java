package JavaTesting.StringProgramme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindThePositionOfCharcter {
    public static void main(String[] args) {
        String str="Ganeshaaa";
        char targetChar='a';
        int count = 0; // To store the count of occurrences of the target character
        List<Integer> positions = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==targetChar)
            {
                count++; // Increment the count if the character matches
                positions.add(i+1);

            }
          
        }
        System.out.println("Character '" + targetChar + "' occurs " + count + " times.");
        System.out.println("Positions of character '" + targetChar + "': " + positions);
    }
}
