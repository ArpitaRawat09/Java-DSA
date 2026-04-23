package Hashing;

import java.util.*;

public class subArrEquals {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;

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
