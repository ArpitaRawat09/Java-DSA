package BinarySearchAlgos.ImpQuestionOfBS;

public class bookAllocation {

    public static boolean isValid(int[] arr, int upperLimit, int k) {
        int count = 1, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + sum > upperLimit) {
                count++;
                sum = arr[i];
                if (count > k)
                    return false;
            } else
                sum += arr[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,2,3,7 };
        int k = 3;
        if (k > arr.length) {
            System.out.println("Answer is: -1");
            return;
        }

        int first = 0, last = 0, ans = -1;

        for (int i = 0; i < arr.length; i++) {
            last += arr[i];
            first = Math.max(arr[i], first);
        }
        while (first <= last) {
            int mid = (first + last) / 2;
            if (isValid(arr, mid, k)) {
                ans = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        System.out.println("Answer is :" + ans);
    }
}
