package Hashing;

import java.util.*;

public class lengthOfSubArrEquals {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, -10 };
        int sum = 0, k = 15, longest = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, -1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum - k)) {
                longest = Math.max(longest, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(longest);
    }
}
