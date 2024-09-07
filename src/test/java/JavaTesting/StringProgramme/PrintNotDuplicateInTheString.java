package JavaTesting.StringProgramme;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PrintNotDuplicateInTheString {
    public static void main(String[] args) {
        String str="hello";
        Map<Character,Integer> map= new LinkedHashMap();
        for(char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        List<Character> list =new LinkedList();
        for(Map.Entry<Character,Integer> dupli:map.entrySet())
        {
            if(dupli.getValue()==1)
            {

                list.add(dupli.getKey());
            }
        }
        System.out.println(list);
    }
}
