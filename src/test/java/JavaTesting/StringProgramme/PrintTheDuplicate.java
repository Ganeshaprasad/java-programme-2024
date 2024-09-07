package JavaTesting.StringProgramme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintTheDuplicate {
    public static void main(String[] args) {
        String str="ganeshaaapp";
        Set<Character> printedCharacters = new HashSet<>();
        for(char chr:str.toCharArray())
        {
            int count=0;
            for(char chr1:str.toCharArray())
            {
                if(chr==chr1)
                {
                    count++;
                }
            }
            if (count > 1 && !printedCharacters.contains(chr)) {
                System.out.println(chr);
                printedCharacters.add(chr); // Add the character to the set after printing it
            }
        }
    }
}
