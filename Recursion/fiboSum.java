package Recursion;

public class fiboSum {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibooSum(n));
    }

    public static int fibooSum(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibooSum(n - 1) + fibooSum(n-2);
    }

}
