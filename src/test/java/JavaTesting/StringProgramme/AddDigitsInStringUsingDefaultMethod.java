package JavaTesting.StringProgramme;

public class AddDigitsInStringUsingDefaultMethod {
    public static void main(String[] args) {
        String str="hello123hsgdg56";
int sum=0;
        for(char ch:str.toCharArray())
        {
            if(Character.isDigit(ch))// checking charcter digit or not
            {
                sum=sum+Character.getNumericValue(ch);//adding numerical value of chratcer
            }
        }
        System.out.println(sum);
    }
}
