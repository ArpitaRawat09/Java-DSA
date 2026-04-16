package Recursion;

// Greatest common factor - GCD

public class GCD {

    public static int gcd(int a, int b) {
        if (a == b)
            return a;
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }

    public static void main(String[] args) {
        int a = 32, b = 24;
        // for (int i = Math.min(a, b); i >= 1; i--) {
        // if (a % i == 0 && b % i == 0) {
        // System.out.println(i);
        // break;
        // }
        // }

        // Euclidean Method ----> iterative code

        // while (a != b) {
        // if (a > b)
        // a = a - b;
        // else
        // b = b - a;
        // }

        // Euclidean Method ----> Recursive code
        System.out.println(gcd(a, b));
    }

}
