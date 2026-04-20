package BinarySearchAlgos.ImpQuestionOfBS;

import java.util.Arrays;

public class kokoEatingBananas {
    public static boolean canEatAll(int[] piles, int h, int speed) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += (piles[i] + speed - 1) / speed;
        }
        return time <= h;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canEatAll(piles, h, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Koko's Eating per Hour Speed is : " + ans);
    }
}
