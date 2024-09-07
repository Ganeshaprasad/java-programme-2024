package JavaTesting.ArrayProgrammee;

import java.util.ArrayList;
import java.util.List;

public class PrintNotDuplicateUsingLoops {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int b[] = {10, 50, 70};

        ArrayList<Integer> list = new ArrayList<>();
        //for loop to iterate first array a and add it to list
        for (int a1 : a) {
            list.add(a1);
        }

        //for loop to itertae second array b and add it to list
        for (int b1 : b) {
            list.add(b1);
        }

        List lists=new ArrayList<>();
//[10, 20, 30, 40, 10, 50, 70]
        for (int num:list){
            int count=0;
            for(int num1:list){
                if(num==num1)
                {
                    count++;
                }
            }
            if(count==1)
            {
                lists.add(num);

            }

        }
        System.out.println(lists);
    }
}
