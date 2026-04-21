package Hashing;

import java.util.*;

public class intersectionOfArr {
    public static void main(String[] args) {
        int[] arr1 = { 4, 9, 5 };
        int[] arr2 = { 9, 4, 9, 8, 4 };

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();
 
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i]) && !ans.contains(arr2[i])) {
                ans.add(arr2[i]);
            }
        }

        System.out.println(ans);

    }
}
