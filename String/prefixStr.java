package String;

public class prefixStr {
    public static void main(String[] args) {
        String[] str = { "attention", "pay", "attend", "bhavenpadara", "at" };
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].startsWith("at")) {
                count++;
            }
        }

        System.out.println("Count is : " + count);
    }

}
