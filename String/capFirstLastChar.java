package String;

public class capFirstLastChar {
    public static void main(String[] args) {
        String str = "hello aap kese ho ";
        String[] word = str.split(" ");
        String ans = " ";

        for (int i = 0; i < word.length; i++) {
            String w = word[i];
            if (w.length() <= 2) {
                ans = ans + w.toUpperCase();
            } else {
                char first = Character.toUpperCase(w.charAt(0));
                char last = Character.toUpperCase(w.charAt(w.length() - 1));

                String mid = w.substring(1, w.length() - 1);

                ans = ans + first + mid + last;
            }

            ans = ans + " ";
        }

        System.out.println("Answer is : " + ans);

    }

}
