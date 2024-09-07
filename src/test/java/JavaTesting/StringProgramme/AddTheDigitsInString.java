package JavaTesting.StringProgramme;

public class AddTheDigitsInString {
    public static void main(String[] args) {
        String s= "123abc5";
        int digit=0;
        for(char ch:s.toCharArray())
        {

            if(ch<='9'&&ch>='0')
            {

               digit= digit+ch-48;// 0 th ascii value was 48, so subtracting

            }
        }

        System.out.println(digit);
    }
}
