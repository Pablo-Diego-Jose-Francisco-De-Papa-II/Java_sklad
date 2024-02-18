import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/*
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
        String guessingNumString = Integer.toString(rand.nextInt(10) + 1);
        Integer last_num = null;


        while (true) {
            System.out.print("Guess number: ");
            String guess = input.next();

            if (guess.equals(guessingNumString)) {
                System.out.println("You won! The number was " + guessing_num);
                break;


            } else if (guess.equals("hint")) {
                try {

                    if (last_num > guessing_num) { System.out.println("Lower"); }
                    else { System.out.println("Upper"); }

                } catch (NullPointerException e) {
                    System.out.println("niga");
                }


            } else {
                try {
                    last_num = Integer.valueOf(guess);
                    System.out.println("You guessed wrong! Try again...");

                } catch (NumberFormatException kys) {
                    System.out.println("cislo");
                }
            }
        }
    }
}
