package BasicI.O;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = "ARPITA RAWAT";
        // System.out.println(name.toLowerCase());

        // System.out.println(name.replace(' ' ,'_'));

        String letter = "Hello <|name|> , thanks a lot ";
        letter = letter.replace("<|name|>", "Arpita");
        System.out.println(letter);

        sc.close();
    }
}
