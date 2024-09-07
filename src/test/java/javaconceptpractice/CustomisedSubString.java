package javaconceptpractice;

public class CustomisedSubString {
    public static String customisedSubString(String str,int beginIndex,int lastIndex)
    {
        String fin="";
        for(int i=beginIndex;i<lastIndex;i++)
        {
            fin=fin+str.charAt(i);
        }
        return fin;
    }

    public static void main(String[] args) {
        String str="ganeshprasad";


        System.out.println( customisedSubString(str,4,9));
    }
}
