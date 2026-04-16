package conditions;
import java.util.Scanner;

public class perCalculate {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in physics : ");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in mathematics : ");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in chemistry : ");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3) / 3.0f;

        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Student Passed...");
        } else {
            System.out.println("Student Failed....");
        }

        sc.close();
    }
}
