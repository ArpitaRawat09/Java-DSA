package ArrayPracticeSet;

public class checkNumIsPresent {
    public static void main(String[] args) {
        float[] num = { 45.7f, 64.1f, 986.4f, 98.4f };
        float elem = 98.4f;
        boolean isElem = false;

        for (float number : num) {
            if (elem == number) {
                isElem = true;
                break;
            }
        }

        if (isElem) {
            System.out.println("Number is Present in Array..✅");
        } else {
            System.out.println("Not Present in Array...❌");
        }
    }
}
