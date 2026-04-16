package Recursion;

public class reverseDigits {
    public static int revDigit(int n, int rev) {
        if (n == 0)
            return rev;
        return revDigit((n / 10), rev * 10 + (n % 10));

    }

    public static void main(String[] args) {
        int n = 891;
        System.out.println(revDigit(n, 0));
    }

}
