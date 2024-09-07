package JavaTesting.StringProgramme;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharcter {
    public static void main(String[] args) {
        String str = "ganesha";

        Map<Character, Integer> charCount = new HashMap<>();

        for (char chr : str.toCharArray()) {
charCount.put(chr,charCount.getOrDefault(chr,0)+1);
        }

       System.out.println(charCount);
        for (Map.Entry<Character,Integer> entr:charCount.entrySet())
        {
            System.out.println(entr.getKey()+" :"+entr.getValue());
        }
    }
}
