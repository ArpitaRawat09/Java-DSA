package Map;

import java.util.HashMap;
import java.util.Map;

public class freq {

    public static void main(String[] args) {

        String str = "amenadmeddd";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = (char) str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }

}
