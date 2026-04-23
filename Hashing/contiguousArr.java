package Hashing;

import java.util.HashMap;

public class contiguousArr {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = -1;
        }

        int k = 0, sum = 0, longest = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // agar key exist karti h to y wala code chalega 

            if (map.containsKey(sum - k)) {
                longest = Math.max(longest, i - map.get(sum - k));
            }

            // warna map m sum or index store ho jayega 
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(longest);
    }
}
