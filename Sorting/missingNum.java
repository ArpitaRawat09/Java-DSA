package Sorting;

public class missingNum {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int i = 0;
        while (i < arr.length) {
            int currIdx = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[currIdx]) {
                int temp = arr[i];
                arr[i] = arr[currIdx];
                arr[currIdx] = temp;
            } else
                i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                System.out.println("Missing number : " + j);
            }
        }
    }
}
