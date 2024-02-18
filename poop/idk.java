import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Guess the Number Game!");
        final int guessing_num = rand.nextInt(10) + 1;

        while (true) {
            try {
                System.out.print("Guess number: ");
                int guess = input.nextInt();

                if (guessing_num == guess) {
                    System.out.println("You won! The number was " + guessing_num);
                    break;

                } else {
                    System.out.println("You guessed wrong! Try again...");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Next time enter a number.");
                input.next();
            }
        }
    }
}
