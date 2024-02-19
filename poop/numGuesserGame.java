import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/* todo list
* add user difficulty
* add helper ✅
* maybe keep score
* progressively increase dif
* obmedzeny pocet hintov
* */

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Guess the Number Game!");


        System.out.print("\nWhat mode you want to play: ");
        String mode = input.next();

        Integer minNum = null;
        Integer maxNum = null;
        Integer lastNum = null;
        Integer randomNumber = null;

        switch (mode) {
            case "classic":
                minNum = 1;
                maxNum = 10;
                randomNumber = rand.nextInt(maxNum - minNum + 1) + minNum;
                break;

            case "normal":
                System.out.print("\nWith how many digits you wanna play: ");
                int digits = input.nextInt();
                minNum = 1;
                maxNum = (int) Math.pow(10, digits) - 1;
                randomNumber = rand.nextInt(maxNum - minNum + 1) + minNum;
                break;

            case "custom":
                System.out.println("custom\n");
                break;
        }

        String randomNumberStr = Integer.toString(randomNumber);

        System.out.println("How to play: 1.Guess number between " + minNum + "-" + maxNum);


        while (true) {
            System.out.print("Guess number: ");
            String guess = input.next().trim();

            if (guess.equals(randomNumberStr)) {
                System.out.println("You won! The number was " + randomNumber);
                break;
            }

            if (guess.equals("hint")) {
                if (lastNum == null) {
                    System.out.println("You haven't guessed yet dumbass!");

                } else {
                    System.out.println(lastNum > randomNumber ? "Lower" : "Upper");
                }

            } else {
                try {
                    lastNum = Integer.valueOf(guess);
                    System.out.println("You guessed wrong! Try again...");

                } catch (NumberFormatException kys) {
                    System.out.println("Invalid input. Next time enter a number.");
                }
            }
        }
    }
}
