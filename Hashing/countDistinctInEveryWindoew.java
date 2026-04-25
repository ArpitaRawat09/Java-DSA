package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class countDistinctInEveryWindoew {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;

        HashMap<Integer, Integer> map = new HashMap<>();

        // first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(map.size());

        int i = 0, j = k;

        while (j < arr.length) {

            // add new element
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            // remove old element
            int freq = map.get(arr[i]);
            if (freq == 1)
                map.remove(arr[i]);
            else
                map.put(arr[i], freq - 1);

            ans.add(map.size());

            i++;
            j++;
        }

        System.out.println(ans);
    }
}