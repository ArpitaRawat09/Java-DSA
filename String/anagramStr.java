package String;

public class anagramStr {
    public static void main(String[] args) {
        // String str1 = "abcdaae";
        // String str2 = "aaacdbf";

        String str1 = "car";
        String str2 = "arC";

        int[] freq = new int[123];

        if (str1.length() != str2.length()) {
            System.out.println("Given String is not Anagram....");
        } else {
            boolean isAnagram = true;

            for (int i = 0; i < str1.length(); i++) {
                int asciiStr1 = (int) str1.charAt(i);
                freq[asciiStr1]++;
            }

            for (int i = 0; i < str2.length(); i++) {
                int asciiStr2 = (int) str2.charAt(i);
                freq[asciiStr2]--;
            }

            for (int i = 0; i < freq.length; i++) {
                if (freq[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram) System.out.println("String is Anagram....");
            else System.out.println("String is not Anagram...");
        }

    }
}
