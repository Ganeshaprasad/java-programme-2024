package JavaTesting.Number;

public class PlaindromeNumber {
    public static void main(String[] args) {
        int num=5467;
        int num2=0;
        while(num>0)
        {
            int  digit=(num%10);
            num2=num2*10+digit;
            num=num/10;
        }

        System.out.println(num2);
    }
}
