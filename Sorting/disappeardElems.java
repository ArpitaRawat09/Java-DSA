package Sorting;

import java.util.ArrayList;

public class disappeardElems {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int i = 0;
        while (i < arr.length) {
            int currIdx = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[currIdx]) {
                int temp = arr[i];
                arr[i] = arr[currIdx];
                arr[currIdx] = temp;
            } else
                i++;
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }

        System.out.println("Disappeard Number :" + ans);
    }

}
