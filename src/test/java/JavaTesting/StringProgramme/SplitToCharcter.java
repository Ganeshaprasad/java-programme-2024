package JavaTesting.StringProgramme;

public class SplitToCharcter {
    public static void main(String[] args) {
        String input = "My NAME";
        input=input.replace(" ","");

        // Loop through the string, picking two characters at a time
        for (int i = 0; i < input.length(); i =i+ 2) {
            // Check if there is at least one more character ahead
            if (i + 2 <= input.length()) {
                System.out.println(input.substring(i, i + 2));
            } else {
                // If only one character is left, print it
                System.out.println(input.substring(i));
            }
        }
    }
}
