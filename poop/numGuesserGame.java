import java.util.InputMismatchException;
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

        boolean shouldRun = true;
        Integer minNum = null;
        Integer maxNum = null;
        Integer lastNum = null;
        Integer randomNumber = null;


        System.out.print("\nWhat mode you want to play: ");

        while (shouldRun) {
            switch (input.nextLine().trim().toLowerCase()) {

                case "classic" -> {
                    minNum = 1;
                    maxNum = 10;
                    randomNumber = rand.nextInt(maxNum) + minNum;

                    shouldRun = false;
                }

                case "normal" -> {
                    System.out.print("\nWith how many digits you wanna play: ");

                    try {
                        int digits = input.nextInt();
                        minNum = 1;
                        maxNum = (int) Math.pow(10, digits) - 1;
                        randomNumber = rand.nextInt(maxNum) + minNum;

                        shouldRun = false;

                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Next time enter a number.");
                    }

                }

                case "custom" -> {
                    System.out.print("\nSet a range \"num - num\": ");

                    try {
                        String nums = input.nextLine();
                        String[] idk = nums.trim().split("-");

                        minNum = Integer.parseInt(idk[0].trim());
                        maxNum = Integer.parseInt(idk[1].trim());
                        randomNumber = rand.nextInt(maxNum - minNum + 1) + minNum;

                        shouldRun = false;

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Next time enter a number.");
                    }

                }

                default -> System.out.print("\nWhat mode you want to play: ");
            }
        }


        String randomNumberStr = Integer.toString(randomNumber);
        System.out.println("Your goal is to guess number between " + minNum + " - " + maxNum + "!");


        while (true) {
            System.out.print("Guess number: ");
            String guess = input.nextLine().trim();

            if (guess.equals(randomNumberStr)) {
                System.out.println("You won! The number was " + randomNumber);
                break;
            }

            if (guess.equals("hint")) {
                System.out.println(randomNumberStr);
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
