package JavaTesting.ArrayProgrammee;

import java.util.*;

public class PrintNotDuplicate {
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

        //using map--> getting occurnce
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int lists : list) {
            map.put(lists, map.getOrDefault(lists, 0) + 1);
        }

        //add unique key to list
        List<Integer> uniqueElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> maps : map.entrySet()) {
            if (maps.getValue() == 1) {
                uniqueElements.add(maps.getKey());
            }
        }

        System.out.println(uniqueElements+"**");
        // convert list to array
        int[] resultArray = uniqueElements.stream().mapToInt(i -> i).toArray();


        //iterate array
        System.out.print("{ ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");


    }
}