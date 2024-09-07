package JavaTesting.Number;

public class Factorial {
    public static void main(String[] args) {
        int num = 3;
        int fin = 0;
        // while loop to run extract each digit one by one
        while (num > 0) {
            int fact = 1;

            //extracting the digit
            int digit = num % 10;

            //for loop to decremnet digit and multiply
            for (int i = digit; i > 0; i--) {
                fact = i * fact;

            }
            fin = fin + fact;
            num = num / 10;

        }
        System.out.println(fin);

    }
}
