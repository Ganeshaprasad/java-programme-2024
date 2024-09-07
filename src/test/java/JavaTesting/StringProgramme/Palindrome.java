package JavaTesting.StringProgramme;

public class Palindrome {
    public static void main(String[] args) {
        String str="kanaka";
        String fin="";
//Iterating from last charcter to right--> left
        for(int i=str.length()-1;i>=0;i--)
        {
            //one by charctere one i am getting
            char str2 = str.charAt(i);

           // conatcing that
            fin=fin+str2;
        }
        System.out.println(fin);
        if(str.equals(fin))
        {
            System.out.println("Its palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
