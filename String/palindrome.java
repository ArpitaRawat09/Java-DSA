package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String....");
        String str = sc.next();
        boolean isPalin = true;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalin = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalin) {
            System.out.println("Palindrome....");
        }else{
            System.out.println("Not Palindrome....");
        }

        sc.close();
    }

}
