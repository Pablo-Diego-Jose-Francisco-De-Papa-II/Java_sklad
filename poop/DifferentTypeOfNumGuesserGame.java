import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class UhrinovejHra {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNumber = randomNumber(100000, 999999);
        ArrayList<Integer> splitedRandomNumber = listIt(Integer.toString(randomNumber));
        System.out.println(randomNumber);

        while (true) {
            String number = input.next();
            ArrayList<Integer> splitedNumber = listIt(number);

            if (String.valueOf(randomNumber).equals(number.trim())) {
                return;
            }

            for (int i = 0; i < splitedRandomNumber.size(); i++) {

                if (splitedNumber.get(i).equals(splitedRandomNumber.get(i))) {
                    System.out.print(1);

                } else if (splitedRandomNumber.contains(splitedNumber.get(i))) {
                    System.out.print(0);
                }
            }

            System.out.println(" ");
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
