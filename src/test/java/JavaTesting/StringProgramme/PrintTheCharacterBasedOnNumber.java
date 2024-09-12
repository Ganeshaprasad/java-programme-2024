package JavaTesting.StringProgramme;

public class PrintTheCharacterBasedOnNumber {
    public static void main(String[] args) {
        String str = "a2b11c5";//output: aabbbbbbbbbbbccccc
        StringBuilder result = new StringBuilder();
        //get the character one by one
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
//check if the charter was alphabetic
            if (Character.isAlphabetic(ch)) {
                StringBuilder num = new StringBuilder();
                //check (i+1)==> number next to chrater
                //its should be less than string length
                //charcter should be digit
                while (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    num.append(str.charAt(i + 1));
                    i++;
                }
                //converting the number to integer
                int count = Integer.parseInt(num.toString());

                //appending charcter based on the count
                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }
            }
        }
        System.out.println(result);

    }
}
