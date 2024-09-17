package JavaTesting.StringProgramme;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseHalfOfString {
    public static void main(String[] args) {
        String str="Ganesha";
        String str1="";
        String str2="";
       // System.out.println(str.length()/2);
        for (int i=(str.length()/2)-1;i>=0;i--)
        {
             str1 = str1+str.charAt(i);

        }
        str2=str1+str.substring(str.length()/2);
        System.out.println(str2);




    }

}
