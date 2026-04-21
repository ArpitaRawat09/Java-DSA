package Hashing;

import java.util.*;

public class subArrEquals {
    public static void main(String[] args) {
        int[] arr = { 10, 2, -2, -20, 10 };
        int k = -10;

        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);

    }
}
