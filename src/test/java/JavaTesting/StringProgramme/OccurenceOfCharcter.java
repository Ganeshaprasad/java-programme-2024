package JavaTesting.StringProgramme;

import java.util.*;

public class OccurenceOfCharcter {
    public static void main(String[] args) {
        String str = "ggannnnnesha";

        Map<Character, Integer> charCount = new HashMap<>();
        List list =new ArrayList<>();
        for (char chr : str.toCharArray()) {
charCount.put(chr,charCount.getOrDefault(chr,0)+1);
        }

//       System.out.println(charCount);
//        for (Map.Entry<Character,Integer> entr:charCount.entrySet())
//        {
//            System.out.println(entr.getKey()+" :"+entr.getValue());
//        }

        for(char c:str.toCharArray())
        {
            if(!list.contains(c)) {
                System.out.println("key " + c + ", value" + charCount.get(c));
                list.add(c);
            }
        }
    }
}
