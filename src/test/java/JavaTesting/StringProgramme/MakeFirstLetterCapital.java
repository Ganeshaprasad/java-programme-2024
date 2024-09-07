package JavaTesting.StringProgramme;

import java.util.Scanner;

public class MakeFirstLetterCapital {
    public static void main(String[] args) {


//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the string");
//        String str = sc.nextLine();


        String str = "today is monday";

        //splitting based on word--> word will be stored in array
        String[] splt = str.split(" ");
        // System.out.println(str1);
        String finalStr = "";
        //looping the string array
        for (String str1 : splt) {

            //by using substring fistr letter extract and make it to uppere case
            //+ conacta with string other than first letter
            String finalString = str1.substring(0, 1).toUpperCase() + str1.substring(1);
            finalStr = finalStr + " " + finalString;
        }

        System.out.println(finalStr);
    }
}
