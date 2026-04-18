package Sorting;

public class missingPositiveNum {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4 };
        int i = 0;

        // Cyclic Sort
        while (i < arr.length) {
            int currIdx = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[currIdx]) {
                int temp = arr[i];
                arr[i] = arr[currIdx];
                arr[currIdx] = temp;
            } else {
                i++;
            }
        }

        // Find first missing positive
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                System.out.println("Missing Positive number: " + (j + 1));
                return;
            }
        }

        // Edge case
        System.out.println("Missing Positive number: " + (arr.length + 1));
    }
}