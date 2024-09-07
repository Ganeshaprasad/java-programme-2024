package JavaTesting.StringProgramme;


import java.util.*;

public class PrintDuplicateUsingLinkedList {
    public static void main(String[] args) {
        String str="abcabc";
        List<Character> lst= new LinkedList<>();
        for(char ch:str.toCharArray())
        {
            if(!lst.contains(ch))
            {
                lst.add(ch);
            }

        }
        System.out.println(lst);

        
    }
}
