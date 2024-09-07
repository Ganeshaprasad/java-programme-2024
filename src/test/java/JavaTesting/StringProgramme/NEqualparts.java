package JavaTesting.StringProgramme;

public class NEqualparts {
    public static void main(String[] args) {
        String str="aabbcc";
        int n=3;
        int m=str.length()/n;
        int temp=0;
        String[] str2=new String[n];
        for(int i=0;i<str.length();i=i+m)
        {
            String x=str.substring(i,i+m);
            str2[temp]=x;
            temp++;
        }
        for(String str3:str2){
            System.out.println(str3);
        }
    }
}
