package Set;

import java.util.HashSet;
import java.util.Set;

public class jewelsStones {
    public static void main(String[] args) {
        String j = "aA";
        String s = "aAAAbbbb";

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < j.length(); i++) {
            char ch = (char) j.charAt(i);
            set.add(ch);
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch2 = (char) s.charAt(i);
            if (set.contains(ch2)) {
                count++;
            }
        }

        System.out.println(count);
    }

}
