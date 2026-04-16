package String;

public class freqStr {
    public static void main(String[] args) {
        String str = "abccdefffgab";
        int[] freq = new int[123];

        for (int i = 0; i < str.length(); i++) {
            int asciiValue = (int)str.charAt(i);
            freq[asciiValue]++;
        }

        for (int i = 0; i < 123; i++) {
            if (freq[i] > 0) {
                char ch = (char)i;
                System.out.println(ch + " ASCII " + i + " Frequency : " + freq[i]);

            }
        }

    }

}
