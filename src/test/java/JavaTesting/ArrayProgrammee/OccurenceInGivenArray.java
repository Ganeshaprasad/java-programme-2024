package JavaTesting.ArrayProgrammee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceInGivenArray {
    public static void main(String[] args) {
        int a[] = {9, 7, 3, 4, 5, 10, 1, 0, 2, 3, 4};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int b : a) {
            map.put(b, map.getOrDefault(b, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            System.out.println("key "+mp.getKey()+" "+"Value "+mp.getValue());
        }
    }
}
