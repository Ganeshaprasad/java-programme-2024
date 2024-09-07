package JavaTesting.StringProgramme;

public class GetFirstLetterInString {
    public static void main(String[] args) {
        String str="Hello world";

        String[] str1 = str.split(" ");

        String str3="";
        for(String str2:str1)
        {
            System.out.println(str2.substring(0,1));
        }

    }
}
