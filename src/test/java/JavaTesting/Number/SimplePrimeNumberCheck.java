package JavaTesting.Number;

import java.util.Scanner;

public class SimplePrimeNumberCheck {

    public static void main(String[] args) {
        int number = 29; // Example number to check
       // Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        boolean isPrime = true;

        // Handle edge cases
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 to number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // No need to check further if we find a factor
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
