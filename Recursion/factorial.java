package Recursion;

import java.util.Scanner;

public class factorial {

    static int factorial1(int x) {
        if (x == 0 || x == 1) { //base case
            return 1;

        } else {
            return x * factorial1(x - 1);  // main logic
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter thr number : " );
        int n = sc.nextInt();
        int res = factorial1(n);
        System.out.println("factorial is :" +  res);

        sc.close();
    }
}
