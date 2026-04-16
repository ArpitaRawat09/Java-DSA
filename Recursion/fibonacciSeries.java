package Recursion;

import java.util.Scanner;

public class fibonacciSeries {
    public static int fiboo(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            return fiboo(x - 1) + fiboo(x - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fiboo(i) +  " ");
        }
        sc.close();

    }
}
