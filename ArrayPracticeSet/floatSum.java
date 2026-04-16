package ArrayPracticeSet;

public class floatSum {
    public static void main(String[] args) {
        float[] marks = { 34, 4f, 56.7f, 657.3f, 54.4f };
        float sum = 0;

        for (float elements : marks) {
            sum = sum + elements;
        }

        System.out.println("Sum is : " + sum);
    }
}
