package OOPS;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rn = new Random();
        this.number = rn.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the Number.....");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        sc.close();    // when run the code comment sc.close 

    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you Guessed it right it was %d \n You guessed it in %d attempts : " , number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Tooo low...");
        } else if (inputNumber > number) {
            System.out.println("Tooo High...");
        }
        return false;

    }
}

public class guessNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            // System.out.println(b);
        }

    }

}
