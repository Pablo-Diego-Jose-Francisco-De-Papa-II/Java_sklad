import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class DifferentTypeOfNumGuesserGame {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);
    static StringBuilder pandigitalNumber = new StringBuilder();

    public static void main(String[] args) {
        int[] allNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int attempts = 0;
        int randomNumber = 0;
        boolean shouldRun = true;

        System.out.println("Chose your mode (random \"r\" or pandigital \"p\"):");

        while (shouldRun) {
            switch (input.next()) {
                case "random", "r" -> { randomNumber = randomRandomNumber(100000, 999999); shouldRun = false; }
                case "pandigital", "p" -> { randomNumber = randomPandigitalNumber(allNumbers); shouldRun = false; }
                default -> System.out.println("This mode doesnt exist...");
            }
        }

        while (true) {
            ArrayList<Integer> splitedRandomNumber = listIt(Integer.toString(randomNumber));
            String number = input.next();
            ArrayList<Integer> splitedNumber = listIt(number);

            if (splitedNumber.size() == 6) {
                attempts++;

                if (String.valueOf(randomNumber).equals(number.trim())) {
                    System.out.println("WELL DONE! It took you " + attempts + " tries.");
                    return;
                }

                for (int i = 0; i < splitedNumber.size(); i++) {
                    if (splitedNumber.get(i).equals(splitedRandomNumber.get(i))) {
                        System.out.print("1");
                        splitedNumber.set(i, -1);
                        splitedRandomNumber.set(i, -2);
                    }
                }

                for (int i = 0; i < splitedNumber.size(); i++) {
                    if (splitedRandomNumber.contains(splitedNumber.get(i))) {
                        System.out.print("0");
                        int index = splitedRandomNumber.indexOf(splitedNumber.get(i));
                        splitedNumber.set(i, -1);
                        splitedRandomNumber.set(index, -2);
                    }
                }
                System.out.println("\n");
            } else {
                System.out.println("Enter 6 digit number next time!");
            }
        }
    }

    public static int randomRandomNumber(int minNum, int maxNum) {
        return rand.nextInt(maxNum - minNum + 1) + minNum;
    }

    public static int randomPandigitalNumber(int[] allNumbers) {
        Integer[] allNumbersInteger = Arrays.stream(allNumbers).boxed().toArray(Integer[]::new);
        Collections.shuffle(Arrays.asList(allNumbersInteger));

        for (int i = 0; i < 6; i++) {
            pandigitalNumber.append(allNumbersInteger[i]);
        }
        return Integer.parseInt(pandigitalNumber.toString());
    }

    public static ArrayList<Integer> listIt(String str) {
        ArrayList<Integer> list = new ArrayList<>(str.length());

        for (char item : str.toCharArray()) {
            list.add(Character.getNumericValue(item));
        }
        return list;
    }
}
