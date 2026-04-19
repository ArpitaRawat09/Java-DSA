package BinarySearchAlgos;

public class searchInRoatedSortedArr {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        int f = 0, l = arr.length - 1;
        while (f <= l) {
            int mid = (f + l) / 2;
            if (arr[mid] == target) {
                System.out.println("Target at index : " + mid);
                return;
            } else if (arr[f] <= arr[mid]) {
                if (arr[f] <= target && target <= arr[mid])
                    l = mid;
                else
                    f = mid + 1;
            } else {
                if (arr[mid + 1] <= target && target <= arr[l])
                    f = mid + 1;
                else
                    l = mid;
            }
        }

        System.out.println("Target element at index :" + f);
    }
}
