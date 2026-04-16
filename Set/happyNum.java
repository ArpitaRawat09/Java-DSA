package Set;

import java.util.HashSet;
import java.util.Set;

public class happyNum {
    public static void main(String[] args) {
        int n = 2;

        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + (rem * rem);
                n = Math.floorDiv(n, 10);
            }

            if (sum == 1) {
                System.out.println("Happy Number");
                break;
            }
            if (set.contains(sum)) {
                System.out.println("Not Happy Number");
                break;
            } else {
                set.add(sum);
            }
            n = sum;
        }
    }
}
