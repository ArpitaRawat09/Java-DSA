package String;

import java.util.Scanner;

public class toggleStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String....");
        String str = sc.next();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int code = (int) ch;

            if (code >= 65 && code <= 90) {
                ans = ans + (char) (ch + 32);
            } else if (code >= 97 && code <= 122) {
                ans = ans + (char) (ch - 32);
            } 
        }

        System.out.println("Answer is : " + ans);

        // System.out.println(code);

        sc.close();

    }
}
