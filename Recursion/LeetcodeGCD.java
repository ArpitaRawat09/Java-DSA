package Recursion;

import java.util.Arrays;

public class LeetcodeGCD {
    public static void main(String[] args) {
        int[] num = { 2, 5, 6, 9, 10 };
        Arrays.sort(num);
        int min = num[0], max = num.length - 1;
        for (int i = Math.min(min, max); i >= 1; i--) {
            if (min % i == 0 && max % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

}
