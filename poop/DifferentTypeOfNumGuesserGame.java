import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class UhrinovejHra {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNumber = randomNumber(100000, 999999);
        int allNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int attempts = 0;

        while (true) {
            ArrayList<Integer> splitedRandomNumber = listIt(Integer.toString(randomNumber));
            String number = input.next();
            ArrayList<Integer> splitedNumber = listIt(number);

            if (splitedNumber.size() == 6) {
                attempts += 1;

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
                splitedNumber.clear();
            } else {
                System.out.println("Enter 6 digit number next time!");
            }
        }
    }

    public static int randomNumber(int minNum, int maxNum) {
        return rand.nextInt(maxNum - minNum + 1) + minNum;
    }

    public static ArrayList<Integer> listIt(String str) {
        ArrayList<Integer> list = new ArrayList<>(str.length());

        for (char item : str.toCharArray()) {
            list.add(Character.getNumericValue(item));
        }
        return list;
    }
}
