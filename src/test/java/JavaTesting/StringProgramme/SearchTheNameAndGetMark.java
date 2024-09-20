package JavaTesting.StringProgramme;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchTheNameAndGetMark {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        Map<String, int[]> map=new LinkedHashMap<>();
        int a[]={10,20,30};
        map.put("Krishna", new int[]{10, 20, 30});
        map.put("Malika", new int[]{50, 20, 30});

        if(map.containsKey(name))
        {
            int[] mark = map.get(name);
            System.out.println(getAvgMark(mark));
        }

    }

    public static double getAvgMark(int a[])
    {

        int sum=0;
        for(int b:a)
        {
            sum=sum+b;
        }
        double avg=sum/a.length;
        return avg;
    }
}
