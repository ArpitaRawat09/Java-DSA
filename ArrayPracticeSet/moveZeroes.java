package ArrayPracticeSet;
import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 0, 1 };
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
        // for (int num : arr) {
        //     System.out.println(arr);
        // }

    }

}
