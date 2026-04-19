package BinarySearchAlgos;

import java.util.Arrays;
// check element sabse pehle or sabse bad me kab aaya tha

public class firstAndLastPosOfElem {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 4, 8, 8, 8, 8, 7, 9, 2 };
        int target = 8;

        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        ans[0] = binarySearch(arr, target, true);
        ans[1] = binarySearch(arr, target, false);
        return ans;
    }

    public static int binarySearch(int[] arr, int target, boolean isStart) {
        int f = 0, l = arr.length - 1;
        int ans = -1;
        while (f <= l) {
            int mid = (f + l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isStart) {
                    l = mid - 1;
                } else {
                    f = mid + 1;
                }
            } else if (arr[mid] < target)
                f = mid + 1;
            else
                l = mid - 1;
        }
        return ans;
    }
}
