package Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 5, 12, 6, 3, 11, 20 };
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void divide(int[] arr, int f, int l) {
        if (f >= l)
            return;
        int mid = f + (l - f) / 2;
        divide(arr, f, mid);
        divide(arr, mid + 1, l);
        conquer(arr, f, mid, l);
    }

    public static void conquer(int[] arr, int f, int mid, int l) {
        int[] ans = new int[l - f + 1];
        int i = f, j = mid + 1, k = 0;
        while (i <= mid && j <= l) {
            if (arr[i] < arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            ans[k++] = arr[i++];
        }

        while (j <= l) {
            ans[k++] = arr[j++];
        }
        for (int x = 0; x < ans.length; x++) {
            arr[f + x] = ans[x];
        }

    }
}
