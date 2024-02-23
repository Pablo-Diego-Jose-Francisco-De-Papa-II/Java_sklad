import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class UhrinovejHra {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNumber = randomNumber(100000, 999999);
        int attempts = 0;

        while (true) {
            ArrayList<Integer> splitedRandomNumber = listIt(Integer.toString(randomNumber));
            StringBuilder hintNum = new StringBuilder();
            System.out.println(randomNumber);
            String number = input.next();
            ArrayList<Integer> splitedNumber = listIt(number);

            attempts += 1;

            if (String.valueOf(randomNumber).equals(number.trim())) {
                System.out.println("WELL DONE! It took you" + attempts + "tries.");
                return;
            }

            for (int i = 0; i < splitedRandomNumber.size(); i++) {
                if (splitedNumber.get(i).equals(splitedRandomNumber.get(i))) {
                    hintNum.append("1");

                } else if (splitedRandomNumber.contains(splitedNumber.get(i))) {
                    hintNum.append("0");

                }
                splitedNumber.remove(splitedNumber.get(i));
                splitedRandomNumber.remove(splitedRandomNumber.get(i));

            }
            StringBuilder reversed = new StringBuilder(hintNum).reverse();
            String reversedHintNum = reversed.toString();
            System.out.println(reversedHintNum);

            splitedNumber.clear();
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
