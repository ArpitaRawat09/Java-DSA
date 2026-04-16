package conditions;
import java.util.Scanner;

public class conditionsQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Income slab : ");
        float income = sc.nextFloat();

        if (income <= 2.5 && income >= 5.0) {
            System.out.println("you have to pay 5%  income tax...");
        } else if (income >= 10.0) {
            System.out.println("you have to pay 20% income tax..");
        } else {
            System.out.println("you have to pay 30% income tax..");
        }

        sc.close();
    }
}
