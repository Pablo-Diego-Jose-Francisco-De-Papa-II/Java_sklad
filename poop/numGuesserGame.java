import java.util.Scanner;
import java.util.Random;

/* todo list
* add user difficulty
* add helper
* maybe keep score or increase dif... idek
* obmedzeny pocet hintov
* */

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Guess the Number Game!");
        int guessing_num = rand.nextInt(10) + 1;
        String guessingNumString = Integer.toString(guessing_num);
        Integer last_num = null;


        while (true) {
            System.out.print("Guess number: ");
            String guess = input.next().trim();

            if (guess.equals(guessingNumString)) {
                System.out.println("You won! The number was " + guessing_num);
                break;
            }

            if (guess.equals("hint")) {
                if (last_num == null) {
                    System.out.println("You haven't guessed yet dumbass!");

                } else {
                    System.out.println(last_num > guessing_num ? "Lower" : "Upper");
                }

            } else {
                try {
                    last_num = Integer.valueOf(guess);
                    System.out.println("You guessed wrong! Try again...");

                } catch (NumberFormatException kys) {
                    System.out.println("Invalid input. Next time enter a number.");
                }
            }
        }
    }
}
