package ArrayPracticeSet;
import java.util.Arrays;

public class mergeSortedArr {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 5 };
        int[] arr2 = { 1, 4, 7 };
        int[] ans = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        // if arr1 elements are remaining
        while (i < arr1.length) {
            ans[k++] = arr1[i++];
        }
        // if arr2 elems are remaining
        while (j < arr2.length) {
            ans[k++] = arr2[j++];
        }

        System.out.println(" Merge Sorted Array : " + Arrays.toString(ans));

    }

}
