package JavaTesting.StringProgramme;

public class ReverseOnlyCharcterFromStringNotString {

    public static void main(String[] args) {
        String str = "Hello World";
        String[] str1 = str.split(" ");
        String str4 = "";
        for (String str2 : str1) {
            String str3 = "";
            for (int i = str2.length() - 1; i >= 0; i--) {
                str3 = str3 + str2.charAt(i);
            }
            str4 = str4 + " " + str3;

        }
        System.out.println(str4);
    }
}
