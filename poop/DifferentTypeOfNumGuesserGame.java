import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class UhrinovejHra {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> splitedRandomNumber = new ArrayList<>();
        ArrayList<Integer> splitedNumber = new ArrayList<>();

        int randomNumber = randomNumber(100000, 999999);

        for (String item : String.valueOf(randomNumber).trim().split("")) {
            splitedRandomNumber.add(Integer.valueOf(item));
        }

        System.out.println(randomNumber);

        while (true) {
            String number = input.next();

            for (String item : number.trim().split("")) {
                splitedNumber.add(Integer.valueOf(item));
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
}
