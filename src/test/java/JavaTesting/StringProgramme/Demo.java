package JavaTesting.StringProgramme;

import javaconceptpractice.InvalidNameFormatException;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws InvalidNameFormatException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name (at least 4 characters):");
        String name = sc.nextLine();

        System.out.println("Enter date of birth in YYYYMMDD format:");
        String dob = sc.nextLine();

        System.out.println("Enter mobile number (at least 10 digits):");
        String mob = sc.nextLine();

        Demo demo = new Demo();
        String password = demo.generatePassword(name, dob, mob);
        System.out.println("Generated Password: " + password);

        sc.close();
    }

    public String generatePassword(String name, String dob, String mob) throws InvalidNameFormatException {
        // Validate input lengths
        if (name.length() < 4) {
            throw new InvalidNameFormatException();// custom exceptio created for prACTICE
        }
        if (dob.length() < 8) {
            throw new IllegalArgumentException("Date of birth must be in YYYYMMDD format.");
        }
        if (mob.length() < 10) {
            throw new IllegalArgumentException("Mobile number must be at least 10 digits long.");
        }

        // Extract substrings
        String myName = name.substring(0, 4);
        String dobs = dob.substring(4, 8); // Correcting index for 4 characters
        String mobs = mob.substring(6, 10); // Correcting index for 4 characters

        return myName + dobs + mobs;
    }
}

